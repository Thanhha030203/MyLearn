/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4Lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4lab4 {
    public static void main(String[] args) {
        nangcapsanpham sp = new nangcapsanpham();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham : ");
        sp.setTensp(sc.nextLine());
        System.out.print(" Nhap don gia cho san pham : ");
        sp.setDongia(sc.nextDouble());
        System.out.print("Nhap giam gia cho san pham : ");
        sp.setGiamgia(sc.nextDouble());
        System.out.println(" Ten san pham : "+ sp.getTensp());
        System.out.println(" Don gia : "+ sp.getDongia());
        System.out.println(" Giam gia : "+ sp.getGiamgia());
        
    }   
}
