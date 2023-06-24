/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DanhSachSanPham {

    private ArrayList<SanPham> danhsach;

    public DanhSachSanPham(ArrayList<SanPham> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSanPham() {
        this.danhsach = new ArrayList<SanPham>();
    }

    public void themsp(SanPham sp) {
        danhsach.add(sp);
    }
    public void ktra(String hang){ 
        for(SanPham sp : danhsach){ 
            if(sp.hang.equalsIgnoreCase(hang)){ 
                System.out.println(sp);
            }
        }
    }
}
