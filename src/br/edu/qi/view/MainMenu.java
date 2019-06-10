/*
 * The MIT License
 *
 * Copyright 2019 Brian & Willian.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.edu.qi.view;


/**
 *
 * @author Brian & Willian
 * @since 07/06/2019 - 18:26
 * @version 1.0
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpDesktop = new javax.swing.JDesktopPane();
        jmbMenu = new javax.swing.JMenuBar();
        jmiNew = new javax.swing.JMenu();
        jmiNewClient = new javax.swing.JMenuItem();
        jmiNewBurger = new javax.swing.JMenuItem();
        jmiEdit = new javax.swing.JMenu();
        jmiManageClients = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpDesktopLayout = new javax.swing.GroupLayout(jdpDesktop);
        jdpDesktop.setLayout(jdpDesktopLayout);
        jdpDesktopLayout.setHorizontalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpDesktopLayout.setVerticalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jmiNew.setText("New");
        jmiNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmiNewClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmiNewClient.setText("New Client");
        jmiNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewClientActionPerformed(evt);
            }
        });
        jmiNew.add(jmiNewClient);

        jmiNewBurger.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmiNewBurger.setText("New Burger");
        jmiNewBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewBurgerActionPerformed(evt);
            }
        });
        jmiNew.add(jmiNewBurger);

        jmbMenu.add(jmiNew);

        jmiEdit.setText("Manage");
        jmiEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmiManageClients.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiManageClients.setText("Manage Clients");
        jmiManageClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManageClientsActionPerformed(evt);
            }
        });
        jmiEdit.add(jmiManageClients);

        jmbMenu.add(jmiEdit);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertUINewClientToDesktop() {
        UINewClient uINewClient = new UINewClient();
        jdpDesktop.add(uINewClient);
        uINewClient.setVisible(true);
    }
    
    private void insertUINewBurgerToDesktop() {
        UINewBurger uINewBurger = new UINewBurger();
        jdpDesktop.add(uINewBurger);
        uINewBurger.setVisible(true);
    }
    
    private void insertUIClientManagerToDesktop() {
        UIClientManager uIClientManager = new UIClientManager();
        jdpDesktop.add(uIClientManager);
        uIClientManager.setVisible(true);
    }
    
    private void jmiNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewClientActionPerformed
        insertUINewClientToDesktop();
    }//GEN-LAST:event_jmiNewClientActionPerformed

    private void jmiNewBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewBurgerActionPerformed
        insertUINewBurgerToDesktop();
    }//GEN-LAST:event_jmiNewBurgerActionPerformed

    private void jmiManageClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManageClientsActionPerformed
        insertUIClientManagerToDesktop();
    }//GEN-LAST:event_jmiManageClientsActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jdpDesktop;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenu jmiEdit;
    private javax.swing.JMenuItem jmiManageClients;
    private javax.swing.JMenu jmiNew;
    private javax.swing.JMenuItem jmiNewBurger;
    private javax.swing.JMenuItem jmiNewClient;
    // End of variables declaration//GEN-END:variables
}
