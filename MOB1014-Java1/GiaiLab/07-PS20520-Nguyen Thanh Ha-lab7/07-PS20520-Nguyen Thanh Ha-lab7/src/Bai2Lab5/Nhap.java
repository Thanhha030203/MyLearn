/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab5;

import java.util.Objects;
import java.util.Scanner;

/* 
 */
public class Nhap {
    public String hoten;

    public Nhap(String hoten) {
        this.hoten = hoten;
    }

    public Nhap() {
    }
    
    Scanner sc = new Scanner(System.in);
    public void xuat(){ 
        System.out.println(" xuat ho va ten " +hoten);
    }
    public void nhap(){ 
        System.out.println("Nhap ho va ten : ");
        hoten = sc.nextLine();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nhap other = (Nhap) obj;
        if (!Objects.equals(this.hoten, other.hoten)) {
            return false;
        }
        return true;
    }
    
}
