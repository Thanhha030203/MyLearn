/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.ui;

import PhongKham.dao.ThongKePKDao;
import PhongKham.utils.XJdbc;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Admin
 */
public class ThongKeDV extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeDB
     */
    String path  = null;
    public ThongKeDV() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablehongkedichvu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbothang = new javax.swing.JComboBox<>();
        cbonam = new javax.swing.JComboBox<>();
        cbotrangthai = new javax.swing.JComboBox<>();
        btnIn = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();

        setBackground(new java.awt.Color(93, 167, 219));

        tablehongkedichvu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tablehongkedichvu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablehongkedichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaDV", "Tên DV", "Số Lượng ĐK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablehongkedichvu.setRowHeight(30);
        tablehongkedichvu.setRowMargin(10);
        jScrollPane1.setViewportView(tablehongkedichvu);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("THỐNG KÊ DỊCH VỤ PHÒNG KHÁM");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("30/11/2022");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(481, 481, 481))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(694, 694, 694))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbothang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbothang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbothang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbothangItemStateChanged(evt);
            }
        });

        cbonam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbonam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", " " }));
        cbonam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbonamItemStateChanged(evt);
            }
        });

        cbotrangthai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbotrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Nhiều nhất", "Ít nhất", "Không có" }));

        btnIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnIn.setText("In");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnPDF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPDF.setText("Xuất File PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbotrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnPDF))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbotrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        // TODO add your handling code here:
                 Hashtable map = new Hashtable();
        map.put("manv", "Yta01");
        map.put("tennv", "Nguyen Thanh Ha");
        map.put("gioitinh", "Nữ");
        map.put("chucvu", "Y tá");
         if (cbothang.getSelectedIndex() != 0 &&  cbonam.getSelectedIndex() != 0) {
                path = "src/report/ThongKeDichVu_theothangnam.jrxml";
                map.put("Thang", Integer.parseInt((String) cbothang.getSelectedItem()));
                map.put("Nam", Integer.parseInt((String) cbonam.getSelectedItem()));
                   
            } else if (cbonam.getSelectedIndex() != 0) {
                path = "src/report/ThongKeDichVu_theonam.jrxml";
                map.put("nam", Integer.parseInt((String) cbonam.getSelectedItem()));
                  
            } else {
                path = "src/report/ThongKeDichVu_all.jrxml";
                   
            }
            System.out.println("in pat tại 244  : "+ path);
           JasperReport jas;
            try {
                jas = JasperCompileManager.compileReport(path);
                JasperPrint print = JasperFillManager.fillReport(jas, map, XJdbc.consql());
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                System.out.println("lỗi report 249 " + ex);
            }
    }//GEN-LAST:event_btnInActionPerformed

    private void cbothangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbothangItemStateChanged
        // TODO add your handling code here:
        select();
    }//GEN-LAST:event_cbothangItemStateChanged

    private void cbonamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbonamItemStateChanged
        // TODO add your handling code here:
        select();
    }//GEN-LAST:event_cbonamItemStateChanged

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
        try {
            String thongtin;

            thongtin = "Danh Sách Thống Kê Thuốc";

            MessageFormat header = new MessageFormat(thongtin);
            MessageFormat footer = new MessageFormat("1");           
            tablehongkedichvu.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(DichVuGD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDFActionPerformed
    public void init (){ 
        filltablethongkedichvu();
    }
    ThongKePKDao daothongkephongkham = new ThongKePKDao();
public void filltablethongkedichvu(){ 
    DefaultTableModel model = (DefaultTableModel) tablehongkedichvu.getModel();
    model.setRowCount(0);
    List<Object[]> list = daothongkephongkham.getTKDangKyDV();
    for (Object[] objects : list) {
        model.addRow(objects);
    }
    tablehongkedichvu.setModel(model);
}
  public void select() {
        tablehongkedichvu.clearSelection();
        if (cbothang.getSelectedIndex() != 0 && cbonam.getSelectedIndex() != 0) {
            DefaultTableModel model = (DefaultTableModel) tablehongkedichvu.getModel();
            model.setRowCount(0);
            List<Object[]> list = daothongkephongkham.getTKDangKyDVtheothangnam((String) cbothang.getSelectedItem(), (String) cbonam.getSelectedItem());
            for (Object[] row : list) {
                model.addRow(row);
            }
        } else if (cbonam.getSelectedIndex() != 0) {
            DefaultTableModel model = (DefaultTableModel) tablehongkedichvu.getModel();
            model.setRowCount(0);
            List<Object[]> list = daothongkephongkham.getTKDangKyDVtheonam((String) cbonam.getSelectedItem());
            for (Object[] row : list) {
                model.addRow(row);
            }
        }
        else{ 
            DefaultTableModel model = (DefaultTableModel) tablehongkedichvu.getModel();
            model.setRowCount(0);
            List<Object[]> list = daothongkephongkham.getTKDangKyDV();
            for (Object[] row : list) {
                model.addRow(row);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnPDF;
    private javax.swing.JComboBox<String> cbonam;
    private javax.swing.JComboBox<String> cbothang;
    private javax.swing.JComboBox<String> cbotrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablehongkedichvu;
    // End of variables declaration//GEN-END:variables
}
