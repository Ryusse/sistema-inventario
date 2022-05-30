
package GUI;

import java.awt.Color;
import javax.swing.JPanel;
public class Dashboard extends javax.swing.JFrame {

    Color defaultColor,lightBlue ,blue, gray;
    public Dashboard() {
        initComponents();
        defaultColor = new Color(255,255,255);
        blue = new Color(66,94,240);
        lightBlue = new Color(239,242,255);
        gray = new Color(134,143,165);
        
        MenuItem2.setBackground(lightBlue);
        MenuItemText2.setForeground(blue);
        MenuItem1.setBackground(defaultColor);
        
        Propiedades propiedades = new Propiedades();
        showPanel(propiedades);
    }
    
    private void showPanel(JPanel p){
        p.setSize(920,690);
        
        Content.removeAll();
        Content.add(p);
        Content.revalidate();
        Content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JPanel();
        Aside = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        MenuItem1 = new javax.swing.JPanel();
        MenuItemText1 = new javax.swing.JLabel();
        MenuItem2 = new javax.swing.JPanel();
        MenuItemText2 = new javax.swing.JLabel();
        Content = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dashboard.setBackground(new java.awt.Color(240, 247, 253));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aside.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(15, 23, 67));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Menu");

        MenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        MenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuItem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem1MousePressed(evt);
            }
        });

        MenuItemText1.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemText1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        MenuItemText1.setForeground(new java.awt.Color(134, 143, 165));
        MenuItemText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuItemText1.setText("Perfil");

        javax.swing.GroupLayout MenuItem1Layout = new javax.swing.GroupLayout(MenuItem1);
        MenuItem1.setLayout(MenuItem1Layout);
        MenuItem1Layout.setHorizontalGroup(
            MenuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(MenuItemText1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuItem1Layout.setVerticalGroup(
            MenuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuItemText1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        MenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        MenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem2MousePressed(evt);
            }
        });

        MenuItemText2.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemText2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        MenuItemText2.setForeground(new java.awt.Color(134, 143, 165));
        MenuItemText2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuItemText2.setText("Propiedades");

        javax.swing.GroupLayout MenuItem2Layout = new javax.swing.GroupLayout(MenuItem2);
        MenuItem2.setLayout(MenuItem2Layout);
        MenuItem2Layout.setHorizontalGroup(
            MenuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(MenuItemText2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuItem2Layout.setVerticalGroup(
            MenuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuItemText2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(MenuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout AsideLayout = new javax.swing.GroupLayout(Aside);
        Aside.setLayout(AsideLayout);
        AsideLayout.setHorizontalGroup(
            AsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AsideLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        AsideLayout.setVerticalGroup(
            AsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsideLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Title)
                .addGap(55, 55, 55)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        Dashboard.add(Aside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        Dashboard.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 920, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem1MousePressed
        MenuItem1.setBackground(lightBlue);
        MenuItemText1.setForeground(blue);
        
        MenuItem2.setBackground(defaultColor);
        MenuItemText2.setForeground(gray);
        
        Perfil perfil = new Perfil();
        showPanel(perfil);
        
    }//GEN-LAST:event_MenuItem1MousePressed

    private void MenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem2MousePressed
        MenuItem1.setBackground(defaultColor);
        MenuItemText1.setForeground(gray);
        
        MenuItem2.setBackground(lightBlue);
        MenuItemText2.setForeground(blue);
        
        Propiedades propiedades = new Propiedades();
        showPanel(propiedades);
    }//GEN-LAST:event_MenuItem2MousePressed

    private void MenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem1MouseClicked

    }//GEN-LAST:event_MenuItem1MouseClicked


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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aside;
    private javax.swing.JDesktopPane Content;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuItem1;
    private javax.swing.JPanel MenuItem2;
    private javax.swing.JLabel MenuItemText1;
    private javax.swing.JLabel MenuItemText2;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
