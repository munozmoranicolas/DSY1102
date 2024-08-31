/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author munoz
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la Pizzeria BonAppetit");
        
        Pizza pizza1 = new Pizza("Pepperoni","Grande","Gruesa");
        String nombre = pizza1.getNombre();
        System.out.println("Ud ha comprado una pizza "+nombre);
        pizza1.setTamano("Mediano");
        String tamano = pizza1.getTamano();
        System.out.println("Ud ha comprado una pizza de tamaño "+tamano);
        //Test github 2
    }
    
}
