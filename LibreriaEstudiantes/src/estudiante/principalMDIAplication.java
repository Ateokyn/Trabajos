/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

import java.awt.Desktop;
import javax.swing.JOptionPane;

/**
 *
 * @author Kentry Gutter
 */
public class principalMDIAplication extends javax.swing.JFrame {

    /**
     * Creates new form principalMDIAplication
     */
    public principalMDIAplication() {
        initComponents();
        setTitle("MDI Estudiante");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnEstudiante = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        JMenuAcerca = new javax.swing.JMenu();
        menuItemInformacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setExtendedState(principalMDIAplication.MAXIMIZED_BOTH);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesIcon/sitio-web.png"))); // NOI18N
        btnEstudiante.setContentAreaFilled(false);
        btnEstudiante.setFocusable(false);
        btnEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEstudiante);

        btnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesIcon/acerca-de.png"))); // NOI18N
        btnAcercaDe.setContentAreaFilled(false);
        btnAcercaDe.setFocusable(false);
        btnAcercaDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcercaDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAcercaDe);

        desktopPane.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(204, 204, 204));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        JMenuAcerca.setMnemonic('h');
        JMenuAcerca.setText("Acerca de");

        menuItemInformacion.setMnemonic('c');
        menuItemInformacion.setText("Informacion");
        menuItemInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInformacionActionPerformed(evt);
            }
        });
        JMenuAcerca.add(menuItemInformacion);

        menuBar.add(JMenuAcerca);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        // TODO add your handling code here:
        InternalFrameEstudiante est = new InternalFrameEstudiante();
        desktopPane.add(est);
        est.show();
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void menuItemInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInformacionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Creador : Kentry Gutter\nRedes sociales\nFacebook : Kentry Gutter\nWhatsApp : 505 83347188");
    }//GEN-LAST:event_menuItemInformacionActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
        InternalInformacion Inf = new InternalInformacion();
        desktopPane.add(Inf);
        Inf.show();
        
    }//GEN-LAST:event_btnAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(principalMDIAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalMDIAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalMDIAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalMDIAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalMDIAplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAcerca;
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnCerrarInfo;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemInformacion;
    // End of variables declaration//GEN-END:variables

}
