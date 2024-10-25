/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayudantiaev2;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public abstract class Menu {
    protected ArrayList<Producto> productos;

    public Menu() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public abstract void mostrarMenu();
    
}
