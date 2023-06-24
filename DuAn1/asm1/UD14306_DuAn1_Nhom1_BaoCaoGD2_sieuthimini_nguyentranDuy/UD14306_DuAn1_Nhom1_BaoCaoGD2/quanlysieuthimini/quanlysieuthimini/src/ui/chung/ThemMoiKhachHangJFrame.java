/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.chung;

import model.KhachHang;
import dao.KhachHangDAO;
import helper.DateHelper;
import helper.DialogHelper;
import helper.ShareHelper;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JTextField;
import ui.quanly.doitac.khachhang.DanhSachKhachHangJFrame;


/**
 *
 * @author Administrator
 */
public class ThemMoiKhachHangJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThemMoiKhachHangJFrame
     */
    public ThemMoiKhachHangJFrame() {
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

        btg_GioiTinh = new javax.swing.ButtonGroup();
        lbl_MaKhachHang = new javax.swing.JLabel();
        txt_MaKhachHang = new javax.swing.JTextField();
        lbl_HoTen = new javax.swing.JLabel();
        txt_HoTen = new javax.swing.JTextField();
        lbl_DienThoai = new javax.swing.JLabel();
        txt_DienThoai = new javax.swing.JTextField();
        lbl_GioiTinh = new javax.swing.JLabel();
        rad_Nam = new javax.swing.JRadioButton();
        rad_Nu = new javax.swing.JRadioButton();
        txt_Email = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        lbl_NgaySinh = new javax.swing.JLabel();
        dat_NgaySinh = new com.toedter.calendar.JDateChooser();
        lbl_NhanVienQuanLy = new javax.swing.JLabel();
        txt_NhanVienQuanLy = new javax.swing.JTextField();
        lbl_GhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_GhiChu = new javax.swing.JTextArea();
        lbl_DiaChi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_DiaChi = new javax.swing.JTextArea();
        lbl_DiemThuong = new javax.swing.JLabel();
        txt_DiemThuong = new javax.swing.JTextField();
        cmb_TrangThai = new javax.swing.JComboBox<>();
        btn_NhapLai = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM MỚI KHÁCH HÀNG");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 600));

        lbl_MaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_MaKhachHang.setForeground(new java.awt.Color(0, 0, 153));
        lbl_MaKhachHang.setText("Mã khách hàng");

        txt_MaKhachHang.setEditable(false);
        txt_MaKhachHang.setBackground(new java.awt.Color(255, 255, 204));
        txt_MaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_HoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_HoTen.setForeground(new java.awt.Color(0, 0, 153));
        lbl_HoTen.setText("Họ tên");

        txt_HoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_HoTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_HoTenFocusLost(evt);
            }
        });

        lbl_DienThoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_DienThoai.setForeground(new java.awt.Color(0, 0, 153));
        lbl_DienThoai.setText("Điện thoại");

        txt_DienThoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_DienThoai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_DienThoaiFocusLost(evt);
            }
        });
        txt_DienThoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DienThoaiKeyTyped(evt);
            }
        });

        lbl_GioiTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_GioiTinh.setForeground(new java.awt.Color(0, 0, 153));
        lbl_GioiTinh.setText("Giới tính");

        btg_GioiTinh.add(rad_Nam);
        rad_Nam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_Nam.setForeground(new java.awt.Color(0, 0, 153));
        rad_Nam.setSelected(true);
        rad_Nam.setText("Nam");

        btg_GioiTinh.add(rad_Nu);
        rad_Nu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rad_Nu.setForeground(new java.awt.Color(0, 0, 153));
        rad_Nu.setText("Nữ");

        txt_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EmailFocusLost(evt);
            }
        });
        txt_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EmailKeyTyped(evt);
            }
        });

        lbl_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(0, 0, 153));
        lbl_Email.setText("Email");

        lbl_NgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NgaySinh.setForeground(new java.awt.Color(0, 0, 153));
        lbl_NgaySinh.setText("Ngày sinh");

        dat_NgaySinh.setDateFormatString("dd/MM/yyyy");
        dat_NgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dat_NgaySinh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dat_NgaySinhPropertyChange(evt);
            }
        });

        lbl_NhanVienQuanLy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NhanVienQuanLy.setForeground(new java.awt.Color(0, 0, 153));
        lbl_NhanVienQuanLy.setText("Nhân viên quản lý");

        txt_NhanVienQuanLy.setEditable(false);
        txt_NhanVienQuanLy.setBackground(new java.awt.Color(255, 255, 204));
        txt_NhanVienQuanLy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_GhiChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_GhiChu.setForeground(new java.awt.Color(0, 0, 153));
        lbl_GhiChu.setText("Ghi chú");

        txa_GhiChu.setColumns(10);
        txa_GhiChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txa_GhiChu.setRows(3);
        txa_GhiChu.setAutoscrolls(false);
        jScrollPane1.setViewportView(txa_GhiChu);

        lbl_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_DiaChi.setForeground(new java.awt.Color(0, 0, 153));
        lbl_DiaChi.setText("Địa chỉ");

        txa_DiaChi.setColumns(10);
        txa_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txa_DiaChi.setRows(2);
        txa_DiaChi.setAutoscrolls(false);
        txa_DiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txa_DiaChiFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txa_DiaChi);

        lbl_DiemThuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_DiemThuong.setForeground(new java.awt.Color(0, 0, 153));
        lbl_DiemThuong.setText("Điểm thưởng");

        txt_DiemThuong.setEditable(false);
        txt_DiemThuong.setBackground(new java.awt.Color(255, 255, 204));
        txt_DiemThuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_DiemThuong.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_DiemThuong.setText("0");

        cmb_TrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang giao dịch", "Ngưng giao dịch" }));
        cmb_TrangThai.setEnabled(false);

        btn_NhapLai.setBackground(new java.awt.Color(51, 51, 255));
        btn_NhapLai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_NhapLai.setForeground(new java.awt.Color(255, 255, 255));
        btn_NhapLai.setText("NHẬP LẠI");
        btn_NhapLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NhapLaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NhapLaiMouseExited(evt);
            }
        });
        btn_NhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhapLaiActionPerformed(evt);
            }
        });

        btn_Luu.setBackground(new java.awt.Color(255, 51, 0));
        btn_Luu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Luu.setForeground(new java.awt.Color(255, 255, 255));
        btn_Luu.setText("LƯU");
        btn_Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LuuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LuuMouseExited(evt);
            }
        });
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_NhanVienQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txt_DiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_GioiTinh)
                                    .addGap(178, 178, 178))
                                .addComponent(lbl_MaKhachHang, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rad_Nam)
                                            .addGap(18, 18, 18)
                                            .addComponent(rad_Nu))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_DienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txt_MaKhachHang)))
                                    .addComponent(lbl_HoTen)
                                    .addComponent(lbl_DienThoai)
                                    .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_NgaySinh)
                                    .addComponent(dat_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_NhanVienQuanLy))
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_TrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_DiemThuong))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(cmb_TrangThai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad_Nam)
                    .addComponent(rad_Nu)
                    .addComponent(lbl_GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dat_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_NhanVienQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NhanVienQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LuuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseEntered
        // TODO add your handling code here:
        btn_Luu.setBackground(Color.yellow);
        btn_Luu.setForeground(Color.blue);
        btn_Luu.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_LuuMouseEntered

    private void btn_LuuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseExited
        // TODO add your handling code here:
        btn_Luu.setBackground(new Color(255, 51, 0));
        btn_Luu.setForeground(Color.white);
    }//GEN-LAST:event_btn_LuuMouseExited

    private void btn_NhapLaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhapLaiMouseEntered
        // TODO add your handling code here:
        btn_NhapLai.setBackground(Color.yellow);
        btn_NhapLai.setForeground(Color.blue);
        btn_NhapLai.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_NhapLaiMouseEntered

    private void btn_NhapLaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhapLaiMouseExited
        // TODO add your handling code here:
        btn_NhapLai.setBackground(new Color(51, 51, 255));
        btn_NhapLai.setForeground(Color.white);
    }//GEN-LAST:event_btn_NhapLaiMouseExited

    private void btn_NhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhapLaiActionPerformed
        // TODO add your handling code here:
        xoaThongTin();
    }//GEN-LAST:event_btn_NhapLaiActionPerformed

    private void txt_DienThoaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DienThoaiFocusLost
        // TODO add your handling code here:
        if(checkDienThoai()){
            txt_DienThoai.setBackground(Color.white);
        }
    }//GEN-LAST:event_txt_DienThoaiFocusLost

    private void txt_DienThoaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DienThoaiKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(txt_DienThoai.getText().length() == 11 || !(Character.isDigit(c)) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txt_DienThoaiKeyTyped

    private void txt_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EmailFocusLost
        // TODO add your handling code here:
        if(checkEmail()){
            txt_Email.setBackground(Color.WHITE);
        }
        else{
            txt_Email.setBackground(Color.YELLOW);
        }
    }//GEN-LAST:event_txt_EmailFocusLost

    private void dat_NgaySinhPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dat_NgaySinhPropertyChange
        // TODO add your handling code here:
        if(!checkNgaySinh()){
            ((JTextField)dat_NgaySinh.getDateEditor().getUiComponent()).setForeground(Color.red);
            ((JTextField)dat_NgaySinh.getDateEditor().getUiComponent()).setBackground(Color.yellow);
        }
        else {
            ((JTextField)dat_NgaySinh.getDateEditor().getUiComponent()).setForeground(Color.BLACK);
            ((JTextField)dat_NgaySinh.getDateEditor().getUiComponent()).setBackground(Color.white);
        }
    }//GEN-LAST:event_dat_NgaySinhPropertyChange

    private void txa_DiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txa_DiaChiFocusLost
        // TODO add your handling code here:
        if(!checkDiaChi()){
            txa_DiaChi.setBackground(Color.yellow);
        }
        else {
            txa_DiaChi.setBackground(Color.white);
        }
    }//GEN-LAST:event_txa_DiaChiFocusLost

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        themKhachHang();
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void txt_HoTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_HoTenFocusLost
        // TODO add your handling code here:
        if(!checkHoTen()) {
            txt_HoTen.setBackground(Color.yellow);
        }
        else {
            txt_HoTen.setBackground(Color.white);
        }
    }//GEN-LAST:event_txt_HoTenFocusLost

    private void txt_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EmailKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_EmailKeyTyped

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
            java.util.logging.Logger.getLogger(ThemMoiKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemMoiKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemMoiKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemMoiKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMoiKhachHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_GioiTinh;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_NhapLai;
    private javax.swing.JComboBox<String> cmb_TrangThai;
    private com.toedter.calendar.JDateChooser dat_NgaySinh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_DiemThuong;
    private javax.swing.JLabel lbl_DienThoai;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_GhiChu;
    private javax.swing.JLabel lbl_GioiTinh;
    private javax.swing.JLabel lbl_HoTen;
    private javax.swing.JLabel lbl_MaKhachHang;
    private javax.swing.JLabel lbl_NgaySinh;
    private javax.swing.JLabel lbl_NhanVienQuanLy;
    private javax.swing.JRadioButton rad_Nam;
    private javax.swing.JRadioButton rad_Nu;
    private javax.swing.JTextArea txa_DiaChi;
    private javax.swing.JTextArea txa_GhiChu;
    private javax.swing.JTextField txt_DiemThuong;
    private javax.swing.JTextField txt_DienThoai;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_HoTen;
    private javax.swing.JTextField txt_MaKhachHang;
    private javax.swing.JTextField txt_NhanVienQuanLy;
    // End of variables declaration//GEN-END:variables

    KhachHangDAO KhachHangDAO = new KhachHangDAO();
    
    /*
     * Hàm khởi tạo các giá trị ban đầu cho JFrame
     */
    void inIt(){
        this.setSize(530,600);
        this.setMinimumSize(new Dimension(530, 600));
        this.setMaximumSize(new Dimension(530, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        doThongTin();
    }
    
    /*
     * Hàm tự động đổ mã khách hàng và NVQL lên textfield
     */
    void doThongTin(){
        String MaNhanVien = ShareHelper.NguoiDung.getTenDangNhap();
        txt_NhanVienQuanLy.setText(MaNhanVien);
        try {
            int dem = KhachHangDAO.tongKhachHang();
            String MaKhachHang = "KH" + dem;
            txt_MaKhachHang.setText(MaKhachHang);
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm xoá thông tin trên textfield để nhập lại
     */
    void xoaThongTin(){
        txt_HoTen.setText("");
        txt_HoTen.setBackground(Color.white);
        txt_DienThoai.setText("");
        txt_DienThoai.setBackground(Color.white);
        ((JTextField)dat_NgaySinh.getDateEditor().getUiComponent()).setText("");
        ((JTextField)dat_NgaySinh.getDateEditor().getUiComponent()).setBackground(Color.white);
        txt_Email.setText("");
        txt_Email.setBackground(Color.white);
        txa_DiaChi.setText("");
        txa_DiaChi.setBackground(Color.white);
        txa_GhiChu.setText("");
        txa_GhiChu.setBackground(Color.white);
        rad_Nam.setSelected(true);
        cmb_TrangThai.setSelectedIndex(0);
    }
    
    /*
     * Hàm kiểm tra sdt có tồn tại trong database hay không
     */
    boolean checkDienThoai(){
        boolean ketqua = true;
        try {
            String SDT = txt_DienThoai.getText();
            if(SDT.isEmpty() || SDT.length() < 10 || SDT.length() > 11){
                ketqua = false;
                txt_DienThoai.setBackground(Color.yellow);
            }
            else if(!KhachHangDAO.kiemSDT(SDT)){
                ketqua = false;
                DialogHelper.alert(this, "Số điện thoại đã tồn tại");
                txt_DienThoai.setBackground(Color.yellow);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
        return ketqua;
    }
    
    /*
     * Hàm kiểm tra định dạng email
     */
    boolean checkEmail(){
        try {
            String email = txt_Email.getText();
            String pattern = "([A-Za-z0-9-_.]+@[A-Za-z0-9-_]+(?:\\.[A-Za-z0-9]+)+)";
            if(email.length() <= 0 | (!email.matches(pattern))){
                return false;
            }
            if(!KhachHangDAO.kiemEmail(email)){
                DialogHelper.alert(this, "Email đã tồn tại");
                return false;
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
        return true;
    }
    
    /*
     * Hàm check ngày sinh khách hàng: tính đến thời gian hiện tại phải từ 13t trở lên
     */
    boolean checkNgaySinh(){
        if(dat_NgaySinh.getDate() != null){
            Date NgayHienTai = DateHelper.now();
            Date NgaySinh = dat_NgaySinh.getDate();
            long kiemtra = DateHelper.getDateDiff(NgaySinh, NgayHienTai, TimeUnit.DAYS);
            if(kiemtra/365 < 13){
                DialogHelper.alert(this, "Khách hàng phải đủ 13 tuổi");
                return false;
            }
        }
        return true;
    }
    
    /*
     * Hàm check địa chỉ
     */
    boolean checkDiaChi(){
        if(txa_DiaChi.getText().isEmpty()){
            return false;
        }
        else
            return true;
    }
    
    /*
     * Hàm thêm khách hàng vào database
          sau khi thêm thì close frame này
     */
    void themKhachHang(){
        try {
            if(kiemLoi()){
                KhachHang model = taoModel();
                int rs = KhachHangDAO.themKhachHang(model);
                if(rs != 0){
                    DialogHelper.alert(this, "Thêm mới thành công");
                    this.dispose();
                    if(capnhatFrameDSKH()){
                        new DanhSachKhachHangJFrame().setVisible(true);
                    }
                }
                else {
                    DialogHelper.alert(this, "Thêm mới thất bại");
                }
            }
            else {
                DialogHelper.alert(this, "Kiểm tra lại thông tin");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }
    
    /*
     * Hàm kiểm tra họ tên
     */
    boolean checkHoTen(){
        String pattern = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ\\s]+$";
        if(!txt_HoTen.getText().matches(pattern)){
            return false;
        }
        return true;
    }
    
    /*
     * Hàm kiểm lỗi trước khi thêm Khách hàng
     */
    boolean kiemLoi(){
        if(!checkDiaChi() || !checkEmail() || !checkNgaySinh() || !checkDienThoai() || !checkHoTen())
            return false;
        return true;
    }
    
    /*
     * Hàm tạo model khách hàng để đưa lên database
     */
    KhachHang taoModel(){
        KhachHang model = new KhachHang();
        model.setMaKhachHang(txt_MaKhachHang.getText());
        model.setHoTen(txt_HoTen.getText());
        model.setDiemThuong(0);
        model.setDienThoai(txt_DienThoai.getText());
        model.setGioiTinh(rad_Nam.isSelected());
        model.setNgaySinh(dat_NgaySinh.getDate());
        model.setNVQuanLy(txt_NhanVienQuanLy.getText());
        model.setEmail(txt_Email.getText());
        model.setDiaChi(txa_DiaChi.getText());
        model.setGhiChu(txa_GhiChu.getText());
        model.setTrangThai(true);
        return model;
    }
    
    /*
     * Hàm reload lại frame DANH SÁCH KHÁCH HÀNG để cập nhật khách hàng mới
           hàm chỉ thực thi khi frame DSKH đang mở
     */
    boolean capnhatFrameDSKH(){
        Frame[] listFrames = Frame.getFrames();
        for (Frame fr : listFrames) {
            String tenFrame = fr.getClass().getName();
            if (tenFrame.equalsIgnoreCase("ui.quanly.doitac.khachhang.DanhSachKhachHangJFrame")) {
                fr.dispose();
                return true;
            }
        }
        return false;
    }
}
