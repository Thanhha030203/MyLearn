/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.io.Serializable;

/**
 *
 * @author MinhMan
 */
class SanPham implements Serializable{
    private String ten = "";
    private double gia = 0d;

    public SanPham() 
    {
        
    }

    public SanPham(String ten, double gia) 
    {
        this.ten = ten;
        this.gia = gia;
    }

    public void setTen(String ten) 
    {
        this.ten = ten;
    }

    public String getTen() 
    {
        return ten;
    }

    public void setGia(double gia) 
    {
        this.gia = gia;
    }

    public double getGia() 
    {
        return gia;
    }
}
