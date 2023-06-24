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
public class BaiDang {
    String MaTK,NoiDung,HinhAnh;
    String NgayDang;
    boolean Like_dislike;
    String ND_danhGia;

    public BaiDang(String MaTK, String NoiDung, String HinhAnh, String NgayDang, boolean Like_dislike, String ND_danhGia) {
        this.MaTK = MaTK;
        this.NoiDung = NoiDung;
        this.HinhAnh = HinhAnh;
        this.NgayDang = NgayDang;
        this.Like_dislike = Like_dislike;
        this.ND_danhGia = ND_danhGia;
    }

    public BaiDang() {
    }

    public String getMaTK() {
        return MaTK;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public String getNgayDang() {
        return NgayDang;
    }

    public boolean isLike_dislike() {
        return Like_dislike;
    }

    public String getND_danhGia() {
        return ND_danhGia;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public void setNgayDang(String NgayDang) {
        this.NgayDang = NgayDang;
    }

    public void setLike_dislike(boolean Like_dislike) {
        this.Like_dislike = Like_dislike;
    }

    public void setND_danhGia(String ND_danhGia) {
        this.ND_danhGia = ND_danhGia;
    }
    
}
