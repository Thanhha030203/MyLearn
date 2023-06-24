package Cau5Lab3;

/**
 *
 * @author Admin
 */
public class theothang {

    public void trathang(float n, int thang, float laivay) {
        float lai = 0;
        int count = 0;
        System.out.printf("Sau day la bang tinh so tien ban can phai tra hang thang :  \n");
        System.out.printf("\t\t________________________________________________________________________\n");
        System.out.printf("\t\t|Ky han   |  Tiền Gốc     |  Goc phai tra   |  Lãi       |  Tổng số     |");
        for (int i = 1;; i++) {
            lai = (float) (n * laivay);
            System.out.printf("\n\t\t|_________|_______________|_________________|____________|______________|");
            System.out.printf("\n\t\t|tháng%4d|%15.1f|%17d|%12.1f|\t%12.1f|", i, n, thang, lai, (thang + lai));
            n = n - (thang);
            if (n < thang) {
                thang = (int) n;
            }
            count++;
            if (n == 0 || n < 0) {
                break;
            }
        }
        System.out.println("");
        System.out.println("So thang ban phai tra la : " + count);
    }
}
