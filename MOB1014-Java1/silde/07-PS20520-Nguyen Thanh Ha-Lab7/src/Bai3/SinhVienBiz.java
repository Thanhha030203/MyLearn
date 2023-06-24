/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Bai2.SinhVienPoly;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVienPoly {
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public SinhVienBiz() {
    }

    @Override
    public double getDiem() {
        return (2*this.diemMarketing+this.diemSales)/3;
    }
    public String getHocbong(){ 
        if(getHocluc().equalsIgnoreCase("gioi")&& this.diemMarketing>=6.5&& this.diemSales>=6.5){ 
            return "Hoc bong gioi";
        }
        else if(getHocluc().equalsIgnoreCase("kha")&& this.diemMarketing>=5&& this.diemSales>=5){ 
            return "hoc bong kha";
        }
        else{
            return "khong hoc bong";
        }
    }
    public void xuat(){ 
        System.out.println("ten : "+getHoTen());
        System.out.println("Nganh : "+getNganh());
        System.out.println("diem Marketing : "+diemMarketing);
        System.out.println("diem Sales : "+diemSales);
        System.out.println("----------------------------------------");
    }

    
}
