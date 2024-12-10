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
    
    private String tipoSuspencion;

    public BicicletaMontana() {
    }

    public BicicletaMontana(String tipoSuspencion, String codigo, String marca, String modelo, int kilometraje, String tipo) {
        super(codigo, marca, modelo, kilometraje, tipo);
        this.tipoSuspencion = tipoSuspencion;
    }

    public String getTipoSuspencion() {
        return tipoSuspencion;
    }

    public void setTipoSuspencion(String tipoSuspencion) {
        this.tipoSuspencion = tipoSuspencion;
    }

    @Override
    public String toString() {
        return "Bicicleta "+getTipo()+" ("+ getCodigo() +") "+ getMarca() +" Suspencion(" + tipoSuspencion + ")";
    }
    
    
}
