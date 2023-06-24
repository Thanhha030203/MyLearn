/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3Lab3;


import java.util.Scanner;

public class Bai3Lab3 {

    public static void main(String[] args) {
        System.out.println("=== DAY SO FIBONACCI ====\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so bat ki : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum = fobi(i);
        }
        System.out.println("-----------------------------\n");
        System.out.println("Fibonacci thu "+n+" la : "+sum);    
    }
        public static int fobi(int n){
         if(n<0){
             return -1;
         } 
         else if(n==0||n==1){
             return n;
         }
         else{
             return fobi(n-1)+fobi(n-2);
         }
    }
}
