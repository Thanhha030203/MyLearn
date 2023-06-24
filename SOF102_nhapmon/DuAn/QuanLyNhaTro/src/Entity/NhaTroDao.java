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
        int trangthai = (entity.isTrangThai())?1:0;
        insert_sql = "Insert into NhaTro values('" + entity.getMaNT() + "', N'" + entity.getTenNT() + "', N'" + entity.getDiaChi() + "', '" + entity.getDientich() + "', N'"+entity.getMota()+"', N'" + entity.getMaLoai() + "',"+entity.getGia()+",'"+entity.getMa_NLH()+"',"+trangthai+", '"+entity.getHinh()+"')";
        try {
            con.getResult(insert_sql);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } catch (SQLException ex) {
                        System.out.println("Lỗi tại entity.NhaTroDao.insert "+ex);

        }
        
    }

    @Override
    public void update(NhaTro entity) {
        int trangthai = (entity.isTrangThai())?1:0;
        update_sql = "Update NhaTro set TenNT = '"+entity.getTenNT()+"',DiaChi = N'"+entity.getDiaChi()+"',DienTich = "+entity.getDientich()+",MoTa = N'"+entity.getMota()+"',MaLoai = '"+entity.getMaLoai()+"',Gia = "+entity.getGia()+",Ma_NLH = '"+entity.getMa_NLH()+"',TrangThai = "+trangthai+",Hinh = '"+entity.getHinh()+"'  Where MaNT = '" + entity.getMaNT()+ "'";
        try {
            con.getResult(update_sql);
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.NhaTroDao.update "+ex);
        }
    }

    @Override
    public void delete(NhaTro entity) {
        delete_sql = "Delete From NhaTro where MaNT = '" + entity.getMaNT()+ "' ";
        try {
            con.getResult(delete_sql);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.NhaTroDao.delete " + ex);
        }

    }

    @Override
    public NhaTro Select_ID(String id) {
        NhaTro NT = new NhaTro();
        selectld_sql = "Select * from NhaTro where MaNT = '" + id + "'";
        try {
            NT = con.getNhaTro(selectld_sql);
    
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.NhaTroDao.selectID " + ex);
        }
        return NT;
    }

    @Override
    public List<NhaTro> SelectAll() {
        List<NhaTro> List = new ArrayList<NhaTro>();
        NhaTro nt = new NhaTro();
        selectall_sql = "Select * from NhaTro";
        try {
            nt = con.getNhaTro(selectall_sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi tại entity.NhaTroDao.SelectAll");
        }
        List.add(nt);
        return List;
    }

}
