package Bai2345;

import java.util.ArrayList;
import java.util.Scanner;

public class bai45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<svpoly> arrSv = new ArrayList<>();
        do {
            System.out.println("Ban muon tao sinh vien nao?");
            System.out.println("1. Sinh Vien IT");
            System.out.println("2. Sinh Vien Biz");

            try {
                int chon = sc.nextInt();
                sc.nextLine();

                if (chon >= 1 && chon <= 2) {
                    switch (chon) {
                        case 1:
                            System.out.println("==== TAO SINH VIEN IT ====");
                            System.out.print("Nhap ho ten SV: ");
                            String name = sc.nextLine();

                            System.out.print("Nhap nganh: ");
                            String nganh = sc.nextLine();

                            System.out.print("Nhap diem JAVA: ");
                            double java = Double.parseDouble(sc.nextLine());

                            System.out.print("Nhap diem CSS: ");
                            double css = Double.parseDouble(sc.nextLine());

                            System.out.print("Nhap diem HTML: ");
                            double html = Double.parseDouble(sc.nextLine());

                            sinhvienIT sv = new sinhvienIT(name, nganh, java, css, html);
                            arrSv.add(sv);
                            break;
                        case 2:
                            System.out.println("==== TAO SINH VIEN BIZ ====");
                            System.out.print("Nhap ho ten SV: ");
                            String ten = sc.nextLine();

                            System.out.print("Nhap nganh: ");
                            String nganhBiz = sc.nextLine();

                            System.out.print("Nhap diem Marketing: ");
                            double marketing = Double.parseDouble(sc.nextLine());

                            System.out.print("Nhap diem Sale: ");
                            double sales = Double.parseDouble(sc.nextLine());

                            arrSv.add(new sinhvienBiz( ten, nganhBiz, marketing, sales));
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("Ban vui long chon tu 1 den 2!");
                }

            } catch (Exception e) {
                System.out.println("Ban vui long chon tu 1 den 2!");
            }

            System.out.print("Ban co muon them tiep hay khong? (C/K)");
        } while (!sc.nextLine().equalsIgnoreCase("K"));
        
        System.out.println("========== SINH VIEN GIOI ============");
        for (svpoly sv : arrSv) {
            if ((sv.getDiem() < 9) && (sv.getDiem() >= (double) 7.5)) {
                sv.xuat();
            }
        }
        System.out.println("========== DANH SACH SINH VIEN ==========");
        for (svpoly sv : arrSv) {
            if(sv.hocbong().equalsIgnoreCase("hoc bong gioi")){ 
                sv.xuat();
            }
            if(sv.hocbong().equalsIgnoreCase("hoc bong kha")){ 
                sv.xuat();
            }
        }
    }
}
