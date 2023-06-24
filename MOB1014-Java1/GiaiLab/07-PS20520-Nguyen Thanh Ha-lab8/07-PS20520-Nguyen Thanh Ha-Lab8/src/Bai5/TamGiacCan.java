/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author Admin
 */
public class TamGiacCan extends TamGiac{
    public void xuat(){ 
       System.out.println("canh a: "+this.a[0]);
       System.out.println("Canh b : "+this.a[1]);
       System.out.println("Canh c : "+this.a[2]);
       System.out.println("Kieu tam giac : "+xacdinh());
       System.out.println("Chu vi : "+getChuVi());
       System.out.println("Dien tich : "+getDienTich());
   }
}
