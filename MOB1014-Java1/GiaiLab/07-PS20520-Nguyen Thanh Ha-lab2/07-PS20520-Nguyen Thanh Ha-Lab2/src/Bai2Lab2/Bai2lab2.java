package Bai2Lab2;

import java.util.Scanner;

/*Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c 
nhập từ bàn phím
 */
public class Bai2lab2 {

    public static void main(String[] args) {
        System.out.println("\n\n-- PHUONG TRINH BAC HAI ax^2 + bx + c ---\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a : ");
        float a = sc.nextFloat();
        System.out.print("Nhap he so b : ");
        float b = sc.nextFloat();
        System.out.print("Nhap he so c : ");
        float c = sc.nextFloat();
        // Giải phương trình
        System.out.printf("Giai phuong trinh %.0fx^2 + %.0fx + %.0f ta co : \n=>>", a, b, c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem x = " + (-c / b));
            }
        } else {
            float delta = (float) (Math.pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");

            } else if (delta == 0) {
                System.out.println("Phuong trinh co mot nghiem kep x1 = x2 = " + (-b / (2 * a)));
            } else {
                System.out.printf("Phuong trinh co hai nghiem phan biet : \n x1 = %.2f", ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.printf("\n x2 = %.2f \n", ((-b - Math.sqrt(delta)) / (2 * a)));

            }
        }
    }

}
