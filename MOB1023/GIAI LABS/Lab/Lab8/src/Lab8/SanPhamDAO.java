/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.io.Serializable;

/**
 *
 * @author MinhMan
 */
public abstract class SanPhamDAO extends DAO<SanPham>{
    public SanPhamDAO()
    {
        
    }
    
    @Override
    public void capnhat(SanPham entity)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i).getTen().equalsIgnoreCase(entity.getTen()))
            {
                arr.set(i, entity);
            }
        }
    }
    
    @Override
    public SanPham timKiem(Serializable id)
    {
        for (SanPham sp : arr)
        {
            if (sp.getTen().equals(id))
            {
                return sp;
            }
        }
        return null;
    }
}
