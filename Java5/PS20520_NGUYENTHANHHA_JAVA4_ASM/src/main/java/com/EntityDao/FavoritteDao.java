package com.EntityDao;

import java.util.List;

import com.Controller.FavoriteController;
import com.Controller.UserController;
import com.Entity.Favorite;
import com.Entity.User;

public class FavoritteDao extends DaoEntity<Favorite,String> {
	FavoriteController favoriteController;
	public void addEntity(Favorite entity) {
		// TODO Auto-generated method stub
		favoriteController = new FavoriteController();
		favoriteController.createFavorite(entity);
	}
	public boolean removeEntity(Favorite entity,String id) {
		// TODO Auto-generated method stub
		favoriteController = new FavoriteController();
		return favoriteController.removeFavoite(entity,Integer.parseInt(id));
	}
	public List<Favorite> findAllEntity(Favorite entity) {
		// TODO Auto-generated method stub
		favoriteController = new FavoriteController();
		return favoriteController.findAll_Favorite();
	}
	@Override
	public void updateEntity(Favorite entity, String id) {
		// TODO Auto-generated method stub
		
	}
}
