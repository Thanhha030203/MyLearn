package Lab4;

import java.util.Scanner;

public class Bai1lab4 {

    public static void main(String[] args) {
        SanPham sp = new SanPham();
        System.out.println("Nhap : ");
        sp.Nhapthongtin();
        System.out.println("Ten san pham \t Don gia \t Giam gia \t thue");
        sp.Xuatthongtin();
    }
}

class SanPham {

    String tensp;
    double dongia;
    double giamgia;

    public double getThuueNhapKhau() {
        return dongia * 0.1;
    }

    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham : ");
        this.tensp = sc.nextLine();
        System.out.print(" Nhap don gia cho san pham : ");
        this.dongia = sc.nextDouble();
        System.out.print("Nhap giam gia cho san pham : ");
        this.giamgia = sc.nextDouble();
    }

    public void Xuatthongtin() {
        System.out.printf("%s\t\t%f\t\t%f\t\t%f \n", tensp, dongia, giamgia, getThuueNhapKhau());
    }

}
