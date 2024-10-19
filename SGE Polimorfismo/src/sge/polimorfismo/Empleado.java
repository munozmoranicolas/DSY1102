/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sge.polimorfismo;

/**
 *
 * @author munoz
 */
public abstract class Empleado {
    private String idEmpleado;
    private String nombre;
    private double sueldoBase;

    public Empleado(String idEmpleado, String nombre, double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public abstract double calcularSalario();
    
}
