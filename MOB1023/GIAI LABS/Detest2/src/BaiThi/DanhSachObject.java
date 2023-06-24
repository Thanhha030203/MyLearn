/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DanhSachObject implements DanhSach<Library>{

    @Override
    public void stored(List<Library> list) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            BufferedWriter bw = new BufferedWriter(fw);
             for (Library item : list) {
                    bw.write(item.getId() + "," + item.getTitle() + "," + item.getAuthor() + "," + item.getYear() + "," + item.getPages());
                bw.write("\n");


            }
              bw.flush();
            bw.close();
           
            //To change body of generated methods, choose Tools | Templates.
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DanhSachObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DanhSachObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void load() {
        try {
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) !=null){ 
                String [] = 
            }
        } catch (Exception e) {
        }
       
    
}
}
