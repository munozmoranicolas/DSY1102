/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Animal;
import modelo.AnimalDAO;
import modelo.Cuidador;
import modelo.CuidadorDAO;
import modelo.Registro;
import modelo.RegistroDAO;

import vista.Principal;

/**
 *
 * @author munoz
 */
public class RegistroController {
    private RegistroDAO modelo;
    private Principal vista;
    private DefaultTableModel tableModel;

    public RegistroController(RegistroDAO modelo, Principal vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        inicializarTabla();
        listarAnimales();
        listarCuidadores();
        
        /*Boton Guardar*/
        this.vista.setGuardarRegistroActionListener(listener ->{
            
            Animal animal = (Animal) vista.getCbAnimal().getSelectedItem();
            Cuidador cuidador = (Cuidador) vista.getCbCuidador().getSelectedItem();
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = new Date();
            try {
                fecha = formato.parse(vista.getTxtFecha());
            } catch (ParseException ex) {
                System.err.println("Error de formato");
            }
            Registro registro = new Registro(animal, cuidador, fecha , vista.getTxtObservaciones());
            String respuesta = modelo.add(registro);
            
            if(respuesta.equals("Agregado")){
                JOptionPane.showMessageDialog(vista, "Registro agregado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo agregar correctamente");
            }
        });
        
        /*Boton Editar*/
        this.vista.setEditarRegistroActionListener(listener ->{
            int id = Integer.parseInt(vista.getTxtIdRegistro().getText());
            
            Animal animal = (Animal) vista.getCbAnimal().getSelectedItem();
            Cuidador cuidador = (Cuidador) vista.getCbAnimal().getSelectedItem();
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = new Date();
            try {
                fecha = formato.parse(vista.getTxtFecha());
            } catch (ParseException ex) {
                System.err.println("Error de formato");
            }
            Registro registro = new Registro(animal, cuidador, fecha , vista.getTxtObservaciones());
            String respuesta = modelo.edit(registro);
            
            if(respuesta.equals("Modificado")){
                JOptionPane.showMessageDialog(vista, "Registro modificado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo modificar correctamente");
            }            
        });
        
        /*Boton Eliminar*/
        this.vista.setEliminarRegistroActionListener(listener ->{
            int id = Integer.parseInt(vista.getTxtId().getText());
            
            String respuesta = modelo.delete(id);
            
            if(respuesta.equals("Eliminado")){
                JOptionPane.showMessageDialog(vista, "Registro eliminado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo eliminar correctamente");
            }
        });
        
        /*Seleccionar Registro*/
        this.vista.tblRegistrosListSelectionListener(listener->{
            JTable tabla = vista.getTblRegistros();
            tabla.getSelectedRow();
            System.out.println(tabla.getSelectedRow());
            if (!listener.getValueIsAdjusting()) {
                int selectedRow = vista.getTblRegistros().getSelectedRow();
                if (selectedRow != -1) {
                    mostrarDatosSeleccionados(selectedRow);
                }
            }
        });
    }
    
    private void inicializarTabla() {
        tableModel = new DefaultTableModel(new String[]{"ID", "Animal", "Cuidador", "Fecha", "Observaciones"}, 0);
        vista.setTablaRegistros(tableModel);
        actualizarTabla();
    }
    
    private void actualizarTabla() {
        ArrayList<Registro> registros = modelo.lista(); // Obtener lista del modelo
        tableModel.setRowCount(0); // Limpiar la tabla 
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        for (Registro registro : registros) {
            String fecha = formato.format(registro.getFechaRegistro());
            //Date fechaRegistro = new Date(registro.getFechaRegistro());
            tableModel.addRow(new Object[]{registro.getId(), registro.getAnimal().getNombre(), registro.getCuidador().getNombre(), fecha ,registro.getObservaciones()});
        }
    }
    
    private void mostrarDatosSeleccionados(int row) {
        
        String id = tableModel.getValueAt(row, 0).toString();
        String fechaRegistro = tableModel.getValueAt(row, 3).toString();
        String observaciones = tableModel.getValueAt(row, 4).toString();
        
        Registro registro = new RegistroDAO().get(Integer.parseInt(id));
        
        Animal animal = new AnimalDAO().get(registro.getAnimal().getId());
        Cuidador cuidador = new CuidadorDAO().get(registro.getCuidador().getId());
        
        vista.setTxtIdRegistro(id);
        vista.getCbAnimal().setSelectedItem(animal.getNombre());
        vista.getCbCuidador().setSelectedItem(cuidador);
        vista.setTxtFecha(fechaRegistro);
        vista.setTxtObservaciones(observaciones);
        vista.getBtnGuardarRegistro().setVisible(false);
        vista.getBtnEditarRegistro().setVisible(true);
        vista.getBtnEliminarRegistro().setVisible(true);
        vista.getLblIdRegistro().setVisible(true);
        vista.getTxtIdRegistro().setVisible(true);
    }
    
    private void limpiarFormulario(){
        vista.setTxtIdRegistro("");
        vista.getCbAnimal().setSelectedIndex(0);
        vista.getCbCuidador().setSelectedIndex(0);
        vista.setTxtFecha("");
        vista.setTxtObservaciones("");
        vista.getBtnGuardarRegistro().setVisible(true);
        vista.getBtnEditarRegistro().setVisible(false);
        vista.getBtnEliminarRegistro().setVisible(false);
        vista.getLblIdRegistro().setVisible(false);
        vista.getTxtIdRegistro().setVisible(false);
    }
    
    private void listarAnimales(){
        ArrayList<Animal> animales = new AnimalDAO().lista();
        JComboBox comboBox = vista.getCbAnimal();
        comboBox.removeAllItems();
        for(Animal animal : animales){
            comboBox.addItem(animal);
        }
    }
    
    private void listarCuidadores(){
        ArrayList<Cuidador> cuidadores = new CuidadorDAO().lista();
        JComboBox comboBox = vista.getCbCuidador();
        comboBox.removeAllItems();
        for(Cuidador cuidador : cuidadores){
            comboBox.addItem(cuidador);
        }
    }
}
