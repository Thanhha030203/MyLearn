/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

public class tamgiac {
    Double canh1, canh2,canh3;
    public tamgiac(Double canh1, Double canh2, Double canh3){
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public tamgiac() {
    }
    public Double chuVi(){
        return this.canh1 + this.canh2 + this.canh3;
    }
    public Double dienTich(){
        return Math.sqrt((chuVi()/2) * ((chuVi()/2) - this.canh1) * ((chuVi()/2) - this.canh2) * ((chuVi()/2) - this.canh3));
    }
}
