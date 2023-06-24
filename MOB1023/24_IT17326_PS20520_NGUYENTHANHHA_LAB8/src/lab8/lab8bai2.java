/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab8bai2 {
     public static void main(String[] args) {
           ArrayList<Integer> myarr = new ArrayList<Integer>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào danh sach");
           try {
              for(int i=0; i<10;i++){ 
                System.out.print("Số thứ "+(i+1)+" :  ");
                 myarr.add(sc.nextInt());
            }
         } catch (Exception e) {
               System.out.println("Lỗi do nhập " + e);
         }
            System.out.println("In ra màn hình danh sách");
               myarr.forEach(i->{
                   System.out.println(i);
               });
    }
}
