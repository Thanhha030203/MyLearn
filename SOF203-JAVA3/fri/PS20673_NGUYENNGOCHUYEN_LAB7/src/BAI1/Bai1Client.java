/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Ngoc Huyen
 */
public class Bai1Client {
     public static void main(String[] args) {
        try {
            //1. xuất ra thông báo
            System.out.println("Client is Connecting....");
            //2. tạo 1 đối tượng Socket
            //3. nhớ kết nối thông qua port// cổng 9999
            Socket socket = new Socket("localhost", 9999);
            //4. thông báo
            System.out.println("Client is Connected.");
            DataOutputStream outputStream = new DataOutputStream(
                    socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(
                    socket.getInputStream());
            while (true) {
                
                //5. Nhập số thứ nhất
                System.out.print("Nhap vao so thu 1: ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                //6. đấy số thứ nhất lên phía server
                outputStream.flush();
                //7. Nhập số thứ hai
                System.out.print("Nhap vao so thu 2: ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                
                //8. đẩy số thứ hai lên phía server
                
                outputStream.flush();
                System.out.println("Tong 2 so: "+ inputStream.readDouble());
                System.out.print("Tiep tuc?(y/n): ");      
                String traloi = new Scanner(System.in).nextLine();
                if(traloi.equals("n") || traloi.equals("N")){
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}
