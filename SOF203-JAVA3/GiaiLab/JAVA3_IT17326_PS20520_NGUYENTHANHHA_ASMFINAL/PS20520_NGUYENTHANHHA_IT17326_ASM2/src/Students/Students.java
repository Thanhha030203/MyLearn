/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author Admin
 */
public class Students {
    String MASV,Hoten,email,soDT,DiaChi,Hinh;
    int ID;
    byte gioitinh;
    double diemtienganh,diemtinhoc,diemgdtc;

    public Students(String MASV, String Hoten, String email, String soDT, byte gioitinh, String DiaChi, String Hinh, double diemtienganh, double diemtinhoc, double diemgdtc) {
        this.MASV = MASV;
        this.Hoten = Hoten;
        this.email = email;
        this.soDT = soDT;
        this.gioitinh = gioitinh;
        this.DiaChi = DiaChi;
        this.Hinh = Hinh;
        this.diemtienganh = diemtienganh;
        this.diemtinhoc = diemtinhoc;
        this.diemgdtc = diemgdtc;
    }

    public String getMASV() {
        return MASV;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getEmail() {
        return email;
    }

    public String getSoDT() {
        return soDT;
    }

    public Byte getGioitinh() {
        return gioitinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getHinh() {
        return Hinh;
    }

    public int getID() {
        return ID;
    }

    public double getDiemtienganh() {
        return diemtienganh;
    }

    public double getDiemtinhoc() {
        return diemtinhoc;
    }

    public double getDiemgdtc() {
        return diemgdtc;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setGioitinh(Byte gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDiemtienganh(double diemtienganh) {
        this.diemtienganh = diemtienganh;
    }

    public void setDiemtinhoc(double diemtinhoc) {
        this.diemtinhoc = diemtinhoc;
    }

    public void setDiemgdtc(double diemgdtc) {
        this.diemgdtc = diemgdtc;
    }

    @Override
    public String toString() {
        return "Students{" + "MASV=" + MASV + ", Hoten=" + Hoten + ", email=" + email + ", soDT=" + soDT + ", DiaChi=" + DiaChi + ", Hinh=" + Hinh + ", ID=" + ID + ", gioitinh=" + gioitinh + ", diemtienganh=" + diemtienganh + ", diemtinhoc=" + diemtinhoc + ", diemgdtc=" + diemgdtc + '}';
    }
    
}
