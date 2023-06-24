/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vups22631;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Anh Vu
 */
public class XDate {
    private static SimpleDateFormat sdf = new SimpleDateFormat();
    private static Date parse(String text, String pattern) throws ParseException{
        sdf.applyPattern(pattern);
        return sdf.parse(text);
    } 
    public static Date parse (String text) throws ParseException{
        return XDate.parse(text, "dd-MM-yyyy");
    }
    private static Date parses(String text, String pattern) throws ParseException{
        sdf.applyPattern(pattern);
        return sdf.parse(text);
    } public static Date parses(String text) throws ParseException{
        return XDate.parse(text, "dd-MM-yyyy hh:aa:ss");
    }
}




