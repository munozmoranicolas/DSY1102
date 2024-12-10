/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Venta;

/**
 *
 * @author munoz
 */
public class VentaController {
    
    private ArrayList<Venta> ventas;

    public VentaController() {
        ventas = new ArrayList<>();
    }
    
    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }
    
    public ArrayList<Venta> listarVentas(){
        return ventas;
    }

    @Override
    public String toString() {
        return "VentaController{" + "ventas=" + ventas + '}';
    }

    
}
