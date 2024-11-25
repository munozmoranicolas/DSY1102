/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private ArrayList<Prestamo> librosPrestados;

    public Usuario() {
        librosPrestados = new ArrayList<>();
    }

    public Usuario(int idUsuario, String nombre, ArrayList<Prestamo> librosPrestados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }

    public Usuario(int idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Prestamo> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Prestamo> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
    public void realizarPrestamo(Libro libro, String fechaPrestamo){
        System.out.println("realizarPrestamo");
    }
    
    public ArrayList<Prestamo> verHistorialPrestamos(){
        return getLibrosPrestados();
    }
}
