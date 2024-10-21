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
        // Crear menús
        MenuDesayuno menuDesayuno = new MenuDesayuno();
        MenuAlmuerzo menuAlmuerzo = new MenuAlmuerzo();
        MenuCena menuCena = new MenuCena();

        // Agregar productos a los menús
        menuDesayuno.agregarProducto(new Producto("Café", 2.50));
        menuDesayuno.agregarProducto(new Producto("Pan Tostado", 1.50));

        menuAlmuerzo.agregarProducto(new Producto("Hamburguesa", 5.00));
        menuAlmuerzo.agregarProducto(new Producto("Ensalada", 3.50));

        menuCena.agregarProducto(new Producto("Pizza", 8.00));
        menuCena.agregarProducto(new Producto("Pasta", 7.00));

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        Pedido pedido = new Pedido();

        while (continuar) {
            System.out.println("Selecciona el tipo de menú (1. Desayuno, 2. Almuerzo, 3. Cena) o 'salir' para finalizar:");
            String eleccionMenu = scanner.nextLine();

            switch (eleccionMenu) {
                case "1" -> {
                    menuDesayuno.mostrarMenu();
                    agregarProductosAlPedido(menuDesayuno, pedido, scanner);
                }
                case "2" -> {
                    menuAlmuerzo.mostrarMenu();
                    agregarProductosAlPedido(menuAlmuerzo, pedido, scanner);
                }
                case "3" -> {
                    menuCena.mostrarMenu();
                    agregarProductosAlPedido(menuCena, pedido, scanner);
                }
                case "salir" -> continuar = false;
                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
        System.out.println("Total a pagar: $" + pedido.calcularTotal());
    }

    private static void agregarProductosAlPedido(Menu menu, Pedido pedido, Scanner scanner) {
        System.out.println("Escribe el nombre del producto que deseas añadir al pedido (o 'fin' para terminar):");
        String productoElegido = scanner.nextLine();

        while (!productoElegido.equalsIgnoreCase("fin")) {
            boolean productoEncontrado = false;
            for (Producto producto : menu.productos) {
                if (producto.getNombre().equalsIgnoreCase(productoElegido)) {
                    pedido.agregarProducto(producto);
                    productoEncontrado = true;
                    System.out.println(producto.getNombre() + " añadido al pedido.");
                }
            }
            if (!productoEncontrado) {
                System.out.println("Producto no encontrado. Intenta de nuevo.");
            }
            productoElegido = scanner.nextLine();
        }
    }
}
