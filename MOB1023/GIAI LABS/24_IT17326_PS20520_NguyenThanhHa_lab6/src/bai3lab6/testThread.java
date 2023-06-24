/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3lab6;

/**
 *
 * @author Admin
 */
public class testThread {

    public static void main(String[] args) throws InterruptedException {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        Thread tho = new Thread(ot);
        Thread the = new Thread(et);
        tho.start();
        tho.join();
        the.start();

    }
}
