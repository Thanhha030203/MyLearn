/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author baolh
 */
public class Bai1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(10.6);
        list.add(true);
        list.add("Le Huy Bao");
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }
    }
}
