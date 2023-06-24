/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Bai2.SinhVienPoly;
import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoly{ 
    double diemMarketing;
    double diemSales ;
    Scanner sc = new Scanner(System.in);
    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen) {
        super(hoTen);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public SinhVienBiz() {
    }

    @Override
    public double getDiem() {
       return (2*this.diemMarketing+this.diemSales)/3;
    }
public String hocbong(){ 
        if(getHocLuc().equalsIgnoreCase("gioi")& this.diemMarketing>=6.5&&this.diemSales>=6.5){ 
                 return "hoc bong gioi";
        }
            if(getHocLuc().equalsIgnoreCase("gioi")& this.diemMarketing>=5&&this.diemSales>=5){ 
                 return "hoc bong kha";
        }
            else{ 
                return "khong hoc bong";
            }
    }
    public void xuat(){ 
        System.out.println("Sinh vien thuoc chuyen nganh BIZ");
        System.out.println("Ten : "+this.hoTen);
        System.out.println("Diem Marketing : "+this.diemMarketing);
        System.out.println("Diem Sales : "+this.diemSales);
    }
    
    }

