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
public class Reserva {
    
    private Hotel hotel;
    private ArrayList<Habitacion> habitacionReservada;

    public Reserva() {
        this.habitacionReservada = new ArrayList<Habitacion>();
    }

    public Reserva(Hotel hotel) {
        this.hotel = hotel;
        this.habitacionReservada = new ArrayList<Habitacion>();
    }
       
    public boolean agregarReserva(Habitacion habitacion){
        this.hotel.eliminarHabitacion(habitacion.getNumeroHabitacion());
        return habitacionReservada.add(habitacion);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Reserva{" + "hotel=" + hotel + ", habitacionReservada=" + habitacionReservada + '}';
    }

    
    
    
}
