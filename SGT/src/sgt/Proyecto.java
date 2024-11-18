/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgt;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Proyecto {
    private int idProyecto;
    private String nombre;
    private ArrayList<Task> tareas;

    public Proyecto(int idProyecto, String nombre) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    // Métodos para agregar y remover tareas
    public void agregarTarea(Task tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Task tarea) {
        tareas.remove(tarea);
    }

    // Getters y setters
    public int getIdProyecto() { return idProyecto; }
    public String getNombre() { return nombre; }
    public ArrayList<Task> getTareas() { return tareas; }

    @Override
    public String toString() {
        return nombre + " (Tareas: " + tareas.size() + ")";
    }
}
