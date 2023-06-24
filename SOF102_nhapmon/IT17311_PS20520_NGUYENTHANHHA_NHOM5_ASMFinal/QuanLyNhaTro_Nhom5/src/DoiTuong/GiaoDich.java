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
public class GiaoDich extends LienKet{
    String MaGD,tenGD;
    int soTk_nguoinhan;
    String noiDung;
    String thoigian;
    double soTien;
    boolean trangThai;

    public GiaoDich(String MaGD, String tenGD, int soTk_nguoinhan, String noiDung, String thoigian, double soTien, boolean trangThai) {
        this.MaGD = MaGD;
        this.tenGD = tenGD;
        this.soTk_nguoinhan = soTk_nguoinhan;
        this.noiDung = noiDung;
        this.thoigian = thoigian;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }

    public GiaoDich(String MaGD, String tenGD, int soTk_nguoinhan, String noiDung, String thoigian, double soTien, boolean trangThai, String MaLK, String MaTK, String TenNganHang, int soThe, int SoTK, boolean trangthai, double soDu) {
        super(MaLK, MaTK, TenNganHang, soThe, SoTK, soDu);
        this.MaGD = MaGD;
        this.tenGD = tenGD;
        this.soTk_nguoinhan = soTk_nguoinhan;
        this.noiDung = noiDung;
        this.thoigian = thoigian;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }
        public GiaoDich(String MaGD, String tenGD, int soTk_nguoinhan, String noiDung, String thoigian, double soTien, boolean trangThai, String MaLK, String MaTK, String TenNganHang, int soThe, int SoTK, double soDu) {
        super(MaLK, MaTK, TenNganHang, soThe, SoTK, soDu);
        this.MaGD = MaGD;
        this.tenGD = tenGD;
        this.soTk_nguoinhan = soTk_nguoinhan;
        this.noiDung = noiDung;
        this.thoigian = thoigian;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }

 

    public GiaoDich() {
    }

    public String getMaGD() {
        return MaGD;
    }

    public String getTenGD() {
        return tenGD;
    }


    public int getSoTk_nguoinhan() {
        return soTk_nguoinhan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getThoigian() {
        return thoigian;
    }

    public double getSoTien() {
        return soTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setMaGD(String MaGD) {
        this.MaGD = MaGD;
    }

    public void setTenGD(String tenGD) {
        this.tenGD = tenGD;
    }

    public void setSoTk_nguoinhan(int soTk_nguoinhan) {
        this.soTk_nguoinhan = soTk_nguoinhan;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "MaGD=" + MaGD + ", tenGD=" + tenGD + ", soTk_nguoinhan=" + soTk_nguoinhan + ", noiDung=" + noiDung + ", thoigian=" + thoigian + ", soTien=" + soTien + ", trangThai=" + trangThai + '}';
    }
    
}
