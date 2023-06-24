/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.nhanvien;

import dao.NguoiDungDAO;
import helper.DateHelper;
import helper.DialogHelper;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JTextField;
import model.NguoiDung;

/**
 *
 * @author Administrator
 */
public class ThemMoiNhanVienJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThemMoiNhanVienJFrame
     */
    public ThemMoiNhanVienJFrame() {
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
        lbl_MaNhanVien = new javax.swing.JLabel();
        txt_TenDangNhap = new javax.swing.JTextField();
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
        lbl_VaiTro = new javax.swing.JLabel();
        lbl_TrangThai = new javax.swing.JLabel();
        lbl_DiaChi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_DiaChi = new javax.swing.JTextArea();
        cmb_VaiTro = new javax.swing.JComboBox<>();
        cmb_TrangThai = new javax.swing.JComboBox<>();
        lbl_NhapLaiMatKhau = new javax.swing.JLabel();
        txt_MatKhau = new javax.swing.JPasswordField();
        lbl_MatKhau = new javax.swing.JLabel();
        txt_NhapLaiMatKhau = new javax.swing.JPasswordField();
        btn_NhapLai = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM MỚI NHÂN VIÊN");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 600));

        lbl_MaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_MaNhanVien.setForeground(new java.awt.Color(0, 0, 153));
        lbl_MaNhanVien.setText("Tên đăng nhập");

        txt_TenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TenDangNhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TenDangNhapFocusLost(evt);
            }
        });
        txt_TenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TenDangNhapKeyTyped(evt);
            }
        });

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

        lbl_VaiTro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_VaiTro.setForeground(new java.awt.Color(0, 0, 153));
        lbl_VaiTro.setText("Vai trò");

        lbl_TrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TrangThai.setForeground(new java.awt.Color(0, 0, 153));
        lbl_TrangThai.setText("Trạng thái");

        lbl_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_DiaChi.setForeground(new java.awt.Color(0, 0, 153));
        lbl_DiaChi.setText("Địa chỉ");

        txa_DiaChi.setColumns(10);
        txa_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txa_DiaChi.setRows(2);
        txa_DiaChi.setAutoscrolls(false);
        txa_DiaChi.setMinimumSize(new java.awt.Dimension(4, 25));
        txa_DiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txa_DiaChiFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txa_DiaChi);

        cmb_VaiTro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_VaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý", "Thủ kho" }));

        cmb_TrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoạt động", "Ngưng hoạt động" }));
        cmb_TrangThai.setEnabled(false);

        lbl_NhapLaiMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NhapLaiMatKhau.setForeground(new java.awt.Color(0, 0, 153));
        lbl_NhapLaiMatKhau.setText("Nhập lại mật khẩu");

        txt_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_MatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_MatKhauFocusLost(evt);
            }
        });
        txt_MatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MatKhauKeyTyped(evt);
            }
        });

        lbl_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_MatKhau.setForeground(new java.awt.Color(0, 0, 153));
        lbl_MatKhau.setText("Mật khẩu");

        txt_NhapLaiMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_NhapLaiMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NhapLaiMatKhauFocusLost(evt);
            }
        });
        txt_NhapLaiMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NhapLaiMatKhauKeyTyped(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_GioiTinh)
                                    .addGap(178, 178, 178))
                                .addComponent(lbl_MaNhanVien, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rad_Nam)
                                            .addGap(18, 18, 18)
                                            .addComponent(rad_Nu))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_DienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txt_TenDangNhap)))
                                    .addComponent(lbl_HoTen)
                                    .addComponent(lbl_DienThoai)
                                    .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_NgaySinh)
                                    .addComponent(dat_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_VaiTro))
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MatKhau)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbl_NhapLaiMatKhau)
                                    .addComponent(lbl_MatKhau))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_VaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txt_NhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btn_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rad_Nam)
                            .addComponent(rad_Nu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dat_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_VaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_VaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        themNguoiDung();
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void txt_MatKhauKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MatKhauKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_MatKhauKeyTyped

    private void txt_NhapLaiMatKhauKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NhapLaiMatKhauKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NhapLaiMatKhauKeyTyped

    private void txt_MatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_MatKhauFocusLost
        // TODO add your handling code here:
        String Chuoi = new String(txt_MatKhau.getPassword());
        if (Chuoi.length() < 3) {
            txt_MatKhau.setBackground(Color.yellow);
        } else if (Chuoi.length() > 20) {
            txt_MatKhau.setBackground(Color.yellow);
        } else {
            txt_MatKhau.setBackground(Color.white);
        }
    }//GEN-LAST:event_txt_MatKhauFocusLost

    private void txt_NhapLaiMatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NhapLaiMatKhauFocusLost
        // TODO add your handling code here:
        if (checkMatKhau()) {
            txt_NhapLaiMatKhau.setBackground(Color.white);
        } else {
            txt_NhapLaiMatKhau.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_txt_NhapLaiMatKhauFocusLost

    private void txt_HoTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_HoTenFocusLost
        // TODO add your handling code here:
        if (!checkHoTen()) {
            txt_HoTen.setBackground(Color.yellow);
        } else {
            txt_HoTen.setBackground(Color.white);
        }
    }//GEN-LAST:event_txt_HoTenFocusLost

    private void txt_DienThoaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DienThoaiKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (txt_DienThoai.getText().length() == 11 || !(Character.isDigit(c)) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_DienThoaiKeyTyped

    private void txt_DienThoaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DienThoaiFocusLost
        // TODO add your handling code here:
        if (checkDienThoai()) {
            txt_DienThoai.setBackground(Color.white);
        }
    }//GEN-LAST:event_txt_DienThoaiFocusLost

    private void dat_NgaySinhPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dat_NgaySinhPropertyChange
        // TODO add your handling code here:
        if (!checkNgaySinh()) {
            ((JTextField) dat_NgaySinh.getDateEditor().getUiComponent()).setForeground(Color.red);
            ((JTextField) dat_NgaySinh.getDateEditor().getUiComponent()).setBackground(Color.yellow);
        } else {
            ((JTextField) dat_NgaySinh.getDateEditor().getUiComponent()).setForeground(Color.BLACK);
            ((JTextField) dat_NgaySinh.getDateEditor().getUiComponent()).setBackground(Color.white);
        }
    }//GEN-LAST:event_dat_NgaySinhPropertyChange

    private void txt_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EmailFocusLost
        // TODO add your handling code here:
        if (checkEmail()) {
            txt_Email.setBackground(Color.WHITE);
        } else {
            txt_Email.setBackground(Color.YELLOW);
        }
    }//GEN-LAST:event_txt_EmailFocusLost

    private void txt_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EmailKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_EmailKeyTyped

    private void txa_DiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txa_DiaChiFocusLost
        // TODO add your handling code here:
        if (!checkDiaChi()) {
            txa_DiaChi.setBackground(Color.yellow);
        } else {
            txa_DiaChi.setBackground(Color.white);
        }
    }//GEN-LAST:event_txa_DiaChiFocusLost

    private void txt_TenDangNhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TenDangNhapFocusLost
        // TODO add your handling code here:
        if (!checkTenDangNhap()) {
            txt_TenDangNhap.setBackground(Color.yellow);
        } else {
            txt_TenDangNhap.setBackground(Color.white);
        }
    }//GEN-LAST:event_txt_TenDangNhapFocusLost

    private void txt_TenDangNhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TenDangNhapKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TenDangNhapKeyTyped

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
            java.util.logging.Logger.getLogger(ThemMoiNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemMoiNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemMoiNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemMoiNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMoiNhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_GioiTinh;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_NhapLai;
    private javax.swing.JComboBox<String> cmb_TrangThai;
    private javax.swing.JComboBox<String> cmb_VaiTro;
    private com.toedter.calendar.JDateChooser dat_NgaySinh;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_DienThoai;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_GioiTinh;
    private javax.swing.JLabel lbl_HoTen;
    private javax.swing.JLabel lbl_MaNhanVien;
    private javax.swing.JLabel lbl_MatKhau;
    private javax.swing.JLabel lbl_NgaySinh;
    private javax.swing.JLabel lbl_NhapLaiMatKhau;
    private javax.swing.JLabel lbl_TrangThai;
    private javax.swing.JLabel lbl_VaiTro;
    private javax.swing.JRadioButton rad_Nam;
    private javax.swing.JRadioButton rad_Nu;
    private javax.swing.JTextArea txa_DiaChi;
    private javax.swing.JTextField txt_DienThoai;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_HoTen;
    private javax.swing.JPasswordField txt_MatKhau;
    private javax.swing.JPasswordField txt_NhapLaiMatKhau;
    private javax.swing.JTextField txt_TenDangNhap;
    // End of variables declaration//GEN-END:variables

    NguoiDungDAO NguoiDungDAO = new NguoiDungDAO();

    /*
     * Hàm khởi tạo các giá trị ban đầu cho Frame
     */
    void inIt() {
        this.setSize(530, 600);
        this.setMinimumSize(new Dimension(530, 600));
        this.setMaximumSize(new Dimension(530, 600));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /*
     * Hàm xoá thông tin trên textfield để nhập lại
     */
    void xoaThongTin() {
        txt_TenDangNhap.setText("");
        txt_TenDangNhap.setBackground(Color.white);
        txt_HoTen.setText("");
        txt_HoTen.setBackground(Color.white);
        txt_DienThoai.setText("");
        txt_DienThoai.setBackground(Color.white);
        ((JTextField) dat_NgaySinh.getDateEditor().getUiComponent()).setText("");
        ((JTextField) dat_NgaySinh.getDateEditor().getUiComponent()).setBackground(Color.white);
        rad_Nam.setSelected(true);
        cmb_VaiTro.setSelectedIndex(0);
        txt_Email.setText("");
        txt_Email.setBackground(Color.white);
        txa_DiaChi.setText("");
        txa_DiaChi.setBackground(Color.white);
        cmb_TrangThai.setSelectedIndex(0);
        txt_MatKhau.setText("");
        txt_MatKhau.setBackground(Color.white);
        txt_NhapLaiMatKhau.setText("");
        txt_NhapLaiMatKhau.setBackground(Color.white);
    }

    /*
     * Hàm kiểm tra tên đăng nhập có tồn tại chưa
     */
    boolean checkTenDangNhap() {
        boolean ketqua = true;
        try {
            String TenDangNhap = txt_TenDangNhap.getText();
            if (TenDangNhap.isEmpty() || TenDangNhap.length() < 3 || TenDangNhap.length() > 20) {
                ketqua = false;
                txt_TenDangNhap.setBackground(Color.yellow);
            } else if (!NguoiDungDAO.kiemTenDangNhap(TenDangNhap)) {
                ketqua = false;
                DialogHelper.alert(this, "Tên đăng nhập đã tồn tại");
                txt_TenDangNhap.setBackground(Color.yellow);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
        return ketqua;
    }

    /*
     * Hàm kiểm tra sdt có tồn tại trong database hay không
     */
    boolean checkDienThoai() {
        boolean ketqua = true;
        try {
            String SDT = txt_DienThoai.getText();
            if (SDT.isEmpty() || SDT.length() < 10 || SDT.length() > 11) {
                ketqua = false;
                txt_DienThoai.setBackground(Color.yellow);
            } else if (!NguoiDungDAO.kiemSDT(SDT)) {
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
    boolean checkEmail() {
        try {
            String email = txt_Email.getText();
            String pattern = "([A-Za-z0-9-_.]+@[A-Za-z0-9-_]+(?:\\.[A-Za-z0-9]+)+)";
            if (email.length() <= 0 | (!email.matches(pattern))) {
                return false;
            }
            if (!NguoiDungDAO.kiemEmail(email)) {
                DialogHelper.alert(this, "Email đã tồn tại");
                return false;
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
        return true;
    }

    /*
     * Hàm check ngày sinh người dùng: tính đến thời gian hiện tại phải từ 18t trở lên
     */
    boolean checkNgaySinh() {
        if (dat_NgaySinh.getDate() != null) {
            Date NgayHienTai = DateHelper.now();
            Date NgaySinh = dat_NgaySinh.getDate();
            long kiemtra = DateHelper.getDateDiff(NgaySinh, NgayHienTai, TimeUnit.DAYS);
            if (kiemtra / 365 < 18) {
                DialogHelper.alert(this, "Nhân viên phải đủ 18 tuổi");
                return false;
            }
        }
        return true;
    }

    /*
     * Hàm check địa chỉ
     */
    boolean checkDiaChi() {
        if (txa_DiaChi.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Hàm kiểm tra họ tên
     */
    boolean checkHoTen() {
        String pattern = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ\\s]+$";
        if (!txt_HoTen.getText().matches(pattern)) {
            return false;
        }
        return true;
    }

    /*
     * Hàm kiểm tra mật khẩu
          - không có khoảng trắng
          - độ dài: 3 <= MK <= 20
          - phải trùng với txt_NhapLaiMatKhau
     */
    boolean checkMatKhau() {
        boolean ketqua = true;
        String MatKhau = new String(txt_MatKhau.getPassword());
        String NhapLaiMatKhau = new String(txt_NhapLaiMatKhau.getPassword());
        if (MatKhau.length() < 3 || MatKhau.length() > 20) {
            ketqua = false;
        }
        if (!NhapLaiMatKhau.equals(MatKhau)) {
            ketqua = false;
        }
        return ketqua;
    }

    /*
     * Hàm kiểm lỗi trước khi thêm Nhanvien
     */
    boolean kiemLoi() {
        if (!checkTenDangNhap() || !checkDiaChi() || !checkEmail() || !checkNgaySinh() || !checkDienThoai() || !checkHoTen()) {
            return false;
        }
        return true;
    }

    /*
     * Hàm tạo model NguoiDung để đưa lên database
     */
    NguoiDung taoModel() {
        NguoiDung model = new NguoiDung();
        model.setTenDangNhap(txt_TenDangNhap.getText());
        model.setMatKhau(new String(txt_MatKhau.getPassword()));
        model.setHoTen(txt_HoTen.getText());
        model.setDienThoai(txt_DienThoai.getText());
        model.setGioiTinh(rad_Nam.isSelected());
        model.setNgaySinh(dat_NgaySinh.getDate());
        model.setEmail(txt_Email.getText());
        model.setDiaChi(txa_DiaChi.getText());
        model.setVaiTro(cmb_VaiTro.getSelectedIndex());
        model.setTrangThai(true);
        return model;
    }

    /*
     * Hàm thêm Nguoi Dung vào database
          sau khi thêm thì close frame này
     */
    void themNguoiDung() {
        try {
            if (kiemLoi()) {
                NguoiDung model = taoModel();
                int rs = NguoiDungDAO.themNguoiDung(model);
                if (rs != 0) {
                    DialogHelper.alert(this, "Thêm mới thành công");
                    this.dispose();
                    if (capnhatFrameDSNV()) {
                        new DanhSachNhanVienJFrame().setVisible(true);
                    }
                } else {
                    DialogHelper.alert(this, "Thêm mới thất bại");
                }
            } else {
                DialogHelper.alert(this, "Kiểm tra lại thông tin");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
        }
    }

    /*
     * Hàm reload lại frame DANH SÁCH NHAN VIEN để cập nhật thong tin
           hàm chỉ thực thi khi frame DSNV đang mở
     */
    boolean capnhatFrameDSNV() {
        Frame[] listFrames = Frame.getFrames();
        for (Frame fr : listFrames) {
            String tenFrame = fr.getClass().getName();
            if (tenFrame.equalsIgnoreCase("ui.quanly.nhanvien.DanhSachNhanVienJFrame")) {
                fr.dispose();
                return true;
            }
        }
        return false;
    }
}