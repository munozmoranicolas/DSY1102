/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayudantiaii;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public abstract class Menu {
    protected ArrayList<Producto> productos;

    public Menu() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public abstract void mostrarMenu();
}
