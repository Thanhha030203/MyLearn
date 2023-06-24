/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

public class funtions {
    public static final double sum(double...x){
        double tong=0;
        for(double a:x){
            tong+=a;
        }
        return tong;
    }
    public static final double min(double...x){
        double m=x[0];
        for(double a:x){
            if(m>a)
                m=a;
        }
        return m;
    }
    public static final double max(double...x){
        double m=x[0];
        for(int i=1;i<x.length;i++){
            if(m<x[i])
                m=x[i];
        }
        return m;
    }
    public static String toUppperFirstChar(String s){
        String[] arrS = s.split(" ");
//        String[] arrS2 = new String;
        for(int i=0;i<arrS.length;i++){
//            String s2 = String.valueOf(ss.charAt(0)).toUpperCase();
//            String s3 = ss.substring(1);
//            String s4 = s2+s3;
            arrS[i] = String.valueOf(arrS[i].charAt(0)).toUpperCase()+ arrS[i].substring(1); 
            
        }
        return String.join(" ", arrS);
    }
}
