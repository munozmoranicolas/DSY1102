/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayudantiaev2;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class AyudantiaEV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuDesayuno menuDesayuno = new MenuDesayuno();
        MenuAlmuerzo menuAlmuerzo = new MenuAlmuerzo();
        MenuCena menuCena = new MenuCena();
        
        //Desayuno
        Producto cafe = new Producto("Cafe",2.50);
        Producto pan = new Producto("Pan", 1.50);
        
        //Almuerzo
        Producto hamburguesa = new Producto("Hamburguesa",5);
        Producto ensalada = new Producto("Ensalada",4.50);
        
        //Cena
        Producto pizza = new Producto("Pizza",8.99);
        Producto chorrillana = new Producto("Chorrillana",10.50);
        
        menuDesayuno.agregarProducto(cafe);
        menuDesayuno.agregarProducto(pan);
        
        menuAlmuerzo.agregarProducto(hamburguesa);
        menuAlmuerzo.agregarProducto(ensalada);
        
        menuCena.agregarProducto(pizza);
        menuCena.agregarProducto(chorrillana);
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        Pedido pedido = new Pedido();
        
        while (continuar){
            System.out.println("Selecciona el tipo de menú (1. Desayuno, 2. Almuerzo, 3. Cena) o 'salir' para finalizar:");
            String tipoMenu = scanner.nextLine();
            
            switch (tipoMenu) {
                case "1" -> {
                    //System.out.println("Desayuno");
                    menuDesayuno.mostrarMenu();
                    agregarProductosAlPedido(menuDesayuno,pedido,scanner);
                }
                case "2" -> {
                    //System.out.println("Almuerzo");
                    menuAlmuerzo.mostrarMenu();
                    agregarProductosAlPedido(menuAlmuerzo,pedido,scanner);
                }
                case "3" -> {
                    //System.out.println("Cena");
                    menuCena.mostrarMenu();
                    agregarProductosAlPedido(menuCena,pedido,scanner);
                }
                case "salir" -> {
                    System.out.println("Adios!");
                    continuar = false;
                }
                default -> System.out.println("Opción inválida. Inténte nuevamente.");
            }
        }
        System.out.println("Total a pagar: $"+pedido.calcularTotal());
       
    }
    
    private static void agregarProductosAlPedido(Menu menu,Pedido pedido,Scanner scanner){
        System.out.println("Escribe el nombre del producto que desea añadir al pedido ( o 'fin' para terminar):");
        String productoSeleccionado = scanner.nextLine();
        
        while(!productoSeleccionado.equals("fin")){
            boolean productoExistente = false;
            for(Producto producto : menu.productos){
                if(producto.getNombre().equals(productoSeleccionado)){
                    pedido.agregarProducto(producto);
                    productoExistente = true;
                    System.out.println(producto.getNombre() + " añadido al pedido");
                }
            }
            if(!productoExistente){
                System.out.println("Producto no encontrado. Intenta nuevamente.");
            }
            productoSeleccionado = scanner.nextLine();
        }
    }
    
}
