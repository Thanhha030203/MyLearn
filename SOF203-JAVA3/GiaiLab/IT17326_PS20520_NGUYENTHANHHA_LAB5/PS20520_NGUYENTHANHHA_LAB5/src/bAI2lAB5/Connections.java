/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bAI2lAB5;

/**
 *
 * @author Admin
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connections {

    public Connection con = null;
    public Connection consql(String user, String pass, int port, String database) {
        String url = "jdbc:sqlserver://localhost:" + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";
        try {
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
        } catch (Exception e) {
            return null;
        }
        return con;
    }
// Tạo 1 method để chạy kết quả các các lệnh tạo, cập nhật, xoá
    public void getResult(String sql) throws SQLException {
        int result = 0;
        try {         
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            if (result == 1) {
                System.out.println("Xử lí thành công");
                JOptionPane.showMessageDialog(null, "Xử lí thành công");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        con.close();

    }
// Tạo 1 method để chạy kết quả cho lệnh select
    // to do code here
    public List<Students> getResultqury(String sql) throws SQLException{ 
        List <Students> list = new ArrayList<Students>();    
        try {    
            Statement stmts = con.createStatement();
             ResultSet result = stmts.executeQuery(sql);
           while (result.next()) {
                Students std = new Students(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getByte(5),result.getString(6));
                list.add(std);
                
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại connect.getresultquery"+ex);
        }
     
        con.close();
        return list;
    }
   
}
