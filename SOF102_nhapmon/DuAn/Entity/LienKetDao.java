/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.LienKet;
import DoiTuong.NhaTro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author THI QUI
 */
public class LienKetDao implements QuanLyDao<LienKet, String>{
    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectld_sql;
    String selectall_sql;
    Connections con = new Connections();
    @Override
    public void insert(LienKet entity) {
        int trangthai = (entity.isTrangthai())?1:0;
        insert_sql = "Insert into LienKet values('"+entity.getMaLK()+"', '"+entity.getMaTK()+"', N'"+entity.getTenNganHang()+"', "+entity.getSoThe()+", "+entity.getSoTK()+", "+trangthai+", "+entity.getSoDu()+")";
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(LienKetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Thêm thành công");
    }

    @Override
    public void update(LienKet entity) {
        update_sql = "Update LienKet where MaTK = '"+entity.getMaTK()+"'";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(LienKetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public void delete(LienKet entity) {
        delete_sql = "Delete LienKet where TenNganHang = N'"+entity.getTenNganHang()+"'";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(LienKetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Xóa thành công");
    }

    @Override
    public LienKet Select_ID(String id) {
        LienKet LK = new LienKet();
        selectld_sql = "Select * from LienKet = '"+id+"'";
        try {
            LK = con.getLienKet(selectld_sql);
        } catch (SQLException ex) {
            Logger.getLogger(LienKetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LK;
    }

    @Override
    public List<LienKet> SelectAll() {
        List<LienKet> List = new ArrayList<LienKet>();
        LienKet lk = new LienKet();
        selectall_sql = "Select * from LienKet" ;
        try {
            lk = con.getLienKet(selectall_sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.LienKetDao.SelectAll");
        }
        List.add(lk);
        return List;
    }
    
}
