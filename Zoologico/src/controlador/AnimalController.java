/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.AnimalDAO;
import vista.Principal;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Animal;

/**
 *
 * @author munoz
 */
public class AnimalController {
    private AnimalDAO modelo;
    private Principal vista;
    private DefaultTableModel tableModel;

    public AnimalController(AnimalDAO modelo, Principal vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        inicializarTabla();
        
        /*Boton Guardar*/
        this.vista.setGuardarActionListener(listener ->{
            Animal animal = new Animal(vista.getTxtNombre(),vista.getTxtEspecie(),Integer.parseInt(vista.getTxtEdad()),Integer.parseInt(vista.getTxtPeso()));
            String respuesta = modelo.add(animal);
            
            if(respuesta.equals("Agregado")){
                JOptionPane.showMessageDialog(vista, "Animal agregado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo agregar correctamente");
            }
        });
        
        /*Boton Editar*/
        this.vista.setEditarActionListener(listener ->{
            int id = Integer.parseInt(vista.getTxtId().getText());
            
            Animal animal = new Animal(id,vista.getTxtNombre(),vista.getTxtEspecie(),Integer.parseInt(vista.getTxtEdad()),Integer.parseInt(vista.getTxtPeso()));
            String respuesta = modelo.edit(animal);
            
            if(respuesta.equals("Modificado")){
                JOptionPane.showMessageDialog(vista, "Animal modificado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo modificar correctamente");
            }            
        });
        
        /*Boton Eliminar*/
        this.vista.setEliminarActionListener(listener ->{
            int id = Integer.parseInt(vista.getTxtId().getText());
            
            String respuesta = modelo.delete(id);
            
            if(respuesta.equals("Eliminado")){
                JOptionPane.showMessageDialog(vista, "Animal eliminado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo eliminar correctamente");
            }
        });
        
        /*Seleccionar Registro*/
        this.vista.tblAnimalesListSelectionListener(listener->{
            JTable tabla = vista.getTblAnimales();
            tabla.getSelectedRow();
            System.out.println(tabla.getSelectedRow());
            if (!listener.getValueIsAdjusting()) {
                int selectedRow = vista.getTblAnimales().getSelectedRow();
                if (selectedRow != -1) {
                    mostrarDatosSeleccionados(selectedRow);
                }
            }
        });
    }
    
    private void inicializarTabla() {
        tableModel = new DefaultTableModel(new String[]{"ID", "Nombre", "Especie", "Edad", "Peso"}, 0);
        vista.setTablaAnimales(tableModel);
        actualizarTabla();
    }
    
    private void actualizarTabla() {
        ArrayList<Animal> registros = modelo.lista(); // Obtener lista del modelo
        tableModel.setRowCount(0); // Limpiar la tabla

        for (Animal animal : registros) {
            tableModel.addRow(new Object[]{animal.getId(), animal.getNombre(), animal.getEspecie(), animal.getEdad(), animal.getPeso()});
        }
    }
    
    private void mostrarDatosSeleccionados(int row) {
        String id = tableModel.getValueAt(row, 0).toString();
        String nombre = tableModel.getValueAt(row, 1).toString();
        String especie = tableModel.getValueAt(row, 2).toString();
        String edad = tableModel.getValueAt(row, 3).toString();
        String peso = tableModel.getValueAt(row, 4).toString();
        
        vista.setTxtId(id);
        vista.setTxtNombre(nombre);
        vista.setTxtEspecie(especie);
        vista.setTxtEdad(edad);
        vista.setTxtPeso(peso);
        vista.getBtnGuardar().setVisible(false);
        vista.getBtnEditar().setVisible(true);
        vista.getBtnEliminar().setVisible(true);
        vista.getLblId().setVisible(true);
        vista.getTxtId().setVisible(true);
    }
    
    private void limpiarFormulario(){
        vista.setTxtId("");
        vista.setTxtNombre("");
        vista.setTxtEspecie("");
        vista.setTxtEdad("");
        vista.setTxtPeso("");
        vista.getBtnGuardar().setVisible(true);
        vista.getBtnEditar().setVisible(false);
        vista.getBtnEliminar().setVisible(false);
        vista.getLblId().setVisible(false);
        vista.getTxtId().setVisible(false);
    }
}
