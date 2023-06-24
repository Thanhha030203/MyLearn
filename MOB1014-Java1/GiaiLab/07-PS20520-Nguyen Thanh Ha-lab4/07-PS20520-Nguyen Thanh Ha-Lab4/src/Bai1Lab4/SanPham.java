/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham{
    String tensp;
    double dongia;
    double giamgia;
    public double  getThuueNhapKhau(){
        return dongia*0.1;
    }
    public void xuat(){
        System.out.printf("%s\t\t%7.2f\t\t%7.2f\t\t%7.2f \n",tensp,dongia,giamgia,getThuueNhapKhau());
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham : ");
        this.tensp = sc.nextLine();
        System.out.print(" Nhap don gia cho san pham : ");
        this.dongia = sc.nextDouble();
        System.out.print("Nhap giam gia cho san pham : ");
        this.giamgia= sc.nextDouble();
    }
    
}
