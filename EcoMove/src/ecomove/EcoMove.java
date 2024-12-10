/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecomove;

import controlador.BicicletaController;
import java.util.Scanner;
import modelo.Bicicleta;
import modelo.BicicletaElectrica;
import modelo.BicicletaMontana;
import vista.Principal;

/**
 *
 * @author munoz
 */
public class EcoMove {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BicicletaController bicicletaController = new BicicletaController();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bienvenid@\n");
        
        int opcion = 0;
        
        while(opcion!=3){
            System.out.println("Elegir Entorno:\n1.-Interfaz Grafica\n2.-Consola\n3.-Salir");
            opcion = input.nextInt();
            input.nextLine();
            
            if(opcion == 1){
                Principal vistaPrincipal = new Principal();
                vistaPrincipal.setVisible(true);
            }
            else if(opcion == 2 ){
                menuConsola(bicicletaController,input);
            }
            else if(opcion == 3){
                System.out.println("Adios");                
            }
            else{
                System.out.println("Opcion incorrecta!");                
            }
        }
    }
    
    private static void menuConsola(BicicletaController bicicletaController,Scanner scanner){
        int opcion = 0;
        
        while(opcion != 4){
            System.out.println("Seleccione Menu:\n1.-Bicicleta\n2.-Cliente\n3.-Venta\n4.-Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Codigo : ");
                    String codigo = scanner.nextLine();
                    
                    System.out.println("Marca : ");
                    String marca = scanner.nextLine();
                            
                    System.out.println("Modelo : ");
                    String modelo = scanner.nextLine();
                            
                    System.out.println("Kilometraje : ");
                    int kilometraje = scanner.nextInt();
                    scanner.nextLine();
                        
                    int tipo = 0;
                    while(tipo == 0){
                        System.out.println("Tipo (1.-Montaña/2.-Electrica) : ");
                        tipo = scanner.nextInt();
                        scanner.nextLine();
                    
                        if(tipo == 1){
                            System.out.println("Suspencion (Ninguna,Delantera,Doble) :");
                            String suspencion = scanner.nextLine();
                            
                            Bicicleta bicicleta = new BicicletaMontana(suspencion, codigo, marca, modelo, kilometraje, codigo);
                            bicicletaController.agregarBicicleta(bicicleta);
                        }
                        else if(tipo == 2){
                            System.out.println("Capacidad Electrinca:");
                            int capacidad = scanner.nextInt();
                            scanner.nextLine();
                            
                            Bicicleta bicicleta = new BicicletaElectrica(capacidad, codigo, marca, modelo, kilometraje, codigo);
                            bicicletaController.agregarBicicleta(bicicleta);
                        }
                        else{
                            System.out.println("Opcion incorrecta!");
                            tipo = 0;
                        }
                    }    
                    System.out.println(bicicletaController.toString());
                }
                case 2 -> {
                    System.out.println("Cliente");
                }
                case 3 -> {
                    System.out.println("Venta");
                }
                case 4 -> {
                    System.out.println("Salir");
                }
                default -> throw new AssertionError();
            }
        }
    }
    
}
