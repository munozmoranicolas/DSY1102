/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*;

/**
 *
 * @author munoz
 */
public class Conexion {
    
    private Connection con = null;
    
    public Connection getConexion() throws Exception{
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/ejemploproyectomvc";
            con = DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException sqle){
            System.err.println("Erro SQL... conexion" + sqle);
        }
        return con;
    }
    
    public void cerrarConexion(){
        try{
            if(con != null){
                con.close();
            }
        }
        catch(SQLException e){
            System.err.println("Problemas con la conexion");
        }
    }
}
