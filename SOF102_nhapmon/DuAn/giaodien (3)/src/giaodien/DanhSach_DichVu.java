/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.security.util.Password;

/**
 *
 * @author minhc
 */
public class DanhSach_DichVu extends javax.swing.JFrame {
ArrayList<khachhang> list = new ArrayList<>(); 
    DefaultTableModel Model;
    int current = 0; 
    int index = -1;
    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLNT";
    String User = "sa1";
    String Password = "123";
    /**
     * Creates new form dichvu
     */
    public DanhSach_DichVu() {
        initComponents();
        setLocationRelativeTo(null);
        load_data();
    }

    public void load_data() {
        try {
 
            Connection cn = DriverManager.getConnection(connectionUrl, User, Password);
            PreparedStatement ps = cn.prepareStatement("select * from DichVu");
            ResultSet rs = ps.executeQuery();
            list.clear();
            while (rs.next()) {
                khachhang kh = new khachhang();
                kh.setMaNha(rs.getString(1));
                kh.setTennhatro(rs.getString(2));
                kh.setDiachi(rs.getString(3));
                kh.setDientich(rs.getString(4));
                kh.setNguoilienhe(rs.getString(5));
                kh.setMota(rs.getString(6));
                kh.setHinhanh(rs.getString(7));
                kh.setDanhgia(rs.getString(8));
                kh.setLike(rs.getString(9));
                kh.setTrangthai(rs.getString(10));
                kh.setLoainha(rs.getString(11));
                kh.setGia(rs.getDouble(12));

                list.add(kh);
            }
            ps.close();
            cn.close();
            
            DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
            model.setRowCount(0);
            for(khachhang kh:list){
                Object[] row = new Object[]{kh.getMaNha(), kh.getTennhatro(), kh.getDiachi(), kh.getDientich(), kh.getNguoilienhe(), kh.getMota(), kh.getHinhanh(), kh.getDanhgia(), kh.getLike(), kh.getTrangthai(), kh.getLoainha(), kh.getGia()};
                        model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
//    public void fillTable(){
//        Model.setRowCount(0);
//        for(khachhang kh : list){
//            Model.addRow(new Object[]{kh.getMaNha(), kh.getTennhatro(), kh.getDiachi(), kh.getDientich(), kh.getNguoilienhe(), kh.getMota(), kh.getGia(), kh.getTrangthai(), kh.getLoainha()});
//        }
//    }
    
     public void update(){
        
    }
    
    public khachhang timKiemID(String ID){
        for(khachhang kh : list){
            if(kh.getMaNha().equalsIgnoreCase(ID)){
                return kh;
            }
        }
        return null;
    }
    
    public void them(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection cn = DriverManager.getConnection(connectionUrl, User, Password);
            PreparedStatement ps = cn.prepareStatement("insert into DichVu values(?,?,?,?,?,?,?,?,?) ");
            ps.setString(2,txtMaNha.getText());
            ps.setString(3,txtTenNha.getText());
            ps.setString(4,txtDiaChi.getText());
            ps.setString(5, txtDienTich.getText());
            ps.setString(6, txtNgLienHe.getText());
            ps.setString(7, txtMoTa.getText());            
            ps.setString(8,txtGiaPhong.getText());
            ps.setString(9, (String) cboTrangThai.getSelectedItem());
            ps.setString(9, (String) cboChungCu.getSelectedItem());
            
            int kq = ps.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công.");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại.");
            }
            
            ps.close();
            cn.close();
            
            this.load_data();
        } catch (Exception e) {
        }
    }
public void xoa(){
                try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection cn = DriverManager.getConnection(connectionUrl, User, Password);
            PreparedStatement ps = cn.prepareStatement("delete from DichVu where MaNha = ? ");
          
            ps.setString(1, txtMaNha.getText());

            
            int kq = ps.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công.");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại.");
            }
         
            ps.close();
            cn.close();
       
            this.load_data();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xóa Không Thành Công.");
            e.printStackTrace();
        }
    }
    
    public void fillKhachHangLenForm(int index){
        txtMaNha.setText(list.get(index).getMaNha());
        txtTenNha.setText(list.get(index).getTennhatro());
        txtNgLienHe.setText(list.get(index).getNguoilienhe());
        txtDienTich.setText(list.get(index).getDientich());
        txtDiaChi.setText(list.get(index).getDiachi());
        txtGiaPhong.setText(String.valueOf(list.get(index).getGia()));
        txtMoTa.setText(list.get(index).getMota());
    }
    
    public void fillKhachHangLenForm(khachhang kh){
        txtMaNha.setText(kh.getMaNha());
        txtTenNha.setText(kh.getTennhatro());
        txtNgLienHe.setText(kh.getNguoilienhe());
        txtDienTich.setText(kh.getDientich());
        txtDiaChi.setText(kh.getDiachi());
        txtGiaPhong.setText(String.valueOf(kh.getGia()));
        txtMoTa.setText(kh.getMota());
    }
    
    public void dauTien(){
        index = 0;
        updeteM();
    }

    private void updeteM() {
        tblBang.setRowSelectionInterval(index, index);
        fillKhachHangLenForm(index);
    }
    public void truocDo(){
        index = list.size() - 1;
        updeteM();
    }
    public void tiepTheo(){
        if(index == 0){
            truocDo();
        }else{
            index --;
        }
        updeteM();
    }
    public void cuoiCung(){
        if(index == list.size() - 1){
            dauTien();
        }else{
            index ++;
        }
        updeteM();
    }
    
    public boolean validateForm(){
        if(txtMaNha.getText().equals("")){
            JOptionPane.showMessageDialog(this, "CHUA NHAP MaNha");
            return false;
        }
        
        if(txtTenNha.getText().equals("")){
            JOptionPane.showMessageDialog(this, "CHUA NHAP TEN nha");
            return false;
        }
        
        if(txtNgLienHe.getText().equals("")){
            JOptionPane.showMessageDialog(this, "CHUA NHAP NGUOI LIEN HE");
            return false;
        }
        try {
            Integer.parseInt(txtGiaPhong.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "GIA PHONG PHAI LA SO!");
            return false;
        }
        
        if(txtDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "CHUA NHAP EMAIL");
            return false;
        }
        
        if(txtDienTich.getText().equals("")){
            JOptionPane.showMessageDialog(this, "CHUA NHAP DIEN TICH");
            return false;
        }
        
        if(txtMoTa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "CHUA NHAP MO TA");
            return false;
        }
        return true;
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHinhAnh = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNha = new javax.swing.JTextField();
        cboChungCu = new javax.swing.JComboBox<>();
        txtTenNha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNgLienHe = new javax.swing.JTextField();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDienTich = new javax.swing.JTextField();
        txtGiaPhong = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();
        btnTruoc = new javax.swing.JButton();
        btnTiep = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Mã nhà:");

        jLabel4.setText("Loại nhà:");

        jLabel5.setText("Tên nhà:");

        txtHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodien/icon/apartment.png"))); // NOI18N

        javax.swing.GroupLayout txtHinhAnhLayout = new javax.swing.GroupLayout(txtHinhAnh);
        txtHinhAnh.setLayout(txtHinhAnhLayout);
        txtHinhAnhLayout.setHorizontalGroup(
            txtHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtHinhAnhLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txtHinhAnhLayout.setVerticalGroup(
            txtHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtHinhAnhLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cboChungCu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chung cư", "lầu1", "phòng trọ", "ký túc xá" }));
        cboChungCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChungCuActionPerformed(evt);
            }
        });

        txtTenNha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNhaActionPerformed(evt);
            }
        });

        jLabel6.setText("Người liên hệ:");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "trạng thái", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Diện tích:");

        jLabel8.setText("Gía phòng:");

        jLabel9.setText("Địa chỉ:");

        jLabel10.setText("Mô tả:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodien/icon/like.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodien/icon/dislike.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodien/icon/chat.png"))); // NOI18N

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane3.setViewportView(txtMoTa);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaNha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNgLienHe)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboChungCu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenNha))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtDiaChi))))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtMaNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboChungCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNgLienHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách dịch vụ của tôi");

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhà", "loại nhà", "tên nhà trọ", "địa chỉ", "giá", "diện tích", "mô tả", "người liên hệ", "hình ảnh", "đánh giá", "like", "trạng thái"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBang);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnDau.setText("|<<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnTruoc.setText("<");
        btnTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruocActionPerformed(evt);
            }
        });

        btnTiep.setText(">");
        btnTiep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepActionPerformed(evt);
            }
        });

        btnCuoi.setText(">>|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnTiep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTruoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDau))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDau)
                            .addComponent(btnThem))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(btnTruoc))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnTiep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCuoi)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMoi)
                                .addGap(44, 44, 44)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenNhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNhaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTenNhaActionPerformed

    private void cboChungCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChungCuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChungCuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
        this.load_data();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.them();
        this.load_data();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.xoa();
        this.load_data();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        txtMaNha.setText("");
        txtMoTa.setText("");
        txtGiaPhong.setText("");
        txtDiaChi.setText("");
        txtTenNha.setText("");
        txtDienTich.setText("");
        txtNgLienHe.setText("");
        
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        int index = tblBang.getSelectedRow();
        fillKhachHangLenForm(index);
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        // TODO add your handling code here:
        this.cuoiCung();
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        // TODO add your handling code here:
        this.dauTien();
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruocActionPerformed
        // TODO add your handling code here:
        this.truocDo();
    }//GEN-LAST:event_btnTruocActionPerformed

    private void btnTiepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepActionPerformed
        // TODO add your handling code here:
        this.tiepTheo();
    }//GEN-LAST:event_btnTiepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(timKiemID(txtMaNha.getText()) == null){
            JOptionPane.showMessageDialog(this, "tim ko thay nv!");
        }else{
            fillKhachHangLenForm(timKiemID(txtMaNha.getText()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSach_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSach_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSach_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSach_DichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSach_DichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiep;
    private javax.swing.JButton btnTruoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChungCu;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienTich;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JPanel txtHinhAnh;
    private javax.swing.JTextField txtMaNha;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtNgLienHe;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNha;
    // End of variables declaration//GEN-END:variables

} 

