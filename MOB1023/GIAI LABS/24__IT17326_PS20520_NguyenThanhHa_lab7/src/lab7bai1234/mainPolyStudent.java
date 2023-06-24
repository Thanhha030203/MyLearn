
package lab7bai1234;

public class mainPolyStudent {
    public static void main(String[] args) {
        PolyStudent sv = new PolyStudent();
        sv.fullname = "Nguyễn Thanh Ha";
        try {
            sv.career = Career.valueOf("IT");
            sv.print();
        } catch (Exception e) {
            System.out.println(">Fullname: "+ sv.fullname);
            System.out.println("* Khong co nganh nay!");
        }
    }
}
