/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservas;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Hotel {
    
    private String idHotel;
    private String nombre;
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel() {
        habitacionesDisponibles = new ArrayList<Habitacion>();
    }

    public Hotel(String idHotel, String nombre) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        habitacionesDisponibles = new ArrayList<Habitacion>();
    }
    
    public boolean agregarHabitacion(Habitacion habitacion){
        return habitacionesDisponibles.add(habitacion);
    }
    
    public boolean eliminarHabitacion(String numeroHabitacion){
        for(Habitacion habitacion : habitacionesDisponibles){
            if(habitacion.getNumeroHabitacion().equals(numeroHabitacion)){
                habitacionesDisponibles.remove(habitacion);
            }
        }
        return false;
    }
    
    public boolean buscarHabitacion(String numeroHabitacion){
        for(Habitacion habitacion : habitacionesDisponibles){
            if(habitacion.getNumeroHabitacion().equals(numeroHabitacion)){
                return true;
            }
        }
        return false;
    }
    
    public void listarHabitaciones(){
        for(Habitacion habitacion : habitacionesDisponibles){
            System.out.println(habitacion.toString());
        }
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombre=" + nombre + ", habitacionesDisponibles=" + habitacionesDisponibles + '}';
    }
    
}
