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
public class OddThread extends Thread {
        public void run(){ 
        for(int i=1; i<=10;i++){
            if(i%2 !=0){
            System.out.println("so le "+ i);
            
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
    }
    }
}
