/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2Lab6;

/*Nhập vào mảng 5 sản phẩm (mỗi sản phẩm gồm tên, giá và hãng). Xuất thông tin 
các sản phẩm có hãng là Nokia.
 */
public class Bai2Lab6 {

    public static void main(String[] args) {
        DanhSachSanPham ds = new DanhSachSanPham();
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();;
            ds.themsp(sp);
        }
        ds.ktra("Nokia");
    }
}
