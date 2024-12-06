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
    private Animal animal;
    private Cuidador cuidador;
    private Date fechaRegistro;
    private String observaciones;

    public Registro() {
    }

    public Registro(Animal animal, Cuidador cuidador, Date fechaRegistro, String observaciones) {
        this.animal = animal;
        this.cuidador = cuidador;
        this.fechaRegistro = fechaRegistro;
        this.observaciones = observaciones;
    }

    public Registro(int id, Animal animal, Cuidador cuidador, Date fechaRegistro, String observaciones) {
        this.id = id;
        this.animal = animal;
        this.cuidador = cuidador;
        this.fechaRegistro = fechaRegistro;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
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

    @Override
    public String toString() {
        return "Registro{" + "id=" + id + ", animal=" + animal + ", cuidador=" + cuidador + ", fechaRegistro=" + fechaRegistro + ", observaciones=" + observaciones + '}';
    }
    
    
}
