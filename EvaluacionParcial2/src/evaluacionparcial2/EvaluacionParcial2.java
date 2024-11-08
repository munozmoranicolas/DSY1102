/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionparcial2;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class EvaluacionParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Proveedor");
            System.out.println("2. Registrar Producto");
            System.out.println("3. Mostrar Productos");
            System.out.println("4. Actualizar Stock");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Opcion de registrar proveedor");
                }

                case 2 -> {
                    System.out.print("Opcion de registrar Producto");
                }

                case 3 -> {
                    System.out.print("Opcion de mostrar productos");
                }

                case 4 -> {
                    System.out.print("Opcion de actualizar Stock ");
                }

                case 5 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
    
}
