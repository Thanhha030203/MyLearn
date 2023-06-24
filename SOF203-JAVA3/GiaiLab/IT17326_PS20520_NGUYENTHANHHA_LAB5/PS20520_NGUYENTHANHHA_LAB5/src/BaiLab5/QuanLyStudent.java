/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiLab5;

import bAI2lAB5.Connections;
import bAI2lAB5.Students;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyStudent {
    public static void main(String[] args) throws SQLException {
        Connections con = new Connections();
        con.consql("PS20520-THANHHA","30022031", 1433, "QLSINHVIEN");
        List<Students> list = new ArrayList<Students>();
        String sql = "Select * from STUDENTS ";
        list = con.getResultqury(sql);
        for(int i=0; i<list.size();i++){ 
            Students s = list.get(i);
            System.out.println(s);
        }
    }
}
