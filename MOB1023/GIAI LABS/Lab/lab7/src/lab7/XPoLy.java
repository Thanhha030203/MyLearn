/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author 
 */
public class XPoLy {
    public static boolean isCardNumber(String so)
    {
        int[] mang = new int[so.length()];
        int tong = 0;
        
        for (int i = 0; i < so.length(); i++)
        {
            if (so.charAt(i) != ' ')
            {
                mang[i] = so.charAt(i);
            }
        }
        
        for (int i = 0; i < so.length(); i++)
        {
            tong += mang[i];
        }
        
        if (tong % 2 == 0)
            return true;
        else
            return false;
    }
}
