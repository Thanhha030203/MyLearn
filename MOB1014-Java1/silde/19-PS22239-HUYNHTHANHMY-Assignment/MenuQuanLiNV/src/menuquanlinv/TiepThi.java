/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuquanlinv;

/**
 *
 * @author THANH MY
 */
public class TiepThi extends NhanVien {

    private Double doanhSo;
    private Double hueHong;

    public TiepThi() {
    }

    public TiepThi(Double doanhSo, Double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(String msnv, String ten, double luong, Double doanhSo, Double hueHong) {
        super(msnv, ten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHueHong() {
        return hueHong;
    }

    public void setHueHong(Double hueHong) {
        this.hueHong = hueHong;
    }
    
    

    

    @Override
    public Double getThuNhap() {
        return super.getThuNhap()+doanhSo+hueHong;
    }

}
