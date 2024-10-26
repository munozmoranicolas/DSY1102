/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sge.polimorfismo;

/**
 *
 * @author munoz
 */
public class EmpleadoPorHora extends Empleado implements BonusCalculable{
    
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora, String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora * calcularBonus();
    }
    
    @Override
    public double calcularBonus() {
        if(horasTrabajadas >= 160){
            return tarifaPorHora*1.2;
        }
        else{
            return tarifaPorHora*1.1;
        }
    }
}
