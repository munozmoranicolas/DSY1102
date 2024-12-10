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
    
    private String fecha;
    private Cliente cliente;
    private Bicicleta bicicleta;
    private double valor;

    public Venta() {
    }

    public Venta(String fecha, Cliente cliente, Bicicleta bicicleta, double valor) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", cliente=" + cliente + ", bicicleta=" + bicicleta + ", valor=" + valor + '}';
    }
    
    
}
