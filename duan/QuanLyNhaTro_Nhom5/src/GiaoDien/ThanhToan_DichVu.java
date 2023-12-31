/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Connections.Connections;
import DoiTuong.DangKy_DichVu;
import DoiTuong.GiaoDich;
import DoiTuong.LienKet;
import DoiTuong.NhaTro;
import DoiTuong.TaiKhoan;
import Entity.DangKy_DichVuDao;
import Entity.GiaoDichDao;
import Entity.LienKetDao;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThanhToan_DichVu extends javax.swing.JFrame {

    /**
     * Creates new form ThanhToan_DichVu
     */
    DefaultTableModel model;
    TaiKhoan user;
    double tongphi;
    LienKet lk;
    GiaoDich gd;
    DangKy_DichVu dk_dv;
    String header[] = {"Tên ngân hàng", "Số thẻ", "Số tài khoản", "Số dư"};
    List<LienKet> list = new ArrayList<LienKet>();

    public ThanhToan_DichVu() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
//        creattable();
//        addRow();
    }

    public ThanhToan_DichVu(TaiKhoan users, DangKy_DichVu dk_dv, double tongphi) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = users;
        this.dk_dv = dk_dv;
        this.tongphi = tongphi;
        creattable();
        addRow();
    }

    public void creattable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(header);
        tblBang.setModel(model);
    }

    public void addRow() throws SQLException {
        String select = "Select * from LienKetThe_Vi where MaTK = '" + user.getMaTK() + "'";
        list = new Connections().getLienKets(select);
        model.setRowCount(0);
        for (LienKet n : list) {
            System.out.println(n);
            model.addRow(new Object[]{n.getTenNganHang(), n.getSoThe(), n.getSoTK(), n.getSoDu()});
        }
        model.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btnthanhtoan = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Chọn Thẻ Thanh Toán");

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên ngân hàng", "Số thẻ", "Số tài khoản", "Số dư"
            }
        ));
        jScrollPane1.setViewportView(tblBang);

        btnthanhtoan.setText("Thanh toán");
        btnthanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthanhtoanActionPerformed(evt);
            }
        });

        btnback.setText("Trở về");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnthanhtoan)
                        .addGap(57, 57, 57)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthanhtoan)
                    .addComponent(btnback))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnthanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthanhtoanActionPerformed
        int index = tblBang.getSelectedRow();
        lk = list.get(index);
        try {
            check(lk);
        } catch (SQLException ex) {
            Logger.getLogger(ThanhToan_DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnthanhtoanActionPerformed
    public void check(LienKet lk) throws SQLException {
         Date date = java.util.Calendar.getInstance().getTime();
        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        String ngayThanhToan = fm.format(date);
        if (this.tongphi <= lk.getSoDu()) {
            lk.setSoDu(lk.getSoDu() - tongphi);
            new LienKetDao().update(lk);
            dk_dv.setTrangthaithanhtoan(false) ;
            new DangKy_DichVuDao().updates(dk_dv,user.getMaTK());
            gd = new GiaoDich("GDVN1000", dk_dv.getTenDV(), 9808373, user.getMaTK() + " Thanh toán dịch vụ ", ngayThanhToan, tongphi, true, lk.getMaLK(), lk.getMaTK(), lk.getTenNganHang(), lk.getSoThe(), lk.getSoTK(), lk.getSoDu());
            new GiaoDichDao().insert(gd);
            JOptionPane.showMessageDialog(null, "Giao dịch thành công");
        } else {
            JOptionPane.showMessageDialog(null, "thanh toán thất bại");
            gd = new GiaoDich("GDVN1000", dk_dv.getTenDV(), 9808373, user.getMaTK() + " Thanh toán dịch vụ ", ngayThanhToan, tongphi, false, lk.getMaLK(), lk.getMaTK(), lk.getTenNganHang(), lk.getSoThe(), lk.getSoTK(), lk.getSoDu());
            new GiaoDichDao().insert(gd);
        }
        addRow();
    }
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
            java.util.logging.Logger.getLogger(ThanhToan_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ThanhToan_DichVu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ThanhToan_DichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnthanhtoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBang;
    // End of variables declaration//GEN-END:variables
}
