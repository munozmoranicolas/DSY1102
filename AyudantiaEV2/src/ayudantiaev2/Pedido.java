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
public class Pedido implements Calculable{
    private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for(Producto prod : productos){
            total += prod.getPrecio();
        }
        return total;
    }
        
}
