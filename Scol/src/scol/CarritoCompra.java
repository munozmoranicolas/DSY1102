/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scol;

/**
 *
 * @author CETECOM
 */
public class CarritoCompra {
    
    private String productos;
    private double total;

    //Constructor
    public CarritoCompra(String productos, double total) {
        this.productos = productos;
        this.total = total;
    }
    
    //Accesores y Mutadores

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
