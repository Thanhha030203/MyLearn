/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silde7;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

public class Silde7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myhosst, youhost;
        myhosst = InetAddress.getLocalHost();
        JOptionPane.showMessageDialog(null, myhosst.getHostName()+"\n"+myhosst.getHostAddress());
        youhost = InetAddress.getByName("www.tuoitre.vn");
        JOptionPane.showMessageDialog(null, youhost.getHostName()+"\n"+youhost.getHostAddress());
        InetAddress [] ads = InetAddress.getAllByName("www.vnexpress.vn");
      for(InetAddress i : ads){ 
          System.out.println(i.getHostAddress());
      }
        // TODO code application logic here
    }
    
}
