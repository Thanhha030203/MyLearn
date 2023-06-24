/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Asm2 {

    public static void main(String[] args) {
        ArrayList<NhanVien> arrnv = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int chon;
            System.out.println("______________________________Menu_____________________________");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap danh sach nhan vien tu ban phim");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh");
            System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
            System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
            System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("________________________________________________________________");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Ban chon nhap danh sach nhan vien tu ban phim");
                    nhap(arrnv);
                    break;
                case 2:
                    System.out.println("Ban chon xuat danh sach nhan vien ra man hinh");
                    xuat(arrnv);
                    break;
                case 3:
                    System.out.println("Ban chon tim va hien thi nhan vien theo ma nhap tu ban phim");
                    TimNhanVien(arrnv);
                    break;
                case 4:
                    System.out.println("Ban chon xoa nhan vien theo ma nhap tu ban phim");
                    Xoa(arrnv);
                    break;
                case 5:
                    System.out.println("Ban chon cap nhat thong tin nhan vien theo ma nhap tu ban phim");
                    
                    break;
                case 6:
                    System.out.println("Ban chon tim cac nhan vien theo khoang luong nhap tu ban phim");
                    TimTheoLuong(arrnv);
                    break;
                case 7:
                    System.out.println("Ban chon sap xep nhan vien theo ho va ten");
                    break;
                case 8:
                    System.out.println("Ban chon sap xep nhan vien theo thu nhap");
                    break;
                case 9:
                    System.out.println("Ban chon xuat 5 nhan vien co thu nhap cao nhat");
                    break;
                default:
                    System.out.println("Chuc nang ban chon chua dung ");
            }
        }
    }//end main

    static void nhap(ArrayList<NhanVien> arrnv) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ho va ten: ");
            String ten = sc.nextLine();
            System.out.println("Ma nhan vien: ");
            String manv = sc.nextLine();
            System.out.println("Luong: ");
            Double luong = Double.parseDouble(sc.nextLine());
            System.out.println("Chuc vu: (1.Truong Phong-2.Tiep Thi)");
            int cv = Integer.parseInt(sc.nextLine());
            if (cv == 1) {
                System.out.println("Tien trach nhiem: ");
                Double trachnhiem = Double.parseDouble(sc.nextLine());
                NhanVien nv = new TruongPhong(ten, manv, luong, trachnhiem);
                arrnv.add(nv);
            } else {
                System.out.println("Tien danh so: ");
                Double danhSo = Double.parseDouble(sc.nextLine());
                System.out.println("Tien hue hong: ");
                Double hueHong = Double.parseDouble(sc.nextLine());
                NhanVien nv = new TiepThi(ten, manv, luong, danhSo, hueHong);
                arrnv.add(nv);
            }

            System.out.println("Ban co muon tiep tuc nhap khong (C/K)?? ");
            if (sc.nextLine().equalsIgnoreCase("K")) {
                break;
            }
        }
    }

    static void xuat(ArrayList<NhanVien> arrnv) {
        for (NhanVien nv : arrnv) {
            nv.xuat();
        }
    }

    static void TimNhanVien(ArrayList<NhanVien> arrnv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien muon tim: ");
        String manv = sc.nextLine();
        boolean kt = false;
        for (NhanVien nv : arrnv) {
            if (nv.getManv().equalsIgnoreCase(manv)) {
                kt = true;
                nv.xuat();
            }
        }
        if (!kt) {
            System.out.println("Khong tim thay ma nhan vien " + manv);
        }
    }

    static void Xoa(ArrayList<NhanVien> arrnv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien muon xoa: ");
        String manv = sc.nextLine();
        boolean kt = false;
        for (NhanVien nv : arrnv) {
            if (nv.getManv().equalsIgnoreCase(manv)) {
                arrnv.remove(nv);
                System.out.println("Da xoa duoc nhan vien " + manv);
                kt = true;
                break;
            }
        }
        if (!kt) {
            System.out.println("Khong tim thay ma nhan vien " + manv);
        }
    }
    static void TimTheoLuong(ArrayList<NhanVien> arrnv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong nhan vien muon tim: ");
        Double luong =sc.nextDouble();
        boolean kt = false;
        for (NhanVien nv : arrnv) {
            if (nv.getLuong()==luong) {
                kt = true;
                nv.xuat();
            }
        }
        if (!kt) {
            System.out.println("Khong tim thay ma nhan vien " + luong);
        }
    }
}
