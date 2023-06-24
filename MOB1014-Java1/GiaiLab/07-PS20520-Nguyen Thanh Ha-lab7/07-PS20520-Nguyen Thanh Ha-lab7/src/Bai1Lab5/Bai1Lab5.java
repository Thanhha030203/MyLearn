/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/*Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách vừa 
nhập và tổng của nó.
 */
public class Bai1Lab5 {

    /*
     */
    public static void main(String[] args) {
        ArrayList<Double> danhsach = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach : ");
        for(int i=0; ;i++){
            Double bien = sc.nextDouble();
            danhsach.add(bien);
            System.out.print ("Ban co muon tiep tuc? chon 0 de dung : ");
           int x= sc.nextInt();
           if(x==0){
               break;
           }
    }
        double tong =0;
        System.out.print("\nIn ra danh sach vưa nhap : \t");
        for(Double n :danhsach){
            System.out.print(n +"\t");
           tong+=n;
        }
        System.out.println("\n\nTong cac so trong danh sach la : "+tong);
  } 
}
