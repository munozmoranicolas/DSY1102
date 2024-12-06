/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cuidador;
import modelo.CuidadorDAO;
import vista.Principal;

/**
 *
 * @author munoz
 */
public class CuidadorController {
    private CuidadorDAO modelo;
    private Principal vista;
    private DefaultTableModel tableModel;

    public CuidadorController(CuidadorDAO modelo, Principal vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        inicializarTabla();
        
        /*Boton Guardar*/
        this.vista.setGuardarCuidadorActionListener(listener ->{
            Cuidador cuidador = new Cuidador(vista.getTxtNombreCuidador(),vista.getTxtEspecialidadCuidador(),vista.getTxtTurnoCuidador());
            String respuesta = modelo.add(cuidador);
            
            if(respuesta.equals("Agregado")){
                JOptionPane.showMessageDialog(vista, "Cuidador agregado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo agregar correctamente");
            }
        });
        
        /*Boton Editar*/
        this.vista.setEditarCuidadorActionListener(listener ->{
            int id = Integer.parseInt(vista.getTxtId().getText());
            
            Cuidador cuidador = new Cuidador(id,vista.getTxtNombreCuidador(),vista.getTxtEspecialidadCuidador(),vista.getTxtTurnoCuidador());
            String respuesta = modelo.edit(cuidador);
            
            if(respuesta.equals("Modificado")){
                JOptionPane.showMessageDialog(vista, "Cuidador modificado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo modificar correctamente");
            }            
        });
        
        /*Boton Eliminar*/
        this.vista.setEliminarCuidadorActionListener(listener ->{
            int id = Integer.parseInt(vista.getTxtId().getText());
            
            String respuesta = modelo.delete(id);
            
            if(respuesta.equals("Eliminado")){
                JOptionPane.showMessageDialog(vista, "Cuidador eliminado correctamente");
                limpiarFormulario();
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(vista, "No se pudo eliminar correctamente");
            }
        });
        
        /*Seleccionar Registro*/
        this.vista.tblCuidadoresListSelectionListener(listener->{
            JTable tabla = vista.getTblCuidadores();
            tabla.getSelectedRow();
            System.out.println(tabla.getSelectedRow());
            if (!listener.getValueIsAdjusting()) {
                int selectedRow = vista.getTblCuidadores().getSelectedRow();
                if (selectedRow != -1) {
                    mostrarDatosSeleccionados(selectedRow);
                }
            }
        });
    }
    
    private void inicializarTabla() {
        tableModel = new DefaultTableModel(new String[]{"ID", "Nombre", "Especialidad", "turno"}, 0);
        vista.setTablaCuidadores(tableModel);
        actualizarTabla();
    }
    
    private void actualizarTabla() {
        ArrayList<Cuidador> registros = modelo.lista(); // Obtener lista del modelo
        tableModel.setRowCount(0); // Limpiar la tabla

        for (Cuidador cuidador : registros) {
            tableModel.addRow(new Object[]{cuidador.getId(), cuidador.getNombre(), cuidador.getEspecialidad(), cuidador.getTurno()});
        }
    }
    
    private void mostrarDatosSeleccionados(int row) {
        String id = tableModel.getValueAt(row, 0).toString();
        String nombre = tableModel.getValueAt(row, 1).toString();
        String especialidad = tableModel.getValueAt(row, 2).toString();
        String turno = tableModel.getValueAt(row, 3).toString();
        
        vista.setTxtIdCuidador(id);
        vista.setTxtNombreCuidador(nombre);
        vista.setTxtEspecialidadCuidador(especialidad);
        vista.setTxtTurnoCuidador(turno);
        vista.getBtnGuardarCuidador().setVisible(false);
        vista.getBtnEditarCuidador().setVisible(true);
        vista.getBtnEliminarCuidador().setVisible(true);
        vista.getLblIdCuidador().setVisible(true);
        vista.getTxtIdCuidador().setVisible(true);
    }
    
    private void limpiarFormulario(){
        vista.setTxtIdCuidador("");
        vista.setTxtNombreCuidador("");
        vista.setTxtEspecialidadCuidador("");
        vista.setTxtTurnoCuidador("");
        vista.getBtnGuardarCuidador().setVisible(true);
        vista.getBtnEditarCuidador().setVisible(false);
        vista.getBtnEliminarCuidador().setVisible(false);
        vista.getLblIdCuidador().setVisible(false);
        vista.getTxtIdCuidador().setVisible(false);
    }
}
