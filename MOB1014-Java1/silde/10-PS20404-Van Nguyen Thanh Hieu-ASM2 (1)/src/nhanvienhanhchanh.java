
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class nhanvienhanhchanh {
    private String maNhanVien;
    private String tenNhanVien;
    private Double luongNhanVien;

    public nhanvienhanhchanh() {
    }

    public nhanvienhanhchanh(String maNhanVien, String tenNhanVien, Double luongNhanVien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Double getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setLuongNhanVien(Double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien : ");
        this.maNhanVien = sc.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        this.tenNhanVien = sc.nextLine();
        System.out.print("Luong nhan vien : ");
        this.luongNhanVien = sc.nextDouble();
        sc.nextLine();
    }
    public void xuat(){ 
        System.out.println("Ma nhan vien : " + getMaNhanVien());
            System.out.println("Ten nhan vien : " + getTenNhanVien());
            System.out.println("Luong nhan vien : " + getLuongNhanVien());
            System.out.println("------------------------------");

    }
    
}
