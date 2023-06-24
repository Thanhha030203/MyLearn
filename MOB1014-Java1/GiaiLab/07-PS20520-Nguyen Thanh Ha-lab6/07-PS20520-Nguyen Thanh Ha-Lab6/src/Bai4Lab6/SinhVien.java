/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4Lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {

    public String ten, email, sdt, CMND, diemToan, diemLy, diemHoa;
    String reemail = "\\w+@\\w+\\.\\w+";
    String resdt = "0\\d{9}";
    String recmnd = "\\d+";
    String repDiem = "10|\\d{1}\\.{0,1}\\d{0,1}";
    Scanner sc = new Scanner(System.in);
    double trungBinh = 0;

    public SinhVien(String email, String sdt, String CMND, String diemToan, String diemLy, String diemHoa) {
        this.email = email;
        this.sdt = sdt;
        this.CMND = CMND;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;

    }

    public SinhVien() {
    }

    public void nhap() {
        System.out.print("Nhap ten : ");
        this.ten = sc.nextLine();
        do {
            System.out.print("Nhap email : ");
            this.email = sc.nextLine();

            if (!this.email.matches(reemail)) {
                System.out.println("Nhap khong dung dang email : ");

            }
        } while (!this.email.matches(reemail));

        do {
            System.out.print("Nhap sdt : ");
            this.sdt = sc.nextLine();
            if (!this.sdt.matches(resdt)) {
                System.out.println("Nhap khong dung dang sdt! ");
            }
        } while (!this.sdt.matches(resdt));
        do {
            System.out.print("Nhap CMND : ");
            this.CMND = sc.nextLine();
            if (!this.CMND.matches(recmnd)) {
                System.out.println("Nhap khong dung dang CMND : ");
            }
        } while (!this.CMND.matches(recmnd));
        do {
            System.out.print("Nhap diem toan : ");
            this.diemToan = sc.nextLine();
            System.out.print("Nhap diem Ly : ");
            this.diemLy = sc.nextLine();
            System.out.print("Nhap diem Hoa : ");
            this.diemHoa = sc.nextLine();
            if ((!this.diemToan.matches(repDiem)) || (!this.diemLy.matches(repDiem)) || (!this.diemHoa.matches(repDiem))) {
                System.out.println("Nhap khong dung dang diem : ");
            }
        } while (!this.diemToan.matches(repDiem) || !this.diemLy.matches(repDiem) || !this.diemHoa.matches(repDiem));
    }
    public double trungBinh() {
        this.trungBinh = (Double.parseDouble(this.diemToan) + Double.parseDouble(this.diemLy) + Double.parseDouble(this.diemHoa)) / 3;
        return trungBinh;
    }
    public String xeploai() {
        if (this.trungBinh < 3.5) {
            return "Kem";
        } else if (this.trungBinh < 5.0) {
            return "Yeu";
        } else if (this.trungBinh < 6.5) {
            return "Trung Binh";
        } else if (this.trungBinh < 8.5) {
            return "Kha";
        } else {
            return "Gioi";
        }
    }
    public int hocbong() {
        if (xeploai().equalsIgnoreCase("kha")) {
            return 1500000;
        } else if (xeploai().equalsIgnoreCase("gioi")) {
            return 2000000;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "SinhVien [" + "Ten sv = " + ten + ", email = " + email + ", sdt = " + sdt + ", CMND = " + CMND + ", diemToan = " + diemToan + ", diemLy = " + diemLy + ", diemHoa = " + diemHoa + "DTB = " + trungBinh() + ", Xep loai = " + xeploai() + ", hoc bong = " + hocbong() + ']';
    }
}
