
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
    Scanner sc = new Scanner(System.in);
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

    public void setTenNhanVien() {
        System.out.println("Cap nhat ten : ");
        this.tenNhanVien= sc.nextLine();
    }
    
    public Double getLuongNhanVien() {
        System.out.println("Cap nhat luong : ");
        return this.luongNhanVien=sc.nextDouble();
    }

    public void setLuongNhanVien(Double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien : ");
        this.maNhanVien = sc.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        this.tenNhanVien = sc.nextLine();
        System.out.print("Luong nhan vien : ");
        this.luongNhanVien = sc.nextDouble();
        sc.nextLine();
    }
    
    
}
