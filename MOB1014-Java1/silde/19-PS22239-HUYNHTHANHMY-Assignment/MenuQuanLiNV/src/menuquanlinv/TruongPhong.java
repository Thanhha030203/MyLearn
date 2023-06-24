/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuquanlinv;

/**
 *
 * @author THANH MY
 */
public class TruongPhong extends NhanVien{
    private Double luongTrachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(Double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong(String msnv, String ten, double luong, Double luongTrachNhiem) {
        super(msnv, ten, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public Double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(Double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    

    @Override
    public Double getThuNhap() {
        return super.getThuNhap()+luongTrachNhiem; 
    }
    
    
    
}
