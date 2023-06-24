/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MinhMan
 */
public abstract class DAO<Entity> {
    protected ArrayList<Entity> arr = new ArrayList<>();
    
    public void them(Entity entity)
    {
        arr.add(entity);
    }
    
    public void xoa(Entity entity)
    {
        arr.remove(entity);
    }
    
    abstract public void capnhat(Entity entity);
    
    abstract public Entity timKiem(Serializable id);
    
    public ArrayList<Entity> getList()
    {
        return arr;
    }
    
    public void khoiPhuc(String path)
    {
        try 
        {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            arr = (ArrayList<Entity>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public void load(String path)
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arr);
            oos.close();
            fos.close();
        } catch (Exception e) 
        {
            throw new RuntimeException(e);
        }
    }
}
