/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac: ");
        System.out.print("Canh 1 = ");
        double canh1 = sc.nextDouble();
        System.out.print("Canh 2 = ");
        double canh2 = sc.nextDouble();
        System.out.print("Canh 3 = ");
        double canh3 = sc.nextDouble();
        tamgiac tg = new tamgiac(canh1,canh2,canh3);
        if(Math.pow(canh1,2) == (Math.pow(canh2,2)+Math.pow(canh3,2))
                 || Math.pow(canh2,2) == (Math.pow(canh1,2)+Math.pow(canh3,2))
                 || Math.pow(canh3,2) == (Math.pow(canh1,2)+Math.pow(canh2,2))){
            System.out.println("* Tam giac vuong:");
            System.out.println("Chu vi = "+ tg.chuVi() +"\nDien tich: "+ tg.dienTich());
        }else if(canh1==canh2 || canh1==canh3 || canh2==canh3){
            System.out.println("* Tam giac can: ");
            System.out.println("Chu vi = "+ tg.chuVi() +"\nDien tich: "+ tg.dienTich());
        }else if(canh1==canh2 && canh2==canh3 && canh1==canh3){
            System.out.println("* Tam giac deu: ");
            System.out.println("Chu vi = "+ tg.chuVi() +"\nDien tich: "+ tg.dienTich());
        }
        else{
            System.out.println("* Tam giac thuong: ");
            System.out.println("Chu vi = "+ tg.chuVi() +"\nDien tich: "+ tg.dienTich());
        }
    }
}
