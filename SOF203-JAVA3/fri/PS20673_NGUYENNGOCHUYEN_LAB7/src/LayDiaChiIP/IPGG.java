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
public class IPGG {
    public static void main(String[] args) {
        try {
            //lấy ra mảng địa chỉ ip của domain... dantri.com.vn/,...
            InetAddress mang[] = InetAddress.getAllByName("dantri.com.vn");
            // duyet qua mang xuat dia chi ip ra
            for (int i = 0; i<mang.length;i++) {
                System.out.println("IP thứ "+(i+1)+" Là: "+ mang[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
