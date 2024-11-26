/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author munoz
 */
public class Cuidador {
    
    private int id;
    private String nombre;
    private String especialidad;
    private String turno;

    public Cuidador() {
    }

    public Cuidador(int id, String nombre, String especialidad, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public Cuidador(String nombre, String especialidad, String turno) {
        this.nombre = nombre;
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
