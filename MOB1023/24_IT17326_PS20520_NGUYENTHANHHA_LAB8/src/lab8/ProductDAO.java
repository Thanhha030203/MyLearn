/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.io.Serializable;
import static java.util.Collections.list;
/**
 *
 * @author MinhMan
 */
public class ProductDAO extends DAO<Product> {

    @Override
    public void update(Product entity) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(entity.name)) {
                list.set(i, entity);
            }
        }
    }

    @Override
    public Product find(double id) {
        for (Product p : list) {
            if (p.price == id) {
                return p;
            }
        }
        return null;
    }
}

