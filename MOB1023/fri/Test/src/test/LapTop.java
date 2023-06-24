/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ACER ( ATV )
 */
public class LapTop {
        String maSP,tenSP;
    double canNang;
    Scanner sc = new Scanner(System.in);

    public LapTop(String maSP, String tenSP, double canNang) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.canNang = canNang;
    }

    public LapTop() {
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getCanNang() {
        return canNang;
    }
  
    public void nhap(){
            
            System.out.print("Ma SP: ");
            maSP = sc.nextLine();
            System.out.print("Ten SP: ");
           tenSP = sc.nextLine();
            System.out.print("Can nang: ");
             canNang =sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ma SP: " + getMaSP() + " Ten SP: " + getTenSP() + " Can nang: " + getCanNang());
    }
}
