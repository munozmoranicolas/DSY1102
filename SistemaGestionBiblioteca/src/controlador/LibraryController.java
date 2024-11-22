/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import modelo.*;
import vista.LibraryGUI;

/**
 *
 * @author munoz
 */
public class LibraryController {
    private ArrayList<Libro> libros;
    private LibraryGUI vista;
    
    public void registrarNuevoLibro(String titulo, String autor, String categoria){
        System.out.println("registrarNuevoLibro");
        int id = libros.size()+1;
        Libro nuevoLibro = new Libro(id, titulo, autor, true);
        libros.add(nuevoLibro);
        vista.actualizarInventario();
    }
    
    public void realizarPrestamo(Libro libro, Usuario usuario){
        System.out.println("realizarPrestamo");
    }
    
    public void registrarDevolucion(Prestamo prestamo){
        System.out.println("registrarDevolucion");
    }
    
    public void generarInformePrestamos(){
        System.out.println("generarInformePrestamos");
    }
}
