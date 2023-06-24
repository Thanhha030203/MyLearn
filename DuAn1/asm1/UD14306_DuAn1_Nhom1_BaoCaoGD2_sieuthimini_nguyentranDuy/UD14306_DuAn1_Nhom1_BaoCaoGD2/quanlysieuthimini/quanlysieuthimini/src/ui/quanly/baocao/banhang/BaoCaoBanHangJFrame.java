/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.baocao.banhang;

import dao.HoaDonDAO;
import dao.ThongKeDAO;
import helper.DateHelper;
import helper.DialogHelper;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Administrator
 */
public class BaoCaoBanHangJFrame extends javax.swing.JFrame {

    /**
     * Creates new form BaoCaoTaiChinhJFrame
     */
    public BaoCaoBanHangJFrame() {
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
        pnl_CotTrai = new javax.swing.JPanel();
        lbl_LocTheoThoiGian = new javax.swing.JLabel();
        rad_ToanThoiGian = new javax.swing.JRadioButton();
        rad_HomNay = new javax.swing.JRadioButton();
        rad_TuanNay = new javax.swing.JRadioButton();
        rad_ThangNay = new javax.swing.JRadioButton();
        rad_QuyNay = new javax.swing.JRadioButton();
        rad_NamNay = new javax.swing.JRadioButton();
        rad_Khac = new javax.swing.JRadioButton();
        dat_TuNgay = new com.toedter.calendar.JDateChooser();
        dat_DenNgay = new com.toedter.calendar.JDateChooser();
        btn_XuatFile = new javax.swing.JButton();
        pnl_CotPhai = new javax.swing.JPanel();
        lbl_TenBaoCao = new javax.swing.JLabel();
        lbl_NgayThongKe = new javax.swing.JLabel();
        lbl_NgayTao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_BangBaoCao = new javax.swing.JTable();
        lbl_SoDonHang = new javax.swing.JLabel();
        lbl_DoanhThu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BÁO CÁO BÁN HÀNG");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        pnl_CotTrai.setBackground(new java.awt.Color(255, 255, 255));

        lbl_LocTheoThoiGian.setBackground(new java.awt.Color(102, 102, 255));
        lbl_LocTheoThoiGian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_LocTheoThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LocTheoThoiGian.setText("   LỌC  THEO THỜI GIAN");
        lbl_LocTheoThoiGian.setOpaque(true);

        btg_ChonThoiGian.add(rad_ToanThoiGian);
        rad_ToanThoiGian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_ToanThoiGian.setSelected(true);
        rad_ToanThoiGian.setText("Toàn thời gian");
        rad_ToanThoiGian.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_ToanThoiGianItemStateChanged(evt);
            }
        });

        btg_ChonThoiGian.add(rad_HomNay);
        rad_HomNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_HomNay.setText("Hôm nay");
        rad_HomNay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_HomNayItemStateChanged(evt);
            }
        });

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
        rad_ThangNay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_ThangNayActionPerformed(evt);
            }
        });

        btg_ChonThoiGian.add(rad_QuyNay);
        rad_QuyNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_QuyNay.setText("Quý này");
        rad_QuyNay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_QuyNayActionPerformed(evt);
            }
        });

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

        btn_XuatFile.setBackground(new java.awt.Color(51, 51, 255));
        btn_XuatFile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_XuatFile.setForeground(new java.awt.Color(255, 255, 255));
        btn_XuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconExcel2.png"))); // NOI18N
        btn_XuatFile.setText("XUẤT FILE");
        btn_XuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_XuatFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_XuatFileMouseExited(evt);
            }
        });
        btn_XuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_CotTraiLayout = new javax.swing.GroupLayout(pnl_CotTrai);
        pnl_CotTrai.setLayout(pnl_CotTraiLayout);
        pnl_CotTraiLayout.setHorizontalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_LocTheoThoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CotTraiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dat_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(dat_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_Khac)
                            .addComponent(rad_TuanNay)
                            .addComponent(rad_HomNay)
                            .addComponent(rad_ThangNay)
                            .addComponent(rad_QuyNay)
                            .addComponent(rad_NamNay)
                            .addComponent(rad_ToanThoiGian)))
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btn_XuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pnl_CotTraiLayout.setVerticalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addComponent(lbl_LocTheoThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dat_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dat_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_XuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_TenBaoCao.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbl_TenBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TenBaoCao.setText("Báo cáo chi tiết doanh thu");

        lbl_NgayThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NgayThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NgayThongKe.setText("Từ ngày ............... đến ngày ...............");

        lbl_NgayTao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NgayTao.setText("Ngày tạo: ...............");

        tbl_BangBaoCao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_BangBaoCao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hoá đơn", "Ngày bán", "Người bán", "Số lượng SP", "Chiết khấu", "Giá trị"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_BangBaoCao.setRowHeight(35);
        tbl_BangBaoCao.setRowMargin(3);
        jScrollPane1.setViewportView(tbl_BangBaoCao);

        lbl_SoDonHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_SoDonHang.setText("Số đơn hàng: ...............");

        lbl_DoanhThu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_DoanhThu.setText("Doanh thu: .........................");

        javax.swing.GroupLayout pnl_CotPhaiLayout = new javax.swing.GroupLayout(pnl_CotPhai);
        pnl_CotPhai.setLayout(pnl_CotPhaiLayout);
        pnl_CotPhaiLayout.setHorizontalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TenBaoCao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_NgayThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                    .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                        .addComponent(lbl_SoDonHang)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                        .addComponent(lbl_NgayTao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_DoanhThu)))
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
                    .addComponent(lbl_DoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_SoDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (rad_NamNay.isSelected()) {
            locTrongNam();
        }
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

    private void btn_XuatFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatFileMouseEntered
        // TODO add your handling code here:
        btn_XuatFile.setBackground(Color.yellow);
        btn_XuatFile.setForeground(Color.blue);
        btn_XuatFile.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_XuatFileMouseEntered

    private void btn_XuatFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatFileMouseExited
        // TODO add your handling code here:
        btn_XuatFile.setBackground(new Color(51, 51, 255));
        btn_XuatFile.setForeground(Color.white);
    }//GEN-LAST:event_btn_XuatFileMouseExited

    private void btn_XuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XuatFileActionPerformed
        // TODO add your handling code here:
        xuatFile();
    }//GEN-LAST:event_btn_XuatFileActionPerformed

    private void rad_ToanThoiGianItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_ToanThoiGianItemStateChanged
        // TODO add your handling code here:
        if (rad_ToanThoiGian.isSelected()) {
            locToanThoiGian();
        }
    }//GEN-LAST:event_rad_ToanThoiGianItemStateChanged

    private void rad_HomNayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_HomNayItemStateChanged
        // TODO add your handling code here:
        if (rad_HomNay.isSelected()) {
            locHomNay();
        }
    }//GEN-LAST:event_rad_HomNayItemStateChanged

    private void rad_TuanNayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_TuanNayItemStateChanged
        // TODO add your handling code here:
        if (rad_TuanNay.isSelected()) {
            locTrongTuan();
        }
    }//GEN-LAST:event_rad_TuanNayItemStateChanged

    private void rad_ThangNayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_ThangNayActionPerformed
        // TODO add your handling code here:
        if (rad_ThangNay.isSelected()) {
            locTrongThang();
        }
    }//GEN-LAST:event_rad_ThangNayActionPerformed

    private void rad_QuyNayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_QuyNayActionPerformed
        // TODO add your handling code here:
        if (rad_QuyNay.isSelected()) {
            locTrongQuy();
        }
    }//GEN-LAST:event_rad_QuyNayActionPerformed

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
            java.util.logging.Logger.getLogger(BaoCaoBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoCaoBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoCaoBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoCaoBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoCaoBanHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_ChonThoiGian;
    private javax.swing.JButton btn_XuatFile;
    private com.toedter.calendar.JDateChooser dat_DenNgay;
    private com.toedter.calendar.JDateChooser dat_TuNgay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_DoanhThu;
    private javax.swing.JLabel lbl_LocTheoThoiGian;
    private javax.swing.JLabel lbl_NgayTao;
    private javax.swing.JLabel lbl_NgayThongKe;
    private javax.swing.JLabel lbl_SoDonHang;
    private javax.swing.JLabel lbl_TenBaoCao;
    private javax.swing.JPanel pnl_CotPhai;
    private javax.swing.JPanel pnl_CotTrai;
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
    HoaDonDAO HoaDonDAO = new HoaDonDAO();
    
    DecimalFormat dcf = new DecimalFormat("###,###,###.###");
        
    /*
     *
     */
    void inIt() {
        // start code setSize cố định không cho co giãn lung tung:
        this.setSize(1366,768);
        this.setMinimumSize(new Dimension(1366, 768));
        this.setMaximumSize(new Dimension(1366, 768));
        // end code setSize
        setResizable(false);
        setLocationRelativeTo(null);
        locToanThoiGian();
    }
    
    /*
     * Hàm báo cáo toàn thời gian
     */
    void locToanThoiGian() {
        try {
            String NgayHienTai = DateHelper.toString(DateHelper.now(), "dd-MM-yyyy");
            lbl_NgayThongKe.setText("Từ ngày 01-10-2019 đến ngày " + NgayHienTai);
            lbl_NgayTao.setText("Ngày tạo: " + NgayHienTai);
            double TongDoanhThu = TKDAO.tinhTongDoanhThu();
            lbl_DoanhThu.setText("Doanh thu: " + dcf.format(TongDoanhThu));
            int TongHoaDon = HoaDonDAO.demHoaDon();
            lbl_SoDonHang.setText("Số đơn hàng: " + TongHoaDon);
            List<HoaDon> listHD = HoaDonDAO.select();
            doThongTinHoaDon(listHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm báo cáo doanh thu hôm nay
     */
    void locHomNay() {
        try {
            String NgayHienTai = DateHelper.toString(DateHelper.now(), "dd-MM-yyyy");
            lbl_NgayThongKe.setText("Từ ngày " + NgayHienTai + " đến ngày " + NgayHienTai);
            lbl_NgayTao.setText("Ngày tạo: " + NgayHienTai);
            double DoanhThu = TKDAO.tinhDoanhThuTrongNgay();
            lbl_DoanhThu.setText("Doanh thu: " + dcf.format(DoanhThu));
            int SoHoaDon = TKDAO.demSoDonTrongNgay();
            lbl_SoDonHang.setText("Số đơn hàng: " + SoHoaDon);
            List<HoaDon> listHD = HoaDonDAO.timTrongNgay();
            doThongTinHoaDon(listHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm báo cáo doanh thu trong tuần
     */
    void locTrongTuan() {
        try {
            String NgayHienTai = DateHelper.toString(DateHelper.now(), "dd-MM-yyyy");
            String NgayDauTuan = DateHelper.tinhNgayDauTuan(0);
            lbl_NgayThongKe.setText("Từ ngày " + NgayDauTuan + " đến ngày " + NgayHienTai);
            lbl_NgayTao.setText("Ngày tạo: " + NgayHienTai);
            double DoanhThu = TKDAO.tinhDoanhThuTrongTuan();
            lbl_DoanhThu.setText("Doanh thu: " + dcf.format(DoanhThu));
            int SoHoaDon = TKDAO.demSoDonTrongTuan();
            lbl_SoDonHang.setText("Số đơn hàng: " + SoHoaDon);
            List<HoaDon> listHD = HoaDonDAO.locHoaDonTrongTuan();
            doThongTinHoaDon(listHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm báo cáo doanh thu trong tháng
     */
    void locTrongThang() {
        try {
            String NgayHienTai = DateHelper.toString(DateHelper.now(), "dd-MM-yyyy");
            String ThangHienTai = NgayHienTai.substring(3, 5);
            String NamHienTai = NgayHienTai.substring(6, 10);
            lbl_NgayThongKe.setText("Thống kê: Tháng " + ThangHienTai + "-" + NamHienTai );
            lbl_NgayTao.setText("Ngày tạo: " + NgayHienTai);
            double DoanhThu = TKDAO.tinhDoanhThuTrongThang();
            lbl_DoanhThu.setText("Doanh thu: " + dcf.format(DoanhThu));
            int SoHoaDon = TKDAO.demSoDonTrongThang();
            lbl_SoDonHang.setText("Số đơn hàng: " + SoHoaDon);
            List<HoaDon> listHD = HoaDonDAO.locHoaDonTrongThang();
            doThongTinHoaDon(listHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm báo cáo doanh thu trong quý
     */
    void locTrongQuy() {
        try {
            String NgayHienTai = DateHelper.toString(DateHelper.now(), "dd-MM-yyyy");
            int Quy = DateHelper.tinhSoQuyTrongNam();
            String NamHienTai = NgayHienTai.substring(6,10);
            lbl_NgayThongKe.setText("Thống kê: Quý " + Quy + "-" + NamHienTai);
            lbl_NgayTao.setText("Ngày tạo: " + NgayHienTai);
            double DoanhThu = TKDAO.tinhDoanhThuTrongQuy();
            lbl_DoanhThu.setText("Doanh thu: " + dcf.format(DoanhThu));
            int SoHoaDon = TKDAO.demSoDonTrongQuy();
            lbl_SoDonHang.setText("Số đơn hàng: " + SoHoaDon);
            List<HoaDon> listHD = HoaDonDAO.locHoaDonTrongQuy();
            doThongTinHoaDon(listHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm báo cáo doanh thu trong năm
     */
    void locTrongNam() {
        try {
            String NgayHienTai = DateHelper.toString(DateHelper.now(), "dd-MM-yyyy");
            String NamHienTai = NgayHienTai.substring(6,10);
            lbl_NgayThongKe.setText("Thống kê năm: " + NamHienTai);
            lbl_NgayTao.setText("Ngày tạo: " + NgayHienTai);
            double DoanhThu = TKDAO.tinhDoanhThuTrongNam();
            lbl_DoanhThu.setText("Doanh thu: " + dcf.format(DoanhThu));
            int SoHoaDon = TKDAO.demSoDonTrongNam();
            lbl_SoDonHang.setText("Số đơn hàng: " + SoHoaDon);
            List<HoaDon> listHD = HoaDonDAO.locHoaDonTrongNam();
            doThongTinHoaDon(listHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm đổ thông tin vào table
     */
    void doThongTinHoaDon(List<HoaDon> listHD) {
        DefaultTableModel dtm = (DefaultTableModel) tbl_BangBaoCao.getModel();
        dtm.setRowCount(0);
        int STT = 1;
        for (HoaDon HD : listHD) {
            Object[] row = {STT++,
                            HD.getMaHoaDon(),
                            DateHelper.toString(HD.getNgayBan(), "dd-MM-yyyy"),
                            HD.getMaNhanVien(),
                            HD.getTongSoLuong(),
                            dcf.format(HD.getChietKhau()),
                            dcf.format(HD.getThanhTien())};
            dtm.addRow(row);
        }
    }
    
    void xuatFile() {
        String[] columns = {"STT", "Mã HĐ", "Ngày bán", "Người bán", "Số lượng SP", "Chiết khấu", "Giá Trị"};
        JFileChooser excelFileChooser = new JFileChooser();
        excelFileChooser.setDialogTitle("Save as");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlxs");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            FileOutputStream excelFOU = null;
            BufferedOutputStream excelBOU = null;
            XSSFWorkbook excelJTableExporter = null;
            Row row = null;
            Cell cell = null;
            try {
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                excelSheet.setDefaultColumnWidth(15);
                // xét font cho header 
                XSSFFont headerFont = excelJTableExporter.createFont();
                headerFont.setBold(true); // in đậm
                headerFont.setFontHeightInPoints((short) 14);
                // xét font cho title chính
                XSSFFont titleFont = excelJTableExporter.createFont();
                titleFont.setBold(true);
                titleFont.setFontHeightInPoints((short) 18);
                titleFont.setColor(IndexedColors.BLUE.getIndex());
                //
                XSSFFont tieuDePhuFont = excelJTableExporter.createFont();
                tieuDePhuFont.setBold(true);
                tieuDePhuFont.setFontHeightInPoints((short) 12);
                tieuDePhuFont.setColor(IndexedColors.BLUE.getIndex());
                // cellStyle cua header bảng
                CellStyle headerCellStyle = excelJTableExporter.createCellStyle();
                headerCellStyle.setFont(headerFont);
                headerCellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                headerCellStyle.setBorderBottom(BorderStyle.MEDIUM);
                headerCellStyle.setBorderTop(BorderStyle.MEDIUM);
                headerCellStyle.setBorderLeft(BorderStyle.MEDIUM);
                headerCellStyle.setBorderRight(BorderStyle.MEDIUM);
                // cellStyle của bảng
                CellStyle tableCellStyle = excelJTableExporter.createCellStyle();
                tableCellStyle.setBorderBottom(BorderStyle.MEDIUM);
                tableCellStyle.setBorderTop(BorderStyle.MEDIUM);
                tableCellStyle.setBorderLeft(BorderStyle.MEDIUM);
                tableCellStyle.setBorderRight(BorderStyle.MEDIUM);
                // test for
                for (int i = 0; i < tbl_BangBaoCao.getRowCount() + 10; i++) {
                    row = excelSheet.createRow(i);
                    for (int j = 0; j < tbl_BangBaoCao.getColumnCount(); j++) {
                        cell = row.createCell(j);
                        if (i == 0 && j == 0) {
                            CellStyle titleCellStyle = excelJTableExporter.createCellStyle();
                            cell.setCellValue(lbl_TenBaoCao.getText());
                            titleCellStyle.setFont(titleFont); // add font vào cell
                            titleCellStyle.setAlignment(HorizontalAlignment.CENTER); // xét nằm giữa
                            cell.setCellStyle(titleCellStyle);
                            excelSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, columns.length - 1)); // gộp dòng
                        }
                        if (i == 1 && j == 0) {
                            CellStyle NgayThongKeCellStyle = excelJTableExporter.createCellStyle(); // tạo cellStyle để định dạng
                            cell.setCellValue(lbl_NgayThongKe.getText());
                            NgayThongKeCellStyle.setAlignment(HorizontalAlignment.CENTER); // xét nằm giữa
                            NgayThongKeCellStyle.setFont(tieuDePhuFont);
                            cell.setCellStyle(NgayThongKeCellStyle);
                            excelSheet.addMergedRegion(new CellRangeAddress(1, 1, 0, columns.length - 1)); // gộp dòng
                        }
                        
                        if (i == 4 && j == 0) {
                            CellStyle TongSoLuongCellStyle = excelJTableExporter.createCellStyle(); // tạo cellStyle để định dạng
                            TongSoLuongCellStyle.setFont(tieuDePhuFont);
                            TongSoLuongCellStyle.setAlignment(HorizontalAlignment.LEFT);
                            cell.setCellStyle(TongSoLuongCellStyle);
                            cell.setCellValue(lbl_NgayTao.getText());
                            excelSheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 3)); // gộp dòng                       
                        }
                        
                        if (i == 5 && j == 0) {
                            CellStyle TongSoLuongCellStyle = excelJTableExporter.createCellStyle(); // tạo cellStyle để định dạng
                            TongSoLuongCellStyle.setFont(tieuDePhuFont);
                            TongSoLuongCellStyle.setAlignment(HorizontalAlignment.LEFT);
                            cell.setCellStyle(TongSoLuongCellStyle);
                            cell.setCellValue(lbl_SoDonHang.getText());
                            excelSheet.addMergedRegion(new CellRangeAddress(5, 5, 0, 3)); // gộp dòng                       
                        }
                        
                        if (i == 5 && j == 4) {
                            CellStyle TongSoLuongCellStyle = excelJTableExporter.createCellStyle(); // tạo cellStyle để định dạng
                            TongSoLuongCellStyle.setFont(tieuDePhuFont);
                            TongSoLuongCellStyle.setAlignment(HorizontalAlignment.RIGHT);
                            cell.setCellStyle(TongSoLuongCellStyle);
                            cell.setCellValue(lbl_DoanhThu.getText());
                            excelSheet.addMergedRegion(new CellRangeAddress(5, 5, 4, 6)); // gộp dòng                       
                        }
                    }
                }
                
                // xét vị trí giá trị cho header bảng
                row = excelSheet.createRow(6);
                for (int i = 0; i < columns.length; i++) {
                    cell = row.createCell(i);
                    cell.setCellValue(columns[i]);
                    cell.setCellStyle(headerCellStyle);
                }
                // xet vị trí giá trị cho bảng
                for (int i = 0; i < tbl_BangBaoCao.getRowCount(); i++) {
                    row = excelSheet.createRow(i + 7);
                    for (int j = 0; j < tbl_BangBaoCao.getColumnCount(); j++) {
                        cell = row.createCell(j);
                        cell.setCellValue(tbl_BangBaoCao.getValueAt(i, j).toString());
                        cell.setCellStyle(tableCellStyle);
                        // xet size cho cot
                        excelSheet.autoSizeColumn(i);
                        excelSheet.autoSizeColumn(i + 1);
                    }
                }
                
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(this, "Đã xuất file");
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                    excelFOU.close();
                } catch (Exception e) {
                    DialogHelper.alert(this, "Có lỗi: " + e.toString());
                }
            }
        }
    }
    
}