/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm2;

/**
 *
 * @author dell
 */
public class NhanVien {
    String manv;
    String hoTen;
    double luong;
    public NhanVien(String manv, String hoTen, double luong)
    {
        this.manv=manv;
        this.hoTen=hoTen;
        this.luong=luong;
    }
        public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String gethoTen(){
        return this.hoTen;
    }
    public void setmanv(String manv){
        this.manv = manv;
    }
    public String getmanv(){
        return this.manv;
    }
    public void setluong(double luong){
        this.luong = luong;
    }
    public double getluong(){
        return this.luong;
    }
    public double getThuNhap()
    {
        return luong-getThueTN();
    }
    public double getThueTN()
    {
       if( luong < 90)
           return 0;
       else if( luong < 150)
           return (luong*10)/100;
       else
           return (luong*12)/100;
    }
    public String xuatThongTin()
    {
        return " Ma nhan vien: " + manv +" || Ho ten: "+ hoTen + " || Luong: "+ luong + " || Thue: " + getThueTN() + "|| Thu nhap: " + getThuNhap();
    }
}
