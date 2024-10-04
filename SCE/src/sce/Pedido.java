/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sce;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Pedido {
    
    private ArrayList<Producto> productos;
    private double total;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public Pedido(ArrayList<Producto> productos, double total) {
        this.productos = productos;
        this.total = total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public double calcularTotal(){
        this.total = 0;
        for(Producto producto : productos){
            this.total += producto.getPrecio();
        }
        return this.total;
    }
    
}
