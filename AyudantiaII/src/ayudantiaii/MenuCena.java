/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayudantiaii;

/**
 *
 * @author munoz
 */
public final class MenuCena extends Menu {
    @Override
    public void mostrarMenu() {
        System.out.println("Menú de Cena:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }
}