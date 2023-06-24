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
public class TruongPhong extends NhanVien{
    double trachNhiem;
    public TruongPhong(String hoTen, String manv, double luong, double trachNhiem){
        super(hoTen, manv, luong);
        this.trachNhiem = trachNhiem;
    }
    public void setTrachNhiem(double trachNhiem){
        this.trachNhiem = trachNhiem;
    }
    public double getTrachNhiem(){
        return this.trachNhiem;
    }
    @Override
    public double getThuNhap(){
        return super.getThuNhap() + trachNhiem;
    }
}
