/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa;

/**
 *
 * @author munoz
 */
public class Asignatura {
    
    private String codigo_unico;
    private String nombre;
    private Alumno estudiante;
    private Docente profesor;
    private float nota1;
    private float nota2;
    private float nota3;

    public Asignatura(String codigo_unico, String nombre, Alumno estudiante, Docente profesor, float nota1, float nota2, float nota3) {
        this.codigo_unico = codigo_unico;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(String codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    public Docente getProfesor() {
        return profesor;
    }

    public void setProfesor(Docente profesor) {
        this.profesor = profesor;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public float getNotaPresentacion(){
        float notaPresentacion = (this.nota1*0.3f)+(this.nota2*0.3f)+(this.nota3*0.4f);
        return notaPresentacion;
    }
    
    public String getEximido(float notaPresentacion){
        if(notaPresentacion >= 5.0f){
            return "Eximido";
        }
        else{
            return "No Eximido";
        }
    }
    
    public String getNotaFinal(float notaPresentacion,float notaExamen){
        float notaFinal = (notaPresentacion*0.6f)+(notaExamen*0.4f); 
        if(notaFinal >= 4.0f){
            return "El estudiante "+this.estudiante.getNombre()+" Aprobo con nota final :"+notaFinal;
        }
        else{
            return "El estudiante "+this.estudiante.getNombre()+" Reprobo con nota final :"+notaFinal;
        } 
        
    }
}
