/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionreservas;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class Gestionreservas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotel1 = new Hotel("H0001", "Hilton");
        Hotel hotel2 = new Hotel("H0001", "HUB");
        
        Habitacion habitacion1 = new Habitacion("101",100.0 , true);
        Habitacion habitacion2 = new Habitacion("102",200.0 , true);
        Habitacion habitacion3 = new Habitacion("103",300.0 , true);
        
        hotel1.agregarHabitacion(habitacion1);
        hotel1.agregarHabitacion(habitacion2);
        hotel1.agregarHabitacion(habitacion3);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre : ");
        
        
        boolean clienteRegistrado = false;
        Cliente cliente1 = new Cliente();
        do {            
            String nombreCliente = input.nextLine();
            if(!nombreCliente.isEmpty()){
                cliente1 = new Cliente("C0001", nombreCliente);
                clienteRegistrado = true;
            }
        } while (!clienteRegistrado);
        
        System.out.println("Selecciona la habitacion : ");
        for(Habitacion habitacion : hotel1.getHabitacionesDisponibles()){
            System.out.println((hotel1.getHabitacionesDisponibles().indexOf(habitacion) +1)+ ".- "+ habitacion.getNumeroHabitacion());
        }
        int indexHabitacion = input.nextInt();
        System.out.println("La habitacion seleccionada es "+ hotel1.getHabitacionesDisponibles().get(indexHabitacion-1));
        Reserva reserva1 = new Reserva(hotel1);
        reserva1.agregarReserva(hotel1.getHabitacionesDisponibles().get(indexHabitacion-1));
        cliente1.agregarReserva(reserva1);
        System.out.println(reserva1.toString());
        System.out.println(cliente1.toString());
        
        
    }
    
}
