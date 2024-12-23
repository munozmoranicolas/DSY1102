/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author munoz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        lblId.setVisible(false);
        txtId.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        
        lblIdCuidador.setVisible(false);
        txtIdCuidador.setVisible(false);
        btnEditarCuidador.setVisible(false);
        btnEliminarCuidador.setVisible(false);
        
        lblIdRegistro.setVisible(false);
        txtIdRegistro.setVisible(false);
        btnEditarRegistro.setVisible(false);
        btnEliminarRegistro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblIdCuidador = new javax.swing.JLabel();
        txtIdCuidador = new javax.swing.JTextField();
        txtNombreCuidador = new javax.swing.JTextField();
        txtEspecialidadCuidador = new javax.swing.JTextField();
        btnGuardarCuidador = new javax.swing.JButton();
        btnEditarCuidador = new javax.swing.JButton();
        btnEliminarCuidador = new javax.swing.JButton();
        lblNombreCuidador = new javax.swing.JLabel();
        lblEspecialidadCuidador = new javax.swing.JLabel();
        txtTurnoCuidador = new javax.swing.JTextField();
        lblTurnoCuidador = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCuidadores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtIdRegistro = new javax.swing.JTextField();
        cbAnimal = new javax.swing.JComboBox<>();
        cbCuidador = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        txtObservaciones = new javax.swing.JTextField();
        btnGuardarRegistro = new javax.swing.JButton();
        btnEditarRegistro = new javax.swing.JButton();
        btnEliminarRegistro = new javax.swing.JButton();
        lblIdRegistro = new javax.swing.JLabel();
        lblAnimal = new javax.swing.JLabel();
        lblCuidador = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingreso"));

        btnGuardar.setBackground(new java.awt.Color(51, 204, 0));
        btnGuardar.setText("Guardar");

        lblNombre.setText("Nombre");

        lblEspecie.setText("Especie");

        lblEdad.setText("Edad");

        lblPeso.setText("Peso");

        lblId.setText("ID");

        txtId.setEnabled(false);

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setText("Editar");

        btnEliminar.setBackground(new java.awt.Color(255, 51, 0));
        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEspecie)
                    .addComponent(lblEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEdad)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPeso)
                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblEspecie)
                    .addComponent(lblEdad)
                    .addComponent(lblPeso)
                    .addComponent(lblId))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Especie", "Edad", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Animales", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingreso"));

        lblIdCuidador.setText("ID");

        txtIdCuidador.setEnabled(false);

        btnGuardarCuidador.setBackground(new java.awt.Color(102, 255, 102));
        btnGuardarCuidador.setText("Guardar");

        btnEditarCuidador.setBackground(new java.awt.Color(255, 153, 0));
        btnEditarCuidador.setText("Editar");

        btnEliminarCuidador.setBackground(new java.awt.Color(255, 51, 0));
        btnEliminarCuidador.setText("Eliminar");

        lblNombreCuidador.setText("Nombre");

        lblEspecialidadCuidador.setText("Especialidad");

        lblTurnoCuidador.setText("Turno");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdCuidador))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCuidador))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEspecialidadCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecialidadCuidador))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTurnoCuidador)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtTurnoCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCuidador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCuidador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCuidador)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCuidador)
                    .addComponent(lblNombreCuidador)
                    .addComponent(lblEspecialidadCuidador)
                    .addComponent(lblTurnoCuidador))
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidadCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCuidador)
                    .addComponent(btnEditarCuidador)
                    .addComponent(btnEliminarCuidador)
                    .addComponent(txtTurnoCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tblCuidadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Especialidad", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCuidadores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cuidadores", jPanel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingreso"));

        txtIdRegistro.setEnabled(false);

        cbAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbCuidador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardarRegistro.setBackground(new java.awt.Color(102, 255, 51));
        btnGuardarRegistro.setText("Guardar");

        btnEditarRegistro.setBackground(new java.awt.Color(255, 153, 0));
        btnEditarRegistro.setText("Editar");

        btnEliminarRegistro.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarRegistro.setText("Eliminar");

        lblIdRegistro.setText("ID");

        lblAnimal.setText("Animal");

        lblCuidador.setText("Cuidador");

        lblFecha.setText("Fecha");

        lblObservaciones.setText("Observaciones");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdRegistro))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuidador))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarRegistro))
                    .addComponent(lblObservaciones))
                .addGap(0, 112, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdRegistro)
                    .addComponent(lblAnimal)
                    .addComponent(lblCuidador)
                    .addComponent(lblFecha)
                    .addComponent(lblObservaciones))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarRegistro)
                    .addComponent(btnEditarRegistro)
                    .addComponent(btnEliminarRegistro))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Animal", "Cuidador", "Fecha registro", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblRegistros);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registros", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setGuardarActionListener(ActionListener action){
        btnGuardar.addActionListener(action);
    }
    
    public void setEditarActionListener(ActionListener action){
        btnEditar.addActionListener(action);
    }
    
    public void setEliminarActionListener(ActionListener action){
        btnEliminar.addActionListener(action);
    }
    
    public void setGuardarCuidadorActionListener(ActionListener action){
        btnGuardarCuidador.addActionListener(action);
    }
    
    public void setEditarCuidadorActionListener(ActionListener action){
        btnEditarCuidador.addActionListener(action);
    }
    
    public void setEliminarCuidadorActionListener(ActionListener action){
        btnEliminarCuidador.addActionListener(action);
    }
    
    public void setGuardarRegistroActionListener(ActionListener action){
        btnGuardarRegistro.addActionListener(action);
    }
    
    public void setEditarRegistroActionListener(ActionListener action){
        btnEditarRegistro.addActionListener(action);
    }
    
    public void setEliminarRegistroActionListener(ActionListener action){
        btnEliminarRegistro.addActionListener(action);
    }
    
    public void setGuardar(String text){
        btnGuardar.setText(text);
    }
    
    public void setTablaAnimales(TableModel tableModel){
        tblAnimales.setModel(tableModel);
    }
    
    public void setTablaCuidadores(TableModel tableModel){
        tblCuidadores.setModel(tableModel);
    }
    
    public void setTablaRegistros(TableModel tableModel){
        tblRegistros.setModel(tableModel);
    }

    public void setTxtEdad(String txtEdad) {
        this.txtEdad.setText(txtEdad);
    }

    public void setTxtEspecie(String txtEspecie) {
        this.txtEspecie.setText(txtEspecie);
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre.setText(txtNombre);
    }

    public void setTxtPeso(String txtPeso) {
        this.txtPeso.setText(txtPeso);
    }
    
    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtEspecie() {
        return txtEspecie.getText();
    }

    public String getTxtEdad() {
        return txtEdad.getText();
    }

    public String getTxtPeso() {
        return txtPeso.getText();
    }
    
    public JTable getTblAnimales() {
        return tblAnimales;
    }
    
    public JTable getTblCuidadores() {
        return tblCuidadores;
    }
    
    public JTable getTblRegistros() {
        return tblRegistros;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }
    
    public JButton getBtnGuardarCuidador() {
        return btnGuardarCuidador;
    }

    public JButton getBtnEditarCuidador() {
        return btnEditarCuidador;
    }

    public JButton getBtnEliminarCuidador() {
        return btnEliminarCuidador;
    }
    
    public JButton getBtnGuardarRegistro() {
        return btnGuardarRegistro;
    }

    public JButton getBtnEditarRegistro() {
        return btnEditarRegistro;
    }

    public JButton getBtnEliminarRegistro() {
        return btnEliminarRegistro;
    }

    public JLabel getLblId() {
        return lblId;
    }
    
    public JLabel getLblIdRegistro() {
        return lblIdRegistro;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId.setText(txtId);
    }    
    
    public void tblAnimalesListSelectionListener(ListSelectionListener listener){
        tblAnimales.getSelectionModel().addListSelectionListener(listener);
    }
    
    public void tblCuidadoresListSelectionListener(ListSelectionListener listener){
        tblCuidadores.getSelectionModel().addListSelectionListener(listener);
    }
    
    public void tblRegistrosListSelectionListener(ListSelectionListener listener){
        tblRegistros.getSelectionModel().addListSelectionListener(listener);
    }

    public String getTxtEspecialidadCuidador() {
        return txtEspecialidadCuidador.getText();
    }

    public void setTxtEspecialidadCuidador(String txtEspecialidadCuidador) {
        this.txtEspecialidadCuidador.setText(txtEspecialidadCuidador);
    }

    public JTextField getTxtIdCuidador() {
        return txtIdCuidador;
    }

    public JLabel getLblIdCuidador() {
        return lblIdCuidador;
    }

    public void setTxtIdCuidador(String txtIdCuidador) {
        this.txtIdCuidador.setText(txtIdCuidador);
    }

    public String getTxtNombreCuidador() {
        return txtNombreCuidador.getText();
    }

    public void setTxtNombreCuidador(String txtNombreCuidador) {
        this.txtNombreCuidador.setText(txtNombreCuidador);
    }

    public String getTxtTurnoCuidador() {
        return txtTurnoCuidador.getText();
    }

    public void setTxtTurnoCuidador(String txtTurnoCuidador) {
        this.txtTurnoCuidador.setText(txtTurnoCuidador);
    }

    public JComboBox<String> getCbAnimal() {
        return cbAnimal;
    }

    public JComboBox<String> getCbCuidador() {
        return cbCuidador;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    public JTextField getTxtIdRegistro() {
        return txtIdRegistro;
    }

    public void setTxtIdRegistro(String txtIdRegistro) {
        this.txtIdRegistro.setText(txtIdRegistro);
    }

    public String getTxtObservaciones() {
        return txtObservaciones.getText();
    }

    public void setTxtObservaciones(String txtObservaciones) {
        this.txtObservaciones.setText(txtObservaciones);
    }

    public void setTxtFecha(String txtFecha) {
        this.txtFecha.setText(txtFecha);
    }

    public String getTxtFecha() {
        return txtFecha.getText();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarCuidador;
    private javax.swing.JButton btnEditarRegistro;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCuidador;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarCuidador;
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JComboBox<String> cbAnimal;
    private javax.swing.JComboBox<String> cbCuidador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnimal;
    private javax.swing.JLabel lblCuidador;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecialidadCuidador;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdCuidador;
    private javax.swing.JLabel lblIdRegistro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCuidador;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTurnoCuidador;
    private javax.swing.JTable tblAnimales;
    private javax.swing.JTable tblCuidadores;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecialidadCuidador;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCuidador;
    private javax.swing.JTextField txtIdRegistro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCuidador;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTurnoCuidador;
    // End of variables declaration//GEN-END:variables
}
