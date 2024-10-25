/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionformativa2;

/**
 *
 * @author munoz
 */
public class EvaluacionFormativa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionMascotas gestionMascotas = new GestionMascotas();
        
        // Agregar 3 perros
        Perro bobby = new Perro("P001", "Bobby", 20.0, 3, 7, true);
        Perro rocky = new Perro("P002", "Rocky", 25.5, 5, 5, false);
        Perro max = new Perro("P003", "Max", 15.0, 2, 3, true); 
        gestionMascotas.agregarMascota(bobby);
        gestionMascotas.agregarMascota(rocky);
        gestionMascotas.agregarMascota(max);

        // Agregar 2 gatos
        Gato mishka = new Gato( "Siames","G001", "Mishka", 4.5, 4, 6, true);
        Gato luna = new Gato("Angora","G002", "Luna", 3.2, 3, 8, false);
        gestionMascotas.agregarMascota(mishka);
        gestionMascotas.agregarMascota(luna);

        // Agregar 2 conejos
        Conejo snowball = new Conejo("Vegetariana","C001", "Snowball", 2.0, 1, 4, true);
        Conejo daisy = new Conejo( "Mixta","C002", "Daisy", 2.3, 2, 5, false);
        gestionMascotas.agregarMascota(snowball);
        gestionMascotas.agregarMascota(daisy);

        // Listar todas las mascotas y el total de mascotas
        System.out.println("\n--- Lista de Mascotas Alojadas ---");
        gestionMascotas.listarMascotas();
        System.out.println("\nTotal de mascotas alojadas: " + gestionMascotas.cantidadMascotas());
    }
    
}
