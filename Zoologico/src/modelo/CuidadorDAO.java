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
public class CuidadorDAO {
    private Connection conexion;
    private ArrayList<Cuidador> cuidadores;
    private static Statement st;
    private static ResultSet rs;

    public CuidadorDAO(){
        
    }
    
    public String add(Cuidador cuidador){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "INSERT INTO cuidador (nombre,especialidad,turno) VALUES (?,?,?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, cuidador.getNombre());
            statement.setString(2, cuidador.getEspecialidad());
            statement.setString(3, cuidador.getTurno());
            
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
    
    public String edit(Cuidador cuidador){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "UPDATE cuidador SET nombre = ?,especialidad = ? ,turno = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, cuidador.getNombre());
            statement.setString(2, cuidador.getEspecialidad());
            statement.setString(3, cuidador.getTurno());
            statement.setInt(4, cuidador.getId());
            
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
            String sql = "DELETE FROM cuidador WHERE id = ?";
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
    
    public Cuidador get(int idCuidador){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            
            String sql = "SELECT * FROM cuidador WHERE id = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idCuidador);
            
            rs = statement.executeQuery();
                                    
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String especialidad = rs.getString(3);
                String turno = rs.getString(4);
                
                return new Cuidador(id, nombre, especialidad, turno);
            }
            con.cerrarConexion();
            
        }catch(SQLException e){
            System.err.println("Error : "+e.getMessage());
        }
        return new Cuidador();
    }
    
    public ArrayList<Cuidador> lista(){
        try{
            cuidadores = new ArrayList<>();
            Conexion con = new Conexion();
            conexion = con.getConexion();
            
            String sql = "SELECT * FROM cuidador";
            
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            
                        
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String especialidad = rs.getString(3);
                String turno = rs.getString(4);
                
                cuidadores.add(new Cuidador(id, nombre, especialidad, turno));
            }
            con.cerrarConexion();
            
        }catch(SQLException e){
            System.err.println("Error : "+e.getMessage());
        }
        return cuidadores;
    }
}
