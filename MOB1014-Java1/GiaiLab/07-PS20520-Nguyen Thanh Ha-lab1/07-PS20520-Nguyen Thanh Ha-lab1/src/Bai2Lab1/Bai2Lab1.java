/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab1;

import java.util.Scanner;

/*Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi, 
diện tích và cạnh nhỏ của hình chữ nhật.
 */
public class Bai2Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n---- TINH CHU VI VÀ DIEN TICH HINH CHU NHAT -----\n");
        System.out.println("Nhap vao hai canh cua hinh chu nhat :");
        System.out.print("Nhap canh thu 1 : ");
        float dai = sc.nextFloat();
        System.out.print("Nhap canh thu 2 : ");
        float rong = sc.nextFloat();
        System.out.println("Chu vi cua hinh chu nhat : " + (dai + rong) * 2);
        System.out.println("Dien tich cua hinh chu nhat : " + (dai * rong));
        System.out.println("Canh nho nhat cua hinh chu nhat la : " + Math.min(dai, rong));

    }

}
