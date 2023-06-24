/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.Nguoidung;
import DoiTuong.TaiKhoan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TaiKhoanDao implements QuanLyDao<TaiKhoan,String>{
    String insert_sql ;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    Connections con = new Connections();
    @Override
    public void insert(TaiKhoan entity) { 
        try {
            System.out.println("abc");
            insert_sql = "Insert into TaiKhoan values ('"+entity.getMaTK()+"',"+entity.getSDT()+",'"+entity.getUserName()+"','"+entity.getPassword()+"','"+entity.getRemember()+"')";
            System.out.println(insert_sql);
            con.getResult(insert_sql);
            JOptionPane.showMessageDialog(null,"Thêm thành công");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Thêm thất bại");
            System.out.println("Lỗi tại Entity.TaoKhoanDao.insert :"+ex);
        }
    }

    @Override
    public void update(TaiKhoan entity) {
        update_sql = "Update TaiKhoan set UserName = '"+entity.getUserName()+"',PassWordd = '"+entity.getPassword()+"',remember_pass ='"+entity.getRemember()+"' where MaTK = '"+entity.getMaTK()+"'";
        try {
            con.getResult(update_sql);
            JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cập nhật thất bại");
            System.out.println("Lỗi tại Entity.TaoKhoanDao.update :"+ex);
        }
    }

    @Override
    public void delete(TaiKhoan entity) {
        delete_sql = "Delete TaiKhoan where MaTK = '"+entity.getMaTK()+"'";
        try {
            con.getResult(delete_sql);
            JOptionPane.showMessageDialog(null,"Xoá thành công");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"xoá thất bại");
            System.out.println("Lỗi tại Entity.TaoKhoanDao.delete :"+ex);
        }
    }

    @Override
    public TaiKhoan Select_ID(String id) {
         Nguoidung taikhoan = new TaiKhoan();
        String selectid_sql = "select * from TaiKhoan tk inner join NguoiDung nd on tk.SDT = nd.SDT and UserName = '"+id+"'";
        try {
            taikhoan = con.getTaiKhoan_NguoiDung(selectid_sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại Entity.TaoKhoanDao.select_ID :"+ex);
        }
        return (TaiKhoan) taikhoan;
    }

    @Override
    public List<TaiKhoan> SelectAll() {
        List <TaiKhoan> list = new ArrayList<TaiKhoan>();
         Nguoidung taikhoan = new TaiKhoan();
        String selectid_sql = "Select * from TaiKhoan tk inner join NguoiDung nd on tk.SDT = nd.SDT";
        try {
           taikhoan= con.getTaiKhoan_NguoiDung(selectid_sql);
           list.add((TaiKhoan) taikhoan);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại Entity.TaoKhoanDao.select_ID :"+ex);
        }
        return list;
       
    }
    
}
