/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class lab8bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(1);
        arr.add(2.5);
        arr.add(true);
        arr.add("Hello world");
        arr.forEach(i ->{ 
        System.out.println(i);
    });
        // TODO code application logic here
    }
    
}
