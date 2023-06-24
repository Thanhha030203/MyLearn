/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;  // thư viện socket
/**
 *
 * @author Ngoc Huyen
 */
public class Sever {
     public static void main(String[] args) {
         try {
            //1. phía server tạo 1 đối tượng ServerSocket
            //2. chỉ ra dùng port : 9999 ...cổng vào ra dữ liệu
            //3. nhớ là server dùng port số mấy thì phía client chúng ta kết nối thông qua port đó
            ServerSocket serverSocket = new ServerSocket(9999);
            //4. xuất ra thông báo
            System.out.println("Server is connecting// đợi client chạy và kết nối....");
            Socket socket = serverSocket.accept(); // đợi phía client kết nối  
            //5. khi chương trình client chạy thì ...xuất ra thông báo
            System.out.println("Server is connected// đã kết nối.");
            DataInputStream inputStream = new DataInputStream(
                    socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(
                    socket.getOutputStream());
            while (true) {
                //6. lấy số thứ nhất từ client
                double number1 = inputStream.readDouble();
                //7. lấy số thứ hai từ client
                double number2 = inputStream.readDouble();
                System.out.println("2 Số nhận được từ Client là "+ number1+ " "
                        +number2);
                //8. tính tổng 
                double sum = number1+number2;
                outputStream.writeDouble(sum);
                outputStream.flush();
                //9. xuất kết quả ra màn hình
                System.out.println("Tong 2 so la: "+ sum);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
