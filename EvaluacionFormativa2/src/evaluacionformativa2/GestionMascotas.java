/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa2;

import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class GestionMascotas {
    private ArrayList<Mascota> mascotas;

    public GestionMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public GestionMascotas() {
        this.mascotas = new  ArrayList<>();
    }
    
    public void agregarMascota(Mascota mascota) {
        for (Mascota m : mascotas) {
            if (m.getCodigo().equals(mascota.getCodigo())) {
                System.out.println("La mascota con el código " + mascota.getCodigo() + " ya existe.");
                return;
            }
        }
        mascotas.add(mascota);
        System.out.println("Mascota agregada con éxito.");
    }
    
    public void listarMascotas() {
        for (Mascota mascota : mascotas) {
            mascota.mostrarDatos();
        }
    }

    public int cantidadMascotas() {
        return mascotas.size();
    }
}
