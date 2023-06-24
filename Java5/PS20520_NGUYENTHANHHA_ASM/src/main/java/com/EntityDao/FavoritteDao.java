package com.EntityDao;

import java.util.List;

import com.Controller.FavoriteController;
import com.Controller.UserController;
import com.Entity.Favorite;
import com.Entity.User;
import com.Entity.Video;

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
	public List<Favorite> findAllEntity() {
		// TODO Auto-generated method stub
		favoriteController = new FavoriteController();
		return favoriteController.findAll_Favorite();
	}
	public Favorite findFavoriteByUserVideo(User user, Video video) {
		// TODO Auto-generated method stub
		favoriteController = new FavoriteController();
		return favoriteController.find_Favorite_ByUserVideo(user, video);
	}
	@Override
	public void updateEntity(Favorite entity, String id) {
		// TODO Auto-generated method stub
		
	}
	
}
