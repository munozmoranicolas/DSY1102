/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author munoz
 */
public class AnimalDAO {
    
    private static ArrayList<Animal> animales = new ArrayList<>();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;
    
    public static String agregarAnimal(Animal a){
        try{
            conn = new Conexion().getConexion();
            String sql = "INSERT INTO animal (nombre,especie,edad,peso) VALUES (?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,a.getNombre());
            statement.setString(2,a.getEspecie());
            statement.setInt(3,a.getEdad());
            statement.setDouble(4,a.getPeso());
            
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
    
    public static String modificarAnimal(Animal a){
        try{
            conn = new Conexion().getConexion();
            String sql = "UPDATE animal SET nombre = ?,especie = ? ,edad = ?,peso = ?,estadoSalud = ?,fechaIngreso = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,a.getNombre());
            statement.setString(2,a.getEspecie());
            statement.setInt(3,a.getEdad());
            statement.setFloat(4, (float) a.getPeso());
            statement.setInt(7, a.getId());
            
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

    /*public List<Animal> getAllAnimals() throws SQLException {
        List<Animal> animals = new ArrayList<>();
        String query = "SELECT * FROM animal";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setNombre(rs.getString("nombre"));
                animal.setEspecie(rs.getString("especie"));
                animal.setEdad(rs.getInt("edad"));
                animal.setPeso(rs.getDouble("peso"));
                animal.setEstadoSalud(rs.getString("estadoSalud"));
                animal.setFechaIngreso(rs.getDate("fechaIngreso"));
                animals.add(animal);
            }
        }
        return animals;
    }

    public void updateAnimal(Animal animal) throws SQLException {
        String query = "UPDATE animal SET nombre = ?, especie = ?, edad = ?, peso = ?, estadoSalud = ?, fechaIngreso = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, animal.getNombre());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt(3, animal.getEdad());
            stmt.setDouble(4, animal.getPeso());
            stmt.setString(5, animal.getEstadoSalud());
            stmt.setDate(6, new java.sql.Date(animal.getFechaIngreso().getTime()));
            stmt.setInt(7, animal.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteAnimal(int id) throws SQLException {
        String query = "DELETE FROM animal WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }*/
}
