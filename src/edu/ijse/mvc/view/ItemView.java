/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.dto.ItemDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author sahan
 */
public class ItemView extends javax.swing.JFrame {
     private final ItemController ITEM_CONTROLLER;
    /**
     * Creates new form ItemView
     */
    public ItemView() {
        ITEM_CONTROLLER = new ItemController();
        initComponents();
        loadTable();
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
        lblcode = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        txtpack = new javax.swing.JTextField();
        lblitem = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        lblpack = new javax.swing.JLabel();
        txtitem = new javax.swing.JTextField();
        lblunitprice = new javax.swing.JLabel();
        txtunitprice = new javax.swing.JTextField();
        lblqoh = new javax.swing.JLabel();
        txtqoh = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        lblcode.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblcode.setForeground(new java.awt.Color(0, 0, 102));
        lblcode.setText("Item Form");

        lblDesc.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblDesc.setText("Description");

        lblitem.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblitem.setText("Item Code");

        lblpack.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblpack.setText("Pack Size");

        lblunitprice.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblunitprice.setText("Unit Price");

        lblqoh.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblqoh.setText("QOH");

        btndelete.setBackground(new java.awt.Color(0, 0, 102));
        btndelete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");

        btnupdate.setBackground(new java.awt.Color(0, 0, 102));
        btnupdate.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");

        btnsave.setBackground(new java.awt.Color(0, 0, 102));
        btnsave.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsave)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtdesc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtpack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblitem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(txtitem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblcode, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblcode, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblitem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpack)
                    .addComponent(txtpack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblunitprice)
                    .addComponent(txtunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblqoh)
                    .addComponent(txtqoh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(btnsave))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
         saveItem();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
         searchItem();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemMouseClicked

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
//            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ItemView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblcode;
    private javax.swing.JLabel lblitem;
    private javax.swing.JLabel lblpack;
    private javax.swing.JLabel lblqoh;
    private javax.swing.JLabel lblunitprice;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtitem;
    private javax.swing.JTextField txtpack;
    private javax.swing.JTextField txtqoh;
    private javax.swing.JTextField txtunitprice;
    // End of variables declaration//GEN-END:variables
    private void loadTable() {
        String columns[] = {"Item Code", "Description", "Pack Size", "Unit Price", "Qty on Hand"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        
        try {
            ArrayList<ItemDto> itemDtos = ITEM_CONTROLLER.getAllItems();
            for (ItemDto itemDto : itemDtos) {
                Object[] rowData = {itemDto.getItemcode(), itemDto.getDescription(), itemDto.getPackSize(), itemDto.getUnitPrice(), itemDto.getQoh()};
                dtm.addRow(rowData);
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        tblItem.setModel(dtm);
    }
     private void saveItem(){
        ItemDto itemDto = new ItemDto(
                txtitem.getText(),
                txtdesc.getText(), 
                txtpack.getText(), 
                Double.parseDouble(txtunitprice.getText()),
                Integer.parseInt(txtqoh.getText()));
        
        try {
            String resp = ITEM_CONTROLLER.saveItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        private void clearForm(){
            txtitem.setText("");
            txtdesc.setText("");
            txtpack.setText("");
            txtqoh.setText("");
            txtunitprice.setText("");
        }
    private void searchItem() {
        String itemCode = (String) tblItem.getValueAt(tblItem.getSelectedRow(), 0);
        System.out.println(itemCode);
        
        try {

            ItemDto itemDto = ITEM_CONTROLLER.searchItem(itemCode);
            if (itemDto != null) {
                txtitem.setText(itemDto.getItemcode());
                txtdesc.setText(itemDto.getDescription());
                txtpack.setText(itemDto.getPackSize());
                txtqoh.setText(Integer.toString(itemDto.getQoh()));
                txtunitprice.setText(Double.toString(itemDto.getUnitPrice()));
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void updateItem() {
        ItemDto itemDto = new ItemDto(
                txtitem.getText(),
                txtdesc.getText(), 
                txtpack.getText(), 
                Double.parseDouble(txtunitprice.getText()),
                Integer.parseInt(txtqoh.getText()));    
        
        try {
            String resp = ITEM_CONTROLLER.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void deleteItem() {
        String itemCode = txtitem.getText();
        
        try {
            String resp = ITEM_CONTROLLER.deleteItem(itemCode);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
