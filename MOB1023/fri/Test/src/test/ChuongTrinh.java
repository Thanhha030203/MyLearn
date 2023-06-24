/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER ( ATV )
 */
public class ChuongTrinh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<LapTop> list = new ArrayList<>();
        
        int choose;
        do {
            //        MENU
            System.out.println("QUAN LY CHUONG TRINH");
            System.out.println("----------------------------------");
            System.out.println("1. Nhap Laptop");
            System.out.println("2. Xuat Laptop");
            System.out.println("3.Ket thuc ung dung");
            System.out.println("----------------------------------");
            System.out.print("Chon chuong trinh: ");
            choose = sc.nextInt();
            sc.nextLine();
            if (choose == 3) {
                System.out.println("Ket thuc!");
                break;
            }
            switch (choose) {
                case 1: {
                    System.out.println("Nhap Laptop");
                    LapTop lt = new LapTop();
                    lt.nhap();
                    list.add(lt);
                
                    break;
                }
                case 2: {
                    System.out.println("Xuat Laptop");
                    list.forEach(i ->{
                        i.xuat();
                    });
                    break;
                }
                default: {
                    System.out.println("Chuong trinh khong ton tai! Vui long nhap lai");
                }
            }
        } while (true);
    }
}
