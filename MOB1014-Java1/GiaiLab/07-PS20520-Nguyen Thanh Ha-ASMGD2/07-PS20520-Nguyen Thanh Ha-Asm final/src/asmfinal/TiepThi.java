/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmfinal;

import asm2.NhanVien;

/**
 *
 * @author Admin
 */
public class TiepThi extends NhanVien {
    double doanhso;
    double huehong;

    public TiepThi(double doanhso, double huehong) {
        this.doanhso = doanhso;
        this.huehong = huehong;
    }

    public TiepThi(double doanhso, double huehong, String msnv) {
        super(msnv);
        this.doanhso = doanhso;
        this.huehong = huehong;
    }

    public TiepThi() {
    }
    public void getThuNhap(){ 
        
}
}
