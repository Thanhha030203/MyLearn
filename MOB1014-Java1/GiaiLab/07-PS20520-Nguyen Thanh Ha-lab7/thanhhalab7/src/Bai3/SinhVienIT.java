/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Bai2.SinhVienPoly;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVienPoly{

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    public double diemJava;
    public double diemCss ;
    public double diemHtml;
    Scanner sc = new Scanner(System.in);
    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen) {
        super(hoTen);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public SinhVienIT() {
    }

    SinhVienIT(Double diemJava, Double diemCss, Double diemHtml, String name1, String nganh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    SinhVienIT(Double diemJava, Double diemCss, Double diemHtml, String name1, String nganh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getDiem() {
        return (2*this.diemJava+this.diemCss+this.diemHtml)/4;
    }
    public void nhap(){ 
        System.out.print("Nhap ten : ");
            this.hoTen = sc.nextLine();
            System.out.print("nhap diem Java : ");
            this.diemJava = sc.nextDouble();
            System.out.print("nhap diem Css : ");
            this.diemCss = sc.nextDouble();
            System.out.print("nhap diem Html : ");
            this.diemHtml = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Sinh vien thuoc chuyen nganh IT");
        System.out.println("Ten : "+this.hoTen);
        System.out.println("Diem Java : "+this.diemJava);
        System.out.println("Diem Css : "+this.diemCss);
        System.out.println("Diem Html : "+this.diemHtml);
    }
    public String getHocbong(){ 
        if(getHocLuc().equalsIgnoreCase("gioi")& this.diemJava>=6.5&&this.diemCss>=6.5&&this.diemHtml>=6.5){ 
                 return "hoc bong gioi";
            }
        else if(getHocLuc().equalsIgnoreCase("kha")&&this.diemJava>=5&&this.diemCss>=5&&this.diemHtml>=5){
               return "hoc bong kha";
            }
        else{
            return "khong hoc bong";
        }
    }
    
    
}
