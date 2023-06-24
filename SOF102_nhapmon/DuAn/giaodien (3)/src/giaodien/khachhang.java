/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

/**
 *
 * @author minhc
 */
public class khachhang {
    String MaNha, tennhatro, diachi, dientich, nguoilienhe, mota, hinhanh, danhgia, like, trangthai, loainha;
    double gia;

    public khachhang() {
    }

    public khachhang(String MaNha, String tennhatro, String diachi, String dientich, String nguoilienhe, String mota, String hinhanh, String danhgia, String like, String trangthai, String loainha, double gia) {
        this.MaNha = MaNha;
        this.tennhatro = tennhatro;
        this.diachi = diachi;
        this.dientich = dientich;
        this.nguoilienhe = nguoilienhe;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.danhgia = danhgia;
        this.like = like;
        this.trangthai = trangthai;
        this.loainha = loainha;
        this.gia = gia;
    }

    public String getMaNha() {
        return MaNha;
    }

    public void setMaNha(String MaNha) {
        this.MaNha = MaNha;
    }

    public String getTennhatro() {
        return tennhatro;
    }

    public void setTennhatro(String tennhatro) {
        this.tennhatro = tennhatro;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDientich() {
        return dientich;
    }

    public void setDientich(String dientich) {
        this.dientich = dientich;
    }

    public String getNguoilienhe() {
        return nguoilienhe;
    }

    public void setNguoilienhe(String nguoilienhe) {
        this.nguoilienhe = nguoilienhe;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    
    
}
