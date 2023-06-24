
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class test {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<nhanvienhanhchanh> list = new ArrayList<nhanvienhanhchanh>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("=============== Menu quan ly nhan vien ==================================");
            System.out.println("= 0. Thoat chuong trinh                                          =========");
            System.out.println("= 1. Nhap danh sach nhan vien tu ban phim                        =========");
            System.out.println("= 2. Xuat danh sach nhan vien ra man hinh :                      ==========");
            System.out.println("= 3. Tim va hien thi nhan vien theo ma nhap tu ban phim :        ==========");
            System.out.println("= 4. Xoa nhan vien theo ma nhap tu ban phim :                    ==========");
            System.out.println("= 5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim :     ==========");
            System.out.println("= 6. Tim cac nhan vien theo khoang luong da nhap tu ban phim :   ==========");
            System.out.println("= 7. Sap xep nhan vien theo ho va ten :                          ==========");
            System.out.println("= 8. Sap xep nhan vien theo thu nhap :                           ===========");
            System.out.println("= 9. Xuat 5 nhan vien co thu nhap cao nhat :                     ===========");
            System.out.println("=============================================================================");
            int menu;
            System.out.print("Nhap so can chon : ");
            menu = sc.nextInt();
            switch (menu) {
                case 0:
                    System.exit(0);
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timvahienthi();
                    break;
                case 4:
                    timvaxoa();
                    break;
                case 5:
                    capnhatthongtin();
                    break;
                case 6:
                    timluong();
                    break;
                case 7:
                    sapxeptheohovaten();
                    break;

            }
        }
    }

    public static void nhap() {
        nhanvienhanhchanh nv = new nhanvienhanhchanh();
        while (true) {
            nv.nhap();
            list.add(nv);
            sc.nextLine();
            System.out.print("Tiep tuc nhan enter , dung lai nhan n : ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuat() {
        for (nhanvienhanhchanh nv : list) {
            System.out.println("Ma nhan vien : " + nv.getMaNhanVien());
            System.out.println("Ten nhan vien : " + nv.getTenNhanVien());
            System.out.println("Luong nhan vien : " + nv.getLuongNhanVien());
            System.out.println("------------------------------");

        }
    }

    public static void timvahienthi() {
        sc.nextLine();
        System.out.print("Nhap ma nhan vien can tim : ");
        String manv = sc.nextLine();
        nhanvienhanhchanh nvhc = null;
        for (nhanvienhanhchanh nv : list) {
            if (nv.getMaNhanVien().equals(manv)) {
                nvhc = nv;
                break;

            }
        }
        if (nvhc != null) {
            System.out.println("Da tim thay. ");
            xuat();
        } else {
            System.out.println("Khong tim thay ma nhan vien .");
        }
        System.out.println("-----------------------------------");

    }

    public static void timvaxoa() {
        sc.nextLine();
        System.out.print("Nhap ma nhan vien can xoa : ");
        String manv = sc.nextLine();
        nhanvienhanhchanh nvhc = null;
        for (nhanvienhanhchanh nv : list) {
            if (nv.getMaNhanVien().equalsIgnoreCase(manv)) {
                nvhc = nv;
                break;
            }
        }
        if (nvhc != null) {
            list.remove(nvhc);
            System.out.println("Da xoa thanh cong. ");
        } else {
            System.out.println("Khong tim thay nhan vien can xoa. ");
        }
    }

    public static void capnhatthongtin() {
        sc.nextLine();
        System.out.print("Nhap ma nhan vien can cap nhat : ");
        String manv = sc.nextLine();
        for (nhanvienhanhchanh nv : list) {
            if (nv.getMaNhanVien().equals(manv)) {
                
                break;

            }
        }
        if (nvhc != null) {
            System.out.print("Nhap ma nhan vien : ");
            String manv1 = sc.nextLine();
            System.out.print("Nhap ten nhan vien : ");
            String tennv1 = sc.nextLine();
            System.out.print("Nhap luong nhan vien : ");
            Double luongnv1 = sc.nextDouble();

            System.out.println("Cap nhat thanh cong. ");
        } else {
            System.out.println("Khong tim thay nhan vien can cap nhat.");
        }
    }

    public static void timluong() {
        System.out.print("Nhap luong can tim : ");
        Double luong = sc.nextDouble();
        nhanvienhanhchanh nvhc = null;
        for (nhanvienhanhchanh nv : list) {
            if (nv.getLuongNhanVien().equals(luong)) {
                nvhc = nv;
                break;
            }
        }
        if (nvhc != null) {
            if (nvhc.getLuongNhanVien() > 1 && nvhc.getLuongNhanVien() < 20) {
                System.out.println("Da tim thay.");
            }
            xuat();
        } else {
            System.out.println("Khong tim thay nhan vien , moi xem lai.");
        }
    }

    public static void sapxeptheohovaten() {
        Comparator<nhanvienhanhchanh> comp = new Comparator<nhanvienhanhchanh>() {
            @Override
            public int compare(nhanvienhanhchanh arg0, nhanvienhanhchanh arg1) {
                return arg0.getTenNhanVien().compareTo(arg1.getTenNhanVien());
            }
        };
        Collections.sort(list, comp);
        for (nhanvienhanhchanh nv : list) {
            System.out.println(nv);
            System.out.println("------------------------------");
        }
    }
}
