
package Bai4Lab2;
import Bai1Lab2.Bai1Lab2;
import Bai2Lab2.Bai2lab2;
import Bai3Lab2.Bai3Lab2;
import Bai5Lab2.Bai5Lab2;
import java.util.Scanner;

/*
Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức 
năng để thoát khỏi ứng dụng
 */
public class bai4Lab2 {
    public static void main(String[] args) {
        int chon;
        while(true){
            System.out.print("+---------------------------------------------------+\n" +
                               "|       0. Ket thuc                                 |\n" +
                               "|       1. Giai phuong trinh bac nhat               |\n"+
                               "|       2. Giai phuong trinh bac hai                |\n" +
                               "|       3. Tinh tien dien                           |\n" +
                               "|       4. Bai Tap them                             |\n" +
                               "+---------------------------------------------------+\n"+
                               "Moi ban chon =>>> ");
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0 : System.exit(0);
                case 1 : Bai1Lab2.main(args);break;
                case 2 : Bai2lab2.main(args);break;
                case 3 : Bai3Lab2.main(args);break;
                case 4: Bai5Lab2.main(args);break;
                default: {System.out.println("Ban chon sai vui long chon lai :  ");break;}
            }
        }       
    }   
}

