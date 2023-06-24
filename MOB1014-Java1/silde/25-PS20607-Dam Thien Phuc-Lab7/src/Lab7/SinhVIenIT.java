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
public class SinhVIenIT extends SinhVienPoly{
    private Double java,html,css;

    public SinhVIenIT() {
    }

    public SinhVIenIT(Double java, Double html, Double css) {
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public SinhVIenIT(String ten, String nganh,Double java, Double html, Double css) {
        super(ten, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }


    
    
    @Override
    public Double getDiem(){
        return (this.java*2+this.html+this.css)/4;
    }
}
