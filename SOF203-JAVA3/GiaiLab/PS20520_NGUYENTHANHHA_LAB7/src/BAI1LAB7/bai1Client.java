/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1LAB7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1Client {
    public static void main(String[] args) throws IOException {
        try {
              Scanner sc = new Scanner(System.in);
        System.out.println("Client is connecting....");
        Socket socket = new Socket("localhost",8888);
        System.out.println("Client is connect");
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(socket.getInputStream());
        while (true) { 
            System.out.print("Nhap vao số thứ 1 : ");
            out.writeDouble(sc.nextDouble());
            out.flush();
            System.out.print("Nhập vào số thứ 2 : ");
            out.writeDouble(sc.nextDouble());
            out.flush();    
            System.out.println("Tổng 2 số là : "+input.readDouble());
            System.out.println("Bạn có muốn tiếp tục hông? y/n");
            sc.nextLine();
            if(sc.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
        } catch (Exception e) {
            System.out.println("lỗi + "+e);
        }
            
        
    }
}
