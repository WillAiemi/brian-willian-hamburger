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

import br.edu.qi.interfaces.DialogListener;
import br.edu.qi.model.BurgerVO;
import br.edu.qi.model.ClientVO;
import br.edu.qi.model.OrderListVO;
import br.edu.qi.model.OrderVO;
import br.edu.qi.services.BurgerServices;
import br.edu.qi.services.ClientServices;
import br.edu.qi.services.ServicesFactory;
import br.edu.qi.util.Utilities;
import java.awt.Frame;
import java.awt.Window;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian & Willian
 */
public class UINewOrder extends javax.swing.JInternalFrame implements DialogListener {

    private final ArrayList<OrderListVO> orderListArray;

    private final DefaultTableModel orderListTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Burger", "Quantity", "Price"}
    );

    private static final DecimalFormat DECIMAL_FORMAT_BRL = new DecimalFormat("R$ #,##0.00");

    private final DefaultListModel burgerDefaultListModel = new DefaultListModel();

    private ClientVO clientVO = null;

    /**
     * Creates new form UINewOrder
     */
    public UINewOrder() {
        initComponents();
        jtableOrderList.setModel(orderListTableModel);
        jbAddToOrderList.setEnabled(false);
        jbRemoveFromOrderList.setEnabled(false);
        jbSetObservation.setEnabled(false);

        refreshBurgerList();

        jlistBurger.setModel(burgerDefaultListModel);
        orderListArray = new ArrayList<>();
        jtTotalCost.setText(Utilities.formatToBRL(0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdialogSearchClient = new javax.swing.JDialog();
        jlpBurguer = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistBurger = new javax.swing.JList();
        jtFilterBurger = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableOrderList = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBurgerDescription = new javax.swing.JTextArea();
        jlOrderListObservation = new javax.swing.JLabel();
        jlBurguerDescription = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtOrderListObservation = new javax.swing.JTextArea();
        jbSetObservation = new javax.swing.JButton();
        jbClearObservation = new javax.swing.JButton();
        jbAddToOrderList = new javax.swing.JButton();
        jbRemoveFromOrderList = new javax.swing.JButton();
        jsQuantity = new javax.swing.JSpinner();
        jlTotal = new javax.swing.JLabel();
        jtTotalCost = new javax.swing.JTextField();
        jlpClient = new javax.swing.JLayeredPane();
        jlName = new javax.swing.JLabel();
        jlPhone = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jtPhone = new javax.swing.JTextField();
        jbReset = new javax.swing.JButton();
        jbSearch = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbCreate = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtAdditionalObservations = new javax.swing.JTextArea();

        javax.swing.GroupLayout jdialogSearchClientLayout = new javax.swing.GroupLayout(jdialogSearchClient.getContentPane());
        jdialogSearchClient.getContentPane().setLayout(jdialogSearchClientLayout);
        jdialogSearchClientLayout.setHorizontalGroup(
            jdialogSearchClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdialogSearchClientLayout.setVerticalGroup(
            jdialogSearchClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("New Order");

        jlpBurguer.setBorder(javax.swing.BorderFactory.createTitledBorder("Burguer"));

        jlistBurger.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jlistBurger.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlistBurgerValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlistBurger);

        jtFilterBurger.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtFilterBurgerCaretUpdate(evt);
            }
        });

        jtableOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableOrderList.getTableHeader().setReorderingAllowed(false);
        jtableOrderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableOrderListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableOrderList);

        jtBurgerDescription.setEditable(false);
        jtBurgerDescription.setColumns(20);
        jtBurgerDescription.setLineWrap(true);
        jtBurgerDescription.setRows(5);
        jtBurgerDescription.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jtBurgerDescription);

        jlOrderListObservation.setText("Observation");

        jlBurguerDescription.setText("Burguer Description");

        jtOrderListObservation.setColumns(20);
        jtOrderListObservation.setRows(5);
        jScrollPane4.setViewportView(jtOrderListObservation);

        jbSetObservation.setText("Set");
        jbSetObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetObservationActionPerformed(evt);
            }
        });

        jbClearObservation.setText("Clear");
        jbClearObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearObservationActionPerformed(evt);
            }
        });

        jbAddToOrderList.setText(">>>");
        jbAddToOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddToOrderListActionPerformed(evt);
            }
        });

        jbRemoveFromOrderList.setText("<<<");
        jbRemoveFromOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoveFromOrderListActionPerformed(evt);
            }
        });

        jsQuantity.setValue(1);
        jsQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsQuantityStateChanged(evt);
            }
        });

        jlTotal.setText("Total");

        jtTotalCost.setEditable(false);

        jlpBurguer.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jtFilterBurger, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jlOrderListObservation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jlBurguerDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jbSetObservation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jbClearObservation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jbAddToOrderList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jbRemoveFromOrderList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jsQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jlTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpBurguer.setLayer(jtTotalCost, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpBurguerLayout = new javax.swing.GroupLayout(jlpBurguer);
        jlpBurguer.setLayout(jlpBurguerLayout);
        jlpBurguerLayout.setHorizontalGroup(
            jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpBurguerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addComponent(jlBurguerDescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFilterBurger, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAddToOrderList, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jbRemoveFromOrderList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsQuantity))))
                .addGap(18, 18, 18)
                .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addComponent(jbSetObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jbClearObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addComponent(jlOrderListObservation)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jlpBurguerLayout.setVerticalGroup(
            jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpBurguerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addComponent(jtFilterBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jlpBurguerLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jbAddToOrderList)
                                .addGap(18, 18, 18)
                                .addComponent(jsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbRemoveFromOrderList))))
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTotal)
                            .addComponent(jtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlOrderListObservation)
                    .addComponent(jlBurguerDescription))
                .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jlpBurguerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpBurguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSetObservation)
                    .addComponent(jbClearObservation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpClient.setBorder(javax.swing.BorderFactory.createTitledBorder("Client"));

        jlName.setText("Name");

        jlPhone.setText("Phone");

        jbReset.setText("Reset");
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });

        jbSearch.setText("Search");
        jbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchActionPerformed(evt);
            }
        });

        jlpClient.setLayer(jlName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpClient.setLayer(jlPhone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpClient.setLayer(jtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpClient.setLayer(jtPhone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpClient.setLayer(jbReset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpClient.setLayer(jbSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpClientLayout = new javax.swing.GroupLayout(jlpClient);
        jlpClient.setLayout(jlpClientLayout);
        jlpClientLayout.setHorizontalGroup(
            jlpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpClientLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jlpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpClientLayout.createSequentialGroup()
                        .addComponent(jlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpClientLayout.createSequentialGroup()
                        .addComponent(jlPhone)
                        .addGap(18, 18, 18)
                        .addComponent(jtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpClientLayout.createSequentialGroup()
                        .addComponent(jbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpClientLayout.setVerticalGroup(
            jlpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpClientLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jlpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhone)
                    .addComponent(jtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jlpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbReset)
                    .addComponent(jbSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        jbCreate.setText("Create");
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });

        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jbCreate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbCancel)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLayeredPane3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbCancel, jbCreate});

        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancel)
                    .addComponent(jbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLayeredPane3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbCancel, jbCreate});

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Additional observations"));

        jtAdditionalObservations.setColumns(20);
        jtAdditionalObservations.setRows(5);
        jScrollPane5.setViewportView(jtAdditionalObservations);

        jLayeredPane1.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpClient)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlpClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtFilterBurgerCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtFilterBurgerCaretUpdate
        refreshBurgerList();
    }//GEN-LAST:event_jtFilterBurgerCaretUpdate

    private void jlistBurgerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlistBurgerValueChanged
        refreshBurgerDescription();
    }//GEN-LAST:event_jlistBurgerValueChanged

    private void jsQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsQuantityStateChanged
        if ((int) jsQuantity.getValue() < 1) {
            jsQuantity.setValue(1);
        }
    }//GEN-LAST:event_jsQuantityStateChanged

    private void jbAddToOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddToOrderListActionPerformed
        addBurgerToOrderList();
    }//GEN-LAST:event_jbAddToOrderListActionPerformed

    private void jbRemoveFromOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoveFromOrderListActionPerformed
        removeBurgerFromOrderList();
    }//GEN-LAST:event_jbRemoveFromOrderListActionPerformed

    private void jtableOrderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableOrderListMouseClicked
        refreshOrderListDescription();
    }//GEN-LAST:event_jtableOrderListMouseClicked

    private void jbSetObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetObservationActionPerformed
        setObservationOfOrderList();
    }//GEN-LAST:event_jbSetObservationActionPerformed

    private void jbClearObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearObservationActionPerformed
        clearObservationOfOrderList();
    }//GEN-LAST:event_jbClearObservationActionPerformed

    private void jbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchActionPerformed
        searchClient();
    }//GEN-LAST:event_jbSearchActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        resetClient();
    }//GEN-LAST:event_jbResetActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        cancel();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        createOrder();
    }//GEN-LAST:event_jbCreateActionPerformed

    private void createOrder() {
        try {
            if (clientVO == null) {
                if (jtName.getText().isEmpty()) {
                    throw new NullPointerException("Client's name is empty.");
                }
                if (jtPhone.getText().isEmpty()) {
                    throw new NullPointerException("Client's phone is empty.");
                }
                
                ClientServices clientServices = ServicesFactory.getCLIENT_SERVICES();
                clientServices.insertClient(new ClientVO(
                        jtName.getText(),
                        jtPhone.getText()
                ));
                                
            }
            
            OrderVO orderVO = new OrderVO(
                    this.clientVO,
                    Utilities.getDate().toString(),
                    jtAdditionalObservations.getText()
            );
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void cancel() {
        this.dispose();
    }
    
    private void searchClient() {
        jdialogSearchClient = new UISearchClient((Frame) SwingUtilities.getAncestorOfClass(Window.class, jbSearch), true, this);
        jdialogSearchClient.setVisible(true);
    }

    private void resetClient() {
        this.clientVO = null;
        jtName.setText(null);
        jtPhone.setText(null);
        jtName.setEditable(true);
        jtPhone.setEditable(true);
    }

    private void setObservationOfOrderList() {
        int row = jtableOrderList.getSelectedRow();
        String observation = jtOrderListObservation.getText();
        if (observation != null) {
            orderListArray.get(row).setObservation(observation);
        }
    }

    private void clearObservationOfOrderList() {
        jtOrderListObservation.setText("");
    }

    private void refreshOrderListDescription() {
        int index = jtableOrderList.getSelectedRow();
        if (index != -1) {
            jbRemoveFromOrderList.setEnabled(true);
            jbSetObservation.setEnabled(true);
            jtOrderListObservation.setText(orderListArray.get(index).getObservation());
            return;
        }
        clearObservationOfOrderList();
        jbRemoveFromOrderList.setEnabled(false);
        jbSetObservation.setEnabled(false);
    }

    private String[] vectorizeOrderListVO(OrderListVO orderListVO) {
        return new String[]{
            orderListVO.getBurgerVO().getName(),
            String.valueOf(orderListVO.getQuantity()),
            Utilities.formatToBRL(orderListVO.getSubtotal())
        };
    }

    private void refreshOrderListTable() {
        try {
            orderListTableModel.setNumRows(0);
            if (this.orderListArray.isEmpty()) {
                jtTotalCost.setText(Utilities.formatToBRL(0));
                return;
            }
            double totalCost = 0;
            for (OrderListVO orderListVO : orderListArray) {
                orderListTableModel.addRow(vectorizeOrderListVO(orderListVO));
                totalCost += orderListVO.getSubtotal();
            }
            jtTotalCost.setText(Utilities.formatToBRL(Utilities.round(totalCost, 2)));
            refreshOrderListDescription();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void addBurgerToOrderList() {
        try {
            BurgerVO burgerVO = (BurgerVO) jlistBurger.getSelectedValue();
            int quantity = (int) jsQuantity.getValue();
            jsQuantity.setValue(1);

            if (!orderListArray.isEmpty()) {
                OrderListVO orderList;
                try {
                    orderList = orderListArray.stream()
                            .filter((orderListVO) -> (orderListVO.getBurgerVO() == burgerVO))
                            .findFirst()
                            .get();
                } catch (NoSuchElementException e) {
                    orderList = null;
                }
                if (orderList != null) {
                    orderList.setQuantity(orderList.getQuantity() + quantity);
                    refreshOrderListTable();
                    int index0 = orderListArray.indexOf(orderList);
                    jtableOrderList.setRowSelectionInterval(index0, index0);
                    refreshOrderListDescription();
                    return;
                }
            }

            OrderListVO orderListVO = new OrderListVO();
            orderListVO.setBurgerVO(burgerVO);
            orderListVO.setQuantity(quantity);
            orderListArray.add(orderListVO);
            int index1 = orderListArray.indexOf(orderListVO);
            refreshOrderListTable();
            jtableOrderList.setRowSelectionInterval(index1, index1);
            refreshOrderListDescription();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void removeBurgerFromOrderList() {
        try {
            int row = jtableOrderList.getSelectedRow();
            int quantity = (int) jsQuantity.getValue();
            jsQuantity.setValue(1);

            if (row != -1) {
                OrderListVO orderList = orderListArray.get(row);
                int resultQuantity = orderList.getQuantity() - quantity;
                if (resultQuantity <= 0) {
                    orderListArray.remove(orderList);
                    refreshOrderListTable();
                    refreshOrderListDescription();
                    return;
                }

                orderList.setQuantity(resultQuantity);
                refreshOrderListTable();
                jtableOrderList.setRowSelectionInterval(row, row);
                refreshOrderListDescription();
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

    private void refreshBurgerDescription() {
        if (jlistBurger.getSelectedIndex() != -1) {
            BurgerVO burgerVO = (BurgerVO) jlistBurger.getSelectedValue();
            jtBurgerDescription.setText(burgerVO.getDescription());
            jbAddToOrderList.setEnabled(true);
            return;
        }
        jbAddToOrderList.setEnabled(false);
    }

    private void clearBurgerListModel() {
        this.burgerDefaultListModel.clear();
    }

    private void refreshBurgerList() {
        try {
            BurgerServices burgerServices = ServicesFactory.getBURGER_SERVICES();
            ArrayList<BurgerVO> burgers;
            if (jtFilterBurger.getText().isEmpty()) {
                burgers = burgerServices.selectBurgers();
            } else {
                burgers = burgerServices.selectBurgers(jtFilterBurger.getText(), BurgerServices.NAME);
            }

            clearBurgerListModel();

            burgers.forEach((burger) -> {
                this.burgerDefaultListModel.addElement(burger);
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e,
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbAddToOrderList;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbClearObservation;
    private javax.swing.JButton jbCreate;
    private javax.swing.JButton jbRemoveFromOrderList;
    private javax.swing.JButton jbReset;
    private javax.swing.JButton jbSearch;
    private javax.swing.JButton jbSetObservation;
    private javax.swing.JDialog jdialogSearchClient;
    private javax.swing.JLabel jlBurguerDescription;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlOrderListObservation;
    private javax.swing.JLabel jlPhone;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JList jlistBurger;
    private javax.swing.JLayeredPane jlpBurguer;
    private javax.swing.JLayeredPane jlpClient;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JTextArea jtAdditionalObservations;
    private javax.swing.JTextArea jtBurgerDescription;
    private javax.swing.JTextField jtFilterBurger;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextArea jtOrderListObservation;
    private javax.swing.JTextField jtPhone;
    private javax.swing.JTextField jtTotalCost;
    private javax.swing.JTable jtableOrderList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void closeJDialog(JDialog jDialog) {
        if (jDialog instanceof UISearchClient) {
            UISearchClient uiSearchClient = (UISearchClient) jDialog;
            ClientVO client = uiSearchClient.clientVO;
            if (client != null) {
                this.clientVO = client;
                jtName.setText(client.getName());
                jtPhone.setText(client.getPhoneNumber());
                jtName.setEditable(false);
                jtPhone.setEditable(false);
            }
            jDialog.dispose();
            jdialogSearchClient = null;
        }
    }
}
