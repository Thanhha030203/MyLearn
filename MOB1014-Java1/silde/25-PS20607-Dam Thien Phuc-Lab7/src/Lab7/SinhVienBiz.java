/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author ADMIN
 */
public class SinhVienBiz extends SinhVienPoly{
    private Double maketing,sales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(Double maketing, Double sales) {
        this.maketing = maketing;
        this.sales = sales;
    }

    public SinhVienBiz(String ten, String nganh,Double maketing, Double sales) {
        super(ten, nganh);
        this.maketing = maketing;
        this.sales = sales;
    }
    
    @Override
    public Double getDiem(){
        return (this.maketing*2+this.sales)/3;
    }
}
