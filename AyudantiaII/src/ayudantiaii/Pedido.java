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
public class Pedido implements Calculable{
    private ArrayList<Producto> itemsPedido;

    public Pedido() {
        itemsPedido = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        itemsPedido.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : itemsPedido) {
            total += producto.getPrecio();
        }
        return total;
    }
    
}
