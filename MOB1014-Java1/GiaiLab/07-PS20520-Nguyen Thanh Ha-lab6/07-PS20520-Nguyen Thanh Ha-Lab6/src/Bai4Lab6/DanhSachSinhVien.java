/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4Lab6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhsach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<SinhVien>();
    }
    public void themsv(SinhVien sv ){ 
        danhsach.add(sv);
    }
    public void indanhsach(){ 
        for(SinhVien sv : danhsach){ 
            System.out.println(sv);
        }
    }
   public void timten(String name){ 
       for(SinhVien sv : danhsach){ 
           if(sv.ten.contains(name)){ 
               System.out.println(sv);
           }
       }
   }
     public void timcmnd(String cmnd){ 
       for(SinhVien sv : danhsach){ 
           if(sv.CMND.equalsIgnoreCase(cmnd)){ 
               System.out.println(sv);
           }
       }
   }
}
