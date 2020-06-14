/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product_management;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;

/**
 *
 * @author 
 */
public class Menu_Form extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Form
     */
    public Menu_Form() {
        //Khởi tạo form
        initComponents();
        // Set vị trí của form ở giữa màn hình
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_mainwindow = new javax.swing.JButton();
        btn_shop = new javax.swing.JButton();
        btn_cate = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_showproducts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU Chương Trình");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_mainwindow.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_mainwindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dog.png"))); // NOI18N
        btn_mainwindow.setText("Thú cưng");
        btn_mainwindow.setToolTipText("Quản lý sản phẩm");
        btn_mainwindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainwindowActionPerformed(evt);
            }
        });

        btn_shop.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_shop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/store.png"))); // NOI18N
        btn_shop.setText("Shop");
        btn_shop.setToolTipText("Quản lý Shop");
        btn_shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shopActionPerformed(evt);
            }
        });

        btn_cate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_cate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list.png"))); // NOI18N
        btn_cate.setText("Giống loài");
        btn_cate.setToolTipText("Quản lý giống loài");
        btn_cate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cateActionPerformed(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        btn_logout.setToolTipText("Đăng xuất");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_showproducts.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_showproducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye.png"))); // NOI18N
        btn_showproducts.setText("Xem theo loại");
        btn_showproducts.setToolTipText("Xem thú cưng theo loại");
        btn_showproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showproductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_logout)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_mainwindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_showproducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_shop, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mainwindow)
                    .addComponent(btn_shop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cate)
                    .addComponent(btn_showproducts))
                .addGap(53, 53, 53)
                .addComponent(btn_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mainwindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainwindowActionPerformed
        // TODO add your handling code here:
        
        // tạo form main_window
        Main_Window form = new Main_Window();
        //Cho form hiện
        form.setVisible(true);
        //phương thức pack giúp frame có kích thước vừa đủ với nội dung của frame 
        form.pack();
        //Khởi tạo form tại giữ màn hình
        form.setLocationRelativeTo(null);
        // Đóng form hiện tại
        this.dispose();
    }//GEN-LAST:event_btn_mainwindowActionPerformed

    private void btn_cateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cateActionPerformed
        // TODO add your handling code here:
        Category_Form form = new Category_Form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // Đóng form hiện tại
        this.dispose();
    }//GEN-LAST:event_btn_cateActionPerformed

    private void btn_shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shopActionPerformed
        // TODO add your handling code here:
        Shop_Form form = new Shop_Form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // Đóng form hiện tại
        this.dispose();
    }//GEN-LAST:event_btn_shopActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        Login_Form form = new Login_Form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // Đóng form hiện tại
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_showproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showproductsActionPerformed
        // TODO add your handling code here:
        ShowProducts form = new ShowProducts();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // Đóng form hiện tại
        this.dispose();
    }//GEN-LAST:event_btn_showproductsActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cate;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_mainwindow;
    private javax.swing.JButton btn_shop;
    private javax.swing.JButton btn_showproducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
