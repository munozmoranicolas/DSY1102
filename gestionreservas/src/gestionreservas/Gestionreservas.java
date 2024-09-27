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
        do {            
            String nombreCliente = input.nextLine();
            if(!nombreCliente.isEmpty()){
                Cliente cliente1 = new Cliente("C0001", nombreCliente);
                clienteRegistrado = true;
            }
        } while (!clienteRegistrado);
        
        boolean menu = true;
        do {           
            try {
                System.out.println("Seleccione hotel de preferencia");
                System.out.println("1.- Hilton");
                System.out.println("2.- HUB");
                System.out.println("3.- Salir");
                String opcion = input.next();
                switch (opcion) {
                    case "1" -> {
                        Hotel hotel_select = hotel1;
                        
                    }
                    case "2" -> {                    
                        Hotel hotel_select = hotel2;
                    }
                    case "3" -> {
                        System.out.println("Adios");
                        menu = false;
                        break;
                    }
                    default -> System.err.println("Opcion no valida!");
                }
            } catch (Exception e) {
                    System.err.println("Opcion no valida!");
            }
            
        } while (menu);
        
        
        /*Cliente cliente2 = new Cliente("C0002", "Andrea");
        
        hotel1.agregarHabitacion(habitacion1);
        hotel1.listarHabitaciones();
        
        hotel2.agregarHabitacion(habitacion1);
        hotel2.listarHabitaciones();
        
        if(hotel1.buscarHabitacion("101")){
            for(Habitacion habitacion :hotel1.getHabitacionesDisponibles()){
                if(habitacion.getNumeroHabitacion().equals("101")){
                    reserva1.agregarReserva(habitacion);
                    cliente1.agregarReserva(reserva1);
                    hotel1.eliminarHabitacion("101");
                }
            }
        }*/
        
        
    }
    
}
