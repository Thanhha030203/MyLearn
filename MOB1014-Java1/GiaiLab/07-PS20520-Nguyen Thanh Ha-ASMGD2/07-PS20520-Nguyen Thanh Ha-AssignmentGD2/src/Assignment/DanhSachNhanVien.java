/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {

    private ArrayList<NhanVien> danhsach;
    Scanner sc = new Scanner(System.in);
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public DanhSachNhanVien(ArrayList<NhanVien> danhsach) {
        this.danhsach = danhsach;
    }
    public DanhSachNhanVien() {
        this.danhsach = new ArrayList<NhanVien>();
    }

    public void themNhanVien(NhanVien nv) {
        danhsach.add(nv);
    }

    public void inDanhSach() {
        System.out.println("In danh sach ra man hinh ");
        for (NhanVien nv : danhsach) {
            System.out.println(nv);
        }
    }

    public void timtheoma(String ma) {
        for (NhanVien nv : danhsach) {
            if (nv.getMsnv().equalsIgnoreCase(ma)) {

                System.out.println(nv);
            }
        }

    }

    public void xoa (){ 
        int ktra = 0;
        System.out.println("Nhap ma so muon xoa : ");
        String ma = sc.nextLine();
        for(NhanVien nv : danhsach){ 
            if(nv.getMsnv().equalsIgnoreCase(ma)){ 
                danhsach.remove(nv);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }
    public String capnhattheoma(String ma) {
        int count = 0;
        for (NhanVien nv : danhsach) {
            if (nv.getMsnv().equalsIgnoreCase(ma)) {
                nv.capnhat();
                count++;
            }
        }
        if (count == 0) {
            return "that bai ";
        } else {
            return "thanh cong ";

        }
    }

    public void timtheokhoangluong(double luong1, double luong2) {
        for (NhanVien nv : danhsach) {
            if (nv.getLuong() >= luong1 & nv.getLuong() <= luong2) {
                System.out.println(nv);
            }
        }
    }

    public void Sapxephoten() {
        Collections.sort(danhsach, new Comparator<NhanVien>() {
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        for (NhanVien nv : danhsach) {
            System.out.println(nv);
        }
    }

    public void sapxeptheothunhap() {
        Collections.sort(danhsach, new Comparator<NhanVien>() {
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getLuong() > o2.getLuong()) {
                    return -1;
                } else if (o1.getLuong() < o2.getLuong()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void danhsach5nhanvien() {

        for (int i = 0; (i < 5 && i < danhsach.size()); i++) {
            System.out.println(danhsach.get(i));
        }
    }
}
