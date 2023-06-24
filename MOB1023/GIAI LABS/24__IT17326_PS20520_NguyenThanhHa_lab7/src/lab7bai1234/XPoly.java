package lab7bai1234;

public class XPoly {
 @Deprecated
    public static boolean isCardNumber(String so) {
      int n = Integer.parseInt(so);
      int tong =0;
       while(n>0){ 
           int a = n%10;
           tong += a;
           n = n/10;
       }
       if(tong%2 ==0){ 
           return true;
       }
       else{
        return false;
       }
    }
}
