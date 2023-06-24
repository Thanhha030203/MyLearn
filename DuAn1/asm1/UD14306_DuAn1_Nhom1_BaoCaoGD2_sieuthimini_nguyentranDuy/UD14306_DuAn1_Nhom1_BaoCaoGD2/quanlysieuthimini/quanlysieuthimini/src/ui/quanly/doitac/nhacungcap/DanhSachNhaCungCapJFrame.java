/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.doitac.nhacungcap;

import dao.NhaCungCapDAO;
import dao.ThongKeDAO;
import helper.DialogHelper;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.NhaCungCap;

/**
 *
 * @author Admin
 */
public class DanhSachNhaCungCapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhaCungCapJFrame
     */
    public DanhSachNhaCungCapJFrame() {
        initComponents();
        inIt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_TrangThai = new javax.swing.ButtonGroup();
        pnl_CotPhai = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DanhSachNhaCungCap = new javax.swing.JTable();
        btn_ThemMoi = new javax.swing.JButton();
        btn_NgungGiaoDich = new javax.swing.JButton();
        pnl_CotTrai = new javax.swing.JPanel();
        lbl_TimKiem = new javax.swing.JLabel();
        txt_TimTheoMaTenSDT = new javax.swing.JTextField();
        rad_TatCa = new javax.swing.JRadioButton();
        rad_DangGiaoDich = new javax.swing.JRadioButton();
        rad_NgungGiaoDich = new javax.swing.JRadioButton();
        lbl_TrangThai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DANH SÁCH NHÀ CUNG CẤP");
        setResizable(false);

        lbl_TieuDe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_TieuDe.setForeground(new java.awt.Color(51, 51, 255));
        lbl_TieuDe.setText("DANH SÁCH NHÀ CUNG CẤP");

        tbl_DanhSachNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_DanhSachNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Mã Nhà cung cấp", "Tên Nhà cung cấp", "Điện thoại", "Tổng nhập", "Tổng trả", "Tổng giao dịch"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DanhSachNhaCungCap.setRowHeight(35);
        tbl_DanhSachNhaCungCap.setRowMargin(3);
        tbl_DanhSachNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DanhSachNhaCungCapMouseClicked(evt);
            }
        });
        tbl_DanhSachNhaCungCap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbl_DanhSachNhaCungCapPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DanhSachNhaCungCap);

        btn_ThemMoi.setBackground(new java.awt.Color(255, 51, 0));
        btn_ThemMoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ThemMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/themKhachHang.png"))); // NOI18N
        btn_ThemMoi.setText("THÊM MỚI");
        btn_ThemMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThemMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThemMoiMouseExited(evt);
            }
        });
        btn_ThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemMoiActionPerformed(evt);
            }
        });

        btn_NgungGiaoDich.setBackground(new java.awt.Color(51, 51, 255));
        btn_NgungGiaoDich.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_NgungGiaoDich.setForeground(new java.awt.Color(255, 255, 255));
        btn_NgungGiaoDich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconPause.png"))); // NOI18N
        btn_NgungGiaoDich.setText("NGƯNG GIAO DỊCH");
        btn_NgungGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NgungGiaoDichMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NgungGiaoDichMouseExited(evt);
            }
        });
        btn_NgungGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NgungGiaoDichActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_CotPhaiLayout = new javax.swing.GroupLayout(pnl_CotPhai);
        pnl_CotPhai.setLayout(pnl_CotPhaiLayout);
        pnl_CotPhaiLayout.setHorizontalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                        .addComponent(lbl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btn_NgungGiaoDich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pnl_CotPhaiLayout.setVerticalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NgungGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TieuDe))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
        );

        pnl_CotTrai.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TimKiem.setBackground(new java.awt.Color(102, 102, 255));
        lbl_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TimKiem.setText("   TÌM KIẾM");
        lbl_TimKiem.setOpaque(true);

        txt_TimTheoMaTenSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoMaTenSDT.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoMaTenSDT.setText("Tìm kiếm theo mã, tên, SĐT");
        txt_TimTheoMaTenSDT.setToolTipText("");
        txt_TimTheoMaTenSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaTenSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaTenSDTFocusLost(evt);
            }
        });
        txt_TimTheoMaTenSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoMaTenSDTKeyReleased(evt);
            }
        });

        rad_TatCa.setBackground(new java.awt.Color(255, 255, 255));
        btg_TrangThai.add(rad_TatCa);
        rad_TatCa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_TatCa.setSelected(true);
        rad_TatCa.setText("Tất cả");
        rad_TatCa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_TatCaItemStateChanged(evt);
            }
        });
        rad_TatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_TatCaActionPerformed(evt);
            }
        });

        rad_DangGiaoDich.setBackground(new java.awt.Color(255, 255, 255));
        btg_TrangThai.add(rad_DangGiaoDich);
        rad_DangGiaoDich.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_DangGiaoDich.setText("Đang giao dịch");
        rad_DangGiaoDich.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_DangGiaoDichItemStateChanged(evt);
            }
        });

        rad_NgungGiaoDich.setBackground(new java.awt.Color(255, 255, 255));
        btg_TrangThai.add(rad_NgungGiaoDich);
        rad_NgungGiaoDich.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_NgungGiaoDich.setText("Ngưng giao dịch");
        rad_NgungGiaoDich.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_NgungGiaoDichItemStateChanged(evt);
            }
        });

        lbl_TrangThai.setBackground(new java.awt.Color(102, 102, 255));
        lbl_TrangThai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TrangThai.setText("   TRẠNG THÁI");
        lbl_TrangThai.setOpaque(true);

        javax.swing.GroupLayout pnl_CotTraiLayout = new javax.swing.GroupLayout(pnl_CotTrai);
        pnl_CotTrai.setLayout(pnl_CotTraiLayout);
        pnl_CotTraiLayout.setHorizontalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_TrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addComponent(txt_TimTheoMaTenSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_TatCa)
                            .addComponent(rad_DangGiaoDich)
                            .addComponent(rad_NgungGiaoDich))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_CotTraiLayout.setVerticalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addComponent(lbl_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_TimTheoMaTenSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_TatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rad_DangGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_NgungGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_CotTrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_CotPhai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_CotTrai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_CotPhai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TimTheoMaTenSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaTenSDTFocusGained
        if (txt_TimTheoMaTenSDT.getText().equals("Tìm kiếm theo mã, tên, SĐT")) {
            txt_TimTheoMaTenSDT.setText("");
            txt_TimTheoMaTenSDT.setForeground(new Color(0, 0, 0));
        }
        rad_TatCa.setSelected(true);
    }//GEN-LAST:event_txt_TimTheoMaTenSDTFocusGained

    private void txt_TimTheoMaTenSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaTenSDTFocusLost
        if (txt_TimTheoMaTenSDT.getText().equals("")) {
            txt_TimTheoMaTenSDT.setText("Tìm kiếm theo mã, tên, SĐT");
            txt_TimTheoMaTenSDT.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoMaTenSDTFocusLost

    private void btn_ThemMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMoiMouseEntered
        // TODO add your handling code here:
        btn_ThemMoi.setBackground(Color.yellow);
        btn_ThemMoi.setForeground(Color.blue);
        btn_ThemMoi.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_ThemMoiMouseEntered

    private void btn_ThemMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMoiMouseExited
        // TODO add your handling code here:
        btn_ThemMoi.setBackground(new Color(255, 51, 0));
        btn_ThemMoi.setForeground(Color.white);
    }//GEN-LAST:event_btn_ThemMoiMouseExited

    private void btn_ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemMoiActionPerformed
        // TODO add your handling code here:
        new ThemMoiNhaCungCapJFrame().setVisible(true);
    }//GEN-LAST:event_btn_ThemMoiActionPerformed

    private void btn_NgungGiaoDichMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NgungGiaoDichMouseEntered
        // TODO add your handling code here:
        btn_NgungGiaoDich.setBackground(Color.yellow);
        btn_NgungGiaoDich.setForeground(Color.blue);
        btn_NgungGiaoDich.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_NgungGiaoDichMouseEntered

    private void btn_NgungGiaoDichMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NgungGiaoDichMouseExited
        // TODO add your handling code here:
        btn_NgungGiaoDich.setBackground(new Color(51, 51, 255));
        btn_NgungGiaoDich.setForeground(Color.white);
    }//GEN-LAST:event_btn_NgungGiaoDichMouseExited

    private void btn_NgungGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NgungGiaoDichActionPerformed
        // TODO add your handling code here:
        ngungGiaoDich();
    }//GEN-LAST:event_btn_NgungGiaoDichActionPerformed

    private void rad_TatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_TatCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rad_TatCaActionPerformed

    private void txt_TimTheoMaTenSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoMaTenSDTKeyReleased
        // TODO add your handling code here:
        timTongHop();
    }//GEN-LAST:event_txt_TimTheoMaTenSDTKeyReleased

    private void rad_TatCaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_TatCaItemStateChanged
        // TODO add your handling code here:
        if (rad_TatCa.isSelected()) {
            capnhatDuLieu();
        }
    }//GEN-LAST:event_rad_TatCaItemStateChanged

    private void rad_DangGiaoDichItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_DangGiaoDichItemStateChanged
        // TODO add your handling code here:
        if (rad_DangGiaoDich.isSelected()) {
            locTheoTrangThai(1);
        }
    }//GEN-LAST:event_rad_DangGiaoDichItemStateChanged

    private void rad_NgungGiaoDichItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_NgungGiaoDichItemStateChanged
        // TODO add your handling code here:
        if (rad_NgungGiaoDich.isSelected()) {
            locTheoTrangThai(0);
        }
    }//GEN-LAST:event_rad_NgungGiaoDichItemStateChanged

    private void tbl_DanhSachNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DanhSachNhaCungCapMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
           capnhatNCC();
        }
    }//GEN-LAST:event_tbl_DanhSachNhaCungCapMouseClicked

    private void tbl_DanhSachNhaCungCapPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbl_DanhSachNhaCungCapPropertyChange
        // TODO add your handling code here:
        taoDanhSachDangChon();
    }//GEN-LAST:event_tbl_DanhSachNhaCungCapPropertyChange

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
            java.util.logging.Logger.getLogger(DanhSachNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachNhaCungCapJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_TrangThai;
    private javax.swing.JButton btn_NgungGiaoDich;
    private javax.swing.JButton btn_ThemMoi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_TimKiem;
    private javax.swing.JLabel lbl_TrangThai;
    private javax.swing.JPanel pnl_CotPhai;
    private javax.swing.JPanel pnl_CotTrai;
    private javax.swing.JRadioButton rad_DangGiaoDich;
    private javax.swing.JRadioButton rad_NgungGiaoDich;
    private javax.swing.JRadioButton rad_TatCa;
    private javax.swing.JTable tbl_DanhSachNhaCungCap;
    private javax.swing.JTextField txt_TimTheoMaTenSDT;
    // End of variables declaration//GEN-END:variables

    NhaCungCapDAO NCCDAO = new NhaCungCapDAO();
    ThongKeDAO ThongKeDAO = new ThongKeDAO();
    
    // Định dạng hiển thị số tiền:
    DecimalFormat dcf = new DecimalFormat("###,###,###.###");
    
    // list chua maNCC duoc chon de ngung giao dich
    static List<String> listNgungGD = new ArrayList<>();
    
    /*
     * Hàm khởi tạo các giá trị ban đầu của Frame
     */
    void inIt() {
        this.setSize(1366, 768);
        this.setMinimumSize(new Dimension(1366, 768));
        this.setMaximumSize(new Dimension(1366, 768));
        setResizable(false);
        setLocationRelativeTo(null);
        capnhatDuLieu();
        btn_NgungGiaoDich.setVisible(false);
    }
    
    /*
     * Hàm cập nhật dữ liệu NCC
     */
    void capnhatDuLieu(){
        try {
            List<NhaCungCap> listNCC = NCCDAO.select();
            doDuLieuVaoBang(listNCC);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm đổ dữ liệu vào bảng tbl_DanhSachNCC
     */
    void doDuLieuVaoBang(List<NhaCungCap> listNCC) throws SQLException{
        DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachNhaCungCap.getModel();
        dtm.setRowCount(0);
        for(NhaCungCap NCC : listNCC){
            double TongNhap = NCCDAO.tongTienNhap(NCC.getMaNCC());
            double TongTra = NCCDAO.tongTienTra(NCC.getMaNCC());
            Object[] row = {false, 
                            NCC.getMaNCC(),
                            NCC.getTenNCC(),
                            NCC.getDienThoai(),
                            dcf.format(TongNhap),
                            dcf.format(TongTra),
                            dcf.format(TongNhap - TongTra)
                            };
            dtm.addRow(row);
        }
    }
    
    /*
     * Hàm tìm tổng hợp theo mã, tên, SĐT
     */
    void timTongHop() {
        String ChuoiTimKiem = txt_TimTheoMaTenSDT.getText();
        if (!ChuoiTimKiem.isEmpty()) {
            try {
                List<NhaCungCap> listNCC = NCCDAO.timTheoMaTenSDT(ChuoiTimKiem);
                doDuLieuVaoBang(listNCC);
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
        else {
            capnhatDuLieu();
        }
    }
    
    /*
     * Hàm lọc NCC theo trạng thái
     */
    void locTheoTrangThai(int i) {
        try {
            List<NhaCungCap> listNCC;
            if (i == 1) {
                listNCC = NCCDAO.locTheoTrangThai(1);
            }
            else 
                listNCC = NCCDAO.locTheoTrangThai(0);
            doDuLieuVaoBang(listNCC);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm tạo danh sách các NCC đang được chọn trên table
     */
    void taoDanhSachDangChon() {
        int i = tbl_DanhSachNhaCungCap.getSelectedRow();
        if(i >= 0){
            String MaNCC = tbl_DanhSachNhaCungCap.getValueAt(i, 1).toString();
            if((Boolean)tbl_DanhSachNhaCungCap.getValueAt(i, 0)){
                if(!(listNgungGD.indexOf(MaNCC) >= 0)) {
                    listNgungGD.add(MaNCC);
                }
            }
            else {
                if((listNgungGD.indexOf(MaNCC) >= 0)){
                    listNgungGD.remove(MaNCC);
                }
            }
        }
        if (!listNgungGD.isEmpty()) {
            btn_NgungGiaoDich.setVisible(true);
        }
        else {
            btn_NgungGiaoDich.setVisible(false);
        }
    }
    
    /*
     * Hàm cập nhật trạng thái ngưng giao dịch cho NCC
     */
    void ngungGiaoDich() {
        if(DialogHelper.confirm(this, "Chuyển trạng thái ngưng giao dịch cho các NCC này?")) {
            try {
                int i = 0;
                for(String MaNCC : listNgungGD) {
                    i = NCCDAO.ngungGiaoDich(MaNCC);
                }
                if(i > 0) {
                    DialogHelper.alert(this, "Cập nhật thành công");
                    listNgungGD.clear();
                    btn_NgungGiaoDich.setVisible(false);
                    capnhatDuLieu();
                }
                else {
                    DialogHelper.alert(this, "Cập nhật thất bại");
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm mở frame cập nhật NCC
          và truyền model NCC đang được chọn qua frame cập nhật
     */
    void capnhatNCC() {
        try {
            int index = tbl_DanhSachNhaCungCap.getSelectedRow();
            String MaNCC = tbl_DanhSachNhaCungCap.getValueAt(index, 1).toString();
            NhaCungCap NCC = NCCDAO.timTheoMa(MaNCC);
            new CapNhatNhaCungCapJFrame(NCC).setVisible(true);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
}
