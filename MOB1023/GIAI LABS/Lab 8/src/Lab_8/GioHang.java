/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

import java.util.HashMap;

/**
 *
 * @author HAN-PC
 */
public class GioHang {
    private long id;
    private HashMap<String, SanPhamDTO> chiTietGioHang;
    
    public GioHang() {
        chiTietGioHang = new HashMap<>();
    }

    public GioHang(long id, HashMap<String, SanPhamDTO> chiTietGioHang) {
        this.id = id;
        this.chiTietGioHang = chiTietGioHang;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HashMap<String, SanPhamDTO> getChiTietGioHang() {
        return chiTietGioHang;
    }

    public void setChiTietGioHang(HashMap<String, SanPhamDTO> chiTietGioHang) {
        this.chiTietGioHang = chiTietGioHang;
    }
    
    public void addProduct (SanPhamDTO sp) {
        String MASP = sp.getSp().getMasp();
        if(chiTietGioHang.containsKey(MASP)) {
            int SoLuong = chiTietGioHang.get(MASP).getSoluong() + sp.getSoluong();
            chiTietGioHang.get(MASP).setSoluong(SoLuong);
        } else {
            chiTietGioHang.put(MASP, sp);
        }
    }
    
    public boolean removeProduct(String MaSP) {
        if(chiTietGioHang.containsKey(MaSP)) {
            chiTietGioHang.remove(MaSP);
            return true;
        } else {
            return false;
        }
    }
    
}
