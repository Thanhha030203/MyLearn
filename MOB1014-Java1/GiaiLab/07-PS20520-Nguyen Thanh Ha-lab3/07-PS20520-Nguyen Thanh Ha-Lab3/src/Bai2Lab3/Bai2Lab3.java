/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab3;

import java.util.Scanner;
import Bai1Lab3.Bai1Lab3;

/*Nhập vào một số từ bàn phím, xuất ra màn hình các số nguyên tố từ 1 đến n và xuất ra có bao nhiêu số.
 */
public class Bai2Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n=== DAY SO NGUYEN TO TU 1 DEN N ==\n");
        System.out.println("Nhap mot so bat ki : ");
        int n = sc.nextInt();
        int count =0;
        System.out.print("Day so nguyen to tu 1 den "+n+" la : ");
        for(int j=1;j<=n;j++){
            if( Bai1Lab3.one(j)){
                System.out.print(j+"\t");
                count++;
            }
        }
        System.out.println("");
        System.out.println("Co tat ca "+count+" so nguyen to");
        
    }
}

