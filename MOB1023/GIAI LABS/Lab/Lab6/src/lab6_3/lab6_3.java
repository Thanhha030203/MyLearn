/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

/**
 *
 * @author Minh Man
 */
public class lab6_3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread (new OldThread());
        t1.start();
        t1.join();
        Thread t2 = new Thread (new EventThread());
        t2.start() ;
    }
}
