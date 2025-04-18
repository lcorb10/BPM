/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames.PlayList;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import nodo.Lista;
import nodo.Nodo;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import nodo.Lista;
import nodo.Nodo;
/**
 *
 * @author jlaza
 */
public class PlayList1 extends JFrame {

    public PlayList1() {

        initComponents();

        try {

            Image imagenOriginal = ImageIO.read(new File("C:\\Users\\Sebastian\\Downloads\\BPM-main\\BPMusic\\src\\Canciones\\LasLocurasMias.jpeg"));

            int nuevoAncho = 300;
            int nuevoAlto = 300;

            Image imagenRedimensionada = imagenOriginal.getScaledInstance(
                    nuevoAncho,
                    nuevoAlto,
                    Image.SCALE_SMOOTH);

            Image imagenRedimensionada2 = imagenOriginal.getScaledInstance(
                    50,
                    50,
                    Image.SCALE_SMOOTH
            );

            FotoCancion.setIcon(new ImageIcon(imagenRedimensionada));
            MiniFotoo.setIcon(new ImageIcon(imagenRedimensionada2));
            MiniCancionName.setText("Las locuras mias");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        Lista p1 = new Lista();
        //RutaCancion-RutaFoto
        Nodo c1 = new Nodo("","");
        Nodo c2 = new Nodo("","");
        Nodo c3 = new Nodo("","");
        Nodo c4 = new Nodo("","");
        Nodo c5 = new Nodo("","");
        Nodo c6 = new Nodo("","");
        Nodo c7 = new Nodo("","");
        
        //Agregar las canciones a la lista
        p1.agregarCancion(c1);
        p1.agregarCancion(c2);
        p1.agregarCancion(c3);
        p1.agregarCancion(c4);
        p1.agregarCancion(c5);
        p1.agregarCancion(c6);
        p1.agregarCancion(c7);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FotoCancion = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        btnSig = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnSig2 = new javax.swing.JButton();
        btnAnt1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        MiniFotoo = new javax.swing.JLabel();
        MiniCancionName = new javax.swing.JLabel();
        FONDONEGRO = new javax.swing.JLabel();
        FONDOGRIS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0:00");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 500, 21, 16);
        getContentPane().add(FotoCancion);
        FotoCancion.setBounds(240, 90, 370, 270);
        getContentPane().add(jSlider2);
        jSlider2.setBounds(220, 500, 320, 20);

        btnSig.setText(">>");
        getContentPane().add(btnSig);
        btnSig.setBounds(460, 470, 72, 22);

        btnAnt.setText("<<");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnt);
        btnAnt.setBounds(210, 470, 72, 22);

        btnStop.setText("I I");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop);
        btnStop.setBounds(330, 470, 72, 22);

        btnSig2.setText(">");
        getContentPane().add(btnSig2);
        btnSig2.setBounds(420, 470, 22, 22);

        btnAnt1.setText("<");
        getContentPane().add(btnAnt1);
        btnAnt1.setBounds(290, 470, 22, 22);
        getContentPane().add(jSlider1);
        jSlider1.setBounds(640, 470, 200, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("🔊");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(620, 470, 12, 16);
        getContentPane().add(MiniFotoo);
        MiniFotoo.setBounds(20, 470, 50, 50);

        MiniCancionName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(MiniCancionName);
        MiniCancionName.setBounds(90, 470, 90, 30);

        FONDONEGRO.setBackground(new java.awt.Color(0, 0, 0));
        FONDONEGRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1920x1080-px-black-1306365-wallhere.com.jpg"))); // NOI18N
        FONDONEGRO.setText(".");
        getContentPane().add(FONDONEGRO);
        FONDONEGRO.setBounds(0, 450, 890, 90);

        FONDOGRIS.setBackground(new java.awt.Color(204, 204, 204));
        FONDOGRIS.setForeground(new java.awt.Color(153, 153, 153));
        FONDOGRIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/gris-solido.jpg"))); // NOI18N
        FONDOGRIS.setText(".");
        getContentPane().add(FONDOGRIS);
        FONDOGRIS.setBounds(-4, 0, 890, 510);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3:20");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 500, 21, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAntActionPerformed

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
            java.util.logging.Logger.getLogger(PlayList1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayList1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayList1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayList1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayList1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDOGRIS;
    private javax.swing.JLabel FONDONEGRO;
    private javax.swing.JLabel FotoCancion;
    private javax.swing.JLabel MiniCancionName;
    private javax.swing.JLabel MiniFotoo;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnAnt1;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnSig2;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    // End of variables declaration//GEN-END:variables
}
