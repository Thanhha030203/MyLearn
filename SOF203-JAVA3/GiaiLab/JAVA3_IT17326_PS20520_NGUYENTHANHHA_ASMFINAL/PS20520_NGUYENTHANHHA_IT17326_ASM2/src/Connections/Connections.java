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
import Students.Students;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connections {

    public Connection con = null;

    public Connection consql(){
            
        String url = "jdbc:sqlserver://localhost:" + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("thành công");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(" LỖI DO KẾT NỐI SQL" + e);
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
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
// Tạo 1 method để chạy kết quả cho lệnh select
    // to do code here

    public List<Students> getResultqury(String sql) throws SQLException {
        List<Students> list = new ArrayList<Students>();
        try {
            Statement stmts = con.createStatement();
            ResultSet result = stmts.executeQuery(sql);
            while (result.next()) {
                String Masv = result.getString("MASV");
                String hoten = result.getString("Hoten");
                String email = result.getString("Email");
                String sdt = result.getString("SoDT");
                byte gioitinh = result.getByte("Gioitinh");
                String diachi = result.getString("Diachi");
                String hinh = result.getString("Hinh");
                double ta = result.getDouble("Tienganh");
                double tin = result.getDouble("Tinhoc");
                double gdtc = result.getDouble("GDTC");
                Students st = new Students(Masv, hoten, email, sdt, gioitinh, diachi, hinh, ta, tin, gdtc);
                list.add(st);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại connect.getresultquery" + ex);
        }

        return list;
    }

    public String getResultuser(String sql) throws SQLException {
        String role = "";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                role = rs.getString("role");
            }
        } //connection bằng preparment
        catch (Exception e) {
           
        } 
    return role ;
    }
}
