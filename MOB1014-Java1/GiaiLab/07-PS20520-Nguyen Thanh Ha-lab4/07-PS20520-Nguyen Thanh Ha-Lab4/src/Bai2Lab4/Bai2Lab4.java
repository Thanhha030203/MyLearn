/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab4;
import Bai1Lab4.SanPham;

/*Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi 
phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo
 */
public class Bai2Lab4 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        System.out.println("Nhap san pham 1 : ");
        sp1.nhap();
        System.out.println("Nhap san pham 1 : ");
        sp2.nhap();
        System.out.println("---------------------------------------------\n");
        System.out.println("Ten san pham \t Don gia \t Giam gia \t thue");
        sp1.xuat();
        sp2.xuat();
    }
    
    
}
