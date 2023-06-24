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
public class LoaiNhaTro {
    String MalOai,TenLoai;

    public LoaiNhaTro(String MalOai, String TenLoai) {
        this.MalOai = MalOai;
        this.TenLoai = TenLoai;
    }

    public LoaiNhaTro(String MalOai) {
        this.MalOai = MalOai;
    }

    public LoaiNhaTro() {
    }

    public String getMalOai() {
        return MalOai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setMalOai(String MalOai) {
        this.MalOai = MalOai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
}
