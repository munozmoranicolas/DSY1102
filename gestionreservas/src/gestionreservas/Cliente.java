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
public class Cliente {
    
    private String idCliente;
    private String nombre;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente() {
        reservasRealizadas = new ArrayList<Reserva>();
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservasRealizadas = new ArrayList<Reserva>();
    }
    
    public boolean agregarReserva(Reserva reserva){
        return reservasRealizadas.add(reserva);
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", reservasRealizadas=" + reservasRealizadas + '}';
    }
    
}
