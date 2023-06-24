/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.ArrayList;

/**
 *
 * @author MinhMan
 */
public class Bai1 {
    public static void main(String[] args) {
//      Thêm vào ArrayList 1 số nguyên
//       Thêm vào ArrayList 1 số thực
//       Thêm vào ArrayList 1 giá trị boolean
//       Thêm vào ArrayList 1 xâu ký tự
//       In ra màn hình 4 giá trị trên từ ArrayList
        ArrayList arr = new ArrayList();
        
        arr.add(5);
        arr.add(8.3);
        arr.add(true);
        arr.add("abcdefgh");
        
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
