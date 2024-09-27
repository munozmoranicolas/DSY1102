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
               
        
    }
    
}
