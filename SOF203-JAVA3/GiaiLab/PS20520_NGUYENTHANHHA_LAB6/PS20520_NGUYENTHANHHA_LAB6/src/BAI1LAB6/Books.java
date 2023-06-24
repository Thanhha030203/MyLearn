/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1LAB6;

/**
 *
 * @author Admin
 */
public class Books {
    int id;
    String title;
    double price;

    public Books(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Books() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Books{" + "id=" + id + ", title=" + title + ", price=" + price + '}';
    }
    
}
