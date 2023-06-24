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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import user.User_InFo;

public class Connections {

    public Connection con = null;

    public Connection consql(String user, String pass, int port, String database) {
        String url = "jdbc:sqlserver://localhost:" + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("thành công");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(" LỖI DO KẾT NỐI SQL");
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


    }
// Tạo 1 method để chạy kết quả cho lệnh select
    // to do code here

    public User_InFo getResultqury(String sql) throws SQLException {
        User_InFo user = null;
        try {
            Statement stmts = con.createStatement();
            ResultSet result = stmts.executeQuery(sql);
            while (result.next()) {
                String hoten = result.getString("FIRST_NAME") + " " + result.getString("LAST_NAME");
                String ngaysinh = String.valueOf(result.getDate("BRITH"));
                String diachi = result.getString("ADDRESS_USER");
                String gioitinh = String.valueOf(result.getByte("SEX"));
                String username = result.getString("USER_NAME");
                String pass = result.getString("PASSWORD");
                int sodt = Integer.parseInt(result.getString("PHONE"));
                int cmnd = result.getInt("IDENTITY_CARD_OR_CITIZEN_IDENTIFICATION");
                double sodu = result.getDouble("WALLET_BALANCE");
                user = new User_InFo(hoten, ngaysinh, diachi, gioitinh, username, pass, sodt, cmnd, sodu);
                System.out.println(user);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại connect.getresultquery" + ex);
        }
        return user;
    }
    //connection bằng preparment
    

}
