/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1bvasm;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class tkb implements Serializable{
      String thu, ca1, ca2, ca3,ca4;

    public tkb() {
    }

    public tkb(String thu, String ca1, String ca2, String ca3, String ca4) {
        this.thu = thu;
        this.ca1 = ca1;
        this.ca2 = ca2;
        this.ca3 = ca3;
        this.ca4 = ca4;
    }

    public String getThu() {
        return thu;
    }

    public String getCa1() {
        return ca1;
    }

    public String getCa2() {
        return ca2;
    }

    public String getCa3() {
        return ca3;
    }

    public String getCa4() {
        return ca4;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public void setCa1(String ca1) {
        this.ca1 = ca1;
    }

    public void setCa2(String ca2) {
        this.ca2 = ca2;
    }

    public void setCa3(String ca3) {
        this.ca3 = ca3;
    }

    public void setCa4(String ca4) {
        this.ca4 = ca4;
    }
      
    
}
