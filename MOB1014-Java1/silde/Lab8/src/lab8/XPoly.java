
package lab8;

import java.util.Scanner;

public class XPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String s = sc.nextLine();
        funtions fn = new funtions();
        System.out.println("Tong: "+ fn.sum(2.4,5.0,8.9));
        System.out.println("Min: "+ fn.min(6.4,5.0,8.9));
        System.out.println("Max: "+ fn.max(6.4,5.0,8.9));
        System.out.println("Ten: "+ fn.toUppperFirstChar(s));
    }
    
}
