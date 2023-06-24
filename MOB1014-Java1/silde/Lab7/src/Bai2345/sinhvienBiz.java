
package Bai2345;

public class sinhvienBiz extends svpoly{
    private Double marketing, sales;
    @Override
    public Double getDiem(){
        return (2*marketing + sales)/3;
    }

    public sinhvienBiz() {
    }
    public sinhvienBiz(String hoten, String nganh, Double marketing, Double sales) {
        super(hoten, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }

    public sinhvienBiz(Double marketing, Double sales) {
        this.marketing = marketing;
        this.sales = sales;
    }
    public double minDiem(){ 
        return Math.min(marketing,sales);
    }
}
