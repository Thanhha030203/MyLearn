/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
    abstract public class  DAO<Entiny>{ 
        protected  List<Entiny> list = new ArrayList<>();
        public void add(Entiny entiny){ 
            list.add(entiny);
        }
        public void remove(Entiny entiny){ 
            list.remove(entiny);
        }
        abstract  public void update(Entiny entiny);
        abstract  public Entiny find(Serializable id);
        public List<Entiny> getList(){ 
            return list;
        }
        public void store(String path){ 
            try {
                FileReader fr = new FileReader(path);
                 BufferedReader br = new BufferedReader(fr);
                 String line ;
                 while((line = br.readLine())!=null){ 
                     String [] txt = line.split(",");
                     Product pro = new Product(txt[0],Double.parseDouble(txt[1]));
                     list.add((Entiny) pro);
                 }
                    
            } catch (Exception e) {
                throw new RuntimeException("lôõi tạo " + e);            }
        }
        public void load(String path){ 
            try {
                FileWriter fw = new FileWriter(path);
                BufferedWriter bw = new BufferedWriter(fw);
                for(Entiny p : list){ 
                    bw.write((String) (Entiny) p);
                    bw.write("\n");
                }
                bw.close();
                bw.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    
}
