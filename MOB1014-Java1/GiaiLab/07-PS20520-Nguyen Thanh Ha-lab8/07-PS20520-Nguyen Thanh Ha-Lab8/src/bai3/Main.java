/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
   public static String toUpperFistChar(String name){ 
        String[] tach = name.split(" ");
        for(int i=0; i<tach.length; i++){ 
            char first = tach[i].charAt(0);
            char up = String.valueOf(first).toUpperCase().charAt(0);
            tach[i]= up + tach[i].substring(1);
        }
        String tu = String.join(" ", tach);
        return tu;
    }
    public static void main(String[] args) {
        System.out.println("Nhap ten : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Chu da duoc thay doi : "+toUpperFistChar(name));
    }
}
