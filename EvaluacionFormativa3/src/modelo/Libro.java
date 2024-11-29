/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author munoz
 */
public class Libro {
    
    private int isbn;
    private String titulo;
    private String editorial;
    private int ejemplaresDisponibles;
    private Date fechaPublicacion;
    private String genero;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String editorial, int ejemplaresDisponibles, Date fechaPublicacion, String genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
    }

    public Libro(String titulo, String editorial, int ejemplaresDisponibles, Date fechaPublicacion, String genero) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
