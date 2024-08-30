/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionformativa;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author munoz
 */
public class EvaluacionFormativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Formato fecha
        SimpleDateFormat fecha_formato = new SimpleDateFormat("dd/MM/yyyy");
        //Informacion Estudiante
        Date fecha_nacimiento = new Date(1994,11,28);
        Alumno estudiante1 = new Alumno("18.850.432-9", "Nicolas Andres Muñoz Mora", 29,fecha_nacimiento);
        System.out.println(fecha_formato.format(estudiante1.getFecha_nacimiento()));
        
        Date fecha_ingreso = new Date(2023,01,01);
        Docente profesor1 = new Docente("11.111.111-1", 1, "Juanito Perez", fecha_ingreso, "Antonio Varas");
        System.out.println(fecha_formato.format(profesor1.getFecha_ingreso()));
        
    }
    
}
