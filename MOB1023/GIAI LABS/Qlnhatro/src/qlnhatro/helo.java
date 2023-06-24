/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhatro;

/**
 *
 * @author Admin
 */
import java.sql.*;
public class helo {
    public static void main(String[] args) {
        String user = "PS20520_THANHHA";
        String pas = "30022031";
        String url = "jdbc:sqlserver://localhost:1433/QLNHATRO_PS20520THANHHA";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url,user,pas);
                        String sql = "Update DANHGIA SET TRANGTHAI = ? WHERE STT = ?";

            PreparedStatement ps = con.prepareStatement("");
            ps.setString(1,"DISLIKE");
            ps.setInt(2, 1);
//            Statement st = con.createStatement();
//            ResultSet re = st.executeQuery(sql);
            int rs = ps.executeUpdate();
            if(rs==1){ 
                System.out.println("Thành công");
            }
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("lõi");
        }
//try {
//           
//            String url = "jdbc:mysql://localhost:3306/databaseName=db_quanlybanhang_ps20673_lab7";
//            Connection con = DriverManager.getConnection(url, "root", "thanhha30022031");
//            Statement stm = con.createStatement();
//            String sql = "select * from san_pham";
//            ResultSet rs = stm.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "-" + rs.getString("maSanPham"));
//            }
//            rs.close();
//            stm.close();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
