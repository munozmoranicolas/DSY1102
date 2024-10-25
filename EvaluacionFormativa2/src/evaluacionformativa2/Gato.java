/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa2;

/**
 *
 * @author munoz
 */
public class Gato extends Mascota{
    private String pedigree;

    public Gato(String pedigree, String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean requiereSupervision) {
        super(codigo, nombre, peso, edad, diasAlojamiento, requiereSupervision);
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public Gato() {
        
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Gato - Código: " + getCodigo() + ", Nombre: " + getNombre() + ", Peso: " + getPeso() +
                " kg, Edad: " + getEdad() + " años, Días de Alojamiento: " + getDiasAlojamiento() +
                ", Requiere Supervisión: " + isRequiereSupervision() + ", Pedigree: " + pedigree);
    }
    
    
}
