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
public class Nguoidung {
    String TenNgD,DiaChi,NgaySinh;
   int SDT;
    boolean gioitinh;
    String Email;
    int CMND;
    String HinhAnh;

    public Nguoidung( String TenNgD, String DiaChi, String NgaySinh, boolean gioitinh,String Email, int CMND) {
        this.TenNgD = TenNgD;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.gioitinh = gioitinh;
        this.CMND = CMND;
    }

    public Nguoidung(String TenNgD, String DiaChi, String NgaySinh, boolean gioitinh, String Email, int CMND, String HinhAnh) {
        this.TenNgD = TenNgD;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.gioitinh = gioitinh;
        this.Email = Email;
        this.CMND = CMND;
        this.HinhAnh = HinhAnh;
    }

    public Nguoidung(int SDT, String TenNgD, String DiaChi, String NgaySinh, boolean gioitinh,String Email, int CMND, String HinhAnh) {
        this.TenNgD = TenNgD;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.gioitinh = gioitinh;
        this.CMND = CMND;
        this.HinhAnh = HinhAnh;
    }

    public Nguoidung() {
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public int getSDT() {
        return SDT;
    }

    public String getTenNgD() {
        return TenNgD;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public int getCMND() {
        return CMND;
    
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTenNgD(String TenNgD) {
        this.TenNgD = TenNgD;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Nguoidung[" + ", TenNgD =" + TenNgD + ", DiaChi =" + DiaChi + ", NgaySinh =" + NgaySinh + ", gioitinh =" + gioitinh + ", CMND =" + CMND + ']';
    }
    
    
}
