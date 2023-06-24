
package Bai2345;

public class main {
    public static void main(String[] args) {
        sinhvienIT svIT = new sinhvienIT("Ha","UDPM",8.5,8.0,9.0);
        System.out.println("* Sinh vien IT: ");
        svIT.xuat();
        sinhvienBiz svBiz = new sinhvienBiz("Anh","Sales",8.5,9.0);
        System.out.println("* Sinh viên Biz: ");
        svBiz.xuat();
    }
}
