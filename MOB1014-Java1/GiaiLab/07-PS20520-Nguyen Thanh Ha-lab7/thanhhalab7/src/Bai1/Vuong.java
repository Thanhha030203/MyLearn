/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

public class Vuong extends ChuNhat{
    double canh;
    public Vuong(double canh) {
        super.dai = canh;
        super.rong = canh;
    }
    public void xuat(){ 
        System.out.println("Chu vi hinh vuong la : "+getChuVi()+ ", Dien tich hinh vuong la : "+getDienTich()); 
    }
    
    
}
