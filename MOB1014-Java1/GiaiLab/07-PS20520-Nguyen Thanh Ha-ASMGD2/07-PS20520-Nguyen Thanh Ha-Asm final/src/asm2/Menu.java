/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    static  DanhSachNhanVien ds = new DanhSachNhanVien();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        
            
    int chon =1;
        do { 
            System.out.print("==========================  MENU ============================\n"
                    + "0. ket thuc\n"
                                 + "1. Nhap danh sach nhan vien tu ban phim  \n"
                    + "2. Xuat danh sach nhan vien ra ban phim\n"
                    + "3. Tim va hien thi nhan vien theo ma nhap tu ban phim\n"
                    + "4.Xoa nhan vien theo ma nhap tu ban phim"
                    + "5. Cao nhat thong tin nhan vien theo ma nhap tu ban phim\n"
                    + "6. Tim cac nhan vien theo khoang lương nhap tu ban phim\n"
                    + "7. Sap xeo nhan vien ho va ten \n"
                    + "8. Sap xep nhan vien theo thu nhap\n"
                    + "9. Xuat 5 nhan vien co thu nhap cao nhat\n"
                    + "==================================================================\n"
                    + "Moi ban chon : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){ 
                case 1 :{ 
                    NhanVien nv = new NhanVien();
                    nv.nhap();
                    ds.themNhanVien(nv);
                    break;
                }
                case 2 :{
                    ds.inDanhSach();
                    break;
                }
                case 3 :{ 
                    System.out.println("Nhap ma nhan vien muon tim : ");
                    String ma = sc.nextLine();
                    ds.timtheoma(ma);
                    break;
                }
                case 4 :{ 
                        System.out.println("Trang thai xoa : "+trangthai());
                    break;
                }
                case 5 :{ 
                    System.out.println("Nhap ma sinh vien muon cap nhat : ");
                    String ma = sc.nextLine();
                    System.out.println("Trang thai cap nhat : "+ds.capnhattheoma(ma));
                    
                    break;
                }
                case 6 :{
                    System.out.println("Nhap khoang luong -> tu : ");
                    double luong1 = sc.nextDouble();
                    System.out.print(" den : ");
                    double luong2 = sc.nextDouble();
                    ds.timtheokhoangluong(luong1, luong2);
                    break;
                }
                case 7 :{
                    ds.Sapxephoten();
                    break;
                }
                case 8 :{ 
                    ds.sapxeptheothunhap();
                    ds.inDanhSach();
                    break;
                }
                case 9 :{
                    ds.sapxeptheothunhap();
                    ds.danhsach5nhanvien();
                    break;
                }
                default: System.out.println("Nhap sai vui long nhap lai!!");
            }
            Thread.sleep (3000);
        } while (chon!=0);
    }
    
    static  String trangthai(){ 
        System.out.println("Nhap ma nhan vien muon xoa : ");
                    String msnv = sc.nextLine();
                    NhanVien nv1 = new NhanVien(msnv);
            if(ds.ktra(nv1)){ 
                return "thanh cong";
        }
            else{ return "that bai";
            
            }
    }
    
}
