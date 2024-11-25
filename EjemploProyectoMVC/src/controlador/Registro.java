/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import modelo.Producto;
import java.sql.*;

/**
 *
 * @author munoz
 */
public class Registro {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;
    
    public static String agregarProducto(Producto p){
        try{
            conn = new Conexion().getConexion();
            String sql = "INSERT INTO producto (nombre,descripcion,precio) VALUES (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,p.getNombre());
            statement.setString(2,p.getDescripcion());
            statement.setInt(3,p.getPrecio());
            
            int c = statement.executeUpdate();
            if(c>0){
                return "Agregado";
            }
            else{
                return "No Agregado";
            }
        }catch(Exception e){
            return "Error : "+e.getMessage();
        }
    }
    
    public static String modificarProducto(Producto p){
        try{
            conn = new Conexion().getConexion();
            String sql = "UPDATE producto SET nombre = ?,descripcion = ? ,precio = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,p.getNombre());
            statement.setString(2,p.getDescripcion());
            statement.setInt(3,p.getPrecio());
            statement.setInt(4, p.getId());
            
            int c = statement.executeUpdate();
            if(c>0){
                return "Modificado";
            }
            else{
                return "No Modificado";
            }
        }catch(Exception e){
            return "Error : "+e.getMessage();
        }
    }
    
    public static String eliminarProducto(int id){
        try{
            conn = new Conexion().getConexion();
            String sql = "DELETE FROM producto WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            int c = statement.executeUpdate();
            if(c>0){
                return "Eliminado";
            }
            else{
                return "No Eliminado";
            }
        }catch(Exception e){
            return "Error : "+e.getMessage();
        }
    }
    
    public static Producto buscarProducto(int idProducto){
        try{
            conn = new Conexion().getConexion();
            String sql = "SELECT * FROM producto WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idProducto);
            
            rs = statement.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                int precio = rs.getInt(4);
                
                return new Producto(id, nombre, descripcion, precio);
            }
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
            return new Producto();
        }
        return new Producto();
    }
    
    public static ArrayList<Producto> listarProducto(){
        try{
            productos.clear();
            conn = new Conexion().getConexion();
            String sql = "SELECT * FROM producto";
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
                        
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                int precio = rs.getInt(4);
                
                productos.add(new Producto(id, nombre, descripcion, precio));
            }
            
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
        }
        return productos;
    }
}
