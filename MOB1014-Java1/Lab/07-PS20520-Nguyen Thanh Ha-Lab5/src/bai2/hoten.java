/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class hoten{
    private String hoTen;
    Scanner sc = new Scanner(System.in);
    public hoten(String hoTen) {
        this.hoTen = hoTen;
    }

    public hoten() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void nhap(){ 
        System.out.println("Nhap ho va ten ");
        hoTen = sc.nextLine();
    }

    @Override
    public String toString() {
        return "hoten  [" + " hoTen = " + hoTen + ']';
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
        final hoten other = (hoten) obj;
        if (!Objects.equals(this.hoTen, other.hoTen)) {
            return false;
        }
        return true;
    }
    
    }

