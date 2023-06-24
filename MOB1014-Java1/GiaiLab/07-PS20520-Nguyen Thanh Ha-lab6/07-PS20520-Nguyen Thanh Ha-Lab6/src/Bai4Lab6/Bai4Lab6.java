/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4Lab6;

import java.util.Scanner;

/*Xây dựng phương thức xetHocBong; Xuất danh sách học bổng (Xây dựng lại hàm 
xuất ở câu 3; thêm phần học bổng): Loại khá 1.500.000đ, loại giỏi: 2.000.000đ
 */
public class Bai4Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien ds = new DanhSachSinhVien();
        int chon = 1;
        do {            
            System.out.print("==============MENU=================\n"
                + "0. ket thuc\n"
                + "1. Nhập ds sinh viên\n"
                + "2. Xuất ds vinh viên\n"
                + "3. Tìm theo tên\n"
                + "4. Tìm cmnd\n"
                + "=====================================\n"
                + "Moi ban chon : ");
        chon = sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1: {
                String chon1;
                do {
                    SinhVien sv1 = new SinhVien();
                    sv1.nhap();
                    ds.themsv(sv1);
                    System.out.print("Chon y/n : ");
                     chon1 = sc.next();
                } while (!(chon1.equals("n")));
                break;
            }
            case 2: {
                ds.indanhsach();
                break;
            }
            case 3: {
                System.out.println("Nhap ten muon tim : ");
                String ten = sc.nextLine();
                ds.timten(ten);
                break;
            }
            case 4: {
                System.out.println("Nhap so cmnd muon tim : ");
                String cmnd = sc.nextLine();
                ds.timcmnd(cmnd);
                break;
            }
            case 0 :System.exit(chon);
            default: System.out.println(" Chon sai vui long chon lai !!");
        }
        } while (chon!=0);
    }
}
