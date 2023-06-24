
package Bai1;

public class hinhVuong extends chunhat {
    double canh;

    public hinhVuong(double canh) {
        super.dai = canh;
        super.rong = canh;
    }
    public void xuat(){
        System.out.println("Canh hinh vuong: "+ this.canh);
        System.out.println("Chu vi hinh vuong: "+ getchuVi());
        System.out.println("Dien tich hinh vuong: "+ getdienTich());
        
    }
}
