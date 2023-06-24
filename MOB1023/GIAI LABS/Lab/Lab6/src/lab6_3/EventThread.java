/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Man
 */
public class EventThread implements Runnable {

    @Override
    public void run() {
         for (int i=1; i<=10;i++)
            {
                System.out.println(+i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OldThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                i+=1 ;
            }
    }
    
}
