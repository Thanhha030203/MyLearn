/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMGD2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class NhanVien<I,S,N> implements Serializable{
    I manv; I tuoi;
    S hoten;S mail;
    N luong;

    public NhanVien(I manv, S hoten, I tuoi, S mail, N luong) {
        this.manv = manv;
        this.tuoi = tuoi;
        this.hoten = hoten;
        this.mail = mail;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public I getManv() {
        return manv;
    }

    public I getTuoi() {
        return tuoi;
    }

    public S getHoten() {
        return hoten;
    }

    public S getMail() {
        return mail;
    }

    public N getLuong() {
        return luong;
    }

    public void setManv(I manv) {
        this.manv = manv;
    }

    public void setTuoi(I tuoi) {
        this.tuoi = tuoi;
    }

    public void setHoten(S hoten) {
        this.hoten = hoten;
    }

    public void setMail(S mail) {
        this.mail = mail;
    }

    public void setLuong(N luong) {
        this.luong = luong;
    }

  
}