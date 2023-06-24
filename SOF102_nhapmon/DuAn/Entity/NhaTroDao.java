/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
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
public class NhaTroDao implements QuanLyDao<NhaTro, String> {
    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectld_sql;
    String selectall_sql;
    Connections con = new Connections();
    @Override
    public void insert(NhaTro entity) {
        insert_sql = "Insert into NhaTro values('"+entity.getMaNT()+"', N'"+entity.getTenNT()+"', N'"+entity.getDiaChi()+"', '"+entity.getDientich()+"', N'"+entity.getMaLoai()+"')";
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(NhaTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Thêm thành công");
    }

    @Override
    public void update(NhaTro entity) {
        update_sql = "Update NhaTro Where DienTich = '"+entity.getDientich()+"'";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(NhaTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
    }

    @Override
    public void delete(NhaTro entity) {
        delete_sql = "Delete NhaTro where TenNT = '"+entity.getTenNT()+"' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(NhaTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Xóa thành công");
    }

    @Override
    public NhaTro Select_ID(String id) {
        NhaTro NT = new NhaTro();
        selectld_sql = "Select * from NhaTro where MaNT = '"+id+"'";
        try {
            NT = con.getNhaTro(selectld_sql);
        } catch (SQLException ex) {
            Logger.getLogger(NhaTroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        return NT;
    }

    @Override
    public List<NhaTro> SelectAll() {
        List<NhaTro> List = new ArrayList<NhaTro>();
        NhaTro nt = new NhaTro();
        selectall_sql = "Select * from NhaTro" ;
        try {
            nt = con.getNhaTro(selectall_sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.NhaTroDao.SelectAll");
        }
        List.add(nt);
        return List;
    }
    
}
