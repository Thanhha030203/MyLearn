/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import java.util.List;



/**
 *
 * @author nhatt
 */
interface  EduSysDAO<Entity,KeyType> {
     public void insert(Entity entity);
     public void update(Entity entity);
     public void delete(KeyType key);
     public List<Entity> selectAll();
     public Entity selectById(KeyType key);
     public List<Entity> selectBySQL(String sql, Object...args);
}
