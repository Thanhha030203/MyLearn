/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class helo {
    public static void main(String[] args) {
      Date d = LocalDate.now();
        System.out.println(d);
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("1");
        String a = date.format(d);
        date.format(d);
        System.out.println(a);
        System.out.println(d);
    }
}
