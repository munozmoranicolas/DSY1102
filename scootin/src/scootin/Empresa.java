/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scootin;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Empresa {
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado emple){
        return listaEmpleados.add(emple);
    }
    
    public boolean buscarEmpleado(String rut){
        for(Empleado emple: listaEmpleados){
            if(emple.getRut().equals(rut)){
                return true;
            }
        }
        return false;
    }
    
    public void listarEmpleados(){
        for(Empleado emple : listaEmpleados){
            System.out.println(emple.toString());
        }
    }
    
    public boolean eliminarEmpleado(String rut){
        for(Empleado emple : listaEmpleados){
            if(emple.getRut().equals(rut)){
                listaEmpleados.remove(emple);
                return true;
            }
        }
        return false;
    }
}
