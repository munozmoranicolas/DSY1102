/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author munoz
 */
public class BicicletaElectrica extends Bicicleta{
    
    private int capacidadBateria;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(int capacidadBateria, String codigo, String marca, String modelo, int kilometraje, String tipo) {
        super(codigo, marca, modelo, kilometraje, tipo);
        this.capacidadBateria = capacidadBateria;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "Bicicleta "+getTipo()+" ("+ getCodigo() +") "+ getMarca() +" " + capacidadBateria + " Wh";
    }
    
    
}
