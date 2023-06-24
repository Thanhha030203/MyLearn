package com.EntityDao;

import java.util.List;

abstract class DaoEntity<EntityType, KeyType> {
	abstract public  void addEntity(EntityType entity);
	abstract public  void updateEntity(EntityType entity, KeyType id);
	abstract public  boolean removeEntity(EntityType entity, KeyType id);
	abstract public  List<EntityType> findAllEntity(EntityType entity);
	
}
