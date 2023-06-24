/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom.pkg5;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class dangkytt {

    /**
     * @param args the command line arguments
     */
   
        public static Connection ConnecttoSQL() throws Exception {
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Student_java3;";
        String user = "sa1";
        String pass = "123";
        Connection com = DriverManager.getConnection(dbURL, user, pass);
        return com;
    }
    
    
}
