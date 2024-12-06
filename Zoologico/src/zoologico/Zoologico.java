/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologico;
import controlador.AnimalController;
import controlador.CuidadorController;
import controlador.RegistroController;
import modelo.AnimalDAO;
import modelo.CuidadorDAO;
import modelo.RegistroDAO;
import vista.Principal;

/**
 *
 * @author munoz
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalDAO animalDAO = new AnimalDAO();
        CuidadorDAO cuidadorDAO = new CuidadorDAO();
        RegistroDAO registroDAO = new RegistroDAO();
        Principal principal = new Principal();
        
        AnimalController animalControlador = new AnimalController(animalDAO, principal);
        
        CuidadorController cuidadorControlador = new CuidadorController(cuidadorDAO, principal);
        
        RegistroController registroControlador = new RegistroController(registroDAO, principal);
        
        principal.setVisible(true);
    }
    
}
