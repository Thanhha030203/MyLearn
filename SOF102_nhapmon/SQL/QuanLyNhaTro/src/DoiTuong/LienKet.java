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
public class LienKet extends TaiKhoan {
    String MaLK;
    String MaTK;
    String TenNganHang;
    int soThe,SoTK;
    boolean trangthai;
    double soDu;

    public LienKet(String MaLK,String MaTK, String TenNganHang, int soThe, int SoTK, boolean trangthai, double soDu, String MaTK_tk, String UserName, String Password,int sdt,String remember) {
        super(MaTK_tk, UserName, Password,sdt,remember);
        this.MaLK = MaLK;
        this.MaTK = MaTK;
        this.TenNganHang = TenNganHang;
        this.soThe = soThe;
        this.SoTK = SoTK;
        this.trangthai = trangthai;
        this.soDu = soDu;
    }

    public LienKet(String MaLK,String MaTK, String TenNganHang, int soThe, int SoTK, boolean trangthai, double soDu) {
        this.MaLK = MaLK;
        this.MaTK = MaTK;
        this.TenNganHang = TenNganHang;
        this.soThe = soThe;
        this.SoTK = SoTK;
        this.trangthai = trangthai;
        this.soDu = soDu;
    }
//    public LienKet(String MaLK,String MaTK, String TenNganHang, int soThe, int SoTK, boolean trangthai, double soDu, String MaTK_tk, String UserName, String Password, int SDT, String TenNgD, String DiaChi, String NgaySinh, boolean gioitinh,String Email, int CMND) {
//        super(MaTK_tk, UserName, Password, SDT, TenNgD, DiaChi, NgaySinh, gioitinh,Email, CMND);
//        this.MaLK = MaLK;
//        this.MaTK= MaTK;
//        this.TenNganHang = TenNganHang;
//        this.soThe = soThe;
//        this.SoTK = SoTK;
//        this.trangthai = trangthai;
//        this.soDu = soDu;
//    }

    public LienKet() {
    }

    public String getMaLK() {
        return MaLK;
    }

    public String getMaTK() {
        return MaTK;
    }

    public String getTenNganHang() {
        return TenNganHang;
    }

    public int getSoThe() {
        return soThe;
    }

    public int getSoTK() {
        return SoTK;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setMaLK(String MaLK) {
        this.MaLK = MaLK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public void setTenNganHang(String TenNganHang) {
        this.TenNganHang = TenNganHang;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public void setSoTK(int SoTK) {
        this.SoTK = SoTK;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
}
