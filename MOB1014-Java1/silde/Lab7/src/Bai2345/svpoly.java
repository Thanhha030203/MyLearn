/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2345;

abstract public class svpoly {
    String hoten;
    String nganh;

    public svpoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    public svpoly() {
    }
    abstract public Double getDiem();
     public String hocbong(){
         if(getDiem()>=7.5 && minDiem()>=6.5){ 
             return " Hoc bong gioi ";
         }
         else if( getDiem()>=6.5 && minDiem()>=5){
             return " hoc bong kha";
         }
         else{
             return " Khong co hoc bong";
         }
     }
    abstract public double minDiem();
    
    public String gethocLuc(){
        if(getDiem()<5){
            return "Yeu";
        }else if(getDiem()<6.5){
            return "Trung binh";
        }else if(getDiem()<7.5){
            return "Kha";
        }else if(getDiem()<9){
            return "Gioi";
        }else return "Xuat sac";
    }
    public void xuat(){
        System.out.println("* Thong tin sinh vien: ");
        System.out.println("Ho ten: "+ this.hoten);
        System.out.println("Nganh: "+ this.nganh);
        System.out.println("Diem TB: "+ getDiem());
        System.out.println("Hoc luc: "+ gethocLuc());
        System.out.println("Hoc bong : "+hocbong());
    }
    
}
