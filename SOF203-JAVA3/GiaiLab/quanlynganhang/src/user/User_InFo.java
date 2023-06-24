/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author Admin
 */
public class User_InFo {
    String Hoten,ngaysinh,diachi,gioitinh,username,pass;
    int sodt,cmnd;
    double sodu;

    public User_InFo() {
    }

    public User_InFo(String Hoten, String ngaysinh, String diachi, String gioitinh, String username, String pass, int sodt, int cmnd, double sodu) {
        this.Hoten = Hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.username = username;
        this.pass = pass;
        this.sodt = sodt;
        this.cmnd = cmnd;
        this.sodu = sodu;
    }

    @Override
    public String toString() {
        return "User_InFo{" + "Hoten=" + Hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", username=" + username + ", pass=" + pass + ", sodt=" + sodt + ", cmnd=" + cmnd + ", sodu=" + sodu + '}';
    }

    public String getHoten() {
        return Hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public int getSodt() {
        return sodt;
    }

    public int getCmnd() {
        return cmnd;
    }

    public double getSodu() {
        return sodu;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setSodt(int sodt) {
        this.sodt = sodt;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }
    
}
