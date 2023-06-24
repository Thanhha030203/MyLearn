/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n=== TO HOP HO + TEN LOT + TEN ====\n");
        System.out.println("Nhâp số họ : ");
        int ho = sc.nextInt();
        String a[]= new String[ho];
        System.out.println("Nhâp họ : ");
        for(int i=0;i<ho;i++){ 
            a[i]=sc.next();
        }
        System.out.println("Nhâp số tên lót : ");
        int tenlot = sc.nextInt();
        String b[]= new String[tenlot];
        System.out.println("Nhâp tên lót : ");
        for(int i=0;i<tenlot;i++){ 
            b[i]=sc.next();
        }
        System.out.println("Nhâp số tên : ");
        int ten = sc.nextInt();
        String c[]= new String[ten];
        System.out.println("Nhâp tên : ");
        for(int i=0;i<ten;i++){ 
            c[i]=sc.next();
        }
        System.out.println("== kết quả tổ hợp : ");
        int count =0;
        for(int i=0;i<ho;i++){
            for(int j=0;j<tenlot;j++){
                for(int k=0;k<ten;k++){
                    System.out.println(a[i]+" "+b[j]+" "+c[k]);
                    count++;
                }
            }
        }
        System.out.println(" Có tất cả "+count+" họ và tên được tạo thành");
    }
    
}
