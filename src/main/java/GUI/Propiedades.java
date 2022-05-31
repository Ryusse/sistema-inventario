/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import javax.swing.JPanel;

/**
 *
 * @author Hal
 */
public class Propiedades extends javax.swing.JPanel {

    /**
     * Creates new form Propiedades
     */
    public Propiedades() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbRooms = new javax.swing.JComboBox<>();
        cmbDistric1 = new javax.swing.JComboBox<>();
        cmbPrice = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblPerfil = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(249, 252, 255));

        cmbRooms.setBackground(new java.awt.Color(255, 255, 255));
        cmbRooms.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbRooms.setForeground(new java.awt.Color(134, 143, 165));
        cmbRooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dormitorios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbRooms.setBorder(null);
        cmbRooms.setFocusable(false);
        cmbRooms.setOpaque(false);
        cmbRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomsActionPerformed(evt);
            }
        });

        cmbDistric1.setBackground(new java.awt.Color(255, 255, 255));
        cmbDistric1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbDistric1.setForeground(new java.awt.Color(134, 143, 165));
        cmbDistric1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar distrito", "San Isidro", "San Borja", "La Molina", "San Juan de lurigancho" }));
        cmbDistric1.setBorder(null);
        cmbDistric1.setFocusable(false);
        cmbDistric1.setOpaque(false);
        cmbDistric1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistric1ActionPerformed(evt);
            }
        });

        cmbPrice.setBackground(new java.awt.Color(255, 255, 255));
        cmbPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbPrice.setForeground(new java.awt.Color(134, 143, 165));
        cmbPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio", "5000", "1000", "20000", "40000", "60000", "80000", "100000" }));
        cmbPrice.setBorder(null);
        cmbPrice.setFocusable(false);
        cmbPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPriceActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(66, 94, 240));
        btnEdit.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Editar");
        btnEdit.setBorder(null);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 172, 140));
        btnAdd.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Agregar");
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(134, 143, 165));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Distrito", "Dormitorios", "Area total", "Cuartos", "Precio"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(237, 245, 255));
        jScrollPane1.setViewportView(jTable1);

        lblPerfil.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(15, 23, 67));
        lblPerfil.setText("Propiedades");

        btnDelete.setBackground(new java.awt.Color(204, 55, 104));
        btnDelete.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(66, 94, 240));
        btnSearch1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch1.setBorder(null);
        btnSearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch1.setFocusPainted(false);
        btnSearch1.setLabel("Buscar");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPerfil)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDistric1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDistric1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomsActionPerformed

    private void cmbDistric1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistric1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDistric1ActionPerformed

    private void cmbPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPriceActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Id id = new Id();
        id.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AgregarPropiedad agregarPropiedad = new AgregarPropiedad();
        agregarPropiedad.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        EliminarPropiedad eliminarPropiedad = new EliminarPropiedad();
        eliminarPropiedad.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JComboBox<String> cmbDistric1;
    private javax.swing.JComboBox<String> cmbPrice;
    private javax.swing.JComboBox<String> cmbRooms;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPerfil;
    // End of variables declaration//GEN-END:variables
}
