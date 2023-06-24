/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import Bai3.SinhVienIT;
import Bai3.SinhVienPoly;
import java.util.ArrayList;
import java.util.Scanner;


public class DanhSachSinhVien {
    Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVienPoly> danhsach = new ArrayList<>() ;

    public DanhSachSinhVien(ArrayList<SinhVienPoly> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<>();
        
    }
    public void nhap(){ 
        System.out.println("Nhap ten : ");
        String name1 = sc.nextLine();
        System.out.println("nganh : ");
        String nganh = sc.nextLine();
        if(nganh.equalsIgnoreCase("it")){
            System.out.println("Nhap diem Java : ");
            Double diemJava = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap diem Css : ");
            Double diemCss = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap diem Html : ");
            Double diemHtml = Double.parseDouble(sc.nextLine()); 
            SinhVienIT svit = new SinhVienIT(diemJava,diemCss,diemHtml,name1,nganh);
            danhsach.add(svit);
        }
        else if(nganh.equalsIgnoreCase("biz")){ 
            System.out.println("Nhap diem Marketing : ");
            Double diemMarketing = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap diem Sales");
            Double điemSales = Double.parseDouble(sc.nextLine());
            
        }
    }
    
}