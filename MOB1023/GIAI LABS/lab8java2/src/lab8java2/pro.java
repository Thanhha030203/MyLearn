/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8java2;

import java.io.Serializable;
import org.w3c.dom.ls.LSSerializer;

/**
 *
 * @author Admin
 */
public class pro implements Serializable{
    String name;
    double price;

    public pro(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public pro() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "pro{" + "name=" + name + ", price=" + price + '}';
    }
    
}
