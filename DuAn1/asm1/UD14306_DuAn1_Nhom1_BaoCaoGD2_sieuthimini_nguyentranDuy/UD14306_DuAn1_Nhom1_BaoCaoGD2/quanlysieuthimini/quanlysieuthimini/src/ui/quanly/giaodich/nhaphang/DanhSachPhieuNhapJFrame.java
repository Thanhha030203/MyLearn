/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.giaodich.nhaphang;

import dao.DonViTinhDAO;
import dao.NguoiDungDAO;
import dao.NhaCungCapDAO;
import dao.NhomHangDAO;
import dao.PhieuNhapChiTietDAO;
import dao.PhieuNhapDAO;
import dao.SanPhamDAO;
import helper.DateHelper;
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
import model.PhieuNhap;

/**
 *
 * @author Admin
 */
public class DanhSachPhieuNhapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachHoaDonJFrame
     */
    public DanhSachPhieuNhapJFrame() {
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

        btg_LocTheoNgay = new javax.swing.ButtonGroup();
        pnl_CotTrai = new javax.swing.JPanel();
        lbl_TimKiem = new javax.swing.JLabel();
        txt_TimTheoMaChungTu = new javax.swing.JTextField();
        rad_TatCa = new javax.swing.JRadioButton();
        txt_TimTheoSanPham = new javax.swing.JTextField();
        lbl_LocTheoNgay = new javax.swing.JLabel();
        rad_HomNay = new javax.swing.JRadioButton();
        rad_HomQua = new javax.swing.JRadioButton();
        rad_7NgayTruoc = new javax.swing.JRadioButton();
        rad_Khac = new javax.swing.JRadioButton();
        dat_TuNgay = new com.toedter.calendar.JDateChooser();
        dat_DenNgay = new com.toedter.calendar.JDateChooser();
        btn_HuyThietLap = new javax.swing.JButton();
        btn_Loc = new javax.swing.JButton();
        txt_TimTheoMaNCC = new javax.swing.JTextField();
        pnl_CotPhai = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DanhSachPhieuNhap = new javax.swing.JTable();
        btn_ThemMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DANH SÁCH PHIẾU NHẬP");
        setResizable(false);

        pnl_CotTrai.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TimKiem.setBackground(new java.awt.Color(102, 102, 255));
        lbl_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TimKiem.setText("   TÌM KIẾM");
        lbl_TimKiem.setOpaque(true);

        txt_TimTheoMaChungTu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoMaChungTu.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoMaChungTu.setText("Tìm theo mã chứng từ");
        txt_TimTheoMaChungTu.setToolTipText("");
        txt_TimTheoMaChungTu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaChungTuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaChungTuFocusLost(evt);
            }
        });
        txt_TimTheoMaChungTu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoMaChungTuKeyReleased(evt);
            }
        });

        rad_TatCa.setBackground(new java.awt.Color(255, 255, 255));
        btg_LocTheoNgay.add(rad_TatCa);
        rad_TatCa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_TatCa.setSelected(true);
        rad_TatCa.setText("Tất cả");

        txt_TimTheoSanPham.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoSanPham.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoSanPham.setText("Tìm theo mã hàng, tên hàng");
        txt_TimTheoSanPham.setToolTipText("");
        txt_TimTheoSanPham.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoSanPhamFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoSanPhamFocusLost(evt);
            }
        });
        txt_TimTheoSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoSanPhamKeyReleased(evt);
            }
        });

        lbl_LocTheoNgay.setBackground(new java.awt.Color(102, 102, 255));
        lbl_LocTheoNgay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_LocTheoNgay.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LocTheoNgay.setText("   LỌC THEO NGÀY");
        lbl_LocTheoNgay.setOpaque(true);

        rad_HomNay.setBackground(new java.awt.Color(255, 255, 255));
        btg_LocTheoNgay.add(rad_HomNay);
        rad_HomNay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_HomNay.setText("Hôm nay");

        rad_HomQua.setBackground(new java.awt.Color(255, 255, 255));
        btg_LocTheoNgay.add(rad_HomQua);
        rad_HomQua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_HomQua.setText("Hôm qua");

        rad_7NgayTruoc.setBackground(new java.awt.Color(255, 255, 255));
        btg_LocTheoNgay.add(rad_7NgayTruoc);
        rad_7NgayTruoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_7NgayTruoc.setText("7 ngày trước");

        rad_Khac.setBackground(new java.awt.Color(255, 255, 255));
        btg_LocTheoNgay.add(rad_Khac);
        rad_Khac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_Khac.setText("Khác:");
        rad_Khac.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_KhacItemStateChanged(evt);
            }
        });

        dat_TuNgay.setBackground(new java.awt.Color(255, 255, 255));
        dat_TuNgay.setDateFormatString("dd-MM-yyyy");
        dat_TuNgay.setEnabled(false);
        dat_TuNgay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dat_DenNgay.setBackground(new java.awt.Color(255, 255, 255));
        dat_DenNgay.setDateFormatString("dd-MM-yyyy");
        dat_DenNgay.setEnabled(false);
        dat_DenNgay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_HuyThietLap.setBackground(new java.awt.Color(255, 255, 204));
        btn_HuyThietLap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_HuyThietLap.setForeground(new java.awt.Color(255, 255, 255));
        btn_HuyThietLap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refreshGioHang.png"))); // NOI18N
        btn_HuyThietLap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_HuyThietLapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_HuyThietLapMouseExited(evt);
            }
        });
        btn_HuyThietLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyThietLapActionPerformed(evt);
            }
        });

        btn_Loc.setBackground(new java.awt.Color(51, 51, 255));
        btn_Loc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Loc.setForeground(new java.awt.Color(255, 255, 255));
        btn_Loc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconLoc.png"))); // NOI18N
        btn_Loc.setText("LỌC");
        btn_Loc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LocMouseExited(evt);
            }
        });
        btn_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocActionPerformed(evt);
            }
        });

        txt_TimTheoMaNCC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoMaNCC.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoMaNCC.setText("Tìm theo mã nhà cung cấp");
        txt_TimTheoMaNCC.setToolTipText("");
        txt_TimTheoMaNCC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaNCCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaNCCFocusLost(evt);
            }
        });
        txt_TimTheoMaNCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoMaNCCKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_CotTraiLayout = new javax.swing.GroupLayout(pnl_CotTrai);
        pnl_CotTrai.setLayout(pnl_CotTraiLayout);
        pnl_CotTraiLayout.setHorizontalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_LocTheoNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                                .addComponent(rad_TatCa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_TimTheoMaChungTu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TimTheoSanPham, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TimTheoMaNCC, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14))
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_Khac)
                            .addComponent(rad_7NgayTruoc)
                            .addComponent(rad_HomQua)
                            .addComponent(rad_HomNay))
                        .addGap(0, 259, Short.MAX_VALUE))))
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_HuyThietLap, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                        .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dat_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dat_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        pnl_CotTraiLayout.setVerticalGroup(
            pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotTraiLayout.createSequentialGroup()
                .addComponent(lbl_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_TimTheoMaChungTu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TimTheoSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TimTheoMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_LocTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_TatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_HomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_HomQua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_7NgayTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad_Khac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dat_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dat_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnl_CotTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_HuyThietLap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        lbl_TieuDe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_TieuDe.setForeground(new java.awt.Color(51, 51, 255));
        lbl_TieuDe.setText("DANH SÁCH PHIẾU NHẬP");

        tbl_DanhSachPhieuNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_DanhSachPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PN", "Tên NCC", "Nhân viên", "Ngày nhập", "Tổng SL", "Chiết khấu (%)", "VAT (%)", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DanhSachPhieuNhap.setRowHeight(35);
        tbl_DanhSachPhieuNhap.setRowMargin(3);
        tbl_DanhSachPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DanhSachPhieuNhapMouseClicked(evt);
            }
        });
        tbl_DanhSachPhieuNhap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbl_DanhSachPhieuNhapPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DanhSachPhieuNhap);

        btn_ThemMoi.setBackground(new java.awt.Color(255, 51, 0));
        btn_ThemMoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ThemMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconAddDocument.png"))); // NOI18N
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

        javax.swing.GroupLayout pnl_CotPhaiLayout = new javax.swing.GroupLayout(pnl_CotPhai);
        pnl_CotPhai.setLayout(pnl_CotPhaiLayout);
        pnl_CotPhaiLayout.setHorizontalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                        .addComponent(lbl_TieuDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_CotPhaiLayout.setVerticalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(pnl_CotPhai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TimTheoMaChungTuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaChungTuFocusGained
        if (txt_TimTheoMaChungTu.getText().equals("Tìm theo mã chứng từ")) {
            txt_TimTheoMaChungTu.setText("");
            txt_TimTheoMaChungTu.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_TimTheoMaChungTuFocusGained

    private void txt_TimTheoMaChungTuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaChungTuFocusLost
        if (txt_TimTheoMaChungTu.getText().equals("")) {
            txt_TimTheoMaChungTu.setText("Tìm theo mã chứng từ");
            txt_TimTheoMaChungTu.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoMaChungTuFocusLost

    private void txt_TimTheoMaChungTuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoMaChungTuKeyReleased
        // TODO add your handling code here:
        timTheoMa();
    }//GEN-LAST:event_txt_TimTheoMaChungTuKeyReleased

    private void tbl_DanhSachPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DanhSachPhieuNhapMouseClicked
        // TODO add your handling code here:
//        if (evt.getClickCount() == 2) {
//            xemHDCT();
//        }
    }//GEN-LAST:event_tbl_DanhSachPhieuNhapMouseClicked

    private void tbl_DanhSachPhieuNhapPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbl_DanhSachPhieuNhapPropertyChange
        // TODO add your handling code here:
    //    taoDanhSachDangChon();
    }//GEN-LAST:event_tbl_DanhSachPhieuNhapPropertyChange

    private void rad_KhacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_KhacItemStateChanged
        // TODO add your handling code here:
        if (rad_Khac.isSelected()) {
            dat_TuNgay.setEnabled(true);
            dat_DenNgay.setEnabled(true);
        }
        else {
            dat_TuNgay.setEnabled(false);
            dat_DenNgay.setEnabled(false);
        }
    }//GEN-LAST:event_rad_KhacItemStateChanged

    private void btn_LocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LocMouseEntered
        // TODO add your handling code here:
        btn_Loc.setBackground(Color.yellow);
        btn_Loc.setForeground(Color.blue);
        btn_Loc.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_LocMouseEntered

    private void btn_LocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LocMouseExited
        // TODO add your handling code here:
        btn_Loc.setBackground(new Color(51, 51, 255));
        btn_Loc.setForeground(Color.white);
    }//GEN-LAST:event_btn_LocMouseExited

    private void btn_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocActionPerformed
        // TODO add your handling code here:
        locPhieuNhap();
    }//GEN-LAST:event_btn_LocActionPerformed

    private void btn_HuyThietLapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HuyThietLapMouseEntered
        // TODO add your handling code here:
        btn_HuyThietLap.setBackground(Color.yellow);
        btn_HuyThietLap.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_HuyThietLapMouseEntered

    private void btn_HuyThietLapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HuyThietLapMouseExited
        // TODO add your handling code here:
        btn_HuyThietLap.setBackground(new Color(255, 255, 204));
    }//GEN-LAST:event_btn_HuyThietLapMouseExited

    private void btn_HuyThietLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyThietLapActionPerformed
        // TODO add your handling code here:
        capnhatDuLieu();
    }//GEN-LAST:event_btn_HuyThietLapActionPerformed

    private void txt_TimTheoMaNCCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaNCCFocusGained
        // TODO add your handling code here:
        if (txt_TimTheoMaNCC.getText().equals("Tìm theo mã nhà cung cấp")) {
            txt_TimTheoMaNCC.setText("");
            txt_TimTheoMaNCC.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_TimTheoMaNCCFocusGained

    private void txt_TimTheoMaNCCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaNCCFocusLost
        // TODO add your handling code here:
        if (txt_TimTheoMaNCC.getText().equals("")) {
            txt_TimTheoMaNCC.setText("Tìm theo mã nhà cung cấp");
            txt_TimTheoMaNCC.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoMaNCCFocusLost

    private void txt_TimTheoMaNCCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoMaNCCKeyReleased
        // TODO add your handling code here:
        timTheoMaNCC();
    }//GEN-LAST:event_txt_TimTheoMaNCCKeyReleased

    private void txt_TimTheoSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoSanPhamKeyReleased
        // TODO add your handling code here:
        timTheoSanPham();
    }//GEN-LAST:event_txt_TimTheoSanPhamKeyReleased

    private void txt_TimTheoSanPhamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoSanPhamFocusLost
        // TODO add your handling code here:
        if (txt_TimTheoSanPham.getText().equals("")) {
            txt_TimTheoSanPham.setText("Tìm theo mã hàng, tên hàng");
            txt_TimTheoSanPham.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoSanPhamFocusLost

    private void txt_TimTheoSanPhamFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoSanPhamFocusGained
        // TODO add your handling code here:
        if (txt_TimTheoSanPham.getText().equals("Tìm theo mã hàng, tên hàng")) {
            txt_TimTheoSanPham.setText("");
            txt_TimTheoSanPham.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_TimTheoSanPhamFocusGained

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
        new ThemMoiPhieuNhapJFrame().setVisible(true);
    }//GEN-LAST:event_btn_ThemMoiActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachPhieuNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachPhieuNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachPhieuNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachPhieuNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new DanhSachPhieuNhapJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_LocTheoNgay;
    private javax.swing.JButton btn_HuyThietLap;
    private javax.swing.JButton btn_Loc;
    private javax.swing.JButton btn_ThemMoi;
    private com.toedter.calendar.JDateChooser dat_DenNgay;
    private com.toedter.calendar.JDateChooser dat_TuNgay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_LocTheoNgay;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_TimKiem;
    private javax.swing.JPanel pnl_CotPhai;
    private javax.swing.JPanel pnl_CotTrai;
    private javax.swing.JRadioButton rad_7NgayTruoc;
    private javax.swing.JRadioButton rad_HomNay;
    private javax.swing.JRadioButton rad_HomQua;
    private javax.swing.JRadioButton rad_Khac;
    private javax.swing.JRadioButton rad_TatCa;
    private javax.swing.JTable tbl_DanhSachPhieuNhap;
    private javax.swing.JTextField txt_TimTheoMaChungTu;
    private javax.swing.JTextField txt_TimTheoMaNCC;
    private javax.swing.JTextField txt_TimTheoSanPham;
    // End of variables declaration//GEN-END:variables

    NhomHangDAO NhomHangDAO = new NhomHangDAO();
    NhaCungCapDAO NCCDAO = new NhaCungCapDAO();
    SanPhamDAO SanPhamDAO = new SanPhamDAO();
    DonViTinhDAO DVTDAO = new DonViTinhDAO();
    PhieuNhapDAO PhieuNhapDAO = new PhieuNhapDAO();
    PhieuNhapChiTietDAO PNCTDAO = new PhieuNhapChiTietDAO();
    NguoiDungDAO NguoiDungDAO = new NguoiDungDAO();
    
    // Định dạng hiển thị số tiền:
    DecimalFormat dcf = new DecimalFormat("###,###,###.###");
    
    /*
     * Hàm khởi tạo các giá trị ban đầu cho JFrame
     */
    void inIt() {
        this.setSize(1366, 768);
        this.setMinimumSize(new Dimension(1366, 768));
        this.setMaximumSize(new Dimension(1366, 768));
        setResizable(false);
        setLocationRelativeTo(null);
        capnhatDuLieu();
    }
    
    /*
     * Hàm cập nhật dữ liệu phiếu nhập
     */
    void capnhatDuLieu(){
        try {
            rad_TatCa.setSelected(true);
            List<PhieuNhap> list = PhieuNhapDAO.select();
            doDuLieuVaoBang(list);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm đổ dữ liệu vào bảng
     */
    void doDuLieuVaoBang(List<PhieuNhap> listPN) throws SQLException{
        DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachPhieuNhap.getModel();
        dtm.setRowCount(0);
        for(PhieuNhap PN : listPN){
            NhaCungCap NCC = NCCDAO.timTheoMa(PN.getMaNCC());
            Object[] row = {PN.getMaPhieuNhap(),
                            NCC.getTenNCC(),
                            PN.getMaNhanVien(),
                            DateHelper.toString(PN.getNgayNhap(), "dd-MM-yyyy"),
                            PN.getTongSoLuong(),
                            PN.getChietKhau(),
                            PN.getVAT(),
                            dcf.format(PN.getThanhTien())
                            };
            dtm.addRow(row);
        }
    }
    
    /*
     * Hàm tìm phiếu nhập theo mã
     */
    void timTheoMa() {
        String ChuoiTimKiem = txt_TimTheoMaChungTu.getText();
        if (ChuoiTimKiem.isEmpty()) {
            capnhatDuLieu();
        }
        else {
            try {
                PhieuNhap PN = PhieuNhapDAO.timTheoMa(ChuoiTimKiem);
                List<PhieuNhap> list = new ArrayList<>();
                if (PN != null)
                    list.add(PN);
                if (list.size() > 0)
                    doDuLieuVaoBang(list);
                else {
                    DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachPhieuNhap.getModel();
                    dtm.setRowCount(0);
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm tìm phiếu nhập theo mã/tên sản phẩm
     */
    void timTheoSanPham() {
        String ChuoiTimKiem = txt_TimTheoSanPham.getText();
        if (ChuoiTimKiem.isEmpty()) {
            capnhatDuLieu();
        }
        else {
            try {
                List<PhieuNhap> list = PhieuNhapDAO.timTheoSanPham(ChuoiTimKiem);
                if (list.size() > 0)
                    doDuLieuVaoBang(list);
                else {
                    DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachPhieuNhap.getModel();
                    dtm.setRowCount(0);
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm tìm phiếu nhập theo mã NCC
     */
    void timTheoMaNCC() {
        String ChuoiTimKiem = txt_TimTheoMaNCC.getText();
        if (ChuoiTimKiem.isEmpty()) {
            capnhatDuLieu();
        }
        else {
            try {
                List<PhieuNhap> list = PhieuNhapDAO.timTheoMaNCC(ChuoiTimKiem);
                if (list.size() > 0)
                    doDuLieuVaoBang(list);
                else {
                    DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachPhieuNhap.getModel();
                    dtm.setRowCount(0);
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm lọc phiếu nhập theo các tuỳ chọn
     */
    void locPhieuNhap() {
        List<PhieuNhap> list = new ArrayList<>();
        if (rad_TatCa.isSelected())
            list = PhieuNhapDAO.select();
        if (rad_HomNay.isSelected())
            list = PhieuNhapDAO.timTrongNgay();
        if (rad_HomQua.isSelected())
            list = PhieuNhapDAO.timNgayHomQua();
        if (rad_7NgayTruoc.isSelected())
            list = PhieuNhapDAO.tim7NgayTruoc();
        if (rad_Khac.isSelected())
            list = timTheoKhoangNgay();
        try {
            if (list.size() > 0) {
                doDuLieuVaoBang(list);
            }
            else {
                DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachPhieuNhap.getModel();
                dtm.setRowCount(0);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm tìm phiếu nhập theo khoảng ngày tuỳ chọn
     */
    List<PhieuNhap> timTheoKhoangNgay() {
        List<PhieuNhap> list = new ArrayList<>();
        String TuNgay = DateHelper.toString(dat_TuNgay.getDate(),"yyyy-MM-dd");
        String DenNgay = DateHelper.toString(dat_DenNgay.getDate(),"yyyy-MM-dd");
        if (dat_TuNgay.getDate().after(dat_DenNgay.getDate())) {
            DialogHelper.alert(this, "Chọn lại ngày");
        }
        else {
            try {
                list = PhieuNhapDAO.timTheoKhoangNgay(TuNgay, DenNgay);
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());    
            }
        }
        return list;
    }
    
    /*
     * Hàm mở jframe chi tiêt phiếu nhập
     */
//    void xemHDCT() {
//        int index = tbl_DanhSachPhieuNhap.getSelectedRow();
//        String MaHD = tbl_DanhSachPhieuNhap.getValueAt(index, 0).toString();
//        try {
//            HoaDon HD = HoaDonDAO.timHoaDonTheoMa(MaHD);
//            new ChiTietHoaDonJFrame(HD).setVisible(true);
//        } catch (Exception e) {
//            DialogHelper.alert(this, "Có lỗi: " + e.toString());
//        }
//    }
    
}