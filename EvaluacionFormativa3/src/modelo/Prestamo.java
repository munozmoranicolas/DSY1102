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
public class Prestamo {
    
    private int id;
    private int idLibro;
    private int idUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean aplicaMulta;
    private double totalMulta;

    public Prestamo() {
    }

    public Prestamo(int id, int idLibro, int idUsuario, Date fechaPrestamo, Date fechaDevolucion, boolean aplicaMulta, double totalMulta) {
        this.id = id;
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.aplicaMulta = aplicaMulta;
        this.totalMulta = totalMulta;
    }

    public Prestamo(int idLibro, int idUsuario, Date fechaPrestamo, Date fechaDevolucion, boolean aplicaMulta, double totalMulta) {
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.aplicaMulta = aplicaMulta;
        this.totalMulta = totalMulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isAplicaMulta() {
        return aplicaMulta;
    }

    public void setAplicaMulta(boolean aplicaMulta) {
        this.aplicaMulta = aplicaMulta;
    }

    public double getTotalMulta() {
        return totalMulta;
    }

    public void setTotalMulta(double totalMulta) {
        this.totalMulta = totalMulta;
    }
    
    
}
