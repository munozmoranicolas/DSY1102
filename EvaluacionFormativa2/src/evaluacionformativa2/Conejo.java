/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa2;

/**
 *
 * @author munoz
 */
public class Conejo extends Mascota{
    private String dieta;

    public Conejo(String dieta, String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean requiereSupervision) {
        super(codigo, nombre, peso, edad, diasAlojamiento, requiereSupervision);
        this.dieta = dieta;
    }

    public Conejo() {
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Conejo - Código: " + getCodigo() + ", Nombre: " + getNombre() + ", Peso: " + getPeso() +
                " kg, Edad: " + getEdad() + " años, Días de Alojamiento: " + getDiasAlojamiento() +
                ", Requiere Supervisión: " + isRequiereSupervision() + ", Dieta: " + dieta);
    }
    
    
}
