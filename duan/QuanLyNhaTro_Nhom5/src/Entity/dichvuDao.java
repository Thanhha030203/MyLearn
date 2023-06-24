/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.DichVu;
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
public class dichvuDao implements QuanLyDao<DichVu,String>{
    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    String selectall_sql;
    Connections con = new Connections();
    @Override
    public void insert(DichVu entity) {
        insert_sql = "Insert into dichvu values ('"+entity.getMaDV()+"', '"+entity.getTenDV()+"', N'"+entity.getPhiDV()+"', '"+entity.getNgayPhatHanh()+"', '"+entity.getHanKetThuc()+"')";
        
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(dichvuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Thêm thành công");
    }

    @Override
    public void update(DichVu entity) {
        update_sql = "Update DichVu set TenDV = N'"+entity.getTenDV()+"', PhiDV = "+entity.getPhiDV()+"', NgayPhatHanh = "+entity.getNgayPhatHanh()+"', HanKetThuc = "+entity.getHanKetThuc()+"' where MaDV = '"+entity.getMaDV()+"'  ";
        try {
            con.getResult(update_sql);
            JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        } catch (SQLException ex) {
            Logger.getLogger(dichvuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(DichVu entity) {
        delete_sql = "Delete from DichVu where MaDV = '"+entity.getMaDV()+"' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(dichvuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        
    }

    @Override
    public DichVu Select_ID(String id) {
        DichVu dv = new DichVu();
        selectid_sql = "Select * from DichVu dv inner join DichVu_HoTro ht  on dv.MADV = ht.MADV and ht.MADV= '"+id+"'";
        try {
            dv =con.getDichVu(selectid_sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại Entity.dichvuDao.selectID "+ex);
        }
        //JOptionPane.showMessageDialog(null,"Than");
        return dv;
    }

    @Override
    public List<DichVu> SelectAll() {
        List<DichVu> list = new ArrayList<DichVu>();
        DichVu dv = new DichVu();
        selectall_sql = "select * from DichVu";
        try {
            dv = con.getDichVu(selectall_sql);
        } catch (SQLException ex) {
            Logger.getLogger(dichvuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(dv);
        return list;
    }
    
}
