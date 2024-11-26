/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Animal;
import modelo.AnimalDAO;

/**
 *
 * @author munoz
 */
public class AnimalController {

    public static String agregarAnimal(Animal animal) {
        try {
            return AnimalDAO.agregarAnimal(animal);
        } catch (Exception e) {
            return "Error: "+e.getMessage();
        }
    }
}
