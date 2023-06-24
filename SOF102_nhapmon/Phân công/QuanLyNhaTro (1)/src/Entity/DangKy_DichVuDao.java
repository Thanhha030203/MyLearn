/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.DangKy_DichVu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author minhc
 */
public class DangKy_DichVuDao implements QuanLyDao <DangKy_DichVu, String>{
    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    String selectall_sql;
    Connections con = new Connections();
    @Override
    public void insert(DangKy_DichVu entity) {
        insert_sql = "Insert into DangKy_DichVu values ('"+entity.getMaDV()+"', '"+entity.getMaTK()+"', '"+entity.getNgayDangKy()+"', '"+entity.getThoiHan()+"', '"+entity.isTrangThaiDangKy()+"')";
        
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Thêm thành công");
    }

    @Override
    public void update(DangKy_DichVu entity) {
        update_sql = "Update DichVu set MaTK = '"+entity.getMaTK()+"', NgayDangKy = '"+entity.getNgayDangKy()+"', ThoiHan_Thang = '"+entity.getThoiHan()+"', TrangThaiDangKy = '"+entity.isTrangThaiDangKy()+"'where MaDV = '"+entity.getMaDV()+"'  ";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public void delete(DangKy_DichVu entity) {
        delete_sql = "Delete DangKy_DichVu where MaDV = '"+entity.getMaDV()+"' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        
    }

    @Override
    public DangKy_DichVu Select_ID(String id) {
        DangKy_DichVu dk = new DangKy_DichVu();
        selectid_sql = "Select * from DichVu = '"+id+"'";
        try {
            con.getDangKy_DichVu(selectid_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        return dk;
    }

    @Override
    public List<DangKy_DichVu> SelectAll() {
        List<DangKy_DichVu> list = new ArrayList<DangKy_DichVu>();
        DangKy_DichVu dk = new DangKy_DichVu();
        selectall_sql= "select * from DangKy_DichVu";
        try {
            con.getDangKy_DichVu(selectall_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(dk);
        return list;
    }



    
}
