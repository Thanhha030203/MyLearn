/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bAI2lAB5;

/**
 *
 * @author Admin
 */
public class Students {
    private String MaSv;
    private String Hoten;
    private String Email;
    private String SoDT;
    private String Diachi;
   byte gioitnh;

    public Students() {
    }

    public Students(String MaSv, String Hoten, String Email, String SoDT, byte gioitnh, String Diachi) {
        this.MaSv = MaSv;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SoDT = SoDT;
        this.Diachi = Diachi;
        this.gioitnh = gioitnh;
    }

    @Override
    public String toString() {
        return "Students{" + "MaSv=" + MaSv + ", Hoten=" + Hoten + ", Email=" + Email + ", SoDT=" + SoDT + ", Diachi=" + Diachi + ", gioitnh=" + gioitnh + '}';
    }
    

    public String getMaSv() {
        return MaSv;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public byte getGioitnh() {
        return gioitnh;
    }
    
    
}
