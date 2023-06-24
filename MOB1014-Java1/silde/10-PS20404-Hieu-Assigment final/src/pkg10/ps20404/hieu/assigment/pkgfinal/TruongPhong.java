/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.ps20404.hieu.assigment.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TruongPhong extends nhanVien{
    private Double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong( String maNhanVien, String hoTenNhanVien, Double luongNhanVien , Double trachNhiem) {
        super(maNhanVien, hoTenNhanVien, luongNhanVien);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public Double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong trach nhiem : ");
        this.trachNhiem = sc.nextDouble();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("Hien thi luong trach nhiem : %.1f \n" , this.getTrachNhiem());
        
    }

   public Double getThuNhap(){
       return (this.getLuongNhanVien() +  this.getTrachNhiem()) ;
   }    
    
    
}
