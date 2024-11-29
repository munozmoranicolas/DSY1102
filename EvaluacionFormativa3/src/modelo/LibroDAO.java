/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class LibroDAO {
    
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;
    
    public static String agregar(Libro l){
        try{
            conn = new Conexion().getConexion();
            String sql = "INSERT INTO libro (titulo,editorial,ejemplaresDisponibles,fechaPublicacion,genero) VALUES (?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,l.getTitulo());
            statement.setString(2,l.getEditorial());
            statement.setInt(3,l.getEjemplaresDisponibles());
            statement.setDate(4, new java.sql.Date(l.getFechaPublicacion().getTime()));
            statement.setString(5,l.getGenero());
            
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
    
    public static String modificar(Libro l){
        try{
            conn = new Conexion().getConexion();
            String sql = "UPDATE libro SET titulo = ?, editorial = ?, ejemplaresDisponibles = ?, fechaPublicacion = ?, genero = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, l.getTitulo());
            statement.setString(2, l.getEditorial());
            statement.setInt(3, l.getEjemplaresDisponibles());
            statement.setDate(4, new java.sql.Date(l.getFechaPublicacion().getTime()));
            statement.setString(5, l.getGenero());
            statement.setInt(6, l.getIsbn());            
            
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
    
    public static String eliminar(int id){
        try{
            conn = new Conexion().getConexion();
            String sql = "DELETE FROM libro WHERE id = ?";
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
    
    public static Libro buscar(int idLibro){
        try{
            conn = new Conexion().getConexion();
            String sql = "SELECT * FROM libro WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idLibro);
            
            rs = statement.executeQuery(sql);
            
            while(rs.next()){
                int isbn = rs.getInt(1);
                String titulo = rs.getString(2);
                String editorial = rs.getString(3);
                int ejemplaresDisponibles = rs.getInt(4);
                Date fechaPublicacion = new Date(rs.getDate(5).getTime());
                String genero = rs.getString(6);
                
                
                return new Libro(isbn, titulo, editorial, ejemplaresDisponibles, fechaPublicacion, genero);
            }
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
            return new Libro();
        }
        return new Libro();
    }
    
    public static ArrayList<Libro> listar(){
        try{
            libros.clear();
            conn = new Conexion().getConexion();
            String sql = "SELECT * FROM libro";
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
                        
            while(rs.next()){
                int isbn = rs.getInt(1);
                String titulo = rs.getString(2);
                String editorial = rs.getString(3);
                int ejemplaresDisponibles = rs.getInt(4);
                Date fechaPublicacion = new Date(rs.getDate(5).getTime());
                String genero = rs.getString(6);
                
                libros.add(new Libro(isbn, titulo, editorial, ejemplaresDisponibles, fechaPublicacion, genero));
                
            }
            
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
        }
        return libros;
    }
}
