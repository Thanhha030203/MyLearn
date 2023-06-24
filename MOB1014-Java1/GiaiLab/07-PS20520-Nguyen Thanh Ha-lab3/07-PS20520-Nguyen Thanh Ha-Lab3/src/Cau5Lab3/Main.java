/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau5Lab3;
import Cau5Lab3.Theonam;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Theonam nam = new Theonam();
        theothang thangvay = new theothang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien muon vay:  ");
        float tienvay = sc.nextFloat();
        System.out.println("Nhap % lai vay hang nam :  ");
        float laivay = sc.nextFloat();
        float laihangthang = laivay/12;
        System.out.println("================================================");
        System.out.println(" 1. Tinh theo so nam can vay ");
        System.out.println(" 2. Tinh theo so tien co the tra hang thang ");
        System.out.println("================================================");
        System.out.println("Moi chon : ");
        int chon = sc.nextInt();
        switch(chon){ 
            case 1 : 
                System.out.println("Nhap so nam ban muon tra : ");
                int namvay = sc.nextInt();
                nam.tra(tienvay,namvay,laihangthang);break;
            case 2:{ System.out.println("Nhap so tien ban co the tra hang thang  : ");
                int trathang = sc.nextInt();
                thangvay.trathang(tienvay, trathang,laihangthang);
                break;}
        }
        
        
    }
}
