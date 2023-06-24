/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author Admin
 */
public class TaiKhoan extends Nguoidung {
    String MaTK;
    String UserName,Password;
    int SDT;
    String remember;

    public TaiKhoan(String MaTK, String UserName, String Password, int SDT,String remember, String TenNgD, String DiaChi, String NgaySinh, boolean gioitinh,String Email, int CMND,String Hinh) {
        super( TenNgD, DiaChi, NgaySinh, gioitinh,Email, CMND,Hinh);
        this.MaTK = MaTK;
        this.UserName = UserName;
        this.Password = Password;
        this.SDT = SDT;
        this.remember = remember;
    }
    
    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public TaiKhoan(String MaTK, String UserName, String Password,int SDT,String remeber) {
        this.MaTK = MaTK;
        this.UserName = UserName;
        this.Password = Password;
        this.SDT = SDT;
        this.remember = remeber;
    }

    public TaiKhoan() {
    }

    public String getMaTK() {
        return MaTK;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "MaTK=" + MaTK + ", UserName=" + UserName + ", Password=" + Password + ", SDT=" + SDT + ", remember=" + remember + '}';
    }

 

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }
    
}
