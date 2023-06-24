 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author Admin
 */


import java.sql.*;


public class Connections {

    Connection con;
// chỉ cần khởi tạo là tự động liên kết

    public Connections() {
        
    }

    public Connection consql(String user, String pass, int port, String database) {
        String url = "jdbc:sqlserver:// localhost : " + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";

        try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("thành công");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(" LỖI DO KẾT NỐI SQL" + e);
            return null;
        }
        return (Connection) con;
    }
// Tạo 1 method để chạy kết quả các các lệnh tạo, cập nhật, xoá

}