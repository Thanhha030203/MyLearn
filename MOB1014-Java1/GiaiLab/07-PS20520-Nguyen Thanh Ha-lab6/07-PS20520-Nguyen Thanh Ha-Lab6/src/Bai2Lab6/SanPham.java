/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    public String tenSp;
    public double donGia;
    public String hang;
    Scanner sc = new Scanner(System.in);
    public void nhap(){ 
        System.out.print("Nhap ten san pham : ");
        this.tenSp= sc.nextLine();
        System.out.print("Nhap don gia san pham : ");
        this.donGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap hang san pham : ");
        this.hang = sc.nextLine();
    }

    @Override
    public String toString() {
        return "SanPham [" + "tenSp = " + tenSp + ", donGia = " + donGia + ", hang = " + hang + ']';
    }
   
}
