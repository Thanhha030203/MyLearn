/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1LAB7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class Bai1Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("Server is connecting....");
            Socket socket = server.accept();
            System.out.println("Server is connect");
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                double num1 = input.readDouble();
                double num2 = input.readDouble();
                System.out.println("2 số nhận vào là : "+num1+" và "+num2);
                double tong = num1+num2;
                out.writeDouble(tong);
                out.flush();
                System.out.println("Tổng 2 số là : "+tong);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại server : "+ e);
        }
    }
}
