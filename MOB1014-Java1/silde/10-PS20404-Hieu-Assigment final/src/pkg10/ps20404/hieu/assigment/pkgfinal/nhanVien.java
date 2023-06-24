/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.ps20404.hieu.assigment.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class nhanVien {

    private String maNhanVien, hoTenNhanVien;
    private Double luongNhanVien;

    public nhanVien(String maNhanVien, String hoTenNhanVien, Double luongNhanVien) {
        this.maNhanVien = maNhanVien;
        this.hoTenNhanVien = hoTenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public nhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTenNhanVien() {
        return hoTenNhanVien;
    }

    public void setHoTenNhanVien(String hoTenNhanVien) {
        this.hoTenNhanVien = hoTenNhanVien;
    }

    public Double getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setLuongNhanVien(Double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    public Double getThuNhap() {
        return this.luongNhanVien;
    }

    public double getThueThuNhap() {
        double thuethunhap;
        if (this.luongNhanVien < 9000000) {
            return thuethunhap = 0;
        } else if (this.luongNhanVien >= 9000000 && this.luongNhanVien < 15000000) {
            thuethunhap = (this.luongNhanVien - 9000000) * 0.1;
        } else {
            thuethunhap = (6000000 * 0.1) + (this.luongNhanVien - 15000000) * 0.12;
        }
        return thuethunhap;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien : ");
        this.maNhanVien = sc.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        this.hoTenNhanVien = sc.nextLine();
        System.out.print("Nhap luong nhan vien : ");
        this.luongNhanVien = sc.nextDouble();

    }

    public void xuat() {
        System.out.println("Ma nhan vien : " + this.maNhanVien);
        System.out.println("Ho ten nhan vien : " + this.hoTenNhanVien);
        System.out.printf("Luong nhan vien :   %.1f\n" , this.luongNhanVien);
        System.out.println("Thu nhap : " + this.getThuNhap());
        System.out.printf("Thue thu nhap : %.1f\n",this.getThueThuNhap());
    }

}
