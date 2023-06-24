/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3Lab3 {

    public static void main(String[] args) {
        ArrayList<nhapsp> sp = new ArrayList<nhapsp>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("===========MENU================");
            System.out.println("  0. ket thuc");
            System.out.println("  1. Nhap danh sach san pham");
            System.out.println("  2. Sap xep giam dan theo gia va xuat ra man hinh");
            System.out.println("  3. Tim va xia san pham theo ten nhap tu ban phim");
            System.out.println("  4. Xuat gia trung binh cua cac san pham");
            System.out.println("====================================================");
            System.out.println("  Moi chon : ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.exit(chon);
                case 1:
                    System.out.println("Nhap danh sach san pham : ");
                    do {
                        nhapsp nhap = new nhapsp();
                        nhap.nhap();
                        sp.add(nhap);
                        System.out.println(" Ban co muon tiep tuc? nhan so 1 de dung");
                        chon = sc.nextInt();
                    } while (chon != 1);
                case 2: {
                    
                }
                case 3:{ 
                    System.out.println("Nhap ten muon xoa");
                    String xoa = sc.nextLine();
                   for(nhapsp ktra :sp){ 
                       if(ktra.equals(xoa)){ 
                           sp.remove(ktra);
                       }
                    }
                    
                }
            }
        } while (chon != 0);
       
    }

}
