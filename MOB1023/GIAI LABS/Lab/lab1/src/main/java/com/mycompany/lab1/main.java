/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
       
        ArrayList<Product> list = new ArrayList<>();
        int dem = 0;
        do {
            Product sp = new Product();
            sp.Nhap();
            list.add(sp);
            dem++;
        } while (dem < 5);
        System.out.println("Ten SP \t\t Gia SP \t\t Thue");
        for (Product sp : list) {
            sp.Xuat();
        }
    }
}
