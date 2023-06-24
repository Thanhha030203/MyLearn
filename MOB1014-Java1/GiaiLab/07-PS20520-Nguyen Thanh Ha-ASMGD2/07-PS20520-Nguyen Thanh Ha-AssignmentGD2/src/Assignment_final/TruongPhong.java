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
public class TruongPhong extends NhanVien{
    double trachNhiem;
    Scanner sc= new Scanner(System.in);
    public TruongPhong(double trachNhiem, String msnv) {
        super(msnv);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong() {
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem() {
        System.out.print("Cap nhat luong trach nhiem nhan vien : ");
        this.trachNhiem = sc.nextDouble();
    }
    public void capnhat(){ 
        super.capnhat();
         System.out.println("Ban co muon cap nhat doanh nhan vien ? nhan c de cap nhat : ");
        while (sc.nextLine().equalsIgnoreCase("c")) {            
            this.setTrachNhiem();
        }
    }
    public void nhap(){ 
        super.nhap();
        System.out.print("Nhap luong trach nhiem : ");
        this.trachNhiem = sc.nextDouble();
    }
    public double getThuNhap(){
        return this.trachNhiem+this.getLuong();
    }

    @Override
    public String toString() {
        return "TruongPhong [ hoTen= " + getHoTen() + ", msnv= " + getMsnv()+ ", luong= " + getLuong() +
                ", trachNhiem = " + trachNhiem + ", Tong thu nhap = " + getThuNhap() + ", Thue = " + getThueTN() + ']';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    
}
