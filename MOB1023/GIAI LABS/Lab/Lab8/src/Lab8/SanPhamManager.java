/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author MinhMan
 */
public class SanPhamManager {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Iphone10", 100000.0);
        SanPham sp2 = new SanPham("SamSung Galyxy S10+", 25000000);
        
        SanPhamDAO dao = new SanPhamDAO() {};
        
        dao.them(sp1);
        dao.them(sp2);
        dao.khoiPhuc("d:/q.txt");
        
        SanPhamDAO dao2 = new SanPhamDAO() {};
        dao2.load("d:/q.txt");

        SanPham p = dao2.timKiem("Iphone10");
        System.out.println("Tên: " + p.getTen());
        System.out.println("Giá: " + p.getGia());
    }
}
