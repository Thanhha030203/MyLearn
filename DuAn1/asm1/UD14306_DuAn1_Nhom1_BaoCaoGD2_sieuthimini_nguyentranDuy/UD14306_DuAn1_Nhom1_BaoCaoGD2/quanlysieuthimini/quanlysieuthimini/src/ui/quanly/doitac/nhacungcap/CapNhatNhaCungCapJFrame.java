/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.quanly.doitac.nhacungcap;

import dao.NhaCungCapDAO;
import helper.DialogHelper;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import model.NhaCungCap;


/**
 *
 * @author Administrator
 */
public class CapNhatNhaCungCapJFrame extends javax.swing.JFrame {

    private static NhaCungCap model;
    
    /**
     * Creates new form CapNhatNhaCungCapJFrame
     */
    public CapNhatNhaCungCapJFrame(NhaCungCap model) {
        initComponents();
        this.model = model;
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

        lbl_MaNhaCungCap = new javax.swing.JLabel();
        txt_MaNhaCungCap = new javax.swing.JTextField();
        lbl_TenNhaCungCap = new javax.swing.JLabel();
        txt_TenNhaCungCap = new javax.swing.JTextField();
        lbl_DienThoai = new javax.swing.JLabel();
        txt_DienThoai = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        lbl_TrangThai = new javax.swing.JLabel();
        lbl_GhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_GhiChu = new javax.swing.JTextArea();
        lbl_DiaChi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_DiaChi = new javax.swing.JTextArea();
        cmb_TrangThai = new javax.swing.JComboBox<>();
        btn_NhapLai = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CẬP NHẬT NHÀ CUNG CẤP");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 520));

        lbl_MaNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_MaNhaCungCap.setForeground(new java.awt.Color(0, 0, 153));
        lbl_MaNhaCungCap.setText("Mã nhà cung cấp");

        txt_MaNhaCungCap.setEditable(false);
        txt_MaNhaCungCap.setBackground(new java.awt.Color(255, 255, 204));
        txt_MaNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_TenNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TenNhaCungCap.setForeground(new java.awt.Color(0, 0, 153));
        lbl_TenNhaCungCap.setText("Tên nhà cung cấp");

        txt_TenNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_DienThoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_DienThoai.setForeground(new java.awt.Color(0, 0, 153));
        lbl_DienThoai.setText("Điện thoại");

        txt_DienThoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(0, 0, 153));
        lbl_Email.setText("Email");

        lbl_TrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TrangThai.setForeground(new java.awt.Color(0, 0, 153));
        lbl_TrangThai.setText("Trạng thái");

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
        jScrollPane2.setViewportView(txa_DiaChi);

        cmb_TrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_TrangThai.setForeground(new java.awt.Color(0, 0, 153));
        cmb_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang giao dịch", "Ngưng giao dịch" }));

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

        btn_CapNhat.setBackground(new java.awt.Color(255, 51, 0));
        btn_CapNhat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btn_CapNhat.setText("CẬP NHẬT");
        btn_CapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CapNhatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CapNhatMouseExited(evt);
            }
        });
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmb_TrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_MaNhaCungCap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txt_MaNhaCungCap)
                    .addComponent(lbl_TenNhaCungCap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_DienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TenNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(lbl_TrangThai, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_CapNhatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseEntered
        // TODO add your handling code here:
        btn_CapNhat.setBackground(Color.yellow);
        btn_CapNhat.setForeground(Color.blue);
        btn_CapNhat.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_CapNhatMouseEntered

    private void btn_CapNhatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseExited
        // TODO add your handling code here:
        btn_CapNhat.setBackground(new Color(255, 51, 0));
        btn_CapNhat.setForeground(Color.white);
    }//GEN-LAST:event_btn_CapNhatMouseExited

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
        capnhatNCC();
    }//GEN-LAST:event_btn_CapNhatActionPerformed

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
            java.util.logging.Logger.getLogger(CapNhatNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhaCungCapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CapNhatNhaCungCapJFrame(model).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_NhapLai;
    private javax.swing.JComboBox<String> cmb_TrangThai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_DienThoai;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_GhiChu;
    private javax.swing.JLabel lbl_MaNhaCungCap;
    private javax.swing.JLabel lbl_TenNhaCungCap;
    private javax.swing.JLabel lbl_TrangThai;
    private javax.swing.JTextArea txa_DiaChi;
    private javax.swing.JTextArea txa_GhiChu;
    private javax.swing.JTextField txt_DienThoai;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MaNhaCungCap;
    private javax.swing.JTextField txt_TenNhaCungCap;
    // End of variables declaration//GEN-END:variables

    NhaCungCapDAO NCCDAO = new NhaCungCapDAO();
    
    /*
     * Hàm khởi tạo các giá trị ban đầu cho JFrame
     */
    void inIt() {
        this.setSize(530,520);
        this.setMinimumSize(new Dimension(530, 520));
        this.setMaximumSize(new Dimension(530, 520));
        setResizable(false);
        setLocationRelativeTo(null);
        doThongTin();
    }
    
    /*
     * Hàm tự động đổ thông tin NCC lên textfield
     */
    void doThongTin(){
        txt_MaNhaCungCap.setText(model.getMaNCC().trim());
        txt_TenNhaCungCap.setText(model.getTenNCC().trim());
        txt_DienThoai.setText(model.getDienThoai().trim());
        txt_Email.setText(model.getEmail().trim());
        txa_DiaChi.setText(model.getDiaChi());
        if(model.getTrangThai())
            cmb_TrangThai.setSelectedIndex(0);
        else
            cmb_TrangThai.setSelectedIndex(1);
        txa_GhiChu.setText(model.getGhiChu());
    }
    
    /*
     * Hàm xoá thông tin trên textfield để nhập lại
     */
    void xoaThongTin(){
        txt_TenNhaCungCap.setBackground(Color.white);
        txt_DienThoai.setBackground(Color.white);
        txt_Email.setBackground(Color.white);
        txa_DiaChi.setBackground(Color.white);
        txa_GhiChu.setBackground(Color.white);
        doThongTin();
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
            else if(!NCCDAO.kiemSDT(SDT) && !SDT.equalsIgnoreCase(model.getDienThoai())){
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
            if(!NCCDAO.kiemEmail(email) && !email.equalsIgnoreCase(model.getEmail())){
                DialogHelper.alert(this, "Email đã tồn tại");
                return false;
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi: " + e.toString());
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
     * Hàm check ghi chú
     */
    boolean checkGhiChu(){
        if(txa_GhiChu.getText().isEmpty()){
            return false;
        }
        else
            return true;
    }
    
    /*
     * Hàm cập nhật NCC vào database
          sau khi thêm thì close frame này
     */
    void capnhatNCC(){
        try {
            if(kiemLoi()){
                NhaCungCap model = taoModel();
                int rs = NCCDAO.capnhatNCC(model);
                if(rs != 0){
                    DialogHelper.alert(this, "Cập nhật thành công");
                    this.dispose();
                    if(capnhatFrameDSNCC()){
                        new DanhSachNhaCungCapJFrame().setVisible(true);
                    }
                }
                else {
                    DialogHelper.alert(this, "Cập nhật thất bại");
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
     * Hàm kiểm tra tên NCC
     */
    boolean checkTenNCC(){
        String pattern = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ\\s]+$";
        if(!txt_TenNhaCungCap.getText().matches(pattern)){
            return false;
        }
        return true;
    }
    
    /*
     * Hàm kiểm lỗi trước khi thêm NCC
     */
    boolean kiemLoi(){
        if(!checkDiaChi() || !checkEmail() || !checkDienThoai() || !checkTenNCC() || !checkGhiChu())
            return false;
        return true;
    }
    
    /*
     * Hàm tạo model NCC để đưa lên database
     */
    NhaCungCap taoModel(){
        NhaCungCap model = new NhaCungCap();
        model.setMaNCC(txt_MaNhaCungCap.getText());
        model.setTenNCC(txt_TenNhaCungCap.getText());
        model.setDienThoai(txt_DienThoai.getText());
        model.setEmail(txt_Email.getText());
        model.setDiaChi(txa_DiaChi.getText());
        model.setGhiChu(txa_GhiChu.getText());
        model.setTrangThai(true);
        return model;
    }
    
    /*
     * Hàm reload lại frame DANH SÁCH NCC để cập nhật NCC mới
     */
    boolean capnhatFrameDSNCC(){
        Frame[] listFrames = Frame.getFrames();
        for (Frame fr : listFrames) {
            String tenFrame = fr.getClass().getName();
            if (tenFrame.equalsIgnoreCase("ui.quanly.doitac.nhacungcap.DanhSachNhaCungCapJFrame")) {
                fr.dispose();
                return true;
            }
        }
        return false;
    }    
}
