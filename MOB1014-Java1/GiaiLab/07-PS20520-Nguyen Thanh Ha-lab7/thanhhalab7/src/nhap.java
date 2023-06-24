
import Bai3.SinhVienPoly;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class nhap {
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
        System.out.println("Sinh vien có hoc bong gioi : ");
        for(SinhVienPoly sv : danhsach){ 
           if(sv.getHocbong().equalsIgnoreCase("hoc bong gioi")){ 
                sv.xuat();
            }
        }
        System.out.println("Sinh vien có hoc bong kha");
            for(SinhVienPoly sv : danhsach){ 
           if(sv.getHocbong().equalsIgnoreCase("hoc bong kha")){ 
                sv.xuat();
            }
        }
   
    }
}
