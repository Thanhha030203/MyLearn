/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import Bai3.SinhVienBiz;
import Bai3.SinhVienIT;
import Bai4.DanhSachSinhVien;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
        DanhSachSinhVien ds = new DanhSachSinhVien();
        
        Scanner sc = new Scanner(System.in);
        int chon = 1;
        do {
            System.out.println("======================MENU================\n"
                    + "0. ket thuc \n"
                    + "1. Nhập danh sách sinh viên\n"
                    + "2. Xuất thông tin danh sách sinh viên\n"
                    + "3. Xuất danh sách sinh viên có học lực giỏi\n"
                    + "4. Sắp xếp danh sách sinh viên theo điểm\n"
                    + "5. Xuat danh sach sinh vien co hoc bong gioi va kha\n"
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
                case 5 : { 
                   
                    break;
                }
                default:
            }
        } while (chon != 0);

    }
}
