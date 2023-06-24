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
public class DanhGia extends NhaTro {
    String MaDanhGi,Ma_NGD;
    boolean like_dislike;
    String noiDung;

    public DanhGia(String MaDanhGi, String Ma_NGD, boolean like_dislike, String noiDung, String MaNT, String TenNT, String DiaChi, int dientich, String Mota, String MaLoai, double gia, String Ma_NLH, boolean TrangThai,String Hinh) {
        super(MaNT, TenNT, DiaChi, dientich, Mota, MaLoai, gia, Ma_NLH, TrangThai,Hinh);
        this.MaDanhGi = MaDanhGi;
        this.Ma_NGD = Ma_NGD;
        this.like_dislike = like_dislike;
        this.noiDung = noiDung;
    }

    public DanhGia(String MaDanhGi, String Ma_NGD, boolean like_dislike, String noiDung) {
        this.MaDanhGi = MaDanhGi;
        this.Ma_NGD = Ma_NGD;
        this.like_dislike = like_dislike;
        this.noiDung = noiDung;
    }

    public DanhGia() {
    }

    public String getMaDanhGi() {
        return MaDanhGi;
    }

    public String getMa_NGD() {
        return Ma_NGD;
    }

    public boolean isLike_dislike() {
        return like_dislike;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setMaDanhGi(String MaDanhGi) {
        this.MaDanhGi = MaDanhGi;
    }

    public void setMa_NGD(String Ma_NGD) {
        this.Ma_NGD = Ma_NGD;
    }

    public void setLike_dislike(boolean like_dislike) {
        this.like_dislike = like_dislike;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    
}
