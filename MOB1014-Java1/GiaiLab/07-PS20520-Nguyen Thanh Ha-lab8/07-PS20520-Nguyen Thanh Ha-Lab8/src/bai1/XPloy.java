/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class XPloy {
    public static final double sum (double ...x){ 
        double tong =0;
        for(double so :x){ 
            tong += so;
        }
        return tong ;
    }
}
