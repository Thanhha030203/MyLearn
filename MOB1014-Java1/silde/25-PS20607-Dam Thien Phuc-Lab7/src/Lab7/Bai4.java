/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai4 {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVienPoly> arrsv = new ArrayList<>();
      
    public void nhapsv(){ 
        do {            
            System.out.println("Ho ten: ");
        String ten = sc.nextLine();
        System.out.println("Nganh: ");
        String nganh = sc.nextLine();
        if (nganh.equalsIgnoreCase("IT")) {
            System.out.println("Diem java: ");
            Double java = Double.parseDouble(sc.nextLine());
            System.out.println("Diem HTML: ");
            Double html = Double.parseDouble(sc.nextLine());
            System.out.println("Diem CSS: ");
            Double css = Double.parseDouble(sc.nextLine());
            SinhVienPoly svit = new SinhVIenIT(ten, nganh, java, html, css);
            arrsv.add(svit);
        } else {
            System.out.println("Diem maketing: ");
            Double marketing = Double.parseDouble(sc.nextLine());
            System.out.println("Diem sales: ");
            Double sales = Double.parseDouble(sc.nextLine());
            SinhVienPoly svbiz = new SinhVienBiz(ten, nganh, marketing, sales);
            arrsv.add(svbiz);
        }
            System.out.print("Ban muon tiep tuc ko (c/k ) : ");
        } while (!sc.nextLine().equalsIgnoreCase("k"));
    }
    public void xuatsv() {
        for (SinhVienPoly sv : arrsv) {
            sv.xuat();
        }

    }

    public void hocsinhgioi() {
        for (SinhVienPoly sv : arrsv) {
            if (sv.getHocLuc().equalsIgnoreCase("gioi")) {
                sv.xuat();
            }

        }
    }

    public void sapxep() {
        ArrayList<SinhVienPoly> arrsv = new ArrayList<>();
        Collections.sort(arrsv, new Comparator<SinhVienPoly>() {
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                if (o1.getDiem() > o2.getDiem()) {
                    return -1;
                } else if (o1.getDiem() < o1.getDiem()) {
                    return 1;
                } else {
                    return 0;

                }
            }
        });

    }
}
