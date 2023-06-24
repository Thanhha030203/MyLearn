/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.DanhGia;
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
public class DanhGiaDao implements QuanLyDao<DanhGia, String>{
    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    String selectall_sql;
    Connections con = new Connections();
    @Override
    public void insert(DanhGia entity) {
        insert_sql = "Insert into DanhGia values ('"+entity.getMaDanhGi()+"', '"+entity.getMa_NGD()+"', N'"+entity.getMaNT()+"', '"+entity.getNoiDung()+"')";
        
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DanhGiaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Thêm thành công");
    }

    @Override
    public void update(DanhGia entity) {
        update_sql = "Update DanhGia set Ma_NGD = N'"+entity.getMa_NGD()+"', MaTN = "+entity.getMaNT()+"', NoiDung = "+entity.getNoiDung()+"' where MaDanhGi = '"+entity.getMaDanhGi()+"'  ";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DanhGiaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public void delete(DanhGia entity) {
        delete_sql = "Delete DanhGia where MaDanhGi = '"+entity.getMaDanhGi()+"' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DanhGiaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public DanhGia Select_ID(String id) {
      DanhGia dg = new DanhGia();
        selectid_sql = "Select * from DanhGia = '"+id+"'";
        try {
            con.getDanhGia(selectid_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DanhGiaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        return dg;  
    }

    @Override
    public List<DanhGia> SelectAll() {
        List<DanhGia> list = new ArrayList<DanhGia>();
        DanhGia dg = new DanhGia();
        selectall_sql = "select * from DanhGia";
        try {
            con.getDanhGia(selectall_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DanhGiaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(dg);
        return list;
    }
    
}
