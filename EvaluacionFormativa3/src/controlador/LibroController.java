/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Libro;
import modelo.LibroDAO;
import java.util.Date;
import vista.Principal;

/**
 *
 * @author munoz
 */
public class LibroController {
    
    private LibroDAO modelo = new LibroDAO();
    private Principal vista = new Principal();
    
    public boolean agregarLibro(String titulo, String editorial, int ejemplaresDisponibles, Date fechaPublicacion, String genero){
        try{
            Libro libro = new Libro(titulo, editorial, ejemplaresDisponibles, fechaPublicacion, genero);
            String resultado = LibroDAO.agregar(libro);
            if(resultado.equals("Agregado")){
                return true;
            }
        }catch(Exception e){
            System.err.println("Error : "+e.getMessage());
        }
        return false;
    }
            
}
