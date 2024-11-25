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
    private String categoria;
    private boolean disponible;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, String autor, String categoria, boolean disponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Libro(int idLibro, String titulo, String autor, String categoria) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = true;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
         return isDisponible();
    }
}
