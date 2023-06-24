/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuquanlinv;

/**
 *
 * @author Thanh My
 */
import java.util.Scanner;

public class NhanVien {

    private String tenNv;
    private String msnv;
    private Double luong;
    
    public NhanVien() {
    }

    public NhanVien(String msnv,String ten, double luong) {
        this.tenNv = ten;
        this.msnv = msnv;
        this.luong = luong;
    }


    public void xuatThongTin() {

        System.out.printf("\n%20s|%2s%-16s|%3s%-25s|%3s%-25.1f|%3s%-25.1f|%3s%-25.1f|%3s%-25.1f|", ' ', ' ', this.msnv, ' ', this.tenNv, ' ', this.luong, ' ', getThuNhap(), ' ', getThueTN(), ' ', getTongLuong());
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');

    }

    public Double getThuNhap() {
        return luong;
    }

    public Double getThueTN() {
        if (getThuNhap() > 15000000) {
            return getThuNhap() * 0.12;
        } else if (getThuNhap() > 9000000) {
            return getThuNhap() * 0.01;
        } else {
            return 0.0;
        }
    }

    public Double getTongLuong() {
        return getThuNhap() - getThueTN();
    }

    public boolean kiem_tra(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getmsnv() {
        return this.msnv;
    }

    public void setmsnv(String msnv) {
        this.msnv = msnv;
    }

    public String getten() {
        return this.tenNv;
    }

    public void setten(String ten) {
        this.tenNv = ten;
    }

    public double getluong() {
        return this.luong;
    }

    public void setluong(double luong) {
        this.luong = luong;
    }

}
