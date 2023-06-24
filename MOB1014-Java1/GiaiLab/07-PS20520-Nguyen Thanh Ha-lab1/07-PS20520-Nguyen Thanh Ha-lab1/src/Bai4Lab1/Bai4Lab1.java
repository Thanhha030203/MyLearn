/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4Lab1;

import java.util.*;

/*Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn 
delta ra màn hình.
 */
public class Bai4Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n GIAI PHUONG TRINH BAC 2: ax^2 + bx + c = 0 \n");
        System.out.print("Nhap he a : ");
        float a = sc.nextFloat();
        System.out.print("Nhap he b : ");
        float b = sc.nextFloat();
        System.out.print("Nhap he c : ");
        float c = sc.nextFloat();
        System.out.println("------------------------------------------------");
        float delta = (float) (Math.pow(b, 2) - (4 * a * c));
        float can = (float) Math.sqrt(delta);
        System.out.println(" Delta = " + can);
    }
}
