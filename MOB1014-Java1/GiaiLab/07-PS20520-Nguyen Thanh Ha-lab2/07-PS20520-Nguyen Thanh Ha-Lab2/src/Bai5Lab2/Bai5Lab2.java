/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5Lab2;

import java.util.Scanner;

/*Nhập vào một số n
a) Tính tổng: S = 1 + 2 + … + n
b) Tính tích: P = 1.2. … .n
c) Xuất ra các số từ 1 đến n chia hết cho 3
d) Xuất ra các số theo thứ tự ngược lại: n, n – 1, …., 3, 2, 1
 */
public class Bai5Lab2 {
    public static void main(String[] args) {
        System.out.println("\n\n=== PHEP TINH VOI MOT SO NGUYEN ===\n");
        System.out.print("Nhap mot so nguyen n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        double mul = 1.0;
        for(int i=1; i<=n ;i++){
            sum += i ;
            mul *= i ;            
        }
        System.out.println("Tong cac so tu 1 den "+n+" la :\t"+sum);
        System.out.printf("Tich cac so tu 1 đen %d  la %f.1:\t",n,mul);
        System.out.print("Cac so chia het cho 3 la : ");
        for(int i=1 ; i<=n ; i++){
            if(i%3==0){
                System.out.print(i+"\t");
            }
        }
        System.out.println("");
        System.out.print("Cac so duoc xep nguoc lai la : ");
        for(int i=n ; i>=1 ; i--){
            System.out.print(i+"\t");
        }
        System.out.println("");
    
    }
            
    
}
