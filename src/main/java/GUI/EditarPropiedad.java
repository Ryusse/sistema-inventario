/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Hal
 */
public class EditarPropiedad extends javax.swing.JFrame {

    /**
     * Creates new form EditarPropiedad
     */
    public EditarPropiedad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEditEstate = new javax.swing.JLabel();
        form1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        lblbath = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtRoom = new javax.swing.JTextField();
        txtBath = new javax.swing.JTextField();
        txtTotalArea = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 252, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEditEstate.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEditEstate.setForeground(new java.awt.Color(15, 23, 67));
        lblEditEstate.setText("Editar propiedad");

        form1.setBackground(new java.awt.Color(249, 252, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 23, 67));
        jLabel3.setText("Direccion");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 23, 67));
        jLabel8.setText("Id");

        txtId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(134, 143, 165));
        txtId.setText("Id");
        txtId.setToolTipText("");
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtId.setEnabled(false);
        txtId.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdtxtUserTypeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(15, 23, 67));
        jLabel9.setText("Descripción");

        lblRoom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblRoom.setForeground(new java.awt.Color(15, 23, 67));
        lblRoom.setText("Cantidad de cuartos");

        lblbath.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblbath.setForeground(new java.awt.Color(15, 23, 67));
        lblbath.setText("Cantidad de baños");

        txtAdress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(134, 143, 165));
        txtAdress.setText("Dirección");
        txtAdress.setToolTipText("");
        txtAdress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtAdress.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdresstxtNameActionPerformed(evt);
            }
        });

        txtDescription.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(134, 143, 165));
        txtDescription.setText("Descripción");
        txtDescription.setToolTipText("");
        txtDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtDescription.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptiontxtLastNameActionPerformed(evt);
            }
        });

        txtRoom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtRoom.setForeground(new java.awt.Color(134, 143, 165));
        txtRoom.setText("Cantidad de cuartos");
        txtRoom.setToolTipText("");
        txtRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtRoom.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomtxtAgeActionPerformed(evt);
            }
        });

        txtBath.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBath.setForeground(new java.awt.Color(134, 143, 165));
        txtBath.setText("Cantidad de baños");
        txtBath.setToolTipText("");
        txtBath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtBath.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtBath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBathtxtEmailActionPerformed(evt);
            }
        });

        txtTotalArea.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTotalArea.setForeground(new java.awt.Color(134, 143, 165));
        txtTotalArea.setText("Área total");
        txtTotalArea.setToolTipText("");
        txtTotalArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtTotalArea.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtTotalArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAreatxtPasswordActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(15, 23, 67));
        jLabel12.setText("Área total");

        txtPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(134, 143, 165));
        txtPrice.setText("Precio");
        txtPrice.setToolTipText("");
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 143, 165)));
        txtPrice.setSelectedTextColor(new java.awt.Color(134, 143, 165));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricetxtPasswordActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 23, 67));
        jLabel13.setText("Precio");

        txtSave.setBackground(new java.awt.Color(66, 94, 240));
        txtSave.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtSave.setForeground(new java.awt.Color(255, 255, 255));
        txtSave.setText("Guardar");
        txtSave.setBorder(null);
        txtSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSave.setFocusPainted(false);
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(249, 252, 255));
        btnCancel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout form1Layout = new javax.swing.GroupLayout(form1);
        form1.setLayout(form1Layout);
        form1Layout.setHorizontalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(form1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form1Layout.createSequentialGroup()
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtDescription)
                            .addComponent(txtRoom)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblbath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtTotalArea, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtBath))))
                .addGap(28, 28, 28))
        );
        form1Layout.setVerticalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 30, Short.MAX_VALUE)
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164))
                    .addGroup(form1Layout.createSequentialGroup()
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(form1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(form1Layout.createSequentialGroup()
                                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblbath, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBath, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditEstate)
                    .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblEditEstate)
                .addGap(47, 47, 47)
                .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdtxtUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdtxtUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdtxtUserTypeActionPerformed

    private void txtAdresstxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresstxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresstxtNameActionPerformed

    private void txtDescriptiontxtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptiontxtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptiontxtLastNameActionPerformed

    private void txtRoomtxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomtxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomtxtAgeActionPerformed

    private void txtBathtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBathtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBathtxtEmailActionPerformed

    private void txtTotalAreatxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAreatxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAreatxtPasswordActionPerformed

    private void txtPricetxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricetxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricetxtPasswordActionPerformed

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed

        dispose();
    }//GEN-LAST:event_txtSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPropiedad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel form1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEditEstate;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblbath;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBath;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JButton txtSave;
    private javax.swing.JTextField txtTotalArea;
    // End of variables declaration//GEN-END:variables
}
