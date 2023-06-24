/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Minh Man
 */
public class MyThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0 ; i<10 ; i++){
            System.out.println("So "+i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
