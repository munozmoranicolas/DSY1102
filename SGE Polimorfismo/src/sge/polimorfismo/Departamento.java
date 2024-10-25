/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sge.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Departamento {
    private String idDepartamento;
    protected String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.empleados = new ArrayList<>();
    }

    public Departamento(String idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
    
    public double calcularCostoTotalSalarios(){
        double totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.calcularSalario();
        }
        return totalSalarios;
    }
    
}
