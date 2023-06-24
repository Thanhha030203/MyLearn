
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class QuanLyNhanVien extends javax.swing.JFrame {
DefaultTableModel tblModel;
List<NhanVien> list = new ArrayList<>();
private int index = -1;
private static final String Email = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)+\\.([a-z\\.]{2,6})$";//huyen@fpt.edu.vn
// ^[A-Za-z0-9_.]{6,32}@([a-zA-Z0-9]{2,12})(.[a-zA-Z]{2,12})+$
    
    public QuanLyNhanVien() throws IOException {
        initComponents();
        ngayh();
        setLocationRelativeTo(null);
        writefile();
        initTable();
    }

    public QuanLyNhanVien(JLabel lblDongHo) {
        this.lblDongHo = lblDongHo;
    }
    
  
    public void initTable(){
        tblModel = (DefaultTableModel)tblNhanVien.getModel();
        // tạo cột
        tblModel.setColumnIdentifiers(new String[]{"MÃ","HỌ VÀ TÊN","TUỔI","EMAIL","LƯƠNG"});
    }
    public void writefile() throws IOException{ 
       NhanVien [] data = {new NhanVien("NV01","Ngo Ngoc Huy","huy02@gmail.com",12000,18),
        new NhanVien("NV02","Nguyen Ngoc Huyen","huyen12@gmail.com",20000,18),
        new NhanVien("NV03","Nguyen Van Duc","duc08@gmail.com",40000,22),
        new NhanVien("NV04","Nguyen Thanh Ha","ha02@gmail.com",20000,19)};
        FILE.writeObject("danhsach.dat",data);
      
    }
    public void fillTable(){
        tblModel.setRowCount(0);
        for(NhanVien nv : list){
            tblModel.addRow(new Object[]{nv.getMa(),nv.getHoTen(),nv.getTuoi(),nv.getEmail(),nv.getLuong()});
        }
    }
    public void clearForm(){
        txtHoTen.setText("");
        txtLuong.setText("");
        txtMNV.setText("");
        txtMail.setText("");
        txtTuoi.setText("");
        index = -1;
    }
    
    public NhanVien readForm(){
        return new NhanVien(txtMNV.getText(),txtHoTen.getText(),txtMail.getText(),Double.parseDouble(txtLuong.getText()),Integer.valueOf(txtTuoi.getText()));
    }
    // ==========================================================
    // thêm nhân viên
    public void themNV(){
        if(validateForm()){
            
        if( index == -1){
            list.add(readForm());
            fillTable();
            JOptionPane.showMessageDialog(this, "Thêm thành công nhân viên");
        }
        else{
            capNhat(readForm());
            fillTable();
            JOptionPane.showMessageDialog(this,"Cập nhật thành công");
        }
       } 
    }
    // 
    public NhanVien timTheoMa(String ID){
        for(NhanVien nv: list){
            if(nv.getMa().equalsIgnoreCase(ID)){
                return nv;
            }
        }
        return null;
    }
    
    // cập nhật
    public void capNhat(NhanVien newnv){
        
//lấy mã newnv so với mã nvcux và ktra có trùng ko
    if(validateForm()){
         NhanVien nv1  =  timTheoMa((String) newnv.getMa());
        if(nv1 != null){
            nv1.setHoTen(newnv.getHoTen());
            nv1.setTuoi(newnv.getTuoi());
            nv1.setEmail(newnv.getEmail());
            nv1.setLuong(newnv.getLuong());
        }
    }
       
    }
   
    public String thongTinBanGhi(){
        return "Record: "+ (index +1)+ " of " +list.size();
    }
    public void fillNhanVienLenForm(int index){
        txtMNV.setText( list.get(index).getMa());
        txtHoTen.setText( list.get(index).getHoTen());
        txtMail.setText( list.get(index).getEmail());
        txtLuong.setText(String.valueOf(list.get(index).getLuong()));
        txtTuoi.setText(String.valueOf(list.get(index).getTuoi()));
    }
    
    public void fillEmployeeUpForm(NhanVien nv) { 
        txtMNV.setText( nv.getMa());
        txtHoTen.setText( nv.getHoTen());
        txtTuoi.setText(String.valueOf(nv.getTuoi()));
        txtMail.setText( nv.getEmail());
        txtLuong.setText(String.valueOf(nv.getLuong()));
    }

    public void xoaNhanVien(){
//        int index=0;
//        list.remove(index);
//        fillTable();
//        clearForm();
//        JOptionPane.showMessageDialog(this,"Xóa nhân viên thành công");
          if(index == -1){
              JOptionPane.showMessageDialog(this, "Chọn đối tượng để xóa!");
              
          }else{
              list.remove(index);
              fillTable();
              clearForm();
              JOptionPane.showMessageDialog(this, "Đã xóa thành công");
              
          }
    }
    public void fillNhanVienLenForm(NhanVien nv){
        txtMNV.setText( nv.getMa());
        txtHoTen.setText( nv.getHoTen());
        txtMail.setText( nv.getEmail());
        txtLuong.setText(String.valueOf(nv.getLuong()));
        txtTuoi.setText(String.valueOf(nv.getTuoi()));
    }
//    public void updatenv(){
//        tblNhanVien.setRowSelectionInterval(index, index);
//        fillNhanVienLenForm(index);
//        lblBanGhi.setText(thongTinBanGhi());
//    }
    public void first(){
       if( list.size() != 0){
            index = 0;
            tblNhanVien.setRowSelectionInterval(index, index);
            fillNhanVienLenForm(index);
            lblBanGhi.setText(thongTinBanGhi());
       }
        
    }
    
    public void lastNV(){
        if( list.size() != 0){
        index = list.size()-1;
        tblNhanVien.setRowSelectionInterval(index, index);
        fillNhanVienLenForm(index);
        lblBanGhi.setText(thongTinBanGhi());
    }}
    public void preNV(){
        if( list.size() != 0){
        if(index == 0){
            lastNV();
        }else{
            index --;
            
            tblNhanVien.setRowSelectionInterval(index, index);
            fillNhanVienLenForm(index);
            lblBanGhi.setText(thongTinBanGhi());
        }
        }
        
    }
    public void nextNV(){
        if(index == list.size()-1){
            first();
        }else{
            index ++;
            tblNhanVien.setRowSelectionInterval(index, index);
            fillNhanVienLenForm(index);
            lblBanGhi.setText(thongTinBanGhi());
        }
        
    }
    
    // validate kiểm tra ng dùng ko nhập mã, tên mail, tuổi lương
    public boolean validateForm(){
        if(txtMNV.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã nhân viên");
            return false;
        }
        if(txtHoTen.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập họ tên");
            return false;
        }
        // validate tuôi
        if(txtTuoi.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tuổi");
            return false;
        }
        
        try{
            //ép kiểu
        Integer.parseInt(txtTuoi.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Tuổi phải là số");
            return false;
        }
        if(txtMail.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập email");
            return false;
        }
        // nhập đúng định dạng email
        Matcher matcher = Pattern.compile(Email).matcher(txtMail.getText());
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(this,"Email sai định dạng");
            return false;
        }
        if(txtLuong.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập lương");
            return false;
        }
        try{
            //ép kiểu
        Double.parseDouble(txtLuong.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Lương phải là số","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    //đọc file
    public void readFile(){
    try {
         NhanVien [] nv = FILE.readObject("danhsach.dat");
         for(int i=0; i<nv.length;i++){ 
             list.add(nv[i]);
         }
        fillTable();
    } catch (Exception e) {
        System.out.println("Lỗi tại readfile"+ e.getMessage());
    } 
    }
    
    // luu file
    public void saveFile(){
    try {
        FILE.writeObject("danhsachnv.data", list);
        JOptionPane.showMessageDialog(this, "Saved");
    } catch (Exception e) {
        e.printStackTrace(); 
    }
    }
    
    // xử lí đa luồng
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtMNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        txtMail = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblBanGhi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLasst = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblDongHo = new javax.swing.JLabel();
        tt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("EMAIL");

        jLabel6.setText("LUONG");

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblBanGhi.setText("Record: 1 of 10");

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        btnLasst.setText(">|");
        btnLasst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLasstActionPerformed(evt);
            }
        });

        jLabel2.setText("MÃ NHÂN VIÊN");

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jLabel3.setText("HỌ VÀ TÊN");

        jLabel4.setText("TUỔI");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addGap(18, 18, 18)
                .addComponent(btnOpen)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblDongHo.setText("dong ho");

        tt.setText("jLabel7");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(623, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addComponent(txtMNV, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(btnLasst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTuoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblBanGhi)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst)
                        .addComponent(btnPrev)
                        .addComponent(btnNext)
                        .addComponent(btnLasst)
                        .addComponent(lblBanGhi))
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        preNV();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        nextNV();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLasstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLasstActionPerformed
        // TODO add your handling code here:
        lastNV();
    }//GEN-LAST:event_btnLasstActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked

        // TODO add your handling code here:
        index = tblNhanVien.getSelectedRow();
        fillNhanVienLenForm(index);
        lblBanGhi.setText(thongTinBanGhi());
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        themNV();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        xoaNhanVien();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        if(timTheoMa(txtMNV.getText()) == null){
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên");
        } else {
            fillNhanVienLenForm(timTheoMa(txtMNV.getText()));
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
//        try {
//                    list.forEach(index->{ 
//            System.out.println(this.index);
//        });
          readFile();// đọc ghi file
//        fillTable();
//        } catch (Exception e) {
//            System.out.println("lỗi mở file");
//        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        saveFile();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
        int f = file.showOpenDialog(null);
       
        if(f == JFileChooser.APPROVE_OPTION){ 
            File fi = file.getSelectedFile();
            String path = fi.getName();
            tt.setIcon(new ImageIcon(path));
            tt.setSize(100,100);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void ngayh(){ 
   showClock s = new showClock();
   Thread th = new Thread(s);
   th.start();
}
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
            java.util.logging.Logger.getLogger(qlnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyNhanVien().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLasst;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanGhi;
    public javax.swing.JLabel lblDongHo;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JLabel tt;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMNV;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
