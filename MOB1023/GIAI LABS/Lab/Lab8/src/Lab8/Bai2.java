/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.ArrayList;

/**
 *
 * @author MinhMan
 */
public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            arr.add(i + 1);
        }
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
