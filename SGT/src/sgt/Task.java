/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgt;

import java.util.Date;

/**
 *
 * @author munoz
 */
public class Task {
    private int idTask;
    private String nombre;
    private Date fechaLimite;
    private int prioridad; // 1: Alta, 2: Media, 3: Baja
    private boolean completada;

    public Task() {
    }

    public Task(int idTask, String nombre, Date fechaLimite, int prioridad) {
        this.idTask = idTask;
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.completada = false;
    }

    // Getters y setters
    public int getIdTask() { return idTask; }
    public String getNombre() { return nombre; }
    public Date getFechaLimite() { return fechaLimite; }
    public int getPrioridad() { return prioridad; }
    public boolean isCompletada() { return completada; }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "ID : "+getIdTask()+
                "\nNombre : "+getNombre()+
                "\nFecha Limite : "+getFechaLimite()+
                "\nPrioridad : "+getPrioridad()+
                "\nEstado : "+isCompletada();
    }
}
