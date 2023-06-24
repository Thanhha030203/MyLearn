/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

public class NhanVienMain {
    public static void main(String[] args) {
        nhapNhanVien nv = new nhapNhanVien();
        nv.nhapthongtin();
        System.out.println(" Ma nhan vien\t\tHo va ten \t Luong \t\t Thue thu nhap ");
        System.out.println("  "+ nv.toString());
    }
    
}
