package Formularios;

import Database.Conexion;
import Database.Modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Julio Diaz Arias 2021-0834
 */
public class FormRegistrar extends javax.swing.JFrame {

    //atributos
    private String usuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private String contraseña;
    private String confirmarPs;
    private int id;
    private boolean update = false;

    //objetos
    FormLogin log = new FormLogin();
    Conexion con = new Conexion();
    Connection conectar;
    Statement st;
    ResultSet resultado;
    Modelo mod = new Modelo();

    //metodo constructor por defecto
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FormRegistrar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    //metodo constructor para cuando se va a editar un usuario
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FormRegistrar(int id) {
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
        this.update = true;
        //lamando la funcion de llenar campos que pertenecen al id que me llega desde el boton editar
        llenarCampos(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblApellido = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblTelefono = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblCorreoElectronico = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblConfirmarPs = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        psfContraseña = new javax.swing.JPasswordField();
        psfContraseña1 = new javax.swing.JPasswordField();
        psfConfirmPs = new javax.swing.JPasswordField();
        psfContraseña2 = new javax.swing.JPasswordField();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO");

        lblUsuario.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText(" Usuario");

        txtUsuario.setBackground(new java.awt.Color(33, 45, 62));
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(73, 181, 172));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(73, 181, 172));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator2.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));

        lblNombre.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre ");

        txtApellido.setBackground(new java.awt.Color(33, 45, 62));
        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(73, 181, 172));
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        txtApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator3.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));

        lblApellido.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");

        txtTelefono.setBackground(new java.awt.Color(33, 45, 62));
        txtTelefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(73, 181, 172));
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator4.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator4.setForeground(new java.awt.Color(73, 181, 172));

        lblTelefono.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText(" Teléfono");

        txtCorreoElectronico.setBackground(new java.awt.Color(33, 45, 62));
        txtCorreoElectronico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreoElectronico.setForeground(new java.awt.Color(73, 181, 172));
        txtCorreoElectronico.setBorder(null);
        txtCorreoElectronico.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCorreoElectronico.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator5.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator5.setForeground(new java.awt.Color(73, 181, 172));

        lblCorreoElectronico.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoElectronico.setText("Correo Electronico");

        jSeparator6.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator6.setForeground(new java.awt.Color(73, 181, 172));

        lblContraseña.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");

        jSeparator7.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator7.setForeground(new java.awt.Color(73, 181, 172));

        lblConfirmarPs.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblConfirmarPs.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarPs.setText("Confirmar Contraseña");

        btnRegistrar.setBackground(new java.awt.Color(73, 181, 172));
        btnRegistrar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnRegistrar.setText("GUARDAR");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        psfContraseña.setBackground(new java.awt.Color(33, 45, 62));
        psfContraseña.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        psfContraseña.setForeground(new java.awt.Color(73, 181, 172));
        psfContraseña.setBorder(null);
        psfContraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        psfContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        psfContraseña1.setBackground(new java.awt.Color(33, 45, 62));
        psfContraseña1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        psfContraseña1.setForeground(new java.awt.Color(73, 181, 172));
        psfContraseña1.setBorder(null);
        psfContraseña1.setCaretColor(new java.awt.Color(255, 255, 255));
        psfContraseña1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        psfConfirmPs.setBackground(new java.awt.Color(33, 45, 62));
        psfConfirmPs.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        psfConfirmPs.setForeground(new java.awt.Color(73, 181, 172));
        psfConfirmPs.setBorder(null);
        psfConfirmPs.setCaretColor(new java.awt.Color(255, 255, 255));

        psfContraseña2.setBackground(new java.awt.Color(33, 45, 62));
        psfContraseña2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        psfContraseña2.setForeground(new java.awt.Color(73, 181, 172));
        psfContraseña2.setBorder(null);
        psfContraseña2.setCaretColor(new java.awt.Color(255, 255, 255));
        psfContraseña2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_arrow_50px.png"))); // NOI18N
        lblBack.setText("jLabel2");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(lblCorreoElectronico)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator2)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblUsuario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtUsuario)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblApellido)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator3)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblTelefono)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTelefono)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSeparator6)
                                                .addComponent(psfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(45, 45, 45)
                                            .addComponent(lblConfirmarPs)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(psfConfirmPs, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(psfContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(490, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(psfContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefono))
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCorreoElectronico))
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(psfConfirmPs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblConfirmarPs)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(405, Short.MAX_VALUE)
                    .addComponent(psfContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(101, 101, 101)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(415, Short.MAX_VALUE)
                    .addComponent(psfContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(91, 91, 91)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //lbl con un icono de flecha para retonar al login en caso de haberle dado al boton registrarme por error.
    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    //boton registrar.
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        //accediendo al texto de los campos
        usuario = txtUsuario.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        telefono = txtTelefono.getText();
        correoElectronico = txtCorreoElectronico.getText();
        contraseña = psfContraseña.getText();
        confirmarPs = psfConfirmPs.getText();

        //llamando al metodo validar 
        validar(nombre, apellido, usuario, telefono, correoElectronico, contraseña, confirmarPs);

    }//GEN-LAST:event_btnRegistrarActionPerformed

    //metodo validar registros
    public void validar(String nombre, String apellido, String usuario, String telefono, String correoElectronico, String contraseña, String ConfirmPs) {
        try {
            //setiando los valores las variables de mi modelo
            mod.setUsuario(usuario);
            mod.setNombre(nombre);
            mod.setApellido(apellido);
            mod.setTelefono(telefono);
            mod.setCorreo(correoElectronico);
            mod.setContraseña(contraseña);
            mod.setConfirmPs(ConfirmPs);

            //variable para verificar si ya existe ese usuario en la base de datos
            ResultSet existe = validar(mod.getUsuario());
            ResultSet comprobarUser = validar(id, mod.getUsuario());

            //variable contador
            int idError = 0;
            //condicionales para verificar cada campo
            if (mod.getNombre().isEmpty()) {
                idError = 1;
            } else if (mod.getApellido().isEmpty()) {
                idError = 2;
            } else if (mod.getUsuario().isEmpty()) {
                idError = 3;
            } else if (mod.getTelefono().isEmpty()) {
                idError = 4;
            } else if (mod.getCorreo().isEmpty()) {
                idError = 5;
            } else if (mod.getContraseña().isEmpty()) {
                idError = 6;
            } else if (!mod.getContraseña().equals(mod.getConfirmPs())) {
                idError = 7;
            } else if (existe.next()) {
                idError = 8;
                if (comprobarUser.next()) {
                    idError = 9;
                }
            } else if (update) {
                idError = 9;
            }

            //switch para mandar mensaje correspondiente al usuario
            switch (idError) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El campo nombre no esta lleno, debe completarlo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El campo apellido no esta lleno, debe completarlo");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El campo usuario no esta lleno, debe completarlo");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El campo telefono no esta lleno, debe completarlo");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El campo correo no esta lleno, debe completarlo");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "El campo contraseña no esta lleno, debe completarlo");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "La contraseña no coiciden, debe solucionarlo");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Ese usuario no esta disponible, intente con otro");
                    break;
                case 9:
                    //llamando la funcion actualizar
                    actualizar(id, mod.getNombre(), mod.getApellido(), mod.getUsuario(), mod.getTelefono(), mod.getCorreo(), mod.getContraseña());
                    //retornando a la vista de la tabla luego de haber actualizado correctamente.
                    this.setVisible(false);
                    FormRegisterData data = new FormRegisterData();
                    data.setVisible(true);
                    break;

                default:
                    //llamando la funcion insertar nuevo registro
                    insertar(mod.getNombre(), mod.getApellido(), mod.getUsuario(), mod.getTelefono(), mod.getCorreo(), mod.getContraseña());
                    //retornando al login luego de haber agregado nuevo usuario
                    this.setVisible(false);
                    log.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para llenar los campos del formulario registros a la hora de actualizar 
    private void llenarCampos(int id) {
        btnRegistrar.setText("ACTUALIZAR");
        try {
            String actualizar = "SELECT * FROM usuarios WHERE ID = " + id;
            conectar = con.getConexion();
            st = conectar.createStatement();
            resultado = st.executeQuery(actualizar);
            while (resultado.next()) {
                txtUsuario.setText(resultado.getString("USUARIO"));
                txtNombre.setText(resultado.getString("NOMBRE"));
                txtApellido.setText(resultado.getString("APELLIDO"));
                txtTelefono.setText(resultado.getString("TELEFONO"));
                txtCorreoElectronico.setText(resultado.getString("CORREO_ELECTRONICO"));
                psfContraseña.setText(resultado.getString("CONTRASEÑA"));
                psfConfirmPs.setText(resultado.getString("CONTRASEÑA"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //metodo insertar
    private void insertar(String nombre, String apellido, String usuario, String telefono, String correo, String contraseña) {
        try {
            String insert = "INSERT INTO usuarios (USUARIO, NOMBRE, APELLIDO, TELEFONO, CORREO_ELECTRONICO, CONTRASEÑA) VALUES ('" + usuario + "', '" + nombre + "', '" + apellido + "'"
                    + ", '" + telefono + "', '" + correo + "', '" + contraseña + "')";
            conectar = con.getConexion();
            st = conectar.createStatement();
            st.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "registro successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //metodo para actualizar
    public void actualizar(int id, String nombre, String apellido, String usuario, String telefono, String correo, String contraseña) {

        try {
            String editar = "UPDATE usuarios SET USUARIO = ?, NOMBRE = ?, APELLIDO = ?, TELEFONO = ?, CORREO_ELECTRONICO = ?, CONTRASEÑA = ? WHERE ID = " + id;
            PreparedStatement ps = conectar.prepareStatement(editar);

            ps.setString(1, usuario);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, telefono);
            ps.setString(5, correo);
            ps.setString(6, contraseña);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado con exito.! ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //metodo validar si existe el usuario
    public ResultSet validar(String usuario) {
        //setiando las usuario en mi clase modelo
        mod.setUsuario(usuario);
        try {
            //realizando la query
            String select = "SELECT USUARIO FROM USUARIOS "
                    + "WHERE USUARIO = '" + mod.getUsuario() + "'";
            conectar = con.getConexion();
            st = conectar.createStatement();
            resultado = st.executeQuery(select);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return resultado;
    }

    //metodo para comprobar si el nombre de usuario pertenece al mismo id
    public ResultSet validar(int id, String usuario) {
        //setiando las usuario en mi clase modelo
        mod.setUsuario(usuario);
        try {
            //realizando la query
            String select = "SELECT USUARIO FROM USUARIOS "
                    + "WHERE USUARIO = '" + mod.getUsuario() + "'AND ID = '" + id + "'";
            conectar = con.getConexion();
            st = conectar.createStatement();
            resultado = st.executeQuery(select);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    protected javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblConfirmarPs;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    protected javax.swing.JPasswordField psfConfirmPs;
    protected javax.swing.JPasswordField psfContraseña;
    private javax.swing.JPasswordField psfContraseña1;
    private javax.swing.JPasswordField psfContraseña2;
    protected javax.swing.JTextField txtApellido;
    protected javax.swing.JTextField txtCorreoElectronico;
    protected javax.swing.JTextField txtNombre;
    protected javax.swing.JTextField txtTelefono;
    protected javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
