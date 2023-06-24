/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.giaodich.hoadon;

import ui.quanly.giaodich.xuathuyhang.*;
import dao.DonViTinhDAO;
import dao.HoaDonChiTietDAO;
import dao.HoaDonDAO;
import dao.KhachHangDAO;
import dao.NguoiDungDAO;
import dao.NhaCungCapDAO;
import dao.NhomHangDAO;
import dao.PhieuHuyDAO;
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
import model.HoaDon;
import model.KhachHang;
import model.PhieuHuyHang;

/**
 *
 * @author Admin
 */
public class DanhSachHoaDonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachHoaDonJFrame
     */
    public DanhSachHoaDonJFrame() {
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
        txt_TimTheoMaHoaDon = new javax.swing.JTextField();
        rad_TatCa = new javax.swing.JRadioButton();
        txt_TimTheoKhachHang = new javax.swing.JTextField();
        lbl_LocTheoNgay = new javax.swing.JLabel();
        rad_HomNay = new javax.swing.JRadioButton();
        rad_HomQua = new javax.swing.JRadioButton();
        rad_7NgayTruoc = new javax.swing.JRadioButton();
        rad_Khac = new javax.swing.JRadioButton();
        dat_TuNgay = new com.toedter.calendar.JDateChooser();
        dat_DenNgay = new com.toedter.calendar.JDateChooser();
        btn_HuyThietLap = new javax.swing.JButton();
        btn_Loc = new javax.swing.JButton();
        txt_TimTheoNguoiBan = new javax.swing.JTextField();
        pnl_CotPhai = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DanhSachHoaDon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DANH SÁCH HOÁ ĐƠN");
        setResizable(false);

        pnl_CotTrai.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TimKiem.setBackground(new java.awt.Color(102, 102, 255));
        lbl_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TimKiem.setText("   TÌM KIẾM");
        lbl_TimKiem.setOpaque(true);

        txt_TimTheoMaHoaDon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoMaHoaDon.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoMaHoaDon.setText("Tìm kiếm theo mã hoá đơn");
        txt_TimTheoMaHoaDon.setToolTipText("");
        txt_TimTheoMaHoaDon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaHoaDonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoMaHoaDonFocusLost(evt);
            }
        });
        txt_TimTheoMaHoaDon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoMaHoaDonKeyReleased(evt);
            }
        });

        rad_TatCa.setBackground(new java.awt.Color(255, 255, 255));
        btg_LocTheoNgay.add(rad_TatCa);
        rad_TatCa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_TatCa.setSelected(true);
        rad_TatCa.setText("Tất cả");

        txt_TimTheoKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoKhachHang.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoKhachHang.setText("Tìm kiếm theo tên khách hàng");
        txt_TimTheoKhachHang.setToolTipText("");
        txt_TimTheoKhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoKhachHangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoKhachHangFocusLost(evt);
            }
        });
        txt_TimTheoKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoKhachHangKeyReleased(evt);
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

        txt_TimTheoNguoiBan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimTheoNguoiBan.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimTheoNguoiBan.setText("Tìm kiếm theo mã người bán");
        txt_TimTheoNguoiBan.setToolTipText("");
        txt_TimTheoNguoiBan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimTheoNguoiBanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimTheoNguoiBanFocusLost(evt);
            }
        });
        txt_TimTheoNguoiBan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TimTheoNguoiBanKeyReleased(evt);
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
                            .addComponent(txt_TimTheoMaHoaDon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TimTheoKhachHang, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TimTheoNguoiBan, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addComponent(txt_TimTheoMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TimTheoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TimTheoNguoiBan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        lbl_TieuDe.setText("DANH SÁCH HOÁ ĐƠN");

        tbl_DanhSachHoaDon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_DanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Tên KH", "Nhân viên", "Ngày bán", "Tổng SL", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DanhSachHoaDon.setRowHeight(35);
        tbl_DanhSachHoaDon.setRowMargin(3);
        tbl_DanhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DanhSachHoaDonMouseClicked(evt);
            }
        });
        tbl_DanhSachHoaDon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbl_DanhSachHoaDonPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DanhSachHoaDon);

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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_CotPhaiLayout.setVerticalGroup(
            pnl_CotPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CotPhaiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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

    private void txt_TimTheoMaHoaDonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaHoaDonFocusGained
        if (txt_TimTheoMaHoaDon.getText().equals("Tìm kiếm theo mã hoá đơn")) {
            txt_TimTheoMaHoaDon.setText("");
            txt_TimTheoMaHoaDon.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_TimTheoMaHoaDonFocusGained

    private void txt_TimTheoMaHoaDonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoMaHoaDonFocusLost
        if (txt_TimTheoMaHoaDon.getText().equals("")) {
            txt_TimTheoMaHoaDon.setText("Tìm kiếm theo mã hoá đơn");
            txt_TimTheoMaHoaDon.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoMaHoaDonFocusLost

    private void txt_TimTheoMaHoaDonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoMaHoaDonKeyReleased
        // TODO add your handling code here:
        timTheoMa();
    }//GEN-LAST:event_txt_TimTheoMaHoaDonKeyReleased

    private void tbl_DanhSachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DanhSachHoaDonMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            xemHDCT();
        }
    }//GEN-LAST:event_tbl_DanhSachHoaDonMouseClicked

    private void tbl_DanhSachHoaDonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbl_DanhSachHoaDonPropertyChange
        // TODO add your handling code here:
    //    taoDanhSachDangChon();
    }//GEN-LAST:event_tbl_DanhSachHoaDonPropertyChange

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
        locHoaDon();
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

    private void txt_TimTheoNguoiBanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoNguoiBanFocusGained
        // TODO add your handling code here:
        if (txt_TimTheoNguoiBan.getText().equals("Tìm kiếm theo mã người bán")) {
            txt_TimTheoNguoiBan.setText("");
            txt_TimTheoNguoiBan.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_TimTheoNguoiBanFocusGained

    private void txt_TimTheoNguoiBanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoNguoiBanFocusLost
        // TODO add your handling code here:
        if (txt_TimTheoNguoiBan.getText().equals("")) {
            txt_TimTheoNguoiBan.setText("Tìm kiếm theo mã người bán");
            txt_TimTheoNguoiBan.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoNguoiBanFocusLost

    private void txt_TimTheoNguoiBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoNguoiBanKeyReleased
        // TODO add your handling code here:
        timTheoMaNguoiBan();
    }//GEN-LAST:event_txt_TimTheoNguoiBanKeyReleased

    private void txt_TimTheoKhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimTheoKhachHangKeyReleased
        // TODO add your handling code here:
        timTheoTenKhachHang();
    }//GEN-LAST:event_txt_TimTheoKhachHangKeyReleased

    private void txt_TimTheoKhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoKhachHangFocusLost
        // TODO add your handling code here:
        if (txt_TimTheoKhachHang.getText().equals("")) {
            txt_TimTheoKhachHang.setText("Tìm kiếm theo tên khách hàng");
            txt_TimTheoKhachHang.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_TimTheoKhachHangFocusLost

    private void txt_TimTheoKhachHangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimTheoKhachHangFocusGained
        // TODO add your handling code here:
        if (txt_TimTheoKhachHang.getText().equals("Tìm kiếm theo tên khách hàng")) {
            txt_TimTheoKhachHang.setText("");
            txt_TimTheoKhachHang.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_TimTheoKhachHangFocusGained

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
            java.util.logging.Logger.getLogger(DanhSachHoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachHoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachHoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachHoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DanhSachHoaDonJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_LocTheoNgay;
    private javax.swing.JButton btn_HuyThietLap;
    private javax.swing.JButton btn_Loc;
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
    private javax.swing.JTable tbl_DanhSachHoaDon;
    private javax.swing.JTextField txt_TimTheoKhachHang;
    private javax.swing.JTextField txt_TimTheoMaHoaDon;
    private javax.swing.JTextField txt_TimTheoNguoiBan;
    // End of variables declaration//GEN-END:variables

    NhomHangDAO NhomHangDAO = new NhomHangDAO();
    NhaCungCapDAO NCCDAO = new NhaCungCapDAO();
    SanPhamDAO SanPhamDAO = new SanPhamDAO();
    DonViTinhDAO DVTDAO = new DonViTinhDAO();
    HoaDonDAO HoaDonDAO = new HoaDonDAO();
    HoaDonChiTietDAO HDCTDAO = new HoaDonChiTietDAO();
    KhachHangDAO KhachHangDAO = new KhachHangDAO();
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
     * Hàm cập nhật dữ liệu Sản Phẩm
     */
    void capnhatDuLieu(){
        try {
            rad_TatCa.setSelected(true);
            List<HoaDon> list = HoaDonDAO.select();
            doDuLieuVaoBang(list);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm đổ dữ liệu vào bảng
     */
    void doDuLieuVaoBang(List<HoaDon> listHD) throws SQLException{
        DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachHoaDon.getModel();
        dtm.setRowCount(0);
        for(HoaDon HD : listHD){
            String MaKH = HD.getMaKhachHang();
            KhachHang KH = KhachHangDAO.timTheoMa(MaKH);
            Object[] row = {HD.getMaHoaDon(),
                            KH.getHoTen(),
                            HD.getMaNhanVien(),
                            HD.getNgayBan(),
                            HD.getTongSoLuong(),
                            dcf.format(HD.getThanhTien())
                            };
            dtm.addRow(row);
        }
    }
    
    /*
     * Hàm tìm hoá đơn theo mã
     */
    void timTheoMa() {
        String ChuoiTimKiem = txt_TimTheoMaHoaDon.getText();
        if (ChuoiTimKiem.isEmpty()) {
            capnhatDuLieu();
        }
        else {
            try {
                HoaDon HD = HoaDonDAO.timHoaDonTheoMa(ChuoiTimKiem);
                List<HoaDon> list = new ArrayList<>();
                if (HD != null)
                    list.add(HD);
                if (list.size() > 0)
                    doDuLieuVaoBang(list);
                else {
                    DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachHoaDon.getModel();
                    dtm.setRowCount(0);
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm tìm hoá đơn theo tên khách hàng
     */
    void timTheoTenKhachHang() {
        String ChuoiTimKiem = txt_TimTheoKhachHang.getText();
        if (ChuoiTimKiem.isEmpty()) {
            capnhatDuLieu();
        }
        else {
            try {
                List<HoaDon> list = HoaDonDAO.timHoaDonTheoTenKH(ChuoiTimKiem);
                if (list.size() > 0)
                    doDuLieuVaoBang(list);
                else {
                    DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachHoaDon.getModel();
                    dtm.setRowCount(0);
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm tìm hoá đơn theo tên mã người bán
     */
    void timTheoMaNguoiBan() {
        String ChuoiTimKiem = txt_TimTheoNguoiBan.getText();
        if (ChuoiTimKiem.isEmpty()) {
            capnhatDuLieu();
        }
        else {
            try {
                List<HoaDon> list = HoaDonDAO.timHoaDonTheoMaNguoiBan(ChuoiTimKiem);
                if (list.size() > 0)
                    doDuLieuVaoBang(list);
                else {
                    DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachHoaDon.getModel();
                    dtm.setRowCount(0);
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());
            }
        }
    }
    
    /*
     * Hàm lọc hoá đơn theo các tuỳ chọn
     */
    void locHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        if (rad_TatCa.isSelected())
            list = HoaDonDAO.select();
        if (rad_HomNay.isSelected())
            list = HoaDonDAO.timTrongNgay();
        if (rad_HomQua.isSelected())
            list = HoaDonDAO.timTrongHomQua();
        if (rad_7NgayTruoc.isSelected())
            list = HoaDonDAO.timTrong7NgayTruoc();
        if (rad_Khac.isSelected())
            list = timTheoKhoangNgay();
        try {
            if (list.size() > 0) {
                doDuLieuVaoBang(list);
            }
            else {
                DefaultTableModel dtm = (DefaultTableModel) tbl_DanhSachHoaDon.getModel();
                dtm.setRowCount(0);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm tìm hoá đơn theo khoảng ngày tuỳ chọn
     */
    List<HoaDon> timTheoKhoangNgay() {
        List<HoaDon> list = new ArrayList<>();
        String TuNgay = DateHelper.toString(dat_TuNgay.getDate(),"yyyy-MM-dd");
        String DenNgay = DateHelper.toString(dat_DenNgay.getDate(),"yyyy-MM-dd");
        if (dat_TuNgay.getDate().after(dat_DenNgay.getDate())) {
            DialogHelper.alert(this, "Chọn lại ngày");
        }
        else {
            try {
                list = HoaDonDAO.timTheoKhoangNgay(TuNgay, DenNgay);
            } catch (Exception e) {
                DialogHelper.alert(this, "Có lỗi: " + e.toString());    
            }
        }
        return list;
    }
    
    /*
     * Hàm mở jframe chi tiêt hoá đơn
     */
    void xemHDCT() {
        int index = tbl_DanhSachHoaDon.getSelectedRow();
        String MaHD = tbl_DanhSachHoaDon.getValueAt(index, 0).toString();
        try {
            HoaDon HD = HoaDonDAO.timHoaDonTheoMa(MaHD);
            new ChiTietHoaDonJFrame(HD).setVisible(true);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
}