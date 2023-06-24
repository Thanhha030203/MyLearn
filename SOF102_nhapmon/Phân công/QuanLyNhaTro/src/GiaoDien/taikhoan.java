/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import DoiTuong.TaiKhoan;
import Entity.NguoiDungDao;
import Entity.TaiKhoanDao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author minhc
 */
public class taikhoan extends javax.swing.JFrame {

    /**
     * Creates new form taikhoan
     */
    String users;
    TaiKhoan user;

    public taikhoan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public taikhoan(String user) {
        this.users = user;
        System.out.println(users);
        initComponents();
        this.setLocationRelativeTo(null);
        add();

    }

    public void add() {
        System.out.println("b");
       
        this.user = new TaiKhoanDao().Select_ID(users);
        System.out.println(this.user);
        System.out.println("a");
        txtHoTen.setText(user.getTenNgD());
        txtPass.setText(user.getPassword());
        txtDiaChi.setText(user.getDiaChi());
        txtUsername.setText(user.getUserName());
        txtEmail.setText(user.getEmail());
        txtSDT.setText(String.valueOf(user.getSDT()));
         txtCCCD.setText(String.valueOf(user.getCMND()));
         rdoNam.setSelected(user.isGioitinh());
         rdoNu.setSelected(user.isGioitinh()==false);
         lbngaysinh.setText(user.getNgaySinh());
         lblhinh.setIcon(new ImageIcon("Icon//heart.png"));
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblhinh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnchinhsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lbngaysinh = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TÀI KHOẢN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 97, -1, -1));

        jLabel1.setText("UserName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 94, -1, -1));

        jLabel2.setText("Mật khẩu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 143, -1, -1));

        jLabel3.setText("Họ và tên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 200, 52, -1));

        jLabel4.setText("Địa chỉ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 251, 52, -1));

        jLabel5.setText("Gioi tính");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 300, -1, -1));

        jLabel6.setText("CMND/CCCD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 94, -1, -1));

        jLabel7.setText("Số điện thoại");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 134, -1, -1));

        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 183, -1, -1));

        jLabel9.setText("Ngày sinh");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 241, -1, -1));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 85, 152, 34));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 137, 152, 33));

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });
        getContentPane().add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 193, 152, 30));
        getContentPane().add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 241, 152, 35));
        getContentPane().add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 86, 161, 31));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 125, 161, 33));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 176, 161, 30));

        btnchinhsua.setText("Chỉnh sửa");
        btnchinhsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchinhsuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnchinhsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 360, 132, -1));

        btnxoa.setText("Xóa tài khoản");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 360, 128, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        getContentPane().add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 296, 62, -1));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        getContentPane().add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 296, -1, -1));
        getContentPane().add(lbngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 241, 124, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("My Account");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 270, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hinhnenchungcu.jpg"))); // NOI18N
        jLabel10.setText("My Account");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(154, 255, 172), new java.awt.Color(255, 204, 184), java.awt.Color.lightGray, new java.awt.Color(184, 172, 255)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int kq = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xoá tài khoản","Cảnh báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(kq == JOptionPane.YES_OPTION){ 
            try {
        TaiKhoanDao tkd = new TaiKhoanDao();
        tkd.delete(user);
                System.out.println("12");
        JOptionPane.showMessageDialog(null, "Bạn đã xoá thành công");
        dangnhap dn = new dangnhap();
                System.out.println("123");
        dn.setVisible(true);
        this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Quá trình xoá bị lỗi" );
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnchinhsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchinhsuaActionPerformed
        // TODO add your handling code here:
        user.setUserName(txtUsername.getText());
        user.setPassword(txtPass.getText());
        user.setTenNgD(txtHoTen.getText());
        user.setDiaChi(txtDiaChi.getText());
        user.setCMND(Integer.parseInt(txtCCCD.getText()));
        user.setSDT(Integer.parseInt(txtSDT.getText()));
        user.setEmail(txtEmail.getText());
        user.setGioitinh((rdoNam.isSelected()?true:false)) ;
        user.setNgaySinh(lbngaysinh.getText());
        user.setHinhAnh(lblhinh.getText());
        TaiKhoanDao tkd = new TaiKhoanDao();
        tkd.update(user);
        NguoiDungDao nd = new NguoiDungDao();
        nd.update(user);
    }//GEN-LAST:event_btnchinhsuaActionPerformed

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
            java.util.logging.Logger.getLogger(taikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new taikhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchinhsua;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblhinh;
    private javax.swing.JLabel lbngaysinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
