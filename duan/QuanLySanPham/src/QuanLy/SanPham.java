/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

/**
 *
 * @author Admin
 */
public class SanPham {
    String masp,tensp;
    double dongia;
    String loaisp;

    public SanPham(String masp, String tensp, double dongia, String loaisp) {
        this.masp = masp;
        this.tensp = tensp;
        this.dongia = dongia;
        this.loaisp = loaisp;
    }

    public SanPham() {
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    @Override
    public String toString() {
        return loaisp ;
    }

 
    
}
