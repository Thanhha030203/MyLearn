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
public class TestPoLyStudent {
    public static void main(String[] args) {
        PoLyStudent sv = new PoLyStudent();
        sv.hoten = "Ngô Tuấn Đức";
        sv.career = Career.valueOf("UDPM");
        sv.xuat();
    }
}
