package com.Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ps20520.User;

public class Connections {

    Connection con;
// chỉ cần khởi tạo là tự động liên kết

    public Connections() throws ClassNotFoundException {
       con =  consql("PS20520-THANHHA", "thanhha30022031", 1433, " USER_LAB4_JAVA4");
    }

    public Connection consql(String user, String pass, int port, String database) throws ClassNotFoundException {
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:" + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("thành công");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(" LỖI DO KẾT NỐI SQL" + e);
            return null;
        }
        return (Connection) con;
    }
     public List<User> getResult(String sql){ 
    	List<User> list = new ArrayList<User>();
    	 User  user = null;
    	 Statement st;
		try {
			st = con.createStatement();
			 ResultSet re = st.executeQuery(sql);
			 while(re.next()) { 
				 String username  = re.getString("username");
				 String password  = re.getString("password");
				String remember  = re.getString("remember");
			 boolean remem = (remember.equals("true")?true:false);
				 user = new User(username, password, remem);
				 list.add(user);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Lỗi tại vì : "+ e);
		}
    
    	 return list;
     }
     public void insert (String username, String password, String remember) { 
    	 String sql  = "Insert into INFO_USER values (?,?,?)";
    	 
    	 int re = 0;
    	 try {
    		 PreparedStatement pt = con.prepareStatement(sql);
    		 pt.setString(1, username);
    		 pt.setString(2, password);
    		 pt.setString(3, remember);
    		re = pt.executeUpdate();
    		if(re==1) { 
    			System.out.println("Thêm thành công");
    		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Lỗi"+ e);
		}
    	 
     }
     public void delete (String sql) { 
    	 String sqla  = "delete from INFO_USER  where username = ?";
    		System.out.println(sql);
    	 int re = 0;
    	 Statement st;
    	 try {
    		 st = con.createStatement();
			re = st.executeUpdate(sql);
    	
    		
   
    		System.out.println(re);
    		if(re>0) { 
    			System.out.println("xoá thành công");
    		}
    		else { 
    			System.out.println("xoá thất bại");
    		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Lỗi"+ e);
		}
    	 
     }
}
