/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author munoz
 */
public class ClienteController {
    
    private ArrayList<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> listarClientes(){
        return clientes;
    }

    @Override
    public String toString() {
        return "ClienteController{" + "clientes=" + clientes + '}';
    }

    
}
