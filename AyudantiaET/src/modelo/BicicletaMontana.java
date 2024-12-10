/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author munoz
 */
public class BicicletaMontana extends Bicicleta{
    
    private String tipoSuspension;

    public BicicletaMontana() {
    }

    public BicicletaMontana(String tipoSuspension, String codigo, String marca, String modelo, int kilometraje, String tipo) {
        super(codigo, marca, modelo, kilometraje, tipo);
        this.tipoSuspension = tipoSuspension;
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }

    @Override
    public String toString() {
        return "Bicicleta de Montaña ("+ getCodigo()+") : "+getMarca()+" - "+getModelo()+" - "+tipoSuspension;
    }
    
    
}
