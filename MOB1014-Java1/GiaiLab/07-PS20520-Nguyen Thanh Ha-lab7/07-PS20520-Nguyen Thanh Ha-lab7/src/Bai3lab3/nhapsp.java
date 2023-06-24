/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class nhapsp {
    public String name;
    public double prod;
    Scanner sc = new Scanner(System.in);
    public void nhap(){ 
        System.out.println("Nhap ten san pham : ");
        this.name=sc.nextLine();
        System.out.println("Nhap gia san pham : ");
        this.prod=sc.nextDouble();
    }
    public void xuat(){ 
        System.out.println("ten sp : "+name);
        System.out.println("Gia sp : "+prod);
    }
}
