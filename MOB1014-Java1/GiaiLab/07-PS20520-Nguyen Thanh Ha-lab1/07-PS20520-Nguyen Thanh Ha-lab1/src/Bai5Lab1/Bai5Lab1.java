/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5Lab1;

import java.util.Scanner;

/*Viết chương trình nhập và một số, kiểm tra số đó:
a. Kiểm tra số dương
b. Kiểm tra số chẵn
c. Kiểm tra số lớn hơn 5
 */
public class Bai5Lab1 {

    public static void main(String[] args) {
        System.out.println("\n\n=== KIEM TRA MOT SO BAT KI ===\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so bat ki :\t");
        int so = sc.nextInt();
        System.out.println("----------------------");
        if (so > 0) {
            System.out.println(so + " la so duong");
        } else {
            System.out.println(so + " khong phai la so duong");
        }
        if (so % 2 == 0) {
            System.out.println(so + " la so chan ");
        } else {
            System.out.println(so + " la so le");
        }
        if (so < 5) {
            System.out.println(so + " be hon 5");
        } else if (so > 5) {
            System.out.println(so + " lon hon 5 5");
        } else {
            System.out.println(so + " bang 5");
        }
        if(so%5==0&so%3==0){
            
        }
    }
}
