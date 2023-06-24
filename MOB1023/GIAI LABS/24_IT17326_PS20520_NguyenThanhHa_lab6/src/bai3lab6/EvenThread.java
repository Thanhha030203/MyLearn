/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EvenThread extends Thread{
    public void run(){ 
        for(int i=1; i<=10;i++){
            if(i%2==0){
            System.out.println("so chan "+ i);
            
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {}
    }
    }
}
