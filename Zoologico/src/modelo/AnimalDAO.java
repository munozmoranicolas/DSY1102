/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class AnimalDAO {
    private Connection conexion;
    private ArrayList<Animal> animales;
    private static Statement st;
    private static ResultSet rs;

    public AnimalDAO(){
        
    }
    
    public String add(Animal animal){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "INSERT INTO animal (nombre,especie,edad,peso) VALUES (?,?,?,?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1,animal.getNombre());
            statement.setString(2,animal.getEspecie());
            statement.setInt(3,animal.getEdad());
            statement.setInt(4,animal.getPeso());
            
            int c = statement.executeUpdate();
            
            con.cerrarConexion();
            
            if(c>0){
                return "Agregado";
            }
            else{
                return "No Agregado";
            }
        }catch(SQLException e){
            return "Error : "+e.getMessage();
        }
        
    }
    
    public String edit(Animal animal){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "UPDATE animal SET nombre = ?,especie = ? ,edad = ?, peso = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, animal.getNombre());
            statement.setString(2, animal.getEspecie());
            statement.setInt(3, animal.getEdad());
            statement.setInt(4, animal.getPeso());
            statement.setInt(5, animal.getId());
            
            int c = statement.executeUpdate();
            
            con.cerrarConexion();
            
            if(c>0){
                return "Modificado";
            }
            else{
                return "No Modificado";
            }
        }catch(SQLException e){
            return "Error : "+e.getMessage();
        }
    }
    
    public String delete(int id){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "DELETE FROM animal WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            
            int c = statement.executeUpdate();

            con.cerrarConexion();
            
            if(c>0){
                return "Eliminado";
            }
            else{
                return "No Eliminado";
            }
        }catch(SQLException e){
            return "Error : "+e.getMessage();
        }
    }
    
    public ArrayList<Animal> lista(){
        try{
            animales = new ArrayList<>();
            Conexion con = new Conexion();
            conexion = con.getConexion();
            
            String sql = "SELECT * FROM animal";
            
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            
                        
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String especie = rs.getString(3);
                int edad = rs.getInt(4);
                int peso = rs.getInt(5);
                
                animales.add(new Animal(id, nombre, especie, edad,peso));
            }
            con.cerrarConexion();
            
        }catch(SQLException e){
            System.err.println("Error : "+e.getMessage());
        }
        return animales;
    }
    
    public Animal get(int idAnimal){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            
            String sql = "SELECT * FROM animal WHERE id = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idAnimal);
            
            rs = statement.executeQuery();                
            while(rs.next()){
                System.out.println("!");
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String especie = rs.getString(3);
                int edad = rs.getInt(4);
                int peso = rs.getInt(5);
                
                return new Animal(id, nombre, especie, edad,peso);
            }
            con.cerrarConexion();
            
        }catch(SQLException e){
            System.err.println("Error : "+e.getMessage());
        }
        return new Animal();
    }
}
