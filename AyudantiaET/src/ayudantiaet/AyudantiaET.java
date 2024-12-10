/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayudantiaet;


import java.util.Scanner;
import vista.Principal;

/**
 *
 * @author munoz
 */
public class AyudantiaET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
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
            else if(opcion == 2){
                menuConsola(input);
            }
            else if(opcion == 3){
                System.out.println("Adios");
            }
            else{
                System.out.println("Opcion Erronea");
            }
        }
        input.close();       
    }
    
    public static void menuConsola(Scanner scanner){
        
        int opcion = 0;
        while(opcion != 4){
            
            System.out.println("Seleccione Menu:\n1.-Bicicleta\n2.-Cliente\n3.-Venta\n4.-Salir");
            opcion = scanner.nextInt();
            if(opcion == 1){
                System.out.println("Bicicleta");
            }
            else if(opcion == 2){
                System.out.println("Cliente");

            }
            else if(opcion == 3){
                System.out.println("Venta");            
            }
            else if(opcion == 4){
                System.out.println("Adios");            
            }
            else{
                System.out.println("Opcion Erronea");            
            }
        }
        
        
    }
    
}
