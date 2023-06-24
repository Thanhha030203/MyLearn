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
public class NhaTro extends LoaiNhaTro {
    String MaNT,TenNT,DiaChi;
    int dientich;
    String Mota, MaLoai;
    double gia;
    String Ma_NLH;
    boolean TrangThai;
    String Hinh ;

    public NhaTro(String MaNT, String TenNT, String DiaChi, int dientich, String Mota, String MaLoai, double gia, String Ma_NLH, boolean TrangThai, String Hinh, String MalOai, String TenLoai) {
        super(MalOai, TenLoai);
        this.MaNT = MaNT;
        this.TenNT = TenNT;
        this.DiaChi = DiaChi;
        this.dientich = dientich;
        this.Mota = Mota;
        this.MaLoai = MaLoai;
        this.gia = gia;
        this.Ma_NLH = Ma_NLH;
        this.TrangThai = TrangThai;
        this.Hinh = Hinh;
    }

    public NhaTro(String MaNT, String TenNT, String DiaChi, int dientich, String Mota, String MaLoai, double gia, String Ma_NLH, boolean TrangThai, String Hinh) {
        this.MaNT = MaNT;
        this.TenNT = TenNT;
        this.DiaChi = DiaChi;
        this.dientich = dientich;
        this.Mota = Mota;
        this.MaLoai = MaLoai;
        this.gia = gia;
        this.Ma_NLH = Ma_NLH;
        this.TrangThai = TrangThai;
        this.Hinh = Hinh;
    }

    public NhaTro() {
    }

    public String getHinh() {
        return Hinh;
    }


 
    public String getMaNT() {
        return MaNT;
    }

    public String getTenNT() {
        return TenNT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public int getDientich() {
        return dientich;
    }

    public String getMota() {
        return Mota;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public double getGia() {
        return gia;
    }

    public String getMa_NLH() {
        return Ma_NLH;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }
    
    public void setMaNT(String MaNT) {
        this.MaNT = MaNT;
    }

    public void setTenNT(String TenNT) {
        this.TenNT = TenNT;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMa_NLH(String Ma_NLH) {
        this.Ma_NLH = Ma_NLH;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
