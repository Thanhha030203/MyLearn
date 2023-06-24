/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import Bai2.XPoly;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Tong ca so trong day tham so bien doi la : "+XPoly.sum(7.5,7,3,9.4,6));
        System.out.println("So nho nhat trong day tham so bien doi la : "+XPoly.min(7.5,7,3,9.4,6) );
        System.out.println("So lon nhat trong day  tham so bien doi la : "+XPoly.max(7.5,7,3,9.4,6));
        System.out.println("So lon nhat trong day  tham so bien doi la : "+XPoly.tich(7.5,7,3,9.4,6));
    }
}
