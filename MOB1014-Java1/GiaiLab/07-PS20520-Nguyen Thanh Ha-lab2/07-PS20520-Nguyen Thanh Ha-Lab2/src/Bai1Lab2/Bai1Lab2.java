/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab2;

import java.util.Scanner;

/*Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b 
nhập từ bàn phím
 */
public class Bai1Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== PHUONG TRINH aX + b ===\n");
        System.out.print("Nhap he so a : ");
        float a = sc.nextFloat();
        System.out.print("Nhap he so b : ");
        float b = sc.nextFloat();
        System.out.printf("Giai phuong trinh bac nhat %.0fx +%.0f  ta có : \n= >>",a,b);
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            System.out.println("Phương trình co nghiem x = "+(-b/a));
        }
        
    }
}
