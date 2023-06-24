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
public class Vuong extends ChuNhat{
    public Vuong(){
        
    }

    public Vuong(Double canh) {
        super(canh,canh);
    }
    @Override
    public void xuat(){
        System.out.println("Thong tin Vuong");
        System.out.println("Canh "+this.getDai());
        System.out.println("Dien tich: "+this.getDienTich());
        System.out.println("Chu vi: "+this.getChuVi());
    }
}
