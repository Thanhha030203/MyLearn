/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab6;

import java.util.Scanner;

/*Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và 
họ xuất IN HOA.
 */
public class Bai1Lab6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        String hovaten = sc.nextLine();
        String ho = hovaten.substring(0, (hovaten.indexOf(" ")));
        String ten = hovaten.substring((hovaten.lastIndexOf(" ")) + 1);
        String tenlot = hovaten.substring((hovaten.indexOf(" ")) + 1, (hovaten.lastIndexOf(" ")));
        System.out.println(" Ho : " + ho.toUpperCase());
        System.out.println("Ten lot : " + tenlot);
        System.out.println("Ten : " + ten.toUpperCase());
    }

}
