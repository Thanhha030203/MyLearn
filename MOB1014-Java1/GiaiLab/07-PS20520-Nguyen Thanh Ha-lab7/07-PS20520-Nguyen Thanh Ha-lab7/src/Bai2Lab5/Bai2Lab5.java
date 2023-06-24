/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2Lab5 {

    public static void main(String[] args) {
        ArrayList<Nhap> danhsach = new ArrayList<Nhap>();
      
        Scanner sc = new Scanner(System.in);
        int chon = 1;
        sc.nextLine();
        do {
            System.out.println("=========MENU=================");
            System.out.println("  0. Ket thuc");
            System.out.println("  1. Nhap ho va ten ");
            System.out.println("  2. Xuat ho va ten ");
            System.out.println("  3. Xuât theo danh sach ngau nhien");
            System.out.println("  4. Sap xep giam dan va xuat danh sach");
            System.out.println("  5. Tim va xoa ho va ten nhap tu ban phim");
            System.out.println("=========================================");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 0:
                    System.exit(chon);
                case 1: {
                    int so = 0;
                    do {
                        Nhap nhap = new Nhap();
                        nhap.nhap();
                        danhsach.add(nhap);
                        System.out.print("Ban co muon tiep tuc khong 0-1");
                        so = sc.nextInt();
                    } while (so == 1);
                    break;
                }
                case 2: {
                    for (Nhap xuat1 : danhsach) {
                        xuat1.xuat();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Xep ngau nhien : ");
                    Collections.shuffle(danhsach);
                    for (Nhap xuat : danhsach) {
                        xuat.xuat();
                    }
                    break;
                }
                case 4: {
                    Comparator<Nhap> comp;
                    comp = new Comparator<Nhap>() {
                        @Override
                        public int compare(Nhap arg0, Nhap arg1) {
                            return arg0.hoten.compareTo(arg1.hoten);
                        }
                    };
                    Collections.sort(danhsach, comp);
                    for (Nhap xuat : danhsach) {
                        xuat.xuat();
                    }
                    break;
                }
                case 5:{ 
                    System.out.println("Nhap ten muon xoa");
                    String tenmuonxoa =sc.nextLine();
                    Nhap nhap1 = new Nhap(tenmuonxoa);
                   
                    danhsach.remove(nhap1);
                  
                }
            }

        } while (chon != 0);
    }
}
