/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import Frames.MenuPrincipal;
import core.ManejadorUsers;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();

        ManejadorUsers manejador = new ManejadorUsers();
        this.pack(); // Esto ajusta el frame al tamaño preferido de sus componentes

        // Opcional: Establecer un tamaño mínimo
        this.setMinimumSize(new Dimension(400, 300));

        // Centrar la ventana en la pantalla
        this.setLocationRelativeTo(null);

        // Evitar que el usuario redimensione (opcional)
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        usertxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 110, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 366, 323));

        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 334, -1, -1));

        jLabel4.setText("Iniciar sesion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        jButton2.setText("Iniciar sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 406, 110, -1));
        getContentPane().add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 231, 220, -1));

        jLabel5.setText("¿No tienes cuenta?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 158, -1));

        Passwordtxt.setText("EjemploContraseña");
        Passwordtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordtxtFocusGained(evt);
            }
        });
        Passwordtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordtxtMouseClicked(evt);
            }
        });
        Passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordtxtActionPerformed(evt);
            }
        });
        getContentPane().add(Passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 220, -1));

        jToggleButton1.setText("Mostrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String user = usertxt.getText().trim();
        char[] passwordChars = Passwordtxt.getPassword(); // Usando JPasswordField
        String password = new String(passwordChars);

        try {
            // Validar campos vacíos
            if (user.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor complete todos los campos",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Verificar credenciales
            ManejadorUsers manejador = new ManejadorUsers();

            if (manejador.validarLogin(user, password)) {
                // Login exitoso
                JOptionPane.showMessageDialog(this,
                        "Bienvenido, " + user + "!",
                        "Inicio exitoso",
                        JOptionPane.INFORMATION_MESSAGE);

                // Abrir ventana principal y cerrar login
                MenuPrincipal principal = new MenuPrincipal(user);
                principal.setVisible(true);
                this.dispose();
            } else {
                // Credenciales incorrectas
                JOptionPane.showMessageDialog(this,
                        "Usuario o contraseña incorrectos",
                        "Error de autenticación",
                        JOptionPane.ERROR_MESSAGE);

                // Limpiar campo de contraseña
                Passwordtxt.setText("");
                usertxt.requestFocus();
            }
        } finally {
            // Limpiar el array de la contraseña en memoria por seguridad
            Arrays.fill(passwordChars, ' ');
        }

        Passwordtxt.setText("");
        usertxt.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user = usertxt.getText().trim();
        char[] passwordChars = Passwordtxt.getPassword();
        String password = new String(passwordChars);

        try {
            // Validar campos vacíos
            if (user.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Usuario y contraseña son requeridos",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Validar longitud mínima
            if (password.length() < 6) {
                JOptionPane.showMessageDialog(this,
                        "La contraseña debe tener al menos 6 caracteres",
                        "Contraseña insegura",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Registrar nuevo usuario
            ManejadorUsers manejador = new ManejadorUsers();
            if (manejador.registrarUser(user, password)) {
                JOptionPane.showMessageDialog(this,
                        "Registro exitoso!\nAhora puede iniciar sesión",
                        "Registro completado",
                        JOptionPane.INFORMATION_MESSAGE);

                // Limpiar formulario
                usertxt.setText("");
                Passwordtxt.setText("");
                usertxt.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this,
                        "El usuario ya existe",
                        "Error de registro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } finally {

            Arrays.fill(passwordChars, ' ');
        }

        Passwordtxt.setText("");
        usertxt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    private void PasswordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordtxtActionPerformed

    }//GEN-LAST:event_PasswordtxtActionPerformed

    private void PasswordtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordtxtFocusGained

    }//GEN-LAST:event_PasswordtxtFocusGained

    private void PasswordtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordtxtMouseClicked

        Passwordtxt.setText("");
    }//GEN-LAST:event_PasswordtxtMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            // Mostrar contraseña
            Passwordtxt.setEchoChar((char) 0); // Caracter nulo muestra texto plano
            jToggleButton1.setText("Ocultar");
        } else {
            // Ocultar contraseña
            Passwordtxt.setEchoChar('•'); // Caracter de bullet point
            jToggleButton1.setText("Mostrar");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
