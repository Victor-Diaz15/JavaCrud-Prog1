package Formularios;

import Database.Conexion;
import Database.Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Julio Diaz Arias 2021-0834
 */
public class FormLogin extends javax.swing.JFrame {
    //variables y objetos
    Modelo mod = new Modelo();
    Conexion con = new Conexion();
    Connection conectar;
    Statement st;
    ResultSet resultado;
    
    //metodo constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FormLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        psfContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrarme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_25px_1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setLayout(null);

        lblIniciarSesion.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Iniciar Sesión");
        lblIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblIniciarSesion);
        lblIniciarSesion.setBounds(0, 33, 395, 48);

        lblUsuario.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(50, 140, 84, 20);

        lblContraseña.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");
        jPanel1.add(lblContraseña);
        lblContraseña.setBounds(50, 240, 87, 20);

        btnIniciarSesion.setBackground(new java.awt.Color(73, 181, 172));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(90, 368, 220, 23);

        txtUsuario.setBackground(new java.awt.Color(33, 45, 62));
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(73, 181, 172));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(80, 170, 270, 31);

        psfContraseña.setBackground(new java.awt.Color(33, 45, 62));
        psfContraseña.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        psfContraseña.setForeground(new java.awt.Color(73, 181, 172));
        psfContraseña.setBorder(null);
        psfContraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        psfContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(psfContraseña);
        psfContraseña.setBounds(80, 270, 270, 30);

        jSeparator1.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(45, 207, 310, 10);

        jSeparator2.setBackground(new java.awt.Color(73, 133, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(45, 306, 310, 10);

        btnRegistrarme.setBackground(new java.awt.Color(73, 181, 172));
        btnRegistrarme.setText("REGISTRARME");
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarme);
        btnRegistrarme.setBounds(90, 409, 220, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_25px.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 270, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_25px_1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 170, 25, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        try {
            //variables y objetos
            ResultSet bool;
            String usuario = txtUsuario.getText();
            String contraseña = psfContraseña.getText();
            //validando los campos
            bool = validar(usuario, contraseña);
            if (usuario.isEmpty() || contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(null, "debe ingresar su usuario\n"
                        + "y contraseña, si no está registrado debe registrarse");
            } else if (bool.next()) {
                setVisible(false);
                FormRegisterData data = new FormRegisterData();
                data.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    //redirigiendo al usuario a formulario registros mediante el boton registrarme
    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed
        setVisible(false);
        FormRegistrar registrarme = new FormRegistrar();
        registrarme.setVisible(true);
    }//GEN-LAST:event_btnRegistrarmeActionPerformed
    //metodo validar login
    public ResultSet validar(String usuario, String contraseña) {
        //setiando las variables en mi clase modelo
        mod.setUsuario(usuario);
        mod.setContraseña(contraseña);

        try {
            //realizando la query
            String select = "SELECT USUARIO, CONTRASEÑA FROM USUARIOS "
                    + "WHERE USUARIO = '" + mod.getUsuario() + "' AND CONTRASEÑA = '" + mod.getContraseña() + "'";

            conectar = con.getConexion();
            st = conectar.createStatement();
            resultado = st.executeQuery(select);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return resultado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField psfContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
