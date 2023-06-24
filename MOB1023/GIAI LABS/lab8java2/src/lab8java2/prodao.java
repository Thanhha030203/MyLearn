/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8java2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class prodao<Enity> {
    List<Enity> danhsach = new  ArrayList<>();
    
    public prodao() {
    }
    
    public void add(Enity e){ 
        danhsach.add(e);
    }
    public void remove(Enity e){ 
        danhsach.remove(e);
    }
    public void store(String path) throws FileNotFoundException, IOException{ 
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(danhsach);
        oos.close();
        fos.close();
    }
    public void load(String path) throws FileNotFoundException, IOException, ClassNotFoundException{ 
        FileInputStream input = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(input);
        Enity[] e = (Enity[]) ois.readObject();
       for(int i=0; i<e.length;i++){ 
           System.out.println("phần tử thứ "+ i+ ":  "+ e[i]);
       }
    }
    abstract public Enity find(String name);
    abstract  public void update(Enity e);
}
