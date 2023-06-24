/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM2;

/**
 *
 * @author ADMIN
 */
public class TiepThi extends NhanVien{
    private Double doanhSo,hueHong;

    public TiepThi() {
    }

    public TiepThi( String ten, String manv,  double luong, Double doanhSo, Double hueHong) {
        super(manv, ten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(Double doanhSo, Double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }
    
    @Override
    public Double getThuNhap(){
        return super.getLuong()+this.doanhSo+this.hueHong;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("Doanh so: %.0f \n",this.doanhSo);
        System.out.printf("Hue hong: %.0f \n",this.hueHong);
    }
}
