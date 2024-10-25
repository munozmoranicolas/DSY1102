/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa2;

/**
 *
 * @author munoz
 */
public class Perro extends Mascota{
    private boolean haceEjercicio;

    public Perro(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean requiereSupervision) {
        super(codigo, nombre, peso, edad, diasAlojamiento, requiereSupervision);
    }

    public Perro() {
        
    }

    public boolean isHaceEjercicio() {
        return haceEjercicio;
    }

    public void setHaceEjercicio(boolean haceEjercicio) {
        this.haceEjercicio = haceEjercicio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Perro - Código: " + getCodigo() + ", Nombre: " + getNombre() + ", Peso: " + getPeso() +
                " kg, Edad: " + getEdad() + " años, Días de Alojamiento: " + getDiasAlojamiento() +
                ", Requiere Supervisión: " + isRequiereSupervision() + ", Hace Ejercicio: " + haceEjercicio);    }
    
}
