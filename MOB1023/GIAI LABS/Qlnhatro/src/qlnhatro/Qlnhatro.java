/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhatro;

import java.sql.*;


/**
 *
 * @author Admin
 */
public class Qlnhatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.sql.SQLException {
//           String connectionUrl = "jdbc:sqlserver://localhost;databaseName=QUANLY_NGANHANG;user=PS20520-THANHHA;password=30022031";
//
//        try (Connection con = DriverManager.getConnection(connectionUrl);
//                Statement stmt = con.createStatement();) {
//            String SQL = "SELECT * FROM USERS INNER JOIN ACCOUNT ON USERS.USER_CODE = ACCOUNT.USER_CODE AND ACCOUNT.USER_CODE = 'USER1601'";
//            ResultSet rs = stmt.executeQuery(SQL);
//
//            // Iterate through the data in the result set and display it.
//            while (rs.next()) {
//                System.out.println(rs.getString("ACCOUNT_NUMBER") + " -- " + rs.getString("CARD_NUMBER") +"--"+ rs.getString("PASSWORD_ACCOUNT"));
//            }
//        }
//        try (Connection con1 = DriverManager.getConnection(connectionUrl);
//                Statement stmt1 = con1.createStatement();){
//            String SQL1 = "INSERT INTO USERS VALUES ('USER1607',N'Nguyễn',N'Thanh Hà',N'Nũ','2003-02-13',54334212,'2017-07-07',N'Bình Định',N'Tây Sơn - Bình Định',0356456876,'ha@gmail.com')";
//            ResultSet num1 = stmt1.executeQuery(SQL1);
//        }catch (Exception e) {
//            
//        }
        try {
               
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYSINHVIEN";
            System.out.println("1");
            Connection con = DriverManager.getConnection(url, "PS20520-THANHHA", "30022031");
            Statement stm = con.createStatement();
//            String sql = "update DANHGIA set TRANGTHAI =? WHERE STT =?";
String sql = "Select * from STDUENTS";
//String sql = "delete FROMDANHGIA WHERE STT = ?";
            //dùng để truyền tham số vào 
            //b1 cho biết câu lệnh nào sẽ được thực thi

//            PreparedStatement ps = con.prepareStatement(sql);
//              set giá trị tương ứng cho tham số đầu vào
//            ps.setString(1, "DISLIKE");
//            System.out.println("2");
//            ps.setInt(1, 1);

//              thực thi câu lệnh   
//            int rs = ps.executeUpdate(sql);
ResultSet rs = stm.executeQuery(sql);
            if(rs.next()) {
                System.out.println("1");
                System.out.println(rs.getString("MASV"));
            }
            
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        // Handle any errors that may have occurred.
        // TODO code application logic here

        // TODO code application logic here
    }

}
