/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author munoz
 */
public class Venta {
    
    private String fechaVenta;
    private Cliente cliente;
    private Bicicleta bicicleta;
    private double valorVenta;

    public Venta() {
    }

    public Venta(String fechaVenta, Cliente cliente, Bicicleta bicicleta, double valorVenta) {
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.valorVenta = valorVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "fechaVenta=" + fechaVenta + ", cliente=" + cliente + ", bicicleta=" + bicicleta + ", valorVenta=" + valorVenta + '}';
    }
    
    
}
