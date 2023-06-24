/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Danhsachsinhvien ds = new Danhsachsinhvien();
        int chon = 1;
        do {
            System.out.println("===========MENU=================");
            System.out.println("  0. Ket thuc");
            System.out.println("  1. Nhap danh sach sinh vien ");
            System.out.println("  2. Xuat thong tin danh sach sinh vien ");
            System.out.println("  3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("  4. Sap xep danh sach sinh vien theo diem");
            System.out.println("  5. Hoc sinh co hoc bong");
            System.out.println("==============================================");
            System.out.print("Moi ban chon : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    ds.themdanhsach();
                    break;
                }
                case 2: {
                    ds.xuathongtin();
                    break;
                }
                case 3: {
                    ds.xuathocsinhgioi();
                    break;
                }
                case 4: {
                    ds.sapxep();
                    ds.xuathongtin();
                    break;
                }
                case 5: {
                    ds.hocbong();
                    break;
                }
            }
        } while (chon != 0);
    }

}
