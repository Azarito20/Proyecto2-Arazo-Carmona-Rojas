/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import funciones.Global;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pjroj
 */
public class VentanaCargar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public VentanaCargar() {
        initComponents();
        setSize(720, 440);
        setResizable(false);
        setTitle("Inicio - Cargar archivos");
        setLocationRelativeTo(null);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JButton();
        Fondo1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        select_csv = new javax.swing.JButton();
        Fondo2 = new javax.swing.JPanel();
        nextpage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 50, -1));

        Fondo1.setBackground(new java.awt.Color(153, 255, 255));
        Fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("Cola de Impresión");
        Fondo1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 220, 40));
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        select_csv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_csv.setText("Cargar archivo de usuarios");
        select_csv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_csvActionPerformed(evt);
            }
        });
        getContentPane().add(select_csv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 290, 60));

        Fondo2.setBackground(new java.awt.Color(102, 153, 255));
        Fondo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextpage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nextpage.setText("continuar");
        nextpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextpageActionPerformed(evt);
            }
        });
        Fondo2.add(nextpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 220, 30));

        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 390, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void nextpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextpageActionPerformed
        //Función para comprobar si se a seleccionado un archivo
        if (FileIsEmpty()){
            //SE MUESTRA UN MENSAJE DE ERROR EN CASO DE QUE NO SE HAYA SELECCIONADO NINGUN ARCHIVO
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo primero");
        }else{
            //Cargar la siguiente ventana,VentanaInicio la que posee las acciones del programa
            VentanaInicio menu = new VentanaInicio();
            menu.setVisible(true);
            this.dispose();
            //FALTA EL CODIGO PARA LEERLO, USAR GLOBAL//
        }
    }//GEN-LAST:event_nextpageActionPerformed

    private void select_csvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_csvActionPerformed
        //Para cargar el archivo
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv", "csv");
        file.setFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int result = file.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            Global.setFile(file.getSelectedFile());
        JOptionPane.showMessageDialog(null, "Su archivo a sido cargado con exito, haga click en 'CONTINUAR'");
        //FALTA EL CODIGO PARA LEERLO//
        
        }
    }//GEN-LAST:event_select_csvActionPerformed

    private boolean FileIsEmpty(){
        return Global.getFile() == null;
    }
    
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
            java.util.logging.Logger.getLogger(VentanaCargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCargar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextpage;
    private javax.swing.JButton select_csv;
    // End of variables declaration//GEN-END:variables
}
