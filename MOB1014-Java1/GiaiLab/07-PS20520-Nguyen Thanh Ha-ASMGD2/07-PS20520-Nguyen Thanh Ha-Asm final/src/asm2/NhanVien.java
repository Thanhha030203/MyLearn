/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm2;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
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

    @Override
    public String toString() {
        return "NhanVien [" + "hoTen = " + hoTen + ", msnv = " + msnv + ", luong = " + luong + '}';
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
   
     
}
