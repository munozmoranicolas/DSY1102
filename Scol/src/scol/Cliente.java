/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scol;

/**
 *
 * @author CETECOM
 */
public class Cliente {
    
    private String idCliente;
    private String nombre;
    private CarritoCompra carrito;
    
    //Constructor
    public Cliente(String idCliente, String nombre, CarritoCompra carrito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carrito = carrito;
    }
    
    //Accesores y Mutadores

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarritoCompra getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoCompra carrito) {
        this.carrito = carrito;
    }

}
