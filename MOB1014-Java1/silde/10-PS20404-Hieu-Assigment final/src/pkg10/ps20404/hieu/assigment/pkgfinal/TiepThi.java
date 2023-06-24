/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.ps20404.hieu.assigment.pkgfinal;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Admin
 */
public class TiepThi extends nhanVien {

    private Double doanhSo, hoaHong;

    public TiepThi() {
    }

    public TiepThi(String maNhanVien, String hoTenNhanVien, Double luongNhanVien, Double doanhSo, Double hoaHong) {
        super(maNhanVien, hoTenNhanVien, luongNhanVien);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(Double doanhSo, Double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(Double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap doanh so : ");
        this.doanhSo = sc.nextDouble();
        System.out.print("Nhap hoa hong : ");
        this.hoaHong = sc.nextDouble();

    }

    public void xuat() {
        super.xuat();
        System.out.printf("Hien Thi doanh so : %.1f \n" , this.getDoanhSo());
        System.out.printf("Hien thi hoa hong : %.1f \n" , this.getHoaHong());
        System.out.printf("Hien thi thu nhap : %.1f \n" , this.getThuNhap());

    }

    @Override
    public Double getThuNhap() {
        return (this.getLuongNhanVien() + this.doanhSo + this.hoaHong) * 0.1;
    }

}
