/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author Admin
 */
public class User_Login{
    public static TaiKhoan user = null;
    public static void Close(){ 
        User_Login.user = null;
    }
    public static boolean isLogin(){ 
        return User_Login.user !=null;
    }

    @Override
    public String toString() {
        return "User_Login{" +user+ '}';
    }
 
    
    
}
