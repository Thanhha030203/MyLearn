/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DichVu  {
    String MaDV,TenDV;
    double PhiDV;
    String NgayPhatHanh,HanKetThuc;
    String TenCTy, email;
    int SDT;
    String website,DiaChi,GhiChu;

    public DichVu() {
    }

    public DichVu(String MaDV, String TenDV, double PhiDV, String NgayPhatHanh, String HanKetThuc, String TenCTy, String email, int SDT, String website, String DiaChi, String GhiChu) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.PhiDV = PhiDV;
        this.NgayPhatHanh = NgayPhatHanh;
        this.HanKetThuc = HanKetThuc;
        this.TenCTy = TenCTy;
        this.email = email;
        this.SDT = SDT;
        this.website = website;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public double getPhiDV() {
        return PhiDV;
    }

    public void setPhiDV(double PhiDV) {
        this.PhiDV = PhiDV;
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public String getHanKetThuc() {
        return HanKetThuc;
    }

    public void setHanKetThuc(String HanKetThuc) {
        this.HanKetThuc = HanKetThuc;
    }

    public String getTenCTy() {
        return TenCTy;
    }

    public void setTenCTy(String TenCTy) {
        this.TenCTy = TenCTy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }


    

}

    