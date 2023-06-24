/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

/**
 *
 * @author HAN-PC
 */
public class SanPham {
    private String masp;
    private String tensp;
    private double dongia;

    public SanPham() {
    }

    public SanPham(String masp, String tensp, double dongia) {
        this.masp = masp;
        this.tensp = tensp;
        this.dongia = dongia;
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
    
    
}
