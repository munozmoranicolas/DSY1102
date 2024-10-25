/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sge.polimorfismo;

/**
 *
 * @author munoz
 */
public class SGEPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Departamento departamento = new Departamento("D01", "Recursos Humanos");

        // Crear empleados asalariados y por hora
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("E001", "Juan Pérez", 5000.0);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora( 160, 25.0,"E002", "Ana Gómez", 0); // 160 horas trabajadas, tarifa 25 por hora

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleadoAsalariado);
        departamento.agregarEmpleado(empleadoPorHora);

        // Prueba de cálculo de salarios individuales
        System.out.println("Salario de " + empleadoAsalariado.nombre + ": " + empleadoAsalariado.calcularSalario());
        System.out.println("Salario de " + empleadoPorHora.nombre + ": " + empleadoPorHora.calcularSalario());

        // Prueba de cálculo de bonificaciones individuales
        System.out.println("Bonificación de " + empleadoAsalariado.nombre + ": " + empleadoAsalariado.calcularBonus());
        System.out.println("Bonificación de " + empleadoPorHora.nombre + ": " + empleadoPorHora.calcularBonus());

        // Prueba de cálculo del costo total de salarios del departamento
        System.out.println("Costo total de salarios en " + departamento.nombre + ": " + departamento.calcularCostoTotalSalarios());
    }
    
}
