
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien{
     String hoTen ;
     String msnv;
     double luong ;
    public NhanVien() {
    }

    public NhanVien(String msnv) {
        this.msnv= msnv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMsnv() {
        return msnv;
    }

    public double getLuong() {
        return luong;
    }

    public void setHoTen() {
        sc.nextLine();
        System.out.print("Cap nhat ten nhan vien : ");
        this.hoTen = sc.nextLine();
    }

    public void setMsnv() {
        System.out.print("Cap nhat ma so nhan vien : ");
        this.msnv = sc.nextLine();
    }

    public void setLuong() {
        System.out.print("Cap nhat so luong nhan vien : ");
        this.luong = sc.nextDouble();
    }
    
    Scanner sc = new Scanner(System.in);
    public void nhap(){ 
        System.out.print("Nhap ten nhan vien : ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap ma nhan vien : ");
        this.msnv = sc.nextLine();
        System.out.print("Nhap muc luong nhan vien : ");
        this.luong = sc.nextDouble();
    }
    public double getThuNhap(){
        return this.getLuong();
    }
    public double getThueTN(){
        double thue;
        if (getThuNhap() < 9000000) {
            thue = 0;
        } else if (getThuNhap() >= 9000000 && getThuNhap() < 15000000) {
            thue =  ((getThuNhap() - 9000000) * 0.1);
        } else {
            thue = ((6000000 * 0.1) + (getThuNhap() - 15000000) * 0.12);
        }
        return thue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        if (!Objects.equals(this.msnv, other.msnv)) {
            return false;
        }
        return true;
    }
    public void capnhat(){ 
        sc.nextLine();
       System.out.println("Ban co muon cap nhat ten nhan vien ? nhan c de cap nhat : ");
        while (sc.nextLine().equalsIgnoreCase("c")) {            
            this.setHoTen();
        }
        
      
        System.out.println("Ban co muon cap nhat ma nhan vien ? nhan c de cap nhat : ");
        while (sc.nextLine().equalsIgnoreCase("c")) {            
            this.setMsnv();
        }
        System.out.println("Ban co muon cap nhat luong nhan vien ? nhan c de cap nhat : ");
        while (sc.nextLine().equalsIgnoreCase("c")) {            
            this.setLuong();
        }
    }
    @Override
    public String toString() {
        return "Hanh Chinh [" + "hoTen=" + hoTen + ", msnv=" + msnv + ", luong=" + luong +  ", Tong thu nhap = " + getThuNhap() + ", Thue = " + getThueTN() +  ']';
    }
   
    
}
