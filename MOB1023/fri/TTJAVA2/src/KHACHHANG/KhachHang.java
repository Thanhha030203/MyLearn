/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KHACHHANG;

/**
 *
 * @author Ngoc Huyen
 */
public class KhachHang {
    private String loaiKh, maKh, tenKh, mail;

    public KhachHang() {
    }

    public KhachHang(String loaiKh, String maKh, String tenKh, String mail) {
        this.loaiKh = loaiKh;
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.mail = mail;
    }

    public String getLoaiKh() {
        return loaiKh;
    }

    public void setLoaiKh(String loaiKh) {
        this.loaiKh = loaiKh;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
