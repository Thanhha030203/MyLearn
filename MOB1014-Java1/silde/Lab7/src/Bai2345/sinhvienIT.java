
package Bai2345;

public class sinhvienIT extends svpoly {
    private Double java, html, css;
    @Override
    
    public Double getDiem(){
        return (this.java*2 + this.html + this.css)/4;
    }

    public sinhvienIT(String hoten, String nganh, Double java, Double html, Double css) {
        super(hoten, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public sinhvienIT(Double java, Double html, Double css) {
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public sinhvienIT() {
    }
    public double minDiem(){ 
        return Math.min(Math.min(java, html), (Math.min(java, css)));
    }

}
