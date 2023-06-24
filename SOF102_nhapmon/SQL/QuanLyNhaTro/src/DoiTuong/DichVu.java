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

    public DichVu() {
    }

    public String getMaDV() {
        return MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public double getPhiDV() {
        return PhiDV;
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public String getHanKetThuc() {
        return HanKetThuc;
    }

    public String getTenCTy() {
        return TenCTy;
    }

    public String getEmail() {
        return email;
    }

    public int getSDT() {
        return SDT;
    }

    public String getWebsite() {
        return website;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public void setPhiDV(double PhiDV) {
        this.PhiDV = PhiDV;
    }

    public void setNgayPhatHanh(String NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public void setHanKetThuc(String HanKetThuc) {
        this.HanKetThuc = HanKetThuc;
    }

    public void setTenCTy(String TenCTy) {
        this.TenCTy = TenCTy;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}

    