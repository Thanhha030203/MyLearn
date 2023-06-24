/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5Lab4;


/**
 *
 * @author Admin
 */
public class Bai5Lab4 {
    public static void main(String[] args) {
        sanpham sp1 = new sanpham();
        sanpham sp2 = new sanpham();
        sanpham sp3 = new sanpham();
        System.out.println("Nhap san pham 1 : ");
        sp1.nhap();
        System.out.println("Nhap san pham 2 : ");
        sp2.nhap();
        System.out.println("Nhap san pham 3 : ");
        sp3.nhap();
        System.out.println("---------------------------------------------\n");
        System.out.println("Ten san pham \t Don gia \t Giam gia \t thue");
        sp1.xuat();
        sp2.xuat();
        sp3.xuat();
    }
    
}
