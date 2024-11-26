/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import db.Conexion;
import modelo.Animal;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class AnimalController {
   private static Connection conn = null;
   private static ArrayList<Animal> animales = new ArrayList<>();
    
    public static String agregarAnimal(Animal animal){
        try{
            conn = new Conexion().getConexion();
            String sql = "INSERT INTO animal (nombre,especie,edad,peso) VALUE (?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, animal.getNombre());
            statement.setString(2, animal.getEspecie());
            statement.setInt(3, animal.getEdad());
            statement.setInt(4, animal.getPeso());
            
            int comprobacion = statement.executeUpdate();
            
            if(comprobacion > 0){
                return "Animal agregado";
            }
            else{
                return "No se pudo agregar el animal";
            }
            
        }catch(Exception e){
            return "Error : "+e.getMessage();
        }
    }
    
    public static String modificarAnimal(Animal animal){
        try{
            conn = new Conexion().getConexion();
            String sql = "UPDATE animal SET nombre = ?, especie = ?, edad = ?, peso = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, animal.getNombre());
            statement.setString(2, animal.getEspecie());
            statement.setInt(3, animal.getEdad());
            statement.setInt(4, animal.getPeso());
            statement.setInt(5,animal.getId());
            
            int comprobacion = statement.executeUpdate();
            
            if(comprobacion > 0){
                return "Animal agregado";
            }
            else{
                return "No se pudo agregar el animal";
            }
            
        }catch(Exception e){
            return "Error : "+e.getMessage();
        }
    }
    
    public static String eliminarAnimal(int id){
        try{
            conn = new Conexion().getConexion();
            String sql = "DELETE FROM animal WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            
            int comprobacion = statement.executeUpdate();
            
            if(comprobacion > 0){
                return "Animal agregado";
            }
            else{
                return "No se pudo agregar el animal";
            }
            
        }catch(Exception e){
            return "Error : "+e.getMessage();
        }
    }
    
    public static Animal obtenerAnimal(int idAnimal){
        try{
            conn = new Conexion().getConexion();
            String sql = "SELECT * FROM animal WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,idAnimal);
            
            ResultSet respuesta = statement.executeQuery();
            
            while(respuesta.next()){
                int id = respuesta.getInt(1);
                String nombre = respuesta.getString(2);
                String especie = respuesta.getString(3);
                int edad = respuesta.getInt(4);
                int peso = respuesta.getInt(5);
                
                return new Animal(id, nombre, especie, edad, peso);
            }
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
            return new Animal();
        }
        return new Animal();
    }
    
    public static ArrayList<Animal> listarAnimal(){
        try{
            animales.clear();
            conn = new Conexion().getConexion();
            String sql = "SELECT * FROM animal";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String especie = rs.getString(3);
                int edad = rs.getInt(4);
                int peso = rs.getInt(5);
                
                animales.add(new Animal(id, nombre, especie, edad, peso));
            }
            
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
        }
        return animales;
    }
    
}
