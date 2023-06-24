/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3Lab1;

import java.util.Scanner;

/*Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất 
thể tích của khối chữ nhật
 */
public class Bai3Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n-- TINH THE TICH KHOI LAP PHUONG --\n");
        System.out.print("Nhap so do canh cua khoi lap phuong : ");
        float canh = sc.nextFloat();
        System.out.println("The tich cua khoi lap phuong la " + canh + " cm là : " + Math.pow(canh, 3) + " cm");

    }

}
