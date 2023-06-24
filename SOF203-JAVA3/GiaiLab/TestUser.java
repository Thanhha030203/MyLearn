/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databases;
    
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TestUser {
    Connection cnn;
    public TestUser() {
        cnn = Dao.connToMySQL("root","root",3306,"useforjava3");       
        if (cnn!=null){
            try {
                String user = JOptionPane.showInputDialog("Ten User ? ");
                ResultSet rs = Dao.getResultSet(cnn, "select * from users");
                Boolean found = false;
                while (rs.next()) {
                    if (rs.getString("username").equals(user)){
                        found = true;
                        break;
                    }
                }
                if (found) {
                    /* lay role */
                    String role = rs.getString("role");
                    if (role.equals("admin"))
                        System.out.println("new formQuanlySV");;
                    if (role.equals("manager"))
                        System.out.println("new formQuanlyDiem");;
                        
                }
                else 
                    System.out.println("Ko co user nay");
            } catch (SQLException ex) {
                Logger.getLogger(TestUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public static void main(String[] args) {
        new TestUser();
    }
}
