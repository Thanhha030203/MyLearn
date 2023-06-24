/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import Bai2.SinhVienPoly;
import Bai3.SinhVienBiz;
import Bai3.SinhVienIT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Danhsachsinhvien {

    public ArrayList<SinhVienPoly> danhsach;
    Double diemJava, diemHtml, diemCss, diemMarketing, diemSales;
    Scanner sc = new Scanner(System.in);

    public Danhsachsinhvien(ArrayList<SinhVienPoly> danhsach) {
        this.danhsach = danhsach;
    }

    public Danhsachsinhvien() {
        this.danhsach = new ArrayList<>();
    }

    public void themdanhsach() {
        do {
            System.out.print("Moi ban nhap ten : ");
            String name = sc.nextLine();
            System.out.print("Moi ban nhap nganh : ");
            String nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("it")) {
                do {
                    System.out.println("Vui long nhap diem trong khoang 0-10");
                    System.out.print("Nhap diem Java : ");
                    diemJava = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap diem Css : ");
                    diemCss = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap diem Html : ");
                    diemHtml = Double.parseDouble(sc.nextLine());
                } while ((diemJava < 0 || diemJava > 10) || (diemCss < 0 || diemCss > 10) || (diemHtml < 0 || diemHtml > 10));
                SinhVienIT sv1 = new SinhVienIT(diemJava, diemCss, diemHtml, name, nganh);
                danhsach.add(sv1);
            } else if (nganh.equalsIgnoreCase("biz")) {
                do {
                    System.out.println("Vui long nhap diem trong khoang 0-10");
                    System.out.print("Nhap diem Marketing : ");
                    diemMarketing = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap diem Sales : ");
                    diemSales = Double.parseDouble(sc.nextLine());
                } while ((diemMarketing < 0 || diemMarketing > 10) || (diemSales < 0 || diemSales > 10));
                SinhVienBiz sv2 = new SinhVienBiz(diemMarketing, diemSales, name, nganh);
                danhsach.add(sv2);
            }
            System.out.println("Ban muon tiep tuc khong (c/k)");
        } while (!sc.nextLine().equalsIgnoreCase("k"));
    }

    public void xuathongtin() {
        for (SinhVienPoly sv : danhsach) {
            sv.xuat();
        }
    }

    public void xuathocsinhgioi() {
        for (SinhVienPoly sv : danhsach) {
            if (sv.getHocluc().equalsIgnoreCase("gioi")) {
                sv.xuat();
            }
        }
    }

    public void sapxep() {
        Collections.sort(danhsach, new Comparator<SinhVienPoly>() {
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                if (o1.getDiem() > o2.getDiem()) {
                    return -1;
                } else if (o1.getDiem() < o1.getDiem()) {
                    return 1;
                } else {
                    return 0;

                }
            }
        });

    }

    public void hocbong() {
        System.out.println("Sinh vien có hoc bong gioi");
        for (SinhVienPoly sv : danhsach) {
            if (sv.getHocbong().equalsIgnoreCase("hoc bong gioi")) {
                sv.xuat();
            }
        }
        System.out.println("=============================");
        System.out.println("Sinh vien có hoc bong kha ");
        for (SinhVienPoly sv : danhsach) {
            if (sv.getHocbong().equalsIgnoreCase("hoc bong kha")) {
                sv.xuat();
            }
        }
    }

}
