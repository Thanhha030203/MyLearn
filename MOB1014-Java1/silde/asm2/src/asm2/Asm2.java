/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author dell
 */
public class Asm2 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        do {            
        
        Scanner nhap = new Scanner(System.in);
        System.out.println("+-------------------------<<MENU>>------------------------+");
            System.out.println("| 0.Thoát                                                 |");
            System.out.println("| 1.Nhập danh sách nhân viên                              |");
            System.out.println("| 2.Xuất danh sách nhân viên                              |");
            System.out.println("| 3.Tìm và hiển thị nhận viên theo mã nhập từ bàn phím    |");
            System.out.println("| 4.Xóa nhân viên theo mã nhập từ bàn phím                |");
            System.out.println("| 5.Cập nhật thông tin nhân viên theo mã                  |");
            System.out.println("| 6.Tìm các nhân viên theo khoảng lương                   |");
            System.out.println("| 7.Sắp xếp theo họ và tên                                |");
            System.out.println("| 8.Sắp xếp theo khoảng lương                             |");
            System.out.println("| 9.Xuất ra 5 người có lương cao nhất                     |");
            System.out.println("+---------------------------------------------------------+");
        System.out.println("Moi chon chuc nang: ");
        int n= sc.nextInt();
        sc.nextLine();
        switch(n){
            case 1: 
                System.out.println("Nhap danh sach nhan vien tu ban phim");
                nhapDs();
            break;
            case 2: 
                System.out.println("Xuat danh sach nhan vien len man hinh");
                xuatDs();
            break;
            case 3: 
                System.out.println("Tim va hien thi nhan vien theo ma nhap tu ban phim");
                timMaNV();
            break;
            case 4: 
                System.out.println("Xoa nhan vien theo ma tu ban phim");
                xoaDs();
            break;
            case 5: 
                System.out.println("Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
                capNhatDs();
            break;
            case 6: 
                System.out.println("Tim cac nhan vien theo khoang luong nhap tu ban phim");
                timLuongNV();
            break;
            case 7: 
                System.out.println("Sap xep nhan vien theo ho va ten");
                XSNVten();
            break;
            case 8: 
                System.out.println("Sap xep nhan vien theo thu nhap");
                SXNVluong();
            break;
            case 9: 
                System.out.println("Xuat 5 nhan vien co thu nhap cao nhat");
                LuongMax5NV();
            break;
            case 0: 
                System.out.println("Thoat ra ");
                System.exit(0);
            default:
                System.out.println("Nhap khong hop le. Vui long nhap lai!");
            break;
        }
        } while (true);
    }
    static void nhapDs(){
        System.out.println("Chuc nang 1: Nhap danh sach nhan vien");
        do
        {
            System.out.print("Nhap ma nhan vien: ");
            String msnv = sc.nextLine();
            System.out.print("Nhap ho ten nhan vien: ");
            String hoten =sc.nextLine();
            System.out.print("Nhap luong nhan vien: ");
            double luong = sc.nextDouble();
            System.out.print("Truong Phong (nhap 1) || Tiep Thi (nhap 2) || Hanh Chinh (nhap 3)\n Chon chuc vu: ");
            int loai = sc.nextInt();
            if(loai == 1)
            {
                System.out.print("Nhap luong trach nhiem:");
                double tn=sc.nextDouble();
                sc.nextLine();
                TruongPhong a = new TruongPhong(msnv, hoten, luong, tn);
                ds.add(a);
            }
            else if(loai == 2)
            {
                System.out.print("Nhap doanh so: ");
                double doanhSo=sc.nextDouble();
                System.out.print("Nhap hoa hong: ");
                double hoaHong=sc.nextDouble();
                sc.nextLine();
                NVTiepThi a =new NVTiepThi(msnv, hoten, luong, doanhSo, hoaHong);
                ds.add(a);
            }
            else
            {
                sc.nextLine();
                NhanVien a = new NhanVien(msnv,hoten,luong);
                ds.add(a);
            }

            System.out.print("Ban co muon nhap tiep tuc?? (C/K): ");
            String tl=sc.nextLine();
            if(tl.equals("K"))
                break;
        }while(true);
    }
    static void xuatDs(){
        System.out.println("Chuc nang 2: Xuat danh sach nhan vien");
        
        for(int i=0;i<ds.size();i++)
        {
            System.out.println(ds.get(i).xuatThongTin());
        }
    }
    static void timMaNV(){
        System.out.println("Chuc nang 3: Tim va hien thi nhan vien theo ma");
        
        System.out.print("Nhap ma nhan vien can tim: ");
        String ma=sc.nextLine();
        for(int i=0;i<ds.size();i++)
        {
           if(ds.get(i).manv.equalsIgnoreCase(ma))
           {
               System.out.println("------------Thong tin nhan vien can tim-----------");
               System.out.println(ds.get(i).xuatThongTin());
           }
        }
    }
    static void xoaDs(){
        System.out.println("Chuc nang 4: Xoa nhan vien theo ma");
        
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ma=sc.nextLine();
        int indexcanxoa=-1;
        for(int i=0;i<ds.size();i++)
        {
           if(ds.get(i).manv.equalsIgnoreCase(ma))
           {
               indexcanxoa=i;
           }
        }
        ds.remove(indexcanxoa);
    }
    static void capNhatDs(){
        System.out.println("Chuc nang 5: Cap nhat thong tin nhan vien theo ma nhap");
        System.out.print("Nhap ma nhan vien: ");
        String ma = sc.nextLine();

        for(NhanVien nv : ds){
            if(nv.getmanv().equalsIgnoreCase(ma)){
                System.out.println("Cac thong tin co the cap nhat");
                System.out.println("1.Ho va ten nhan vien");
                System.out.println("2. Ma nhan vien");
                System.out.println("3. Luong");
                System.out.print(">...");
                int opt = Integer.parseInt(sc.nextLine());
                if(opt == 1){
                    System.out.print("Nhap ho ten: ");
                    nv.sethoTen(sc.nextLine());
                } else if(opt == 2){
                    System.out.print("Nhap ma: ");
                    nv.setmanv(sc.nextLine());
                } else if(opt == 3){
                    System.out.print("Nhap luong: ");
                    nv.setluong(Double.parseDouble(sc.nextLine()));
                }
                ds.set(ds.indexOf(nv), nv);
            }
        }
    }
    static void timLuongNV(){
        System.out.println("Chuc nang 6: Tim cac nhan vien theo khoang luong da nhap");
        System.out.println("Tim nhan vien theo khoang luong: ");
        System.out.print("Nhap luong dau: ");
        double luongDau=sc.nextDouble();
        System.out.print("Nhap luong cuoi: ");
        double luongCuoi=sc.nextDouble();
        int soLuong = 0;
        for(int i=0;i<ds.size();i++)
        {
            NhanVien a=ds.get(i);
            if(a.luong>luongDau && a.luong<luongCuoi)
            {
                System.out.println(a.xuatThongTin());
                soLuong++;
            }
        }
        System.out.println("Tim thay so luong nv thoa khoang luong: "+soLuong);
    }
    static void XSNVten(){
        System.out.println("Chuc nang 7: Sap xep nhan vien theo ho va ten");
          Comparator<NhanVien> comparator=new Comparator<NhanVien>() {
            
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.hoTen.compareTo(o2.hoTen);
            }
          };
          Collections.sort(ds, comparator);
    }
    static void SXNVluong(){
        System.out.println("Chuc nang 8: Sap xep nhan vien theo thu nhap");
            Comparator<NhanVien> comparator=new Comparator<NhanVien>() {
            
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    return (int)(o1.luong-o2.luong);
                }
            };
            Collections.sort(ds, comparator);
    }
    static void LuongMax5NV(){
        System.out.println("Chuc nang 9: Xuat 5 nhan vien co thu nhap cao nhat.");
            Comparator<NhanVien> comparator=new Comparator<NhanVien>() {
            
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    return (int)(o2.luong-o1.luong);
                }
            };
            Collections.sort(ds, comparator);
            for(int i=0;i<2;i++)
            {
                System.out.println(ds.get(i).xuatThongTin());
            }
    }
}
