
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ngoc Huyen
 */
public class FILE {
    
    public static NhanVien[] readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                NhanVien [] nv = (NhanVien[]) ois.readObject();
                return nv;
        }
            catch(Exception e){ 
                System.out.println("Lỗi tạ file File" + e.getMessage());
         
                    }
        return null;
        
          
        
    }
    public static void writeObject(String path, Object data) throws FileNotFoundException, IOException{
        try(
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){
            oos.writeObject(data);
            oos.close();
        }
    }
    // phương thức đọc file
    public static byte[] read(String path) throws FileNotFoundException, IOException {
        // tạo luồng
       try(FileInputStream fis = new FileInputStream(path);){
           int length = fis.available();
           byte[] data = new byte[length];
           fis.read(data);
           fis.close();
           return data;
       }
      
    }
    // phương thức ghi file
    public static void write(String path, byte[]data) throws FileNotFoundException, IOException{
        try(FileOutputStream fos = new FileOutputStream(path);){
             fos.write(data);
             fos.close();
        }
    }
}
