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
        //SimpleDateFormat fecha_formato = new SimpleDateFormat("dd/MM/yyyy");
        
        //Informacion Estudiantes
        Date fecha_nacimiento1 = new Date(1994,11,28);
        Alumno estudiante1 = new Alumno("11.111.111-1", "Amalia Nunes", 20,fecha_nacimiento1);
        //System.out.println(fecha_formato.format(estudiante1.getFecha_nacimiento()));
        
        Date fecha_nacimiento2 = new Date(1994,10,29);
        Alumno estudiante2 = new Alumno("22.222.222-2", "Francisco Fuentes", 29,fecha_nacimiento2);
        //System.out.println(fecha_formato.format(estudiante1.getFecha_nacimiento()));
        
        //Informacion Docentes
        Date fecha_ingreso1 = new Date(2023,10,01);
        Docente profesor1 = new Docente("33.333.333-3", 1, "Juan Soto", fecha_ingreso1, "Antonio Varas");
        //System.out.println(fecha_formato.format(profesor1.getFecha_ingreso()));
        
        Date fecha_ingreso2 = new Date(2024,12,01);
        Docente profesor2 = new Docente("33.333.333-3", 1, "Pedro Suazo", fecha_ingreso2, "Antonio Varas");
        //System.out.println(fecha_formato.format(profesor1.getFecha_ingreso()));
        
        //Informacion Asignaturas
        Asignatura curso1 = new Asignatura("MAT0101", "Matematica Aplicada", estudiante1, profesor1, 4.5f, 3.8f, 4.5f);
        Asignatura curso2 = new Asignatura("PBD2208", "Programacion de BND", estudiante2, profesor2, 5.2f, 4.7f, 5.1f);
        
        //Notas de presentacion
        float notaPresentacion1 = curso1.getNotaPresentacion();
        System.out.println("Nota presentacion 1 : "+notaPresentacion1);
        
        float notaPresentacion2 = curso2.getNotaPresentacion();
        System.out.println("Nota presentacion 1 : "+notaPresentacion2);
        
        //Estado de eximicion 
        String eximicion1 = curso1.getEximido(notaPresentacion1);
        System.out.println("Estudiante "+curso1.getEstudiante().getNombre()+" se encuentra : "+eximicion1);
        
        String eximicion2 = curso1.getEximido(notaPresentacion2);
        System.out.println("Estudiante "+curso2.getEstudiante().getNombre()+" se encuentra : "+eximicion2);
        
        //Nota Final
        String notaFinal1 = curso1.getNotaFinal(notaPresentacion1, 3.3f);
        System.out.println(notaFinal1);
        
        String notaFinal2 = curso2.getNotaFinal(notaPresentacion2, 5.01f);
        System.out.println(notaFinal2);
    }
    
}
