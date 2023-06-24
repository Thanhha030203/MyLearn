/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class danhsachsanpham {

    private ArrayList<SanPham> danhsach;

    public danhsachsanpham(ArrayList<SanPham> danhsach) {
        this.danhsach = danhsach;
    }

    public danhsachsanpham() {
        this.danhsach = new ArrayList<SanPham>();
    }

    public void themdanhsach(SanPham sp) {
        danhsach.add(sp);
    }

    public void xuatdanhsach() {
        for (SanPham sp : danhsach) {
            System.out.println(sp);
            System.out.println("--------------");
        }
    }

    public void sapxepdanhsach() {
        Collections.sort(danhsach, new Comparator<SanPham>() {
            public int compare(SanPham sp1, SanPham sp2) {
                if (sp1.getGiaSanPham() > sp2.getGiaSanPham()) {
                    return -1;
                } else if (sp1.getGiaSanPham() < sp2.getGiaSanPham()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

    }
    public boolean xoa(SanPham sanpham){ 
        return this.danhsach.remove(sanpham);
    }
    public void xuatgiatrunhbinh(){ 
        double tong = 0;
        for(SanPham sanpham : danhsach){ 
           tong += sanpham.getGiaSanPham();
        }
        double trungbinh= tong/danhsach.size();
        System.out.printf("Gia trung binh cac san pham la : %.2f \n",trungbinh);
    }

}
