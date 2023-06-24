/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
abstract public class SinhVienPoly {
    public String hoTen;
    public String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhVienPoly(String hoTen) {
        this.hoTen = hoTen;
    }
    public SinhVienPoly() {
    }
    
    abstract public double getDiem();
    public String getHocLuc(){ 
        if(getDiem()<5){ 
            return "Yeu";
        }
        else if(getDiem()<6.5){ 
            return "Trung binh";
        }
        else if(getDiem()<7.5){ 
            return "Kha";
        }else if(getDiem()<9){ 
            return "Gioi";
        }
        else{ 
            return "Xuat sac";
        }
        
    }
    public void xuat(){ 
        System.out.println("");
    }
    
}
