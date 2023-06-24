/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.ps20404.hieu.assigment.pkgfinal;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class test {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<nhanVien> list = new ArrayList<nhanVien>();

    public static void main(String[] args) {
        while (true) {
           System.out.println("=============== Menu quan ly nhan vien ==================================");
            System.out.println("= 0. Thoat chuong trinh                                          =========");
            System.out.println("= 1. Nhap danh sach nhan vien tu ban phim                        =========");
            System.out.println("= 2. Xuat danh sach nhan vien ra man hinh :                      ==========");
            System.out.println("= 3. Tim va hien thi nhan vien theo ma nhap tu ban phim :        ==========");
            System.out.println("= 4. Xoa nhan vien theo ma nhap tu ban phim :                    ==========");
            System.out.println("= 5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim :     ==========");
            System.out.println("= 6. Tim cac nhan vien theo khoang luong da nhap tu ban phim :   ==========");
            System.out.println("= 7. Sap xep nhan vien theo ho va ten :                          ==========");
            System.out.println("= 8. Sap xep nhan vien theo thu nhap :                           ===========");
            System.out.println("= 9. Xuat 5 nhan vien co thu nhap cao nhat :                     ===========");
            System.out.println("=============================================================================");
            int menu;
            System.out.print("Nhap so can chon : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;

            }
        }
    }

    public static void nhap() {
        while (true) {

            int chon;
            System.out.print("Moi ban chon chuc vu :\n \t 1. Nhan vien \n \t 2. Tiep thi \n \t 3. Truong phong \n ");
            System.out.print("Nhap chuc vu can chon : ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhanVien nv = new nhanVien();
                    nv.nhap();
                    list.add(nv);
                    break;
                case 2:
                    TiepThi tt = new TiepThi();
                    tt.nhap();
                    list.add(tt);

                    break;
                case 3:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap();
                    list.add(tp);
                    break;

            }
            System.out.print("Ban muon tiep tuc nhan enter , dung lai nhan n : ");
            String nhap = sc.nextLine();
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }

        }
        System.out.println("---------------------");
    }

    public static void xuat() {
        System.out.println("========== Hien thi thong tin vua nhap =========");
        for (nhanVien nv : list) {
            nv.xuat();
            System.out.println("---------------------------------------------");

        }
        System.out.println("-----------------------");
    }
    public static void timvaxuat(){
        
    }
}
