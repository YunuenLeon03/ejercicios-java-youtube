/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_interfaces_graficas_ddr_17;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Fernando
 */
public class FormTicTacToe extends javax.swing.JFrame {

    private TicTacToe juego;
    private JLabel[][] tablero;
    private int J1Puntos;
    private int J2Puntos;
    
    public FormTicTacToe() {
        initComponents();
        
        JLabel[][] t = {
            {lbl00, lbl01, lbl02},
            {lbl10, lbl11, lbl12},
            {lbl20, lbl21, lbl22},
        };
        this.tablero = t;
        this.J1Puntos = 0;
        this.J2Puntos = 0;
        this.inicializarTablero();
        
    }
    
    
    public void inicializarTablero(){
        
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {
                
                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
                
                Image img = new ImageIcon("img/vacio.png").getImage();
                ImageIcon img2 = new ImageIcon(img.getScaledInstance(
                        this.tablero[i][j].getWidth(),
                        this.tablero[i][j].getHeight(),
                        Image.SCALE_SMOOTH)
                );
                
                this.tablero[i][j].setIcon(img2);
                this.tablero[i][j].setBorder(border);
            }
        }
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl00 = new javax.swing.JLabel();
        lbl01 = new javax.swing.JLabel();
        lbl02 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        txtJ1Puntos = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        txtJ2Puntos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(5, 3));
        getContentPane().add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turno");
        getContentPane().add(jLabel2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("J1");
        getContentPane().add(jLabel6);
        getContentPane().add(lbl00);
        getContentPane().add(lbl01);
        getContentPane().add(lbl02);
        getContentPane().add(lbl10);
        getContentPane().add(lbl11);
        getContentPane().add(lbl12);
        getContentPane().add(lbl20);
        getContentPane().add(lbl21);
        getContentPane().add(lbl22);
        getContentPane().add(txtJ1Puntos);

        btnReset.setText("RESET");
        getContentPane().add(btnReset);
        getContentPane().add(txtJ2Puntos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JTextField txtJ1Puntos;
    private javax.swing.JTextField txtJ2Puntos;
    // End of variables declaration//GEN-END:variables
}