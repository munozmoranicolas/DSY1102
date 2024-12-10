/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Bicicleta;

/**
 *
 * @author munoz
 */
public class BicicletaController {
    
    private ArrayList<Bicicleta> bicicletas;

    public BicicletaController() {
        bicicletas = new ArrayList<>();
    }
    
    public void agregarBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
    }
    
    public ArrayList<Bicicleta> listarBicicletas(){
        return bicicletas;
    }

    @Override
    public String toString() {
        String lista = "";
        for(Bicicleta bicicleta : bicicletas){
            lista += bicicleta.toString()+"\n";
        }
        return lista;
    }
    
    
}
