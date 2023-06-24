/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1lab1;

import java.util.Scanner;

/*Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn 
phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.*/
public class Bai1Lab1 {

    public static void main(String[] args) {
        System.out.println("\n\n----- SINH VIEN -----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien : ");
        String Name = sc.nextLine();
        System.out.print("Nhap diem sinh vien : ");
        float Point = sc.nextFloat();
        System.out.println("----------------------------------------");
        System.out.println("Ho va ten sinh vien : " + Name + " - diem trung binh : " + Point);
        System.out.printf("Họ tên sinh viên %s -siểm trung bình %f ",Name,Point);
    }
}
