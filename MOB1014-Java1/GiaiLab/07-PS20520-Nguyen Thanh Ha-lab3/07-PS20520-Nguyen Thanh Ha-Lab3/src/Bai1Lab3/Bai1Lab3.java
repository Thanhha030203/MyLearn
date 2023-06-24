/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab3;

import java.util.Scanner;

/*Viết hàm và truyền vào một số n, kiểm tra đó có phải là số nguyên tố hay không (số
nguyên tố là số chỉ chia hết cho 1 và chính nó). Nếu đúng trả về true, nếu sai trả về
false.
 */
public class Bai1Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n=== KIEM TRA SO NGUYEN TO ===\n");
        System.out.print("Nhap ngau nhien mot so : ");
        int bien = sc.nextInt();
        System.out.print("Ket qua : "); 
        if(one(bien)){
            System.out.println(bien+" la so nguyen to");
        }
        else{
            System.out.println(bien+" khong phai la so nguyen to");
        }
    }
    public static boolean one (int n){
        boolean ktra = true;
        if(n<=2){
           return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                ktra = false;
                break;
            } 
        }
        return ktra;
    }
}
