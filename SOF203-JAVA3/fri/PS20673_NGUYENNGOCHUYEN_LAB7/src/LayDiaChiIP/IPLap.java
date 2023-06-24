/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayDiaChiIP;

import java.net.InetAddress;

/**
 *
 * @author Ngoc Huyen
 */
public class IPLap {
     public static void main(String[] args) {
        // TODO code application logic here
        try {
            // tọ đối tượng innetAddress
            InetAddress myHost = InetAddress.getLocalHost();
            // xuất ra tên máy
            System.out.println("Tên máy: "+myHost.getHostName());
            // xuất ra địa chỉ IP
            System.out.println("Địa chỉ ip của máy : "+myHost.getHostAddress());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
