/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1lab6;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread thread = new MyThread();
        Thread th1 = new Thread(thread);
        Thread th2 = new Thread(thread);
        th1.start();
        th2.start();
    }

}
