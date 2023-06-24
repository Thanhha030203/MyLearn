/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author baolh
 */
public class ProductManage {

    public static void main(String[] args) {
        Product p1 = new Product("iPhone8", 1600.0);
        Product p2 = new Product("Xiaomi 9", 2800.0);
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.store("prod.dat");
        ProductDAO dao2 = new ProductDAO();
        dao2.load("prod.dat");
        Product p = dao2.find("iPhone8");
        System.out.println(">Name: " + p.name);
        System.out.println(">Price: " + p.price);
    }

}
