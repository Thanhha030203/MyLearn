/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connections.Connections;
import DoiTuong.Nguoidung;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class NguoiDungDao implements QuanLyDao<Nguoidung,String> {
       String insert_sql;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    String selectall_sql;
    Connections con = new Connections();
    @Override
    public void insert(Nguoidung entity) {
          int gioitinh = (entity.isGioitinh())?1:0;
        insert_sql = "Insert into NguoiDung values ("+entity.getSDT()+",N'"+entity.getTenNgD()+"',N'"+entity.getDiaChi()+"','"+entity.getNgaySinh()+"',"+gioitinh+",'"+entity.getEmail()+"',"+entity.getCMND()+",'')";
           try {
               con.getResult(insert_sql);
           } catch (SQLException ex) {
               System.out.println("Lỗi tại Entity.NguoidungDao.insert "+ex);
           }
    }

    @Override
    public void update(Nguoidung entity) {
                  int gioitinh = (entity.isGioitinh())?1:0;
        update_sql = "update NguoiDung set TenNgD = N'"+entity.getTenNgD()+"', DiaChi = N'"+entity.getDiaChi()+"',NgaySinh = '"+entity.getNgaySinh()+"',Email = '"+entity.getEmail()+"',CMND = "+entity.getCMND()+" where SDT = "+entity.getSDT()+"";
           try {
               con.getResult(update_sql);
           } catch (SQLException ex) {
               System.out.println("Lỗi tại Entity.NguoidungDao.update "+ex);
           }
    }

    @Override
    public void delete(Nguoidung entity) {
        delete_sql = "Delete NguoiDung where SDT = "+entity.getSDT()+"";
           try {
               con.getResult(delete_sql);
           } catch (SQLException ex) {
               System.out.println("Lỗi tại Entity.NguoidungDao.delete "+ex);
           }
    }

    @Override
    public Nguoidung Select_ID(String id) {
            Nguoidung nguoidung = new Nguoidung();
            selectid_sql = "Select * from NguoiDung where SDT = "+id+"";
           try {
               nguoidung = con.getTaiKhoan_NguoiDung(selectall_sql);
           } catch (SQLException ex) {
               System.out.println("Lỗi tại Entity.NguoidungDao.select_ID "+ex);
           }
            return nguoidung;
    }

    @Override
    public List<Nguoidung> SelectAll() {
        Nguoidung nguoidung = new Nguoidung();
        List<Nguoidung> list = new ArrayList<Nguoidung>();
        selectall_sql = "Select * from NguoiDung";
           try {
               con.getTaiKhoan_NguoiDung(selectall_sql);
                list.add(nguoidung);
           } catch (SQLException ex) {
               System.out.println("Lỗi tại Entity.NguoidungDao.selectAll "+ex);
           }
       
        return list;
    }
    
}
