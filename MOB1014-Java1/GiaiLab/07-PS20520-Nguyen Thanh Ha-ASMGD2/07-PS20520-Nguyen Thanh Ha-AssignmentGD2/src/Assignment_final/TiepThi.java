/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_final;

import Assignment.NhanVien;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TiepThi extends NhanVien {
    double doanhSo;
    double hueHong;
    Scanner sc = new Scanner(System.in);
    public TiepThi(double doanhSo, double hueHong, String msnv) {
        super(msnv);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(double doanhSo, double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi() {
    }
    public double getThuNhap(){ 
        return this.doanhSo + this.hueHong +this.getLuong();
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setDoanhSo() {
        System.out.print("Cap nhat doanh so nhan vien : ");
        this.doanhSo = sc.nextDouble();
    }

    public void setHueHong() {       
        System.out.print("Cap nhat hue hong nhan vien : ");
        this.hueHong = sc.nextDouble();
    }
    
    public void nhap(){ 
        super.nhap();
        System.out.print("Nhap doanh so : ");
        this.doanhSo = sc.nextDouble();
        System.out.print("Nhap hue hong : ");
        this.hueHong = sc.nextDouble();
    }
    public void capnhat(){ 
        super.capnhat();
        sc.nextLine();
         System.out.println("Ban co muon cap nhat doanh so nhan vien ? nhan c de cap nhat : ");
        while (sc.nextLine().equalsIgnoreCase("c")) {            
            this.setDoanhSo();
        }
       System.out.println("Ban co muon cap nhat hue hong nhan vien ? nhan c de cap nhat : ");
        while (sc.nextLine().equalsIgnoreCase("c")) {            
            this.setHueHong();
        }
        
    }
    @Override
    public String toString() {
        return "TiepThi [ " + "hoTen=" + getHoTen() + ", msnv=" + getMsnv()+ ", luong=" + getLuong() + 
                ", doanhSo = " + doanhSo + ", hueHong = " + hueHong +  ", Tong thu nhap = " + getThuNhap() + ", Thue = " + getThueTN() + ']';
    }
    
}
