/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;
public class bai4 {

    public static void main(String[] args) {
        nangcapsanpham sp = new nangcapsanpham();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham : ");
        sp.setTensp(sc.nextLine());
        System.out.print(" Nhap don gia cho san pham : ");
        sp.setDongia(sc.nextDouble());
        System.out.print("Nhap giam gia cho san pham : ");
        sp.setGiamgia(sc.nextDouble());
        System.out.println(" Ten san pham : " + sp.getTensp());
        System.out.println(" Don gia : " + sp.getDongia());
        System.out.println(" Giam gia : " + sp.getGiamgia());

    }
}
class nangcapsanpham {

    private String tensp;
    private double dongia;
    private double giamgia;

    public String getTensp() {
        return this.tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getGiamgia() {
        return this.giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }
}
