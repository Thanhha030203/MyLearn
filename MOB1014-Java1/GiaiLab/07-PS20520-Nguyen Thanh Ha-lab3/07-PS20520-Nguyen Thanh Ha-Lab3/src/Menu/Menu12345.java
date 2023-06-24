/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;
import Bai1Lab3.Bai1Lab3;
import Bai2Lab3.Bai2Lab3;
import Bai3Lab3.Bai3Lab3;
import Bai4lab3.Bai4Lab3;
import Cau5Lab3.Main;

/**
 *
 * @author Admin
 */
public class Menu12345 {
    public static void main(String[] args) {
        int chon;
        while(true){
            System.out.print("\n\n+---------------------------------------------------+\n" +
                               "|       0. Ket thuc                                 |\n" +
                               "|       1. Kiem tra so nguyen to                    |\n"+
                               "|       2. Kiem tra so nguyen to tu 1 den n         |\n" +
                               "|       3. Day so FIBONACCi                         |\n" +
                               "|       4. To hop họ + ten lot + ten                |\n" +
                               "|       5. Tinh lai suat                            |\n"+
                               "+---------------------------------------------------+\n"+
                               "Moi ban chon =>>> ");
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0 : System.exit(0);
                case 1 : Bai1Lab3.main(args);break;
                case 2 : Bai2Lab3.main(args);break;
                case 3 : Bai3Lab3.main(args);break;
                case 4: Bai4Lab3.main(args);break;
                case 5: Main.main(args);break;
                default: {System.out.println("Ban chon sai vui long chon lai :  ");break;}
            }
        }       
    }
    
}
