/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

import java.io.Serializable;

/**
 *
 * @author HAN-PC
 */
public class SanPhamDTO implements Serializable{
    private SanPham sp;
    private int soluong;

    public SanPhamDTO() {
    }

    public SanPhamDTO(SanPham sp, int soluong) {
        this.sp = sp;
        this.soluong = soluong;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
