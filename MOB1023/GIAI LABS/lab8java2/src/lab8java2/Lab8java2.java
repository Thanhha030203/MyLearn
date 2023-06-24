/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8java2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Lab8java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        pro p = new pro("java1",8);
        pro p1 = new pro("java2",8.5);
        pro p2 = new pro("java3",9);
        thuakeprodao tk = new thuakeprodao();
        tk.add(p);
        tk.add(p1);
        tk.add(p2);
        tk.store("data.dat");
        System.out.println(  tk.find("java2"));
        tk.update(p);
        System.out.println(  tk.find("java4"));
        
    }
    
}
