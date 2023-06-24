package Bai3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class danhsachsinhvien {
    Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVienPoly> danhsach = new ArrayList<>() ;

    public danhsachsinhvien(ArrayList<SinhVienPoly> danhsach) {
        this.danhsach = danhsach;
    }

    public danhsachsinhvien() {
        this.danhsach = new ArrayList<>();
        
    }
    public void nhap(){ 
        System.out.println("Nhap ten : ");
        String name1 = sc.nextLine();
        System.out.println("nganh : ");
        String nganh = sc.nextLine();
        if(nganh.equalsIgnoreCase("it")){
            System.out.println("Nhap diem Java : ");
            double diemJava = sc.nextDouble();
            System.out.println("Nhap diem Css : ");
            double diemCss = sc.nextDouble();
            System.out.println("Nhap diem Html : ");
            double diemHtml = sc.nextDouble();
            
           
            
        }
        else if(nganh.equalsIgnoreCase("biz")){ 
            System.out.println("Nhap diem Marketing : ");
            Double diemMarketing = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap diem Sales");
            Double điemSales = Double.parseDouble(sc.nextLine());
            
        }
    }
    
}
