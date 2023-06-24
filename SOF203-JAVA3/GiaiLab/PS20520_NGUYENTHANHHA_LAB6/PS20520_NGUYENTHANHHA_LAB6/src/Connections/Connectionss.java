/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

/**
 *
 * @author Admin
 */
import BAI1LAB6.Books;
import BAI2LAB6.Students;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connectionss {

    public Connection con = null;
    public Connection consql(String user, String pass, int port, String database) {
        System.out.println("1");
        String url = "jdbc:sqlserver://localhost:" + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";
        try {
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            System.out.println("thành công");
        } catch (Exception e) {
            System.out.println("lỗi "+e);
        }
        return con;
    }
// Tạo 1 method để chạy kết quả các các lệnh tạo, cập nhật, xoá
    public void getResult(String sql) throws SQLException {
        int result = 0;
        try {     
            System.out.println("12");
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            System.out.println("1");
            if (result == 1) {
                System.out.println("Xử lí thành công");
                JOptionPane.showMessageDialog(null, "Xử lí thành công");
            }
        } catch (SQLException ex) {
            System.out.println("lỗi tại getResult : "+ex);
        }
        

    }
// Tạo 1 method để chạy kết quả cho lệnh select
    // to do code here
    public List<Students> getResultqury(String sql) throws SQLException{ 
        List <Students> list = new ArrayList<Students>();    
        try {    
            Statement stmts = con.createStatement();
             ResultSet result = stmts.executeQuery(sql);
           while (result.next()) {
             Students std = new Students(result.getInt("RegID"),result.getString("Name"), result.getString("Address"), result.getString("ParentName"), result.getString("Phone"), result.getString("standard"), result.getFloat("FEES"));
             list.add(std);
                
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại connect.getresultquery"+ex);
        }
    
        return list;
    }
   
}
