/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import static Assignment.Menu.ds;
import Assignment_final.TiepThi;
import Assignment_final.TruongPhong;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    static  DanhSachNhanVien ds = new DanhSachNhanVien();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        
            
    int chon =1;
        do { 
            System.out.print("==========================  MENU  ============================\n"
                    + "  0. ket thuc\n"
                    + "  1. Nhap danh sach nhan vien tu ban phim  \n"
                    + "  2. Xuat danh sach nhan vien ra ban phim\n"
                    + "  3. Tim va hien thi nhan vien theo ma nhap tu ban phim\n"
                    + "  4. Xoa nhan vien theo ma nhap tu ban phim\n"
                    + "  5. Cao nhat thong tin nhan vien theo ma nhap tu ban phim\n"
                    + "  6. Tim cac nhan vien theo khoang lương nhap tu ban phim\n"
                    + "  7. Sap xeo nhan vien ho va ten \n"
                    + "  8. Sap xep nhan vien theo thu nhap\n"
                    + "  9. Xuat 5 nhan vien co thu nhap cao nhat\n"
                    + "==================================================================\n"
                    + "Moi ban chon : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){ 
                case 0 : System.exit(chon);
                case 1 :{
                    do {  
                        nhapnv();
                       System.out.print("Ban muon tiep tuc khong (c/k) : ");
                    } while (!sc.nextLine().equalsIgnoreCase("K"));                          
                    break;
                }
                case 2 :{
                    ds.inDanhSach();
                    break;
                }
                case 3 :{ 
                    System.out.print("Nhap ma nhan vien muon tim : ");
                    String ma = sc.nextLine();
                    ds.timtheoma(ma);
                    break;
                }
                case 4 :{ 
                        ds.xoa();
                    break;
                }
                case 5 :{ 
                    System.out.print("Nhap ma sinh vien muon cap nhat : ");
                    String ma = sc.nextLine();
                    System.out.println("Trang thai cap nhat : "+ds.capnhattheoma(ma));
                    
                    break;
                }
                case 6 :{
                    System.out.print("Nhap khoang luong -> tu : ");
                    double luong1 = Double.parseDouble(sc.nextLine());
                    System.out.print(" den : ");
                    double luong2 = Double.parseDouble(sc.nextLine());
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
            Thread.sleep (1000);
        } while (chon!=0);
    }
    
   
    public static  void nhapnv(){ 
        
        System.out.println("Ban muon nhap nhan vien chuc vu gi : ");
        System.out.println("1. Hanh chinh ");
        System.out.println("2. Truong phong");
        System.out.println("3. Tiep thi");
        System.out.print("Moi ban chon : ");
        int chucvu = Integer.parseInt(sc.nextLine());
        switch (chucvu){ 
            case  1: { 
                NhanVien nv = new NhanVien();
                nv.nhap();
                ds.themNhanVien(nv);
                break;
            }
            case 2:{ 
                NhanVien nv1 = new TruongPhong();
                nv1.nhap();
                ds.themNhanVien(nv1);
                break;
            }
            case 3:{ 
                NhanVien nv2 = new TiepThi();
                nv2.nhap();
                ds.themNhanVien(nv2);
                break;
            }
            
        }
    }
}
