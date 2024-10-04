/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sce;

/**
 *
 * @author munoz
 */
public class Electronico extends Producto{
    
    private String marca;
    private int garantiaMeses;

    public Electronico() {
    }

    public Electronico(String marca, int garantiaMeses) {
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico(String marca, int garantiaMeses, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    
    public void extenderGarantia(int mesesExtra){
        int extension = getGarantiaMeses()+mesesExtra;
        this.setGarantiaMeses(extension);
    }
    
    
}
