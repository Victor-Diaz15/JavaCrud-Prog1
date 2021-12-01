package Formularios;

import Database.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victo Julio Diaz Arias 2021-0834
 */
public class FormRegisterData extends javax.swing.JFrame {
    //variables y objetos
    Conexion con = new Conexion();
    Connection conectar;
    Statement st;
    ResultSet resultado;
    DefaultTableModel modelo;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FormRegisterData() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        btnEditar = new java.awt.Button();
        btnNuevo = new java.awt.Button();
        btnCerrarSesion = new java.awt.Button();
        btnEliminar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Registros");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 181, 172));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES REGISTRADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tablaRegistros.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Apellido", "Telefono", "Correo Electronico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRegistros.setGridColor(new java.awt.Color(73, 181, 172));
        tablaRegistros.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tablaRegistros.setRowHeight(20);
        tablaRegistros.setSelectionBackground(new java.awt.Color(73, 133, 172));
        jScrollPane1.setViewportView(tablaRegistros);
        if (tablaRegistros.getColumnModel().getColumnCount() > 0) {
            tablaRegistros.getColumnModel().getColumn(0).setResizable(false);
            tablaRegistros.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaRegistros.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistros.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistros.getColumnModel().getColumn(3).setResizable(false);
            tablaRegistros.getColumnModel().getColumn(4).setResizable(false);
            tablaRegistros.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEditar.setActionCommand("Nuevo");
        btnEditar.setBackground(new java.awt.Color(33, 45, 62));
        btnEditar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(73, 181, 172));
        btnEditar.setLabel("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setActionCommand("Nuevo");
        btnNuevo.setBackground(new java.awt.Color(33, 45, 62));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(73, 181, 172));
        btnNuevo.setLabel("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setActionCommand("Nuevo");
        btnCerrarSesion.setBackground(new java.awt.Color(33, 45, 62));
        btnCerrarSesion.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(73, 181, 172));
        btnCerrarSesion.setLabel("CERRAR SESION");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnEliminar.setActionCommand("Nuevo");
        btnEliminar.setBackground(new java.awt.Color(33, 45, 62));
        btnEliminar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(73, 181, 172));
        btnEliminar.setLabel("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //accion que te retorna al login 
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        setVisible(false);
        FormLogin log = new FormLogin();
        log.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed
    
    //metodo load para cargar los datos de los usuarios
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //llamando al metodo getData
        getData();
    }//GEN-LAST:event_formWindowOpened

    //boton que te redirige al formulario registros
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.setVisible(false);
        FormRegistrar nuevo = new FormRegistrar();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    //boton eliminar usuario de la tabla y base de datos
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice = tablaRegistros.getSelectedRow();
        int id;
        if (indice > 0) {
            try {
                id = Integer.parseInt(tablaRegistros.getValueAt(indice, 0).toString());
                String eliminar = "DELETE FROM usuarios WHERE ID = ?";
                PreparedStatement ps = conectar.prepareStatement(eliminar);
                ps.setInt(1, id);
                ps.execute();
                
                
                JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario " + tablaRegistros.getValueAt(indice, 1));
                this.modelo.removeRow(indice);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, " No ha seleccionado ninguna fila. ");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    //accion editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = tablaRegistros.getSelectedRow();

        if (index > -1) {
            int id = Integer.parseInt(tablaRegistros.getValueAt(index, 0).toString());
            //utiliza el constructor de edicion del formulario de registros
            FormRegistrar editar = new FormRegistrar(id);
            this.setVisible(false);
            editar.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "No ha selecionando ninguna fila.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //metodo para traer los datos de la tabla usuarios y mostrarlos
    private void getData() {
        String select = "SELECT ID, USUARIO, NOMBRE, APELLIDO, TELEFONO, CORREO_ELECTRONICO FROM USUARIOS";
        try {
            conectar = con.getConexion();
            st = conectar.createStatement();
            resultado = st.executeQuery(select);
            Object[] persona = new Object[6];
            modelo = (DefaultTableModel) tablaRegistros.getModel();
            while (resultado.next()) {
                persona[0] = resultado.getInt("ID");
                persona[1] = resultado.getString("USUARIO");
                persona[2] = resultado.getString("NOMBRE");
                persona[3] = resultado.getString("APELLIDO");
                persona[4] = resultado.getString("TELEFONO");
                persona[5] = resultado.getString("CORREO_ELECTRONICO");
                modelo.addRow(persona);
            }
            tablaRegistros.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCerrarSesion;
    private java.awt.Button btnEditar;
    private java.awt.Button btnEliminar;
    private java.awt.Button btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaRegistros;
    // End of variables declaration//GEN-END:variables
}
