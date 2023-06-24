/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;

/**
 *
 * @author Admin
 */
    interface QuanLyDao<Entity,KeyType> {
        public void insert(Entity entity);
        public void update(Entity entity);
        public void delete(Entity entity);
        public Entity Select_ID(KeyType id);
        public List<Entity> SelectAll();
}
