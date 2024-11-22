/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author munoz
 */
public class Libro {
    
    private int idLibro;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, String autor, boolean disponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void prestarLibro(){
        System.out.println("prestarLibro");
    }
    
    public void devolverLibro(){
        System.out.println("devolverLibro");
    }
    
    public boolean getDisponibilidad(){
         return true;
    }
}
