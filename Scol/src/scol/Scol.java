/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scol;

/**
 *
 * @author CETECOM
 */
public class Scol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto("PROD001", "Producto Prueba", 1000);
        CarritoCompra carrito = new CarritoCompra(producto1.toString(), 1000);
        Cliente cliente1 = new Cliente("1111-1", "Juan", carrito);
        
        System.out.println(cliente1.getCarrito().getTotal());
    }
    
}
