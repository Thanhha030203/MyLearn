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
public class DangKy_DichVuDao implements QuanLyDao<DangKy_DichVu, String> {

    String insert_sql;
    String update_sql;
    String delete_sql;
    String selectid_sql;
    String selectall_sql;
    Connections con = new Connections();

    @Override
    public void insert(DangKy_DichVu entity) {
        int trangthaidangki = (entity.isTrangThaiDangKy()) ? 1 : 0;
        int trangthaithanhtoan = (entity.isTrangthaithanhtoan()) ? 1 : 0;
        insert_sql = "Insert into  DanhSach_DangKy_DichVu values ('" + entity.getMaDV() + "', '" + entity.getMaTK() + "', '" + entity.getNgayDangKy() + "', '" + entity.getThoiHan() + "', '" + trangthaidangki + "', '" + trangthaithanhtoan + "')";

        try {
            con.getResult(insert_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thêm thành công");
    }

    @Override
    public void update(DangKy_DichVu entity) {
        int trangthaidangki = (entity.isTrangThaiDangKy()) ? 1 : 0;
        int trangthaithanhtoan = (entity.isTrangthaithanhtoan()) ? 1 : 0;
        update_sql = "Update  DanhSach_DangKy_DichVu set MaTK = '" + entity.getMaTK() + "', NgayDangKy = '" + entity.getNgayDangKy() + "', ThoiHan_Thang = '" + entity.getThoiHan() + "', TrangThaiDangKy = '" + trangthaidangki + "', TrangThaiThanhToan = '" + trangthaithanhtoan + "' where MaDV = '" + entity.getMaDV() + "'  ";
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
    }

    public void updates(DangKy_DichVu entity, String matk) {
        System.out.println("nay");
        System.out.println(matk);
        int trangthaidangki = (entity.isTrangThaiDangKy()) ? 1 : 0;
        int trangthaithanhtoan = (entity.isTrangthaithanhtoan()) ? 1 : 0;
        update_sql = "Update  DanhSach_DangKy_DichVu set NgayDangKy = '" + entity.getNgayDangKy() + "', ThoiHan_Thang = '" + entity.getThoiHan() + "', TrangThaiDangKy = '" + trangthaidangki + "', TrangThaiThanhToan = '" + trangthaithanhtoan + "' where MaDV = '" + entity.getMaDV() + "' and MaTK='" + matk + "' ";
        System.out.println(update_sql);
        try {
            con.getResult(update_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
    }

    @Override
    public void delete(DangKy_DichVu entity) {
        delete_sql = "Delete From  DanhSach_DangKy_DichVu where MaDV = '" + entity.getMaDV() + "' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");

    }
    

    public void deletes(DangKy_DichVu entity) {
        delete_sql = "Delete From  DanhSach_DangKy_DichVu where MaDV = '" + entity.getMaDV() + "' and MaTk ='" + entity.getMaTK() + "' ";
        try {
            con.getResult(delete_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");

    }

    @Override
    public DangKy_DichVu Select_ID(String id) {
        DangKy_DichVu dk = new DangKy_DichVu();
        selectid_sql = "Select * from  DanhSach_DangKy_DichVu k inner join DichVu d on k.MADV = d.MaDV inner join DichVu_HoTro h on d.MADV = h.MADV and k.MADV = '" + id + "'";
        try {
            dk = con.getDangKy_DichVu(selectid_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        return dk;
    }

    public DangKy_DichVu Select_ID2(String id, String matk) {
        DangKy_DichVu dk = new DangKy_DichVu();
        selectid_sql = "Select * from  DanhSach_DangKy_DichVu k inner join DichVu d on k.MADV = d.MaDV inner join DichVu_HoTro h on d.MADV = h.MADV and k.MADV = '" + id + "' and k.MaTk ='" + matk + "'";
        try {
            dk = con.getDangKy_DichVu(selectid_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        System.out.println("okok " + dk);
        return dk;
    }

//    public List<DangKy_DichVu> Select_ID3(String id) {
//        List<DangKy_DichVu> list = new ArrayList<DangKy_DichVu>();
//        DangKy_DichVu dk = new DangKy_DichVu();
//        selectid_sql = "Select * from  DanhSach_DangKy_DichVu k inner join DichVu d on k.MADV = d.MaDV inner join DichVu_HoTro h on d.MADV = h.MADV and k.MaTK = '" + id + "'";
//        try {
//            dk = con.getDangKy_DichVu(selectid_sql);
//        } catch (SQLException ex) {
//            System.out.println("Lỗi tại Entity.DangKyDichVu.select_id3 "+ ex);
//        }
//        list.add(dk);
//        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
//        return list;
//    }

    @Override
    public List<DangKy_DichVu> SelectAll() {
        List<DangKy_DichVu> list = new ArrayList<DangKy_DichVu>();
        DangKy_DichVu dk = new DangKy_DichVu();
        selectall_sql = "select * from  DanhSach_DangKy_DichVu";
        try {
           dk = con.getDangKy_DichVu(selectall_sql);
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_DichVuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(dk);
        return list;
    }

}
