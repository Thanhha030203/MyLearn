/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab4;


/*Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2 
phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn 
hình.
 */
public class Bai1Lab4 {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        System.out.println("Nhap : ");
        sp.nhap();
        System.out.println("---------------------------------------------\n");
        System.out.println("Ten san pham \t Don gia \t Giam gia \t thue");
        sp.xuat();
        
    }
    
}
