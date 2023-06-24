/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.entity.KhoaHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author nhatt
 */
public class Statistic_SyntheticManagement extends javax.swing.JDialog {

    /**
     * Creates new form Statistic_SyntheticManagement
     */
    public Statistic_SyntheticManagement(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    
   ThongKeDAO dao = new ThongKeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();

    void init() {
        setLocationRelativeTo(null);
        fillComboBoxKhoaHoc();
        fillTableBangDiem();
        fillTableLuongNguoiHoc();        
        fillTableDiemChuyenDe();
        
        fillComboBoxNam();
        fillTableDoanhThu();
        
        this.selectTab(0);
        if(!Auth.isManager()){
            tabs.remove(3);
        }
        
        tblBangDiem.getColumnModel().getColumn(0).setMaxWidth(100);
        tblBangDiem.getColumnModel().getColumn(2).setMaxWidth(70);
        tblBangDiem.getColumnModel().getColumn(3).setMaxWidth(120);
        
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblBangDiem.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        
        tblbNguoiHoc.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        tblbNguoiHoc.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblbNguoiHoc.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblbNguoiHoc.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        
        tblDiemChuynDe.getColumnModel().getColumn(0).setMinWidth(250);
        tblDiemChuynDe.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblDiemChuynDe.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblDiemChuynDe.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        tblDiemChuynDe.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        
        tblDoanhThu.getColumnModel().getColumn(0).setMinWidth(250);
        tblDoanhThu.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblDoanhThu.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblDoanhThu.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        tblDoanhThu.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        tblDoanhThu.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
        tblDoanhThu.getColumnModel().getColumn(6).setCellRenderer(cellRenderer);
    }
    
    public void selectTab(int index){
        tabs.setSelectedIndex(index);
    }
    
    void fillComboBoxKhoaHoc(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbKhoaHoc.getModel();
        model.removeAllElements();
        List<KhoaHoc> list = khdao.selectAll();
        for(KhoaHoc kh : list){
            model.addElement(kh);
        }
    }
    void fillTableBangDiem(){
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cbKhoaHoc.getSelectedItem();
        List<Object[]> list = dao.getBangDiem(kh.getMaKH());
        for(Object[] row : list){
            double diem = (double) row[2];
            model.addRow(new Object[]{ row[0], row[1], diem, getXepLoai(diem) });
        }
    }
    String getXepLoai(double diem){
        if(diem < 5){
            return "Chưa đạt";
        }
        if(diem < 6.5){
            return "Trung bình";
        }
        if(diem < 7.5){
            return "Khá";
        }
        if(diem < 9){
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    
    void fillTableLuongNguoiHoc(){
        DefaultTableModel model = (DefaultTableModel) tblbNguoiHoc.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getLuongNguoiHoc();
        for(Object[] row : list){
            model.addRow(row);
        }
    }

    void fillTableDiemChuyenDe() {
        DefaultTableModel model =(DefaultTableModel) tblDiemChuynDe.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getDiemChuyenDe();
        for(Object[] row : list ){
            model.addRow(new Object[]{row[0],row[1],row[2],row[3],row[4]});
        }
    }
            
    void fillComboBoxNam(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List<Integer> list = khdao.selectYears();
        for(Integer year : list){
            model.addElement(year);
        }
    }
    void fillTableDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int nam = (Integer)cboNam.getSelectedItem();
        List<Object[]> list = dao.getDoanhThu(nam);
        for(Object[] row : list){
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbKhoaHoc = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        inBangDiem = new javax.swing.JButton();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbNguoiHoc = new javax.swing.JTable();
        btnInNguoiHoc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiemChuynDe = new javax.swing.JTable();
        btnInDanhSach1 = new javax.swing.JButton();
        btnInDanhSach2 = new javax.swing.JButton();
        btnInDiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        btnInDoanhThu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        jLabel2.setText("KHOÁ HỌC");

        cbKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKhoaHocActionPerformed(evt);
            }
        });

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NH", "HỌ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBangDiem);

        inBangDiem.setText("In bảng điểm");
        inBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inBangDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbKhoaHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inBangDiem)))
                .addContainerGap())
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inBangDiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("BẢNG ĐIỂM", pnlCapNhat);

        tblbNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NĂM", "SỐ NH", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblbNguoiHoc);

        btnInNguoiHoc.setText("In Người học");
        btnInNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInNguoiHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInNguoiHoc))
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnInNguoiHoc))
        );

        tabs.addTab("NGƯỜI HỌC", pnlDanhSach);

        tblDiemChuynDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "SL HV", "ĐIỂM TN", "ĐIỂM CN", "ĐIỂM TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDiemChuynDe);

        btnInDanhSach1.setText("In Doanh Thu");

        btnInDanhSach2.setText("In Doanh Thu");

        btnInDiem.setText("In điểm");
        btnInDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInDiem))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(btnInDanhSach1)
                    .addContainerGap(343, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInDanhSach2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnInDiem))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(btnInDanhSach1)
                    .addContainerGap(248, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInDanhSach2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabs.addTab("ĐIỂM CHUYÊN ĐỀ", jPanel1);

        jLabel3.setText("NĂM");

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KH", "SỐ HV", "D.THU", "HỌC PHÍ CN", "HỌC PHÍ TN", "HỌC PHÍ TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDoanhThu);

        btnInDoanhThu.setText("In Doanh Thu");
        btnInDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInDoanhThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInDoanhThu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnInDoanhThu))
        );

        tabs.addTab("DOANH THU", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKhoaHocActionPerformed
        fillTableBangDiem();
    }//GEN-LAST:event_cbKhoaHocActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        fillTableDoanhThu();
    }//GEN-LAST:event_cboNamActionPerformed

    private void inBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inBangDiemActionPerformed
//        try {
//            printBangDiem();
//        } catch (IOException ex) {
//            Logger.getLogger(Statistic_SyntheticManagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_inBangDiemActionPerformed

    private void btnInNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInNguoiHocActionPerformed
//        printLuongNguoiHoc();
    }//GEN-LAST:event_btnInNguoiHocActionPerformed

    private void btnInDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInDiemActionPerformed
//        printDiemChuyenDe();
    }//GEN-LAST:event_btnInDiemActionPerformed

    private void btnInDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInDoanhThuActionPerformed
//        printDoanhThu();
    }//GEN-LAST:event_btnInDoanhThuActionPerformed

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
            java.util.logging.Logger.getLogger(Statistic_SyntheticManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistic_SyntheticManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistic_SyntheticManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistic_SyntheticManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Statistic_SyntheticManagement dialog = new Statistic_SyntheticManagement(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInDanhSach1;
    private javax.swing.JButton btnInDanhSach2;
    private javax.swing.JButton btnInDiem;
    private javax.swing.JButton btnInDoanhThu;
    private javax.swing.JButton btnInNguoiHoc;
    private javax.swing.JComboBox<String> cbKhoaHoc;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JButton inBangDiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuynDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblbNguoiHoc;
    // End of variables declaration//GEN-END:variables

   
    
}
