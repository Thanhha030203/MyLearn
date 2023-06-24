/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanVien {

    private String manv, ten;
    private double luong;

    public NhanVien(String manv, String ten, double luong) {
        this.manv = manv;
        this.ten = ten;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Double getThuNhap() {
        return this.luong;
    }

    public Double getThueTN() {
        if (this.getThuNhap() < 9000000) {
            return 0.0;
        } else if (this.getThuNhap() < 15000000) {
            return this.getThuNhap() * 0.1;
        } else {
            return this.getThuNhap() * 0.12;
        }
    }
    public void xuat(){
         System.out.println("Thong tin nhan vien: ");
        System.out.println("Ho va ten: "+this.ten);
        System.out.println("Ma nhan vien: "+this.manv);
        System.out.printf("Thu nhap: %.0f \n",this.getThuNhap());
        System.out.printf("Thue thu nhap: %.0f \n",this.getThueTN());
        System.out.printf("Luong: %.0f \n",this.luong);
    }
}
