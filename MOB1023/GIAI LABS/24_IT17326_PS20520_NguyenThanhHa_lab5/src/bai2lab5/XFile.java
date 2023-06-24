/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2lab5;

import bai1lab5.bai1lab5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Admin
 */
public class XFile {
    public static byte [] read (String path){ 
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return  data;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
       
    }
      public static void write (String path,byte [] data) throws FileNotFoundException{
          try {
               FileOutputStream fos = new FileOutputStream(path);
          fos.write(data);
          fos.close();
          } catch (Exception e) {
          }
         
    }
      public static Object readObject(String path){ 
          try {
              FileInputStream fis = new FileInputStream(path);
              ObjectInputStream ois = new ObjectInputStream(fis);
              Object object = ois.readObject();
              ois.close();
              return object;
          } catch (Exception e) {
              throw  new RuntimeException(e);
          }
      }
            public static void writeObject(String path,Object object){ 
                try {
                     FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(object);
                oos.close();
                } catch (Exception e) {
                }
      }
public static void main(String [] args) throws FileNotFoundException{
    byte [] data = bai1lab5.read("read.txt");
         bai1lab5.write("write.txt", data);
      }
}
