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
import java.util.Date;
import modelo.AnimalDAO;
import modelo.CuidadorDAO;

/**
 *
 * @author munoz
 */
public class RegistroDAO {
    private Connection conexion;
    private ArrayList<Registro> registros;
    private static Statement st;
    private static ResultSet rs;

    public RegistroDAO(){
        
    }
    
    public String add(Registro registro){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "INSERT INTO registro (idAnimal,idCuidador,fechaRegistro,observaciones) VALUES (?,?,?,?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, registro.getAnimal().getId());
            statement.setInt(2, registro.getCuidador().getId());
            statement.setDate(3, new java.sql.Date(registro.getFechaRegistro().getTime()));
            statement.setString(4, registro.getObservaciones());
            
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
    
    public String edit(Registro registro){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            String sql = "UPDATE registro SET idAnimal = ?,idCuidador = ? ,fechaRegistro = ?, observaciones = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, registro.getAnimal().getId());
            statement.setInt(2, registro.getCuidador().getId());
            statement.setDate(3, new java.sql.Date(registro.getFechaRegistro().getTime()));
            statement.setString(3, registro.getObservaciones());
            statement.setInt(4, registro.getId());
            
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
            String sql = "DELETE FROM registro WHERE id = ?";
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
    
    public Registro get(int idRegistro){
        try{
            Conexion con = new Conexion();
            conexion = con.getConexion();
            
            String sql = "SELECT * FROM registro WHERE id = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idRegistro);
            
            rs = statement.executeQuery();
                                    
            while(rs.next()){
                int id = rs.getInt(1);
                int idAnimal = rs.getInt(2);
                int idCuidador = rs.getInt(3);
                Date fechaRegistro = new Date(rs.getDate(4).getTime());
                String observaciones = rs.getString(5);
                
                Animal animal = new AnimalDAO().get(idAnimal);
                Cuidador cuidador = new CuidadorDAO().get(idCuidador);
                
                return new Registro(id, animal, cuidador, fechaRegistro, observaciones);
            }
            con.cerrarConexion();
            
        }catch(SQLException e){
            System.err.println("Error : "+e.getMessage());
        }
        return new Registro();
    }
    
    public ArrayList<Registro> lista(){
        try{
            registros = new ArrayList<>();
            Conexion con = new Conexion();
            conexion = con.getConexion();
            
            String sql = "SELECT * FROM registro";
            
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt(1);
                int idAnimal = rs.getInt(2);
                int idCuidador = rs.getInt(3);
                Date fechaRegistro = new Date(rs.getDate(4).getTime());
                String observaciones = rs.getString(5);
                
                Animal animal = new AnimalDAO().get(idAnimal);
                Cuidador cuidador = new CuidadorDAO().get(idCuidador);
                
                registros.add(new Registro(id, animal, cuidador, fechaRegistro, observaciones));
            }
            con.cerrarConexion();
            
        }catch(SQLException e){
            System.err.println("Error : "+e.getMessage());
        }
        return registros;
    }
}
