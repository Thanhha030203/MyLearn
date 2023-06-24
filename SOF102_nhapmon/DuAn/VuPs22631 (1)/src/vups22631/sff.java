/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vups22631;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Anh Vu
 */
public class sff {
    public static void main(String[] args) {
        try{
            String user="sa";
            String pass="";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLNT_NHOM5";
            Connection con = DriverManager.getConnection(url, user,pass);
            String sql="select * from DichVu";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getString("MaDV")+", ");
                System.out.print(rs.getString("TenDV")+", ");
                System.out.print(rs.getString("PhiDV")+", ");
                System.out.print(rs.getString("NgayPhatHanh")+", ");
                System.out.println(rs.getString("HanKetThuc"));
            }
            con.close();
        }catch(Exception e){
                System.out.println(e);
        }
    }
    
}
