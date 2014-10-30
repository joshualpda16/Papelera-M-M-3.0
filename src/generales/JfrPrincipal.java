/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generales;

import heredClasses.PintarJDP;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author joshua.d.juanchini
 */
public class JfrPrincipal extends javax.swing.JFrame {
    private Singleton sng;
    
    /**
     * Creates new form jfrPrincipal
     */
    public JfrPrincipal() {
        initComponents();
        jDesktopPane1.setBorder(new PintarJDP("/images/fondo3.jpg"));
        lookandfeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }
    
    public void lookandfeel(String lf){
        try {
            UIManager.setLookAndFeel(lf);
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JfrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JfrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JfrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run() {
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        cmdConfiguracion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Papelera M&M 3.0");
        setPreferredSize(new java.awt.Dimension(1024, 670));

        cmdConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setts.png"))); // NOI18N
        cmdConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(571, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(cmdConfiguracion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mnuArchivo.setText("Archivo");

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalir);

        jMenuBar1.add(mnuArchivo);

        mnuAyuda.setText("Ayuda");
        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void cmdConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfiguracionActionPerformed
        sng = Singleton.getInstance();
        sng.frConfiguracion();
    }//GEN-LAST:event_cmdConfiguracionActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(jfrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jfrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jfrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jfrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdConfiguracion;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables

    private void lookandfeel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
