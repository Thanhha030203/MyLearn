/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3Lab2;

import java.util.Scanner;

/*Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo 
phương pháp lũy tiến
 Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
 Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
 */
public class Bai3Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n=== TINH TIEN DIEN ======\n");
        System.out.println("Nhap so dien da su dung : ");
        int dien = sc.nextInt();
        int tien;
        if(dien <=50){
             tien = dien*1000;
        }
        else{
             tien = (50*1000)+(dien-50)*1200;
        }
        System.out.println("So tien phai tra la : "+tien);
    }
    
}
