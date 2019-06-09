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

import br.edu.qi.model.ClientVO;
import br.edu.qi.services.ClientServices;
import br.edu.qi.services.ServicesFactory;
import br.edu.qi.util.DialogListener;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian & Willian
 */
public class UIClientManager extends javax.swing.JInternalFrame implements DialogListener{

    private DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"ID", "Name", "Phone Number"}
    );
    
    /**
     * Creates new form UIClientManager
     */
    public UIClientManager() {
        initComponents();
        refresh();
        jcbFilter.setSelectedIndex(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jlpData = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableClients = new javax.swing.JTable();
        jlFilter = new javax.swing.JLabel();
        jtQuery = new javax.swing.JTextField();
        jcbFilter = new javax.swing.JComboBox<>();
        jlpAction = new javax.swing.JLayeredPane();
        jbRefresh = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setClosable(true);

        jlpData.setBorder(new javax.swing.border.MatteBorder(null));

        jtableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableClients);

        jlFilter.setText("Filter");

        jtQuery.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtQueryCaretUpdate(evt);
            }
        });

        jcbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Phone Number" }));
        jcbFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFilterItemStateChanged(evt);
            }
        });

        jlpData.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jlFilter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtQuery, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jcbFilter, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDataLayout = new javax.swing.GroupLayout(jlpData);
        jlpData.setLayout(jlpDataLayout);
        jlpDataLayout.setHorizontalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jlpDataLayout.createSequentialGroup()
                        .addComponent(jlFilter)
                        .addGap(18, 18, 18)
                        .addComponent(jcbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jlpDataLayout.setVerticalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFilter)
                    .addComponent(jcbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlpAction.setBorder(new javax.swing.border.MatteBorder(null));

        jbRefresh.setText("Refresh");
        jbRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRefreshActionPerformed(evt);
            }
        });

        jbClear.setText("Clear");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jlpAction.setLayer(jbRefresh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAction.setLayer(jbClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAction.setLayer(jbEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAction.setLayer(jbDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpActionLayout = new javax.swing.GroupLayout(jlpAction);
        jlpAction.setLayout(jlpActionLayout);
        jlpActionLayout.setHorizontalGroup(
            jlpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDelete)
                .addContainerGap())
        );

        jlpActionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbClear, jbDelete, jbEdit, jbRefresh});

        jlpActionLayout.setVerticalGroup(
            jlpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jlpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbClear)
                    .addComponent(jbEdit)
                    .addComponent(jbDelete)
                    .addComponent(jbRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jlpActionLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbClear, jbDelete, jbEdit, jbRefresh});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpData)
                    .addComponent(jlpAction))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlpAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh() {
        clear();
        try {
            ClientServices clientServices = ServicesFactory.getCLIENT_SERVICES();
            ArrayList<ClientVO> clients;
            if (jtQuery.getText().isEmpty()) {
                clients = clientServices.selectClients();
            } else {
                int filter = jcbFilter.getSelectedIndex();
                String query = jtQuery.getText();
                clients = clientServices.selectClients(query, filter);
            }
            
            for (ClientVO client : clients) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(client.getIDClient()),
                    client.getName(),
                    client.getPhoneNumber()
                });
            }
            
            jtableClients.setModel(defaultTableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void clear() {
        defaultTableModel.setNumRows(0);
    }
    
    private void edit() {
        try {
            int row = jtableClients.getSelectedRow();
            if (row == -1) {
                throw new NullPointerException("No client selected to update.");
            }
            ClientVO clientVO = getClientAt(row);
            UIUpdateClient uIUpdateClient = new UIUpdateClient(null, true, clientVO, this);
            uIUpdateClient.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private ClientVO getClientAt(int row) {
        ClientVO clientVO = new ClientVO(
                Long.parseLong((String) jtableClients.getValueAt(row, 0)),
                (String)jtableClients.getValueAt(row, 1),
                (String)jtableClients.getValueAt(row, 2)
        );
        return clientVO;
    }
    
    private void delete() {
        try {
            int row = jtableClients.getSelectedRow();
            if (row == -1) {
                throw new NullPointerException("No client selected for deletion.");
            }
            ClientVO clientVO = getClientAt(row);
            
            int response = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete '" + clientVO.getName() + "'?",
                    "Delete",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
            if (response == 0) {
                ClientServices clientServices = ServicesFactory.getCLIENT_SERVICES();
                clientServices.deleteClient(clientVO.getIDClient());
                clear();
                refresh();
                JOptionPane.showMessageDialog(
                        this,
                        "Client was deleted from the database.",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void jbRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_jbRefreshActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        clear();
    }//GEN-LAST:event_jbClearActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        edit();
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        delete();
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jtQueryCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtQueryCaretUpdate
        refresh();
    }//GEN-LAST:event_jtQueryCaretUpdate

    private void jcbFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFilterItemStateChanged
        refresh();
    }//GEN-LAST:event_jcbFilterItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JComboBox<String> jcbFilter;
    private javax.swing.JLabel jlFilter;
    private javax.swing.JLayeredPane jlpAction;
    private javax.swing.JLayeredPane jlpData;
    private javax.swing.JTextField jtQuery;
    private javax.swing.JTable jtableClients;
    // End of variables declaration//GEN-END:variables

    @Override
    public void closeJDialog(JDialog jDialog) {
        if (jDialog instanceof UIUpdateClient) {
            refresh();
            jDialog.dispose();
        }
    }

    
}
