/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Minh Man
 */
public class XFile {
   public static byte[] read (String path) throws FileNotFoundException, IOException 
    {
        FileInputStream firs = new FileInputStream (path) ;
        int n = firs.available();
        byte[] data = new byte[n] ;
        firs.read();
        
        firs.close() ;
        return data ;
    }
   public static void write (String path,String s) throws FileNotFoundException, IOException
   {
       FileOutputStream fos = new FileOutputStream (path) ;
       byte[] b= s.getBytes() ;
       fos.write(b) ;
       fos.close() ;
   }


//public static void writeData(String path , byte[]data) throws FileNotFoundException, IOException 
//{
//    FileOutputStream fos = new FileOutputStream (path);
//    fos.write(data) ;
//    fos.close() ;
//}
public static Object  readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException
{
    ObjectInputStream obs = new ObjectInputStream (new FileInputStream(path)) ;
  Object object = obs.readObject() ;
  obs.close() ;
   return object ;
}
public static void writeObject (String path,Object object) throws FileNotFoundException, IOException
{
    ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(path)) ;
    oos.writeObject(object);
    oos.close();
}

    void write(String cUsersMinh_ManDesktopFileImgFMjpg, byte[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
