/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3Lab4;

/**
 *
 * @author Admin
 */
public class Bai3Lab4 {
    public static void main(String[] args) {
        SanPhamNangCap sp1 = new SanPhamNangCap("Beaty",245.65,40.6);
        SanPhamNangCap sp2 = new SanPhamNangCap("Fashion",278.65);
         System.out.println("---------------------------------------------\n");
        System.out.println("Ten san pham \t Don gia \t Giam gia \t thue");
        sp1.xuat();
        sp2.xuat();
    }
    
}
