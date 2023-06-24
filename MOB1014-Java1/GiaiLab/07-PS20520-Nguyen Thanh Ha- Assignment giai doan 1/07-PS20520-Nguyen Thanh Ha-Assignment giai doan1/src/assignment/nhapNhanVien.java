/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class nhapNhanVien {
    String name;
    String msnv;
    int Luong;
    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien : ");
        this.msnv = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien : ");
        this.name = sc.nextLine();
        System.out.print("Nhap luong nhan vien : ");
        this.Luong = sc.nextInt();
    }
    public int thuethunhap() {
        int thue;
        if (this.Luong < 9000000) {
            thue = 0;
        } else if (this.Luong >= 9000000 && this.Luong < 15000000) {
            thue = (int) ((this.Luong - 9000000) * 0.1);
        } else {
            thue = (int) ((6000000 * 0.1) + (this.Luong - 15000000) * 0.12);
        }
        return thue;
    }
    public String toString() {
        return this.msnv + "\t\t\t" + this.name + " \t\t" + this.Luong + "\t " + thuethunhap();
    }

}
