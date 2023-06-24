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
public class NVTiepThi extends NhanVien{
    double doanhSo;
    double hoaHong;
    public NVTiepThi(String hoTen, String manv, double luong, double doanhSo, double hoaHong){
        super(hoTen, manv, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    public void setDoanhSo(double doanhSo){
        this.doanhSo = doanhSo;
    }
    public double getDoanhSo(){
        return this.doanhSo;
    }
    public void setHoaHong(double hoaHong){
        this.hoaHong = hoaHong;
    }
    public double getHoaHong(){
        return this.hoaHong;
    }
    @Override
    public double getThuNhap(){
        return super.getThuNhap() + (doanhSo * hoaHong);
    }
}
