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
 abstract public class SinhVienPoly{
    private String ten,nganh,diem,hocluc;
    abstract public Double getDiem();

    public SinhVienPoly() {
    }

    public SinhVienPoly(String ten, String nganh) {
        this.ten = ten;
        this.nganh = nganh;
    }
    
    public String getHocLuc(){
        if(this.getDiem()<5)
            return "Yeu";
        else if(this.getDiem()<6.5)
            return "Trung Binh";
        else if(this.getDiem()<7.5)
            return "Kha";
        else if(this.getDiem()<9)
            return "Gioi";
        else
            return "Xuat sac";
    }
    public void xuat(){
        System.out.println("Thong tin sinh vien: ");
        System.out.println("Ho va ten: "+this.ten);
        System.out.println("Nganh: "+this.nganh);
        System.out.println("Diem: "+this.getDiem());
        System.out.println("Hoc luc: "+this.getHocLuc());
    }
}
