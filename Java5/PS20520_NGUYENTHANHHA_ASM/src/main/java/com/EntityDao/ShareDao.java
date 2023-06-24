package com.EntityDao;

import java.util.List;

import com.Controller.FavoriteController;
import com.Controller.ShareController;
import com.Entity.Favorite;
import com.Entity.Share;
import com.Entity.User;

public class ShareDao extends DaoEntity<Share,String> {
	ShareController shareController;
	public void addEntity(Share entity) {
		// TODO Auto-generated method stub
		shareController = new ShareController();
		shareController.createShare(entity);
	}
	public boolean removeEntity(Share entity,String id) {
		// TODO Auto-generated method stub
		shareController = new ShareController();
		return shareController.removeShare(entity,Integer.parseInt(id));
	}
	public List<Share> findAllEntity() {
		// TODO Auto-generated method stub
		shareController = new ShareController();
		return shareController.findAll_Share();
	}
	@Override
	public void updateEntity(Share entity, String id) {
		// TODO Auto-generated method stub
		
	}
}
