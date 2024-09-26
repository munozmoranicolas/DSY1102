/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scootin;

/**
 *
 * @author munoz
 */
public class Scootin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puesto pueston = new Puesto(1,"gerente");
        Puesto puestito = new Puesto(2, "ejecutivo");
        
        Empleado empleado1 = new Empleado("1-9","John",'M',10,40,pueston);
        Empleado empleado2 = new Empleado("2-7","Juanita",'F',2,25,puestito);
        
        Empresa empresa = new Empresa();
        
        if(empresa.buscarEmpleado("1-9") == false){
            empresa.agregar(empleado1);
            System.out.println("Se agregó empleado "+ empleado1.getNombreEmpleado());
        }
        else{
            System.out.println("Empleado existe");
        }
        
        empresa.listarEmpleados();
        
        if(empresa.eliminarEmpleado("2-7")){
            System.out.println("Se elimino empleado "+ empleado2.getNombreEmpleado());
        }
        else{
            System.out.println("No se eliminó el empleado "+ empleado2.getNombreEmpleado());
        }
        
        empresa.listarEmpleados();

    }
    
}
