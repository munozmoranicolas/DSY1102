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
public class Cliente {
    
    private String idCliente;
    private String nombre;
    private ArrayList<Pedido> pedidosRealizados;

    public Cliente() {
        this.pedidosRealizados = new ArrayList<Pedido>();
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pedidosRealizados = new ArrayList<Pedido>();
    }

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

    public ArrayList<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }
    
    public void agregarPedido(Pedido pedido){
        this.pedidosRealizados.add(pedido);
    }
    
    
}
