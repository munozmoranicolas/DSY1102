/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayudantiaev2;

/**
 *
 * @author munoz
 */
public class MenuDesayuno extends Menu{

    @Override
    public void mostrarMenu() {
        System.out.println("Menú de Desayuno:");
        for(Producto producto : productos){
            System.out.println(producto.getNombre() + " - $"+producto.getPrecio());
        }
    }
    
}
