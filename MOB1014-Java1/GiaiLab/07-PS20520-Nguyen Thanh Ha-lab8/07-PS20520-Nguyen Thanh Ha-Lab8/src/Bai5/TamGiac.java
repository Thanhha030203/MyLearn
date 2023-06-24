/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TamGiac {
    double[] a = new double[3];
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        do { 
            System.out.println("Nhap 3 canh tam giac");   
            for(int i=0; i<3;i++){ 
                System.out.print("Canh "+(i+1)+" : ");
            a[i] = sc.nextDouble();
        }
 
        } while ((a[0]+a[1]) <=a[2] || (a[1]+a[2])<=a[0] || (a[0]+a[2])<=a[1]);
    } 
            public double getChuVi(){ 
        return this.a[0] +this.a[1] +this.a[2];
    }
    public String xacdinh(){ 
        if(this.a[0] == this.a[1]&& this.a[1]==this.a[2]){ 
            return ("La tam giac deu");
        }
        else if(Math.pow(this.a[0], 2)+Math.pow(this.a[1],2)==Math.pow(this.a[2],2)|| Math.pow(this.a[1], 2)+Math.pow(this.a[2],2)==Math.pow(this.a[0],2)|| Math.pow(this.a[0], 2)+Math.pow(this.a[2],2)==Math.pow(this.a[1],2)){ 
            return("La tam giac vuong ");
        }
        else if(this.a[0] == this.a[1] || (this.a[0]==this.a[2])||(this.a[1]==this.a[2])){ 
            return ("Tam giac can ");
        }
        else{
            return ("Tam giac thuong");
        }
}
    public double getDienTich(){ 
        double p = getChuVi()/2;  
       return  Math.sqrt((p*(p-a[0])*(p-a[1])*(p-a[2])));
    }
   public void xuat(){ 
        System.out.println("-------------------------------\n Xuat thong tin tam giac : ");
       System.out.println("canh a: "+this.a[0]);
       System.out.println("Canh b : "+this.a[1]);
       System.out.println("Canh c : "+this.a[2]);
       System.out.println("Kieu tam giac : "+xacdinh());
       System.out.println("Chu vi : "+getChuVi());
       System.out.println("Dien tich : "+getDienTich());
   
   }
   
}
