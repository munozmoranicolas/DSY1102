/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa;
import java.util.Date;

/**
 *
 * @author munoz
 */
public class Docente {
    
    private String rut;
    private int nro_docente;
    private String nombre;
    private Date fecha_ingreso;
    private String sede;

    public Docente(String rut, int nro_docente, String nombre, Date fecha_ingreso, String sede) {
        this.rut = rut;
        this.nro_docente = nro_docente;
        this.nombre = nombre;
        this.fecha_ingreso = fecha_ingreso;
        this.sede = sede;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNro_docente() {
        return nro_docente;
    }

    public void setNro_docente(int nro_docente) {
        this.nro_docente = nro_docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    
}
