/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservas;

/**
 *
 * @author munoz
 */
public class Habitacion {
    
    private String numeroHabitacion;
    private Double precioNoche;
    private Boolean disponible;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, Double precioNoche, Boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", precioNoche=" + precioNoche + ", disponible=" + disponible + '}';
    }
    
    
}
