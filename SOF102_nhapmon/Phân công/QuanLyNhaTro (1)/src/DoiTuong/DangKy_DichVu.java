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
public class DangKy_DichVu extends DichVu {
    String MaTK;
    String NgayDangKy;
    int ThoiHan;
    boolean trangThaiDangKy;

    public DangKy_DichVu(String MaTK, String NgayDangKy, int ThoiHan, boolean trangThaiDangKy, String MaDV, String TenDV, double PhiDV, String NgayPhatHanh, String HanKetThuc, String TenCTy, String email, int SDT, String website, String DiaChi, String GhiChu) {
        super(MaDV, TenDV, PhiDV, NgayPhatHanh, HanKetThuc, TenCTy, email, SDT, website, DiaChi, GhiChu);
        this.MaTK = MaTK;
        this.NgayDangKy = NgayDangKy;
        this.ThoiHan = ThoiHan;
        this.trangThaiDangKy = trangThaiDangKy;
    }

    public DangKy_DichVu(String MaTK, String NgayDangKy, int ThoiHan, boolean trangThaiDangKy) {
        this.MaTK = MaTK;
        this.NgayDangKy = NgayDangKy;
        this.ThoiHan = ThoiHan;
        this.trangThaiDangKy = trangThaiDangKy;
    }

    public DangKy_DichVu() {
    }

    public String getMaTK() {
        return MaTK;
    }

    public String getNgayDangKy() {
        return NgayDangKy;
    }

    public int getThoiHan() {
        return ThoiHan;
    }

    public boolean isTrangThaiDangKy() {
        return trangThaiDangKy;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public void setNgayDangKy(String NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

    public void setThoiHan(int ThoiHan) {
        this.ThoiHan = ThoiHan;
    }

    public void setTrangThaiDangKy(boolean trangThaiDangKy) {
        this.trangThaiDangKy = trangThaiDangKy;
    }
    
}
