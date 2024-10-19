/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sge.polimorfismo;

/**
 *
 * @author munoz
 */
public class EmpleadoAsalariado extends Empleado implements BonusCalculable{

    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }
    
    @Override
    public double calcularSalario() {
        return getSueldoBase() + calcularBonus();
    }
    
    @Override
    public double calcularBonus() {
        return getSueldoBase() * 0.10; // Por ejemplo, un bonus del 10% del sueldo base
    }
}
