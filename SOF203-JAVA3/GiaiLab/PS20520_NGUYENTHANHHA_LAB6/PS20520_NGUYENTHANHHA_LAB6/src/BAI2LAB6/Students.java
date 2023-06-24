/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2LAB6;

/**
 *
 * @author Admin
 */
public class Students {
    int regid ;
    String name,address,parentname,contactNo,standard;
    double fees;

    public Students() {
    }

    public Students(String name, String address, String parentname, String contactNo, String standard, double fees) {
        this.name = name;
        this.address = address;
        this.parentname = parentname;
        this.contactNo = contactNo;
        this.standard = standard;
        this.fees = fees;
    }

    public Students(int regid,String name, String address, String parentname, String contactNo, String standard, double fees) {
        this.regid = regid;
        this.name = name;
        this.address = address;
        this.parentname = parentname;
        this.contactNo = contactNo;
        this.standard = standard;
        this.fees = fees;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public int getRegid() {
        return regid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getParentname() {
        return parentname;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getStandard() {
        return standard;
    }

    public double getFees() {
        return fees;
    }
    
}
