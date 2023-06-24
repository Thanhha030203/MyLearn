/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau5Lab3;

/**
 *
 * @author Admin
 */
public class Theonam {

    public void tra(float n, int year, float laivay) {
        int thang = 1;
        float goctra = n / (year*12);
        float lai = 0;
        System.out.printf("Sau day la bang tinh so tien ban can phai tra hang thang :  \n");
        System.out.printf("\t\t________________________________________________________________________\n");
        System.out.printf("\t\t|Ky han   |  Tiền Gốc     |  Goc phai tra   |  Lãi       |  Tổng số     |");
        for (int i = 1;; i++) {
            lai = (float) (n * laivay);
             System.out.printf("\n\t\t|_________|_______________|_________________|____________|______________|");
            System.out.printf("\n\t\t|tháng%4d|%15.1f|%17.1f|%12.1f|\t%12.1f|", i, n, goctra, lai, (goctra + lai));
            n = n - (goctra);
             if (n <= goctra) {
                goctra=n;}
             thang++;
             if(n<=0){
                 System.out.println("");
                 break;
             }
        }
    }

}
