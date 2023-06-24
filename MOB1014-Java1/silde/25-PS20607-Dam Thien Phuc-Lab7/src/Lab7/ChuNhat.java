    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuNhat {
    private Double dai;
    private Double rong;
    public Double getDienTich(){
        return (this.dai*this.rong);
    }
    public Double getChuVi(){
        return ((this.dai+this.rong)*2);
    }

    public ChuNhat() {
    }

    public ChuNhat(Double dai, Double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Double getDai() {
        return dai;
    }

    public void setDai(Double dai) {
        this.dai = dai;
    }

    public Double getRong() {
        return rong;
    }

    public void setRong(Double rong) {
        this.rong = rong;
    }
    
   
    public void xuat(){
        System.out.println("Thong tin Chu Nhat");
        System.out.println("Chieu dai: "+this.dai);
        System.out.println("Chieu rong: "+this.rong);
        System.out.println("Dien tich: "+this.getDienTich());
        System.out.println("Chu vi: "+this.getChuVi());
    }
}
