/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa2;

/**
 *
 * @author munoz
 */
public abstract class Mascota {
    private String codigo;
    private String nombre;
    private double peso;
    private int edad;
    private int diasAlojamiento;
    private boolean requiereSupervision;

    public Mascota(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean requiereSupervision) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.requiereSupervision = requiereSupervision;
    }

    public Mascota() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasAlojamiento() {
        return diasAlojamiento;
    }

    public void setDiasAlojamiento(int diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }

    public boolean isRequiereSupervision() {
        return requiereSupervision;
    }

    public void setRequiereSupervision(boolean requiereSupervision) {
        this.requiereSupervision = requiereSupervision;
    }
    
    public abstract void mostrarDatos();
}
