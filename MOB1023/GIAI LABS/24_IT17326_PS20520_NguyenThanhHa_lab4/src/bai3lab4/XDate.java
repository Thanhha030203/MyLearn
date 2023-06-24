/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class XDate {
    private static SimpleDateFormat fm = new SimpleDateFormat();
    public static Date parse (String text , String pattern) throws RuntimeException{ 
        try {
            fm.applyPattern(pattern);
            return fm.parse(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public  static Date parse (String text) throws RuntimeException{ 
        return XDate.parse(text, "dd-MM-yyyy");
    }
}
