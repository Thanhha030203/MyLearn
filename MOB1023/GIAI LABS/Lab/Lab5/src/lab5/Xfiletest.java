/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;

/**
 *
 * @author Minh Man
 */
public class Xfiletest {
    public static void main(String args[]) throws IOException{
        XFile xfile = new XFile();
        
        byte[] data ;
        data = xfile.read("C:/Users/Minh Man/Desktop/File/Img/FM.jpg");
        
        xfile.write("C:/Users/Minh Man/Desktop/File/Img/FM.jpg",data) ;
    }
}
