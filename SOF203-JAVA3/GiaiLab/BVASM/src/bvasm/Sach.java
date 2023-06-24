/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvasm;

/**
 *
 * @author Admin
 */
public class Sach {
      String masach,tensach;
      float gia;
      int namxb;

    public Sach() {
    }

    public Sach(String masach, String tensach, float gia, int namxb) {
        this.masach = masach;
        this.tensach = tensach;
        this.gia = gia;
        this.namxb = namxb;
    }

    public String getMasach() {
        return masach;
    }

    public String getTensach() {
        return tensach;
    }

    public float getGia() {
        return gia;
    }

    public int getNamxb() {
        return namxb;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }
      
}
