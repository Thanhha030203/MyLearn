/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.GiaoDich;
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
public class GiaoDichDao implements QuanLyDao<GiaoDich, String> {

    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectld_sql;
    String selectall_sql;
    Connections con = new Connections();

    @Override
    public void insert(GiaoDich entity) {
        int trangthai = (entity.isTrangthai()) ? 1 : 0;
        insert_sql = "Insert into LienKet values('" + entity.getMaGD() + "', '" + entity.getMaLK() + "', N'" + entity.getTenGD() + "', " + entity.getMaTk_nguoigui() + ", " + entity.getSoTk_nguoigui() + ", " + entity.getMaTk_nguoinhan() + ", " + entity.getSoTk_nguoinhan() + ", N'" + entity.getNoiDung() + "', " + entity.getThoigian() + ", " + entity.getSoTien() + ", " + trangthai + ")";
        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(LienKetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm thành công");
    }

    @Override
    public void update(GiaoDich entity) {
        update_sql = "Update GiaoDich where MaLK = '" + entity.getMaLK() + "'";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
    }

    @Override
    public void delete(GiaoDich entity) {
        delete_sql = "Delete GiaoDich where NoiDung = N'" + entity.getNoiDung() + "'";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Xóa thành công");
    }

    @Override
    public GiaoDich Select_ID(String id) {
        GiaoDich GD = new GiaoDich();
        selectld_sql = "Select * from GiaoDich = '" + id + "'";
        try {
            GD = con.getGiaoDich(selectld_sql);
        } catch (SQLException ex) {
            Logger.getLogger(LienKetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return GD;

    }

    @Override
    public List<GiaoDich> SelectAll() {
        List<GiaoDich> List = new ArrayList<GiaoDich>();
        GiaoDich gd = new GiaoDich();
        selectall_sql = "Select * from LienKet";
        try {
            gd = con.getGiaoDich(selectall_sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.GiaoDichDao.SelectAll");
        }
        List.add(gd);
        return List;
    }

}
