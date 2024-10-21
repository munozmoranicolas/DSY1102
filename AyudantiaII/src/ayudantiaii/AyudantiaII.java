/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayudantiaii;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class AyudantiaII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuDesayuno menuDesayuno = new MenuDesayuno();
        menuDesayuno.agregarProducto(new Producto("Cafe", 2.50));
        menuDesayuno.agregarProducto(new Producto("Pan Tostado", 1.50));
        
        Pedido pedido = new Pedido();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            menuDesayuno.mostrarMenu();
            System.out.println("Elige un producto (o escribe 'salir' para finalizar):");
            String eleccion = scanner.nextLine();

            if (eleccion.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                for (Producto producto : menuDesayuno.productos) {
                    if (producto.getNombre().equalsIgnoreCase(eleccion)) {
                        pedido.agregarProducto(producto);
                    }
                }
            }
        }

        System.out.println("Total a pagar: $" + pedido.calcularTotal());
    }
    
}
