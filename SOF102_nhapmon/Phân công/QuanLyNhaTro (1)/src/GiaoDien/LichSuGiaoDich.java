/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import DoiTuong.GiaoDich;
import Entity.GiaoDichDao;
import Connections.Connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minhc
 */
public class LichSuGiaoDich extends javax.swing.JFrame {
    ArrayList<GiaoDich> list = new ArrayList<>();
    int current = 0;
    int index = -1;
    String url="jdbc:sqlserver://localhost:1433;databaseName=QLNT_NHOM5";
    String Username = "sa1";
    String Password = "123";
    /**
     * Creates new form LichSuGiaoDich
     */
    public LichSuGiaoDich() {
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
            ResultSet rs = ps.executeQuery("select GiaoDich.MaGD , GiaoDich.TenGD , MaLK , MaTk_NguoiGui , SoTk_NguoiGui , SoTk_NguoiNhan , NoiDung , ThoiGian , SoTien , TrangThai"
                    + " from GiaoDich , GiaoDich "
                    + " where GiaoDich.MaGD = GiaoDich.MaGD ");
            list.clear(); 
            while (rs.next()) {
                // tạo đối tượng sinh viên stu
                //Student stu = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6),rs.getString(7));
                GiaoDich gr = new GiaoDich();
                // gán dữ liệu vào cho các thuộc tính
                gr.setMaGD(rs.getString(1));
                gr.setTenGD(rs.getString(2));
                gr.setSoTk_nguoinhan(rs.getInt(3));
                gr.setNoiDung(rs.getString(4));
                gr.setThoigian(rs.getString(5));
                gr.setSoTien(rs.getDouble(6));
                gr.setTrangThai(rs.getBoolean(7));
                list.add(gr);

            }
            ps.close();
            cn.close();

            DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
            model.setRowCount(0);
            //2. duyệt qua danh sách sinh viên list, lấy từng sinh viên thêm vào table
            for (GiaoDich gr : list) {
                Object[] row = new Object[]{gr.getMaGD(), gr.getTenGD(), gr.getSoTk_nguoinhan(), gr.getNoiDung(), gr.getThoigian(), gr.getSoTien(), gr.getSoTien(), gr.isTrangThai()};
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void search(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLNT_NHOM5";
            Connection cn = DriverManager.getConnection(url, Username, Password);
            PreparedStatement ps = cn.prepareStatement(url);
            ResultSet rs = ps.executeQuery("select GiaoDich.MaGD , GiaoDich.TenGD , MaLK , MaTk_NguoiGui , SoTk_NguoiGui , SoTk_NguoiNhan , NoiDung , ThoiGian , SoTien , TrangThai"
                    + " from GiaoDich , GiaoDich "
                    + " where GiaoDich.MaGD = GiaoDich.MaGD ");
            
            ps.setString(1, txtSearch.getText());
            list.clear(); // xóa list đi để lấy dữ liệu từ bảng bỏ vào list
            while (rs.next()) {
                // tạo đối tượng 
                //Student stu = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6),rs.getString(7));
                GiaoDich gr = new GiaoDich();
                // gán dữ liệu vào cho các thuộc tính
                gr.setMaGD(rs.getString(1));
                gr.setTenGD(rs.getString(2));
                gr.setSoTk_nguoinhan(rs.getInt(3));
                gr.setNoiDung(rs.getString(4));
                gr.setThoigian(rs.getString(5));
                gr.setSoTien(rs.getDouble(6));
                gr.setTrangThai(rs.getBoolean(7));
                list.add(gr);

            }
            ps.close();
            cn.close();

            DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
            model.setRowCount(0);
            //2. duyệt qua danh sách sinh viên list, lấy từng sinh viên thêm vào table
            for (GiaoDich gr : list) {
                Object[] row = new Object[]{gr.getMaGD(), gr.getTenGD(), gr.getSoTk_nguoinhan(), gr.getNoiDung(), gr.getThoigian(), gr.getSoTien(), gr.getSoTien(), gr.isTrangThai()};
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showDetails() {
        //1. Lấy ra sinh viên hiện hành dựa vào current
        GiaoDich stu = list.get(current);
        //2. Gán thông tin của sinh viên lên các controls
        txtMaGD.setText(stu.getMaGD());
        txtTenGD.setText(stu.getTenGD());
        txtTenNganHang.setText(stu.getTenNganHang());
        txtSTK.setText(String.valueOf(stu.getSoTK()));
        txtTenNgNhan.setText(stu.getTenNgD());
        txtSTKNhan.setText(String.valueOf(stu.getSoTk_nguoinhan()));
//        txtTrangThai.setText(booleanTrangThai()));
        txtSoTien.setText(String.valueOf(stu.getSoTien()));
        txtTime.setText(stu.getThoigian());
        txtNoiDung.setText(stu.getNoiDung());

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTenNganHang = new javax.swing.JTextField();
        txtSTK = new javax.swing.JTextField();
        txtSTKNhan = new javax.swing.JTextField();
        txtTenNgNhan = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        txtTenGD = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        txtMaGD = new javax.swing.JTextField();
        btnDau = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();

        jTextField5.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lịch sử giao dịch");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã giao dịch:");

        jLabel3.setText("Tên ngân hàng:");

        jLabel4.setText("Số tài khoản:");

        jLabel5.setText("Tên người nhận:");

        jLabel6.setText("Số tài khoản nhận:");

        jLabel7.setText("Tên giao dịch:");

        jLabel8.setText("Trạng thái:");

        jLabel9.setText("Số tiền:");

        jLabel10.setText("Thời gian:");

        jLabel11.setText("Nội dung:");

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(txtMaGD, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenGD, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenNgNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtTenNganHang, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(37, 37, 37)
                                                .addComponent(txtSTK, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSTKNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoTien)
                            .addComponent(txtTime)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtTenGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtTenNganHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txtSTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(txtTenNgNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSTKNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

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

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MaGD", "TenGD", "SoTheThanhToan", "TenNgNhan", "SoTheNgNhan", "ThoiGian", "SoTien", "NoiDung", "TrangThai"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblBang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDau)
                            .addComponent(btnLui)
                            .addComponent(btnTien)
                            .addComponent(btnCuoi)))
                    .addComponent(jScrollPane3))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnDau)
                        .addGap(49, 49, 49)
                        .addComponent(btnLui)
                        .addGap(50, 50, 50)
                        .addComponent(btnTien)
                        .addGap(51, 51, 51)
                        .addComponent(btnCuoi)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        current = tblBang.getSelectedRow();
        showDetails();
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuGiaoDich().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTien;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtMaGD;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtSTK;
    private javax.swing.JTextField txtSTKNhan;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTenGD;
    private javax.swing.JTextField txtTenNgNhan;
    private javax.swing.JTextField txtTenNganHang;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
