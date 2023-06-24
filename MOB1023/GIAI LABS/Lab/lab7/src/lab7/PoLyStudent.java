/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author 
 */
public class PoLyStudent {
    public String hoten = "";
    public Career career;
    
    public void xuat()
    {
        System.out.println("Họ tên: " + hoten);
        switch (career)
        {
            case UDPM:
                System.out.println("Ngành: Ứng dụng phần mềm");
                break;
            case TKTW:
                System.out.println("Ngành: Thiết kế trang web");
                break;
            case LTDD:
                System.out.println("Ngành: Lập trình di động");
                break;
            case TKDH:
                System.out.println("Ngành: Thiết kế đồ họa");
                break;
        }
    }
}
