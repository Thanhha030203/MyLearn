/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import Bai3.SanPham;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class danhsachsanpham1 {

    private ArrayList<SanPham1> danhsach;

    public danhsachsanpham1(ArrayList<SanPham1> danhsach) {
        this.danhsach = danhsach;
    }

    public danhsachsanpham1() {
        this.danhsach = new ArrayList<SanPham1>();
    }

    public void themdanhsach(SanPham1 sp) {
        danhsach.add(sp);
    }

    public void xuatdanhsach() {
        for (SanPham1 sp : danhsach) {
            System.out.println(sp);
            System.out.println("--------------");
        }
    }

    public void sapxepdanhsach() {
        Collections.sort(danhsach, new Comparator<SanPham1>() {
            public int compare(SanPham1 sp1, SanPham1 sp2) {
                if (sp1.getGiaSanPham() > sp2.getGiaSanPham()) {
                    return 1;
                } else if (sp1.getGiaSanPham() < sp2.getGiaSanPham()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

    }

    public boolean xoa(SanPham1 sanpham) {
        return this.danhsach.remove(sanpham);
    }

    public void xuatgiatrunhbinh() {
        double tong = 0;
        for (SanPham1 sanpham : danhsach) {
            tong += sanpham.getGiaSanPham();
        }
        double trungbinh = tong / danhsach.size();
        System.out.printf("Gia trung binh cac san pham la : %.2f \n", trungbinh);
    }

    public void sapxeptheoten() {
        Collections.sort(danhsach, new Comparator<SanPham1>() {
            public int compare(SanPham1 sp1, SanPham1 sp2) {
                if (sp1.getTenSanPham().compareTo(sp2.getTenSanPham()) == 0) {
                    if (sp1.getGiaSanPham() > sp2.getGiaSanPham()) {
                        return 1;
                    } else if (sp1.getGiaSanPham() < sp2.getGiaSanPham()) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else if (sp1.getTenSanPham().compareTo(sp2.getTenSanPham()) > 0) {
                    return -1;
                } else {
                    return 1;

                }
            }
        });

    }
}
