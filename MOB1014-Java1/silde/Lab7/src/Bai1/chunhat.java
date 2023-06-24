
package Bai1;

public class chunhat {

    double rong;
    double dai;

    public chunhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public chunhat() {
    }
    
    public double getchuVi(){
        return (dai+rong)*2;
    }
    public double getdienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Chieu rong la: " + this.rong); 
        System.out.println("Chieu dai la: "+ this.dai);
        System.out.println("Dien tich hcn: "+getdienTich());
        System.out.println("Chu vi hcn: "+ getchuVi());
    }
}
