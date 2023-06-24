package com.ps20520;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDao {
		Connection con ;
		
	
	  public ItemDao() throws ClassNotFoundException {
			con = consql("PS20520-THANHHA","thanhha30022031",1433,"ITEM");
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
	public List<Item> getResult(String sql) throws SQLException{ 
		List<Item> list = new ArrayList<Item>();
		Statement st = con.createStatement();
		ResultSet re = st.executeQuery(sql);
		while(re.next()) { 
			String name = re.getString("NAME");
			String image = re.getString("IMAGE");
			double price = re.getDouble("PRICE");
			double discount = re.getDouble("DISCOUNT");
			Item i = new Item(name, image, price, discount);
			list.add(i);
			
		}
		return list;
	}
}
