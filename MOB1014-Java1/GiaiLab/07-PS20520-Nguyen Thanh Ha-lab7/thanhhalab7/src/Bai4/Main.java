/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;
public class Main {
        public static Scanner sc = new Scanner(System.in);
        public static DanhSachSinhVien ds = new DanhSachSinhVien();
    public static void main(String[] args) {
        int chon = 1;
         
            
        do {
         
            System.out.println("======================MENU================\n"
                    + "0. ket thuc \n"
                    + "1. Nhập danh sách sinh viên\n"
                    + "2. Xuất thông tin danh sách sinh viên\n"
                    + "3. Xuất danh sách sinh viên có học lực giỏi\n"
                    + "4. Sap xep danh sach sinh vien theo diem\n"
                    + "======================================================\n"
                    + "Moi ban chon : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){                
                case 1 : { 
                        ds.nhap();
                        
                    break;
                }
                case 2 : { 
                    ds.in();
                    break;
                }
                case 3 : {
                    ds.hocluc();
                    break;
                }
                case 4 : { 
                    ds.sapxep();
                    ds.in();
                    break;
                }
                default: System.out.print("Ban nhap sai vui long nhap lai");
            } 
        } while (chon != 0);

    
        }
    
}
      



