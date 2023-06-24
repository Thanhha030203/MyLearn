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
public class SinhVienIT extends SinhVienPoly {
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public SinhVienIT() {
    }
    
    @Override
    public double getDiem() {
        return (2*this.diemJava + this.diemHtml+this.diemCss)/4; 
    }
    public String getHocbong(){ 
        if(getHocluc().equalsIgnoreCase("gioi")&& this.diemJava>=6.5&& this.diemCss>=6.5 && this.diemHtml>=6.5){ 
            return "Hoc bong gioi";
        }
        else if(getHocluc().equalsIgnoreCase("kha")&& this.diemJava>=5&& this.diemCss>=5 && this.diemHtml>=5){ 
            return "hoc bong kha";
        }
        else{
            return "khong hoc bong";
        }
    }
    public void xuat(){ 
        System.out.println("ten : "+getHoTen());
        System.out.println("Nganh : "+getNganh());
        System.out.println("diem Java : "+diemJava);
        System.out.println("diem Css : "+diemCss);
        System.out.println("diem Html "+diemHtml);
        System.out.println("--------------------------");
    }

    public double minDiem(){ 
        return Math.min(Math.min(diemJava, diemCss), (Math.min(diemCss, diemHtml)));
    }
    
}
