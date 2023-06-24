/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;
/**
 *
 * @author MinhMan
 */
public class ProductManage {
      public static void main(String[] args) {
        Product p1 = new Product("iPhone8", 1600.0);
        Product p2 = new Product("Xiaomi 9", 2800.0);
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.store("data.txt");
        ProductDAO dao2 = new ProductDAO();
        dao2.load("data.txt");
        Product p = dao2.find(2800.0);
        System.out.println(">Name: " + p.name);
        System.out.println(">Price: " + p.price);
       
    }
}
