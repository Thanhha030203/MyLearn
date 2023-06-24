/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8java2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class thuakeprodao extends  prodao<pro>{
 Scanner sc = new Scanner(System.in);
    @Override
    public pro find(String name) {
     for(pro prc : danhsach){ 
         if(prc.getName().equals(name)){ 
             return prc;
         }
     }
        return null;
    }

    @Override
    public void update(pro p) {
        System.out.println("Input name : ");
         p.setName(sc.nextLine());
         System.out.println("Input price : ");
         p.setPrice(sc.nextDouble());
    }
    
  
    
}
