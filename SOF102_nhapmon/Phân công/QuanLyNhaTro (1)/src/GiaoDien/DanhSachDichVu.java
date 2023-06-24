/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import DoiTuong.DichVu;
import Entity.dichvuDao;
import Connections.Connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author minhc
 */
public class DanhSachDichVu extends javax.swing.JFrame {
    ArrayList<DichVu> list = new ArrayList<>();
    int current = 0;
    int index = -1;
    String url="jdbc:sqlserver://localhost:1433;databaseName=QLNT_NHOM5";
    String Username = "sa1";
    String Password = "123";
    /**
    /**
     * Creates new form DanhSachDichVu
     */
    public DanhSachDichVu() {
        initComponents();
        setLocationRelativeTo(null);
        load_data();
    }

    public void load_data() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLNT_NHOM5";
            Connection cn = DriverManager.getConnection(url, Username, Password);
            PreparedStatement ps = cn.prepareStatement(url);
            ResultSet rs = ps.executeQuery("select DichVu.MaDV , DichVu.TenDV , PhiDV , NgayPhatHanh , HanKetThuc"
                    + " from DichVu , DichVu "
                    + " where DichVu.MaDV = DichVu.MaDV ");
            list.clear(); 
            while (rs.next()) {
                // tạo đối tượng sinh viên stu
                //Student stu = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6),rs.getString(7));
                DichVu gr = new DichVu();
                // gán dữ liệu vào cho các thuộc tính
                gr.setMaDV(rs.getString(1));
                gr.setTenDV(rs.getString(2));
                gr.setPhiDV(rs.getDouble(3));
                gr.setNgayPhatHanh(rs.getString(4));
                gr.setHanKetThuc(rs.getString(5));
                list.add(gr);

            }
            ps.close();
            cn.close();

            DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
            model.setRowCount(0);
            //2. duyệt qua danh sách sinh viên list, lấy từng sinh viên thêm vào table
            for (DichVu gr : list) {
                Object[] row = new Object[]{gr.getMaDV(), gr.getTenDV(), gr.getPhiDV(), gr.getNgayPhatHanh(), gr.getHanKetThuc()};
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void search() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLNT_NHOM5";
            Connection cn = DriverManager.getConnection(url, Username, Password);
            PreparedStatement ps = cn.prepareStatement(url);
            ResultSet rs = ps.executeQuery("select DichVu.MaDV , DichVu.TenDV , PhiDV , NgayPhatHanh , HanKetThuc"
                    + " from DichVu , DichVu "
                    + " where DichVu.MaDV = DichVu.MaDV ");
            ps.setString(1, txtSearch.getText());
            list.clear(); 
            while (rs.next()) {
                // tạo đối tượng sinh viên stu
                //Student stu = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6),rs.getString(7));
                DichVu gr = new DichVu();
                // gán dữ liệu vào cho các thuộc tính
                gr.setMaDV(rs.getString(1));
                gr.setTenDV(rs.getString(2));
                gr.setPhiDV(rs.getDouble(3));
                gr.setNgayPhatHanh(rs.getString(4));
                gr.setHanKetThuc(rs.getString(5));
                list.add(gr);

            }
            ps.close();
            cn.close();

            DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
            model.setRowCount(0);
            //2. duyệt qua danh sách sinh viên list, lấy từng sinh viên thêm vào table
            for (DichVu gr : list) {
                Object[] row = new Object[]{gr.getMaDV(), gr.getTenDV(), gr.getPhiDV(), gr.getNgayPhatHanh(), gr.getHanKetThuc()};
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void showDetails() {
        //1. Lấy ra sinh viên hiện hành dựa vào current
        DichVu stu = list.get(current);
        //2. Gán thông tin của sinh viên lên các controls
        txtMaDV.setText(stu.getMaDV());
        txtTenDV.setText(stu.getTenDV());
        txtPhiDV.setText(String.valueOf(stu.getPhiDV()));
        txtNgayDangKY.setText(stu.getNgayPhatHanh());
        txtHanDangKy.setText(stu.getHanKetThuc());
        txtMoTa.setText(stu.getGhiChu());
         if (stu.isThanhToan() == true) {
            rdoDaThanhToan.setSelected(true);
        } else {
            rdoChuaThanhToan.setSelected(true);
        }
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
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtMaDV = new javax.swing.JTextField();
        txtTenDV = new javax.swing.JTextField();
        txtPhiDV = new javax.swing.JTextField();
        txtNgayDangKY = new javax.swing.JTextField();
        txtHanDangKy = new javax.swing.JTextField();
        cboTrangThai = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoChuaThanhToan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        btnDau = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnDangKyLai = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon_1.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaDV.setText("Mã dịch vụ ...");

        txtTenDV.setText("Tên dịch vụ ...");

        txtPhiDV.setText("Phí dịch vụ ...");

        txtNgayDangKY.setText("Ngày đăng ký ...");
        txtNgayDangKY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDangKYActionPerformed(evt);
            }
        });

        txtHanDangKy.setText("Hạn đăng ký ...");
        txtHanDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHanDangKyActionPerformed(evt);
            }
        });

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trạng thái", "Item 2", "Item 3", "Item 4" }));
        cboTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrangThaiActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Thanh Toán");

        rdoDaThanhToan.setText("Đã thanh toán");

        rdoChuaThanhToan.setText("Chưa thanh toán");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoChuaThanhToan)
                    .addComponent(rdoDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoDaThanhToan)
                .addGap(18, 18, 18)
                .addComponent(rdoChuaThanhToan)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        txtMoTa.setColumns(20);
        txtMoTa.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtMoTa.setRows(5);
        txtMoTa.setText("Mô tả ...");
        jScrollPane1.setViewportView(txtMoTa);

        btnDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/up-arrows.png"))); // NOI18N
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnLui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/up-chevron.png"))); // NOI18N
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });

        btnTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down-chevron.png"))); // NOI18N
        btnTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienActionPerformed(evt);
            }
        });

        btnCuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down-arrow.png"))); // NOI18N
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaDV)
                    .addComponent(txtTenDV)
                    .addComponent(txtPhiDV)
                    .addComponent(txtNgayDangKY, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(txtHanDangKy))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuoi)
                    .addComponent(btnLui)
                    .addComponent(btnDau)
                    .addComponent(btnTien))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtTenDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtPhiDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDau)
                                .addGap(18, 18, 18)
                                .addComponent(btnLui))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtNgayDangKY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtHanDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnTien)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuoi)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnHuy.setText("Hủy đăng ký");

        btnDangKyLai.setText("Đăng ký lại");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh toán");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHuy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangKyLai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHuy)
                .addGap(51, 51, 51)
                .addComponent(btnDangKyLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(43, 43, 43)
                .addComponent(btnThanhToan)
                .addGap(43, 43, 43))
        );

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaDV", "TenDV", "PhiDV", "NgayDangKy", "HanDangKy", "MoTa", "ThanhToan", "TrangThai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBang);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Danh sách dịch vụ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSearch))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtHanDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHanDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHanDangKyActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtNgayDangKYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDangKYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDangKYActionPerformed

    private void cboTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTrangThaiActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        current = tblBang.getSelectedRow();
        showDetails();
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        // TODO add your handling code here:
        tblBang.setRowSelectionInterval(index, index);
        if(index == list.size() - 1){
        }else{
            index ++;
        }
        showDetails();
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienActionPerformed
        // TODO add your handling code here:
        tblBang.setRowSelectionInterval(index, index);
        if(index == 0){
        }else{
            index --;
        }
        showDetails();
    }//GEN-LAST:event_btnTienActionPerformed

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        // TODO add your handling code here:
        tblBang.setRowSelectionInterval(index, index);
        index = list.size() - 1;
        showDetails();
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        // TODO add your handling code here:
        tblBang.setRowSelectionInterval(index, index);
        index = 0;
        showDetails();
    }//GEN-LAST:event_btnDauActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDangKyLai;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoChuaThanhToan;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtHanDangKy;
    private javax.swing.JTextField txtMaDV;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtNgayDangKY;
    private javax.swing.JTextField txtPhiDV;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenDV;
    // End of variables declaration//GEN-END:variables
}
