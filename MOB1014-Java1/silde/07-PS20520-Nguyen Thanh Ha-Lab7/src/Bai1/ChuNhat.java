/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class ChuNhat {
    double rong ;
    double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public ChuNhat() {
    }
   public double getChuVi(){ 
       return (dai+rong)*2;
   }
   public double getDienTich(){ 
       return dai*rong;
   }
    public void xuat(){
        System.out.println("chu vi la : "+ getChuVi() +" , dien tich la : " + getDienTich());
    }
}
