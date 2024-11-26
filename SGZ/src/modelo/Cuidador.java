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
public class Cuidador {
    private int id;
    private String nombre;
    private Date fechaContratacion;
    private String especialidad;
    private String turno;

    public Cuidador() {
    }

    public Cuidador(String nombre, Date fechaContratacion, String especialidad, String turno) {
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public Cuidador(int id, String nombre, Date fechaContratacion, String especialidad, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
}
