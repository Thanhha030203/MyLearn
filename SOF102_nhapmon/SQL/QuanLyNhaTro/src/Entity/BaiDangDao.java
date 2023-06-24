/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.BaiDang;
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
public class BaiDangDao implements QuanLyDao<BaiDang, String>{
    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    String selectall_sql;
    Connections con = new Connections();

    @Override
    public void insert(BaiDang entity) {
        insert_sql = "Insert into BaiDang values ('"+entity.getMaTK()+"', N'"+entity.getNoiDung()+"', N'"+entity.getHinhAnh()+"', '"+entity.getNgayDang()+"', N'"+entity.getND_danhGia()+"')";
        
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(BaiDangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Thêm thành công");
    }

    @Override
    public void update(BaiDang entity) {
        update_sql = "Update BaiDang set NoiDung = N'"+entity.getNoiDung()+"', HinhAnh = "+entity.getHinhAnh()+"', NgayDang = "+entity.getNgayDang()+"', ND_danhGia = "+entity.getND_danhGia()+"' where MaTK = '"+entity.getMaTK()+"'  ";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(BaiDangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public void delete(BaiDang entity) {
        delete_sql = "Delete BaiDang where MaTK = '"+entity.getMaTK()+"' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(BaiDangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public BaiDang Select_ID(String id) {
        BaiDang bd = new BaiDang();
        selectid_sql = "Select * from BaiDang = '"+id+"'";
        try {
            con.getResult(selectid_sql);
        } catch (SQLException ex) {
            Logger.getLogger(BaiDangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        return bd;
    }

    @Override
    public List<BaiDang> SelectAll() {
        List<BaiDang> list = new ArrayList<BaiDang>();
        BaiDang bd = new BaiDang();
        selectall_sql = "select * from BaiDang";
        try {
            con.getResult(selectall_sql);
        } catch (SQLException ex) {
            Logger.getLogger(BaiDangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(bd);
        return list;
    }
}
