/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Product {
    private String tensp;
    private double tien;

    public Product() {
    }

    public Product(String tensp, double tien) {
        this.tensp = tensp;
        this.tien = tien;
    }

    
    
    /**
     * @return the tensp
     */
    public String getTensp() {
        return tensp;
    }

    /**
     * @param tensp the tensp to set
     */
    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    /**
     * @return the tien
     */
    public double getTien() {
        return tien;
    }

    /**
     * @param tien the tien to set
     */
    public void setTien(double tien) {
        this.tien = tien;
    }
    
    public double THue(){
        return 0.1*getTien();
    }
    
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
       System.out.print("tensp: ");
       tensp=sc.nextLine();
       System.out.print("Gia: ");
       tien=sc.nextDouble();
    }
    public void Xuat(){
        System.out.println(getTensp()+" \t\t "+getTien()+" \t\t "+THue());
    }
}
