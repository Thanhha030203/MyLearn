/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.baocao.nhaphang;

import dao.ThongKeDAO;
import helper.DateHelper;
import helper.DialogHelper;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BaoCaoNhapHangJFrame extends javax.swing.JFrame {

    /**
     * Creates new form BaoCaoTaiChinhJFrame
     */
    public BaoCaoNhapHangJFrame() {
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

        btg_ChonThoiGian = new javax.swing.ButtonGroup();
        btg_LoaiBaoCao = new javax.swing.ButtonGroup();
        pnl_CotTrai = new javax.swing.JPanel();
        lbl_LoaiBaoCao = new javax.swing.JLabel();
        rad_BaoCaoTongHopHangNhap = new javax.swing.JRadioButton();
        rad_BaoCaoHangNhapTheoNCC = new javax.swing.JRadioButton();
        rad_ToanThoiGian = new javax.swing.JRadioButton();
        rad_HomNay = new javax.swing.JRadioButton();
        rad_TuanNay = new javax.swing.JRadioButton();
        rad_ThangNay = new javax.swing.JRadioButton();
        rad_QuyNay = new javax.swing.JRadioButton();
        rad_NamNay = new javax.swing.JRadioButton();
        rad_Khac = new javax.swing.JRadioButton();
        dat_TuNgay = new com.toedter.calendar.JDateChooser();
        dat_DenNgay = new com.toedter.calendar.JDateChooser();
        lbl_XuatFile = new javax.swing.JLabel();
        lbl_LocTheoThoiGian = new javax.swing.JLabel();
        pnl_CotPhai = new javax.swing.JPanel();
        lbl_TenBaoCao = new javax.swing.JLabel();
        lbl_NgayThongKe = new javax.swing.JLabel();
        lbl_NgayTao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_BangBaoCao = new javax.swing.JTable();
        lbl_TongSoLuong = new javax.swing.JLabel();
        lbl_TongGiaTri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BÁO CÁO NHẬP HÀNG");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        pnl_CotTrai.setBackground(new java.awt.Color(255, 255, 255));

        lbl_LoaiBaoCao.setBackground(new java.awt.Color(102, 102, 255));
        lbl_LoaiBaoCao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_LoaiBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LoaiBaoCao.setText("   LOẠI BÁO CÁO");
        lbl_LoaiBaoCao.setOpaque(true);

        btg_LoaiBaoCao.add(rad_BaoCaoTongHopHangNhap);
        rad_BaoCaoTongHopHangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_BaoCaoTongHopHangNhap.setSelected(true);
        rad_BaoCaoTongHopHangNhap.setText("Báo cáo tổng hợp hàng nhập");
        rad_BaoCaoTongHopHangNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_BaoCaoTongHopHangNhapItemStateChanged(evt);
            }
        });
        rad_BaoCaoTongHopHangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_BaoCaoTongHopHangNhapActionPerformed(evt);
            }
        });

        btg_LoaiBaoCao.add(rad_BaoCaoHangNhapTheoNCC);
        rad_BaoCaoHangNhapTheoNCC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_BaoCaoHangNhapTheoNCC.setText("Báo cáo hàng nhập theo nhà cung cấp");
        rad_BaoCaoHangNhapTheoNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_BaoCaoHangNhapTheoNCCActionPerformed(evt);
            }
        });

        btg_ChonThoiGian.add(rad_ToanThoiGian);
        rad_ToanThoiGian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_ToanThoiGian.setSelected(true);
        rad_ToanThoiGian.setText("Toàn thời gian");

        btg_ChonThoiGian.add(rad_HomNay);
        rad_HomNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_HomNay.setText("Hôm nay");

        btg_ChonThoiGian.add(rad_TuanNay);
        rad_TuanNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_TuanNay.setText("Tuần này");
        rad_TuanNay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_TuanNayItemStateChanged(evt);
            }
        });

        btg_ChonThoiGian.add(rad_ThangNay);
        rad_ThangNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_ThangNay.setText("Tháng này");

        btg_ChonThoiGian.add(rad_QuyNay);
        rad_QuyNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_QuyNay.setText("Quý này");

        btg_ChonThoiGian.add(rad_NamNay);
        rad_NamNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_NamNay.setText("Năm này");
        rad_NamNay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_NamNayActionPerformed(evt);
            }
        });

        btg_ChonThoiGian.add(rad_Khac);
        rad_Khac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_Khac.setText("Khác");
        rad_Khac.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rad_KhacStateChanged(evt);
            }
        });

        dat_TuNgay.setBackground(new java.awt.Color(255, 255, 255));
        dat_TuNgay.setDateFormatString("dd/MM/yyyy");
        dat_TuNgay.setEnabled(false);
        dat_TuNgay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dat_DenNgay.setBackground(new java.awt.Color(255, 255, 255));
        dat_DenNgay.setDateFormatString("dd/MM/yyyy");
        dat_DenNgay.setEnabled(false);
        dat_DenNgay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_XuatFile.setBackground(new java.awt.Color(0, 51, 153));
        lbl_XuatFile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_XuatFile.setForeground(new java.awt.Color(255, 255, 255));
        lbl_XuatFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_XuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconExcel.png"))); // NOI18N
        lbl_XuatFile.setText("Xuất file");
        lbl_XuatFile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 102)));
        lbl_XuatFile.setOpaque(true);
        lbl_XuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_XuatFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_XuatFileMouseExited(evt);
            }
        });

        lbl_LocTheoThoiGian.setBackground(new java.awt.Color(102, 102, 255));
        lbl_LocTheoThoiGian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_LocTheoThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LocTheoThoiGian.setText("   LỌC THEO THỜI GIAN");
        lbl_LocTheoThoiGian.setOpaque(true);

        javax.swing.GroupLayout pnl_CotTraiLayout = new javax.swing.GroupLayout(pnl_CotTrai);
        pnl_CotTrai.setLayout(pnl_CotTraiLayout);
        pnl_CotTraiLayout.setHorizontalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_LoaiBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CotTraiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dat_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(dat_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addComponent(lbl_LocTheoThoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_Khac)
                            .addComponent(rad_HomNay)
                            .addComponent(rad_QuyNay)
                            .addComponent(rad_NamNay)
                            .addComponent(rad_ToanThoiGian)
                            .addComponent(rad_TuanNay)
                            .addComponent(rad_ThangNay)))
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_BaoCaoHangNhapTheoNCC)
                            .addComponent(rad_BaoCaoTongHopHangNhap)))
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lbl_XuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnl_CotTraiLayout.setVerticalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addComponent(lbl_LoaiBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rad_BaoCaoTongHopHangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_BaoCaoHangNhapTheoNCC)
                .addGap(18, 18, 18)
                .addComponent(lbl_LocTheoThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rad_ToanThoiGian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_HomNay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_TuanNay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_ThangNay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_QuyNay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_NamNay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_Khac)
                .addGap(18, 18, 18)
                .addComponent(dat_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dat_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_XuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_TenBaoCao.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbl_TenBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TenBaoCao.setText("Báo cáo tổng hợp hàng nhập");

        lbl_NgayThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NgayThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NgayThongKe.setText("Từ ngày ............... đến ngày ...............");

        lbl_NgayTao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NgayTao.setText("Ngày tạo: ...............");

        tbl_BangBaoCao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_BangBaoCao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", "", null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "ĐVT", "Số lượng", "Đơn giá", "Giá trị"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_BangBaoCao.setRowHeight(35);
        tbl_BangBaoCao.setRowMargin(3);
        jScrollPane1.setViewportView(tbl_BangBaoCao);

        lbl_TongSoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TongSoLuong.setText("Tổng số lượng: ...............");

        lbl_TongGiaTri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TongGiaTri.setText("Tổng giá trị: ............................");

        javax.swing.GroupLayout pnl_CotPhaiLayout = new javax.swing.GroupLayout(pnl_CotPhai);
        pnl_CotPhai.setLayout(pnl_CotPhaiLayout);
        pnl_CotPhaiLayout.setHorizontalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TenBaoCao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_NgayThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                    .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                        .addComponent(lbl_TongSoLuong)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                        .addComponent(lbl_NgayTao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_TongGiaTri)))
                .addContainerGap())
        );
        pnl_CotPhaiLayout.setVerticalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_TenBaoCao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NgayThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TongGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_TongSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(pnl_CotPhai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rad_NamNayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_NamNayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rad_NamNayActionPerformed

    private void rad_KhacStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rad_KhacStateChanged
        // TODO add your handling code here:
        if(rad_Khac.isSelected()){
            dat_TuNgay.setEnabled(true);
            dat_DenNgay.setEnabled(true);
        }        
        else
        {
            dat_TuNgay.setEnabled(false);
            dat_DenNgay.setEnabled(false);
        }        
    }//GEN-LAST:event_rad_KhacStateChanged

    private void rad_BaoCaoHangNhapTheoNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_BaoCaoHangNhapTheoNCCActionPerformed
        // TODO add your handling code here:
        lbl_TenBaoCao.setText("Báo cáo tổng hợp hàng nhập theo nhà cung cấp");
        
    }//GEN-LAST:event_rad_BaoCaoHangNhapTheoNCCActionPerformed

    private void rad_BaoCaoTongHopHangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_BaoCaoTongHopHangNhapActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rad_BaoCaoTongHopHangNhapActionPerformed

    private void lbl_XuatFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_XuatFileMouseEntered
        // TODO add your handling code here:
        lbl_XuatFile.setBackground(Color.yellow);
        lbl_XuatFile.setForeground(Color.blue);
        lbl_XuatFile.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_XuatFileMouseEntered

    private void lbl_XuatFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_XuatFileMouseExited
        // TODO add your handling code here:
        lbl_XuatFile.setBackground(new Color(0,51,153));
        lbl_XuatFile.setForeground(Color.white);
    }//GEN-LAST:event_lbl_XuatFileMouseExited

    private void rad_BaoCaoTongHopHangNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_BaoCaoTongHopHangNhapItemStateChanged
        // TODO add your handling code here:
        if (rad_BaoCaoTongHopHangNhap.isSelected()) {
            bcTongHopHangNhap();
        }
    }//GEN-LAST:event_rad_BaoCaoTongHopHangNhapItemStateChanged

    private void rad_TuanNayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_TuanNayItemStateChanged
        // TODO add your handling code here:
        if (rad_BaoCaoTongHopHangNhap.isSelected()) {
            bcTongHopHangNhapTrongTuan();
        }
    }//GEN-LAST:event_rad_TuanNayItemStateChanged

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
            java.util.logging.Logger.getLogger(BaoCaoNhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoCaoNhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoCaoNhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoCaoNhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoCaoNhapHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_ChonThoiGian;
    private javax.swing.ButtonGroup btg_LoaiBaoCao;
    private com.toedter.calendar.JDateChooser dat_DenNgay;
    private com.toedter.calendar.JDateChooser dat_TuNgay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_LoaiBaoCao;
    private javax.swing.JLabel lbl_LocTheoThoiGian;
    private javax.swing.JLabel lbl_NgayTao;
    private javax.swing.JLabel lbl_NgayThongKe;
    private javax.swing.JLabel lbl_TenBaoCao;
    private javax.swing.JLabel lbl_TongGiaTri;
    private javax.swing.JLabel lbl_TongSoLuong;
    private javax.swing.JLabel lbl_XuatFile;
    private javax.swing.JPanel pnl_CotPhai;
    private javax.swing.JPanel pnl_CotTrai;
    private javax.swing.JRadioButton rad_BaoCaoHangNhapTheoNCC;
    private javax.swing.JRadioButton rad_BaoCaoTongHopHangNhap;
    private javax.swing.JRadioButton rad_HomNay;
    private javax.swing.JRadioButton rad_Khac;
    private javax.swing.JRadioButton rad_NamNay;
    private javax.swing.JRadioButton rad_QuyNay;
    private javax.swing.JRadioButton rad_ThangNay;
    private javax.swing.JRadioButton rad_ToanThoiGian;
    private javax.swing.JRadioButton rad_TuanNay;
    private javax.swing.JTable tbl_BangBaoCao;
    // End of variables declaration//GEN-END:variables

    ThongKeDAO TKDAO = new ThongKeDAO();
    
    DecimalFormat dcf = new DecimalFormat("###,###,###.###");
    
    /*
     * Hàm khởi tạo các giá trị ban đầu cho JFrame
     */
    void inIt() {
        // start code setSize cố định không cho co giãn lung tung:
        this.setSize(1366,768);
        this.setMinimumSize(new Dimension(1366, 768));
        this.setMaximumSize(new Dimension(1366, 768));
        // end code setSize
        setResizable(false);
        setLocationRelativeTo(null);
        bcTongHopHangNhap();
    }
    
    /*
     * Hàm báo cáo tổng hợp hàng nhập
     */
    void bcTongHopHangNhap() {
        lbl_TenBaoCao.setText("Báo cáo tổng hợp hàng nhập");
        lbl_NgayTao.setText("Ngày tạo: " + DateHelper.toString(DateHelper.now(), "dd-MM-yyyy"));
        if (rad_ToanThoiGian.isSelected())
            bcTongHopHangNhapToanTG();
        if (rad_TuanNay.isSelected())
            bcTongHopHangNhapTrongTuan();
    }
    
    /*
     * Hàm báo cáo tổng hợp hàng nhập toàn thời gian
     */
    void bcTongHopHangNhapToanTG() {
        lbl_NgayThongKe.setText("Từ ngày 01-10-2019 đến " + DateHelper.toString(DateHelper.now(), "dd-MM-yyyy"));
        DefaultTableModel dtm = (DefaultTableModel) tbl_BangBaoCao.getModel();
        dtm.setRowCount(0);
        String[] header = {"STT", "Mã SP", "Tên SP", "ĐVT", "Tổng số lượng", "Tổng giá trị nhập"};
        dtm.setColumnIdentifiers(header);
        try {
            List<Object[]> list = TKDAO.thongkeHangNhapToanTG();
            int STT = 1;
            for (int i = 0; i < list.size(); i++) {
                Object[] row = {STT++,
                                list.get(i)[0],
                                list.get(i)[1],
                                list.get(i)[2],
                                list.get(i)[3],
                                dcf.format(list.get(i)[4])};
                dtm.addRow(row);
            }
            double TongGT = TKDAO.tinhTongGiaTriHangNhap();
            int TongSL = TKDAO.tinhTongSLHangNhap();
            lbl_TongGiaTri.setText("Tổng giá trị (bao gồm VAT & chiết khấu): " + dcf.format(TongGT));
            lbl_TongSoLuong.setText("Tổng số lượng: " + TongSL);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm tổng hợp hàng nhập trong tuần
     */
    void bcTongHopHangNhapTrongTuan() {
        String NgayDauTuan = DateHelper.tinhNgayDauTuan(0);
        lbl_NgayThongKe.setText("Từ ngày " + NgayDauTuan + " đến " + DateHelper.toString(DateHelper.now(), "dd-MM-yyyy"));
        DefaultTableModel dtm = (DefaultTableModel) tbl_BangBaoCao.getModel();
        dtm.setRowCount(0);
        String[] header = {"STT", "Mã SP", "Tên SP", "ĐVT", "Tổng số lượng", "Tổng giá trị nhập"};
        dtm.setColumnIdentifiers(header);
        try {
            List<Object[]> list = TKDAO.thongkeHangNhap(DateHelper.tinhNgayDauTuan(1), DateHelper.toString(DateHelper.now(), "yyyy-MM-dd"));
            int STT = 1;
            for (int i = 0; i < list.size(); i++) {
                Object[] row = {STT++,
                                list.get(i)[0],
                                list.get(i)[1],
                                list.get(i)[2],
                                list.get(i)[3],
                                dcf.format(list.get(i)[4])};
                dtm.addRow(row);
            }
            double GTNhap = TKDAO.tinhTongGiaTriHangNhap(DateHelper.tinhNgayDauTuan(1), DateHelper.toString(DateHelper.now(), "yyyy-MM-dd"));
            int SLNhap = TKDAO.tinhTongSLHangNhap(DateHelper.tinhNgayDauTuan(1), DateHelper.toString(DateHelper.now(), "yyyy-MM-dd"));
            lbl_TongSoLuong.setText("Tổng số lượng: " + SLNhap);
            lbl_TongGiaTri.setText("Tổng giá trị (bao gồm VAT & chiết khấu): " + dcf.format(GTNhap));
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
}
