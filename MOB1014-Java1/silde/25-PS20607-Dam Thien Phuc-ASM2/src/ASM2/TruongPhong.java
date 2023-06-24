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
public class TruongPhong extends NhanVien{
    private Double trachnhiem;

    public TruongPhong() {
    }

    public TruongPhong(  String ten, String manv, Double luong, Double trachnhiem) {
        super(manv, ten, luong);
        this.trachnhiem = trachnhiem;
    }

    public TruongPhong(Double trachnhiem) {
        this.trachnhiem = trachnhiem;
    }
    
    @Override
    public Double getThuNhap(){
        return super.getLuong()+this.trachnhiem;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Trach nhiem: "+this.trachnhiem);
    }
}
