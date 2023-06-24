/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
    public class SanPham1 implements Comparable<SanPham1>{
    private String tenSanPham;
    private double giaSanPham;
    Scanner sc = new Scanner(System.in);
    public SanPham1(String tenSanPham, double giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    public SanPham1(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    
    
    public SanPham1() {
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }
    public void themsanpham(){ 
        System.out.print("Nhap ten san pham : ");
        this.tenSanPham= sc.nextLine();
        System.out.print("Nhap gia san pham : ");
        this.giaSanPham= sc.nextDouble();
    }

    @Override
    public String toString() {
        return "SanPham [" + "tenSanPham = " + tenSanPham + ", giaSanPham = " + giaSanPham + ']';
    }

    @Override
    public int compareTo(SanPham1 arg0) {
         //To change body of generated methods, choose Tools | Templates.
         return this.tenSanPham.compareTo(arg0.tenSanPham);
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
        final SanPham1 other = (SanPham1) obj;
        if (!Objects.equals(this.tenSanPham, other.tenSanPham)) {
            return false;
        }
        return true;
    }
    
    
    }
