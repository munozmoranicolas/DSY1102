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
public class Registro {
    
    private int id;
    private int idAnimal;
    private int idCuidador;
    private Date fechaRegistro;
    private String observaciones;

    public Registro() {
    }

    public Registro(int id, int idAnimal, int idCuidador, Date fechaRegistro, String observaciones) {
        this.id = id;
        this.idAnimal = idAnimal;
        this.idCuidador = idCuidador;
        this.fechaRegistro = fechaRegistro;
        this.observaciones = observaciones;
    }

    public Registro(int idAnimal, int idCuidador, Date fechaRegistro, String observaciones) {
        this.idAnimal = idAnimal;
        this.idCuidador = idCuidador;
        this.fechaRegistro = fechaRegistro;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
