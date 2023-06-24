/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Assignment {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int chon;
        while(true){
            System.out.print("+================================ MENU ===========================+\n" +
                               "|       0. Ket thuc                                               |\n" +
                               "|       1. Nhap danh sach nhan vien tu ban phim                   |\n"+
                               "|       2. Xuat danh sach nhan vien ra man hinh                   |\n" +
                               "|       3. Tim va hien thi nhan vien theo ma nhap tu ban phim     |\n" +
                               "|       4. Xoa nhan vien theo ma nhap tu ban phim                 |\n" +
                               "|       5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim  |\n" +
                               "|       6. Tim cac nhan vien theo khoang luong nhap tu ban phim   |\n" +
                               "|       7. Sap xep nhan vien theo ho va ten                       |\n" +
                               "|       8. Sap xep nhan vien theo thu nhap                        |\n" +
                               "|       9. Xuat 5 nhan vien co thu nhap cao nhat                  |\n" +
                               "+=============================== MENU ============================+\n" +
                               "Moi ban chon =>>> ");
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0: System.exit(0);
                case 1: System.out.println("Nhap danh sach nhan vien tu ban phim");break;
                case 2: System.out.println("Xuat danh sach nhan vien ra man hinh");break;
                case 3: System.out.println("Tim va hien thi nhan vien theo ma nhap tu ban phim");break;
                case 4: System.out.println("Xoa nhan vien theo ma nhap tu ban phim");break;
                case 5: System.out.println("Cap nhat thong tin nhan vien theo ma nhap tu ban phim");break;
                case 6: System.out.println("Tim cac nhan vien theo khoang luong nhap tu ban phim");break;
                case 7 : System.out.println("Sap xep nhan vien theo ho va ten");break;
                case 8 : System.out.println("Sap xep nhan vien theo thu nhap");break;
                case 9 : System.out.println("Xuat 5 nhan vien co thu nhap cao nhat");break;
                default : System.out.println(" Ban chon sai vui long chon lai : ");break;      
            }
                Thread.sleep(3000, 1000);
        }
    }
    
}
