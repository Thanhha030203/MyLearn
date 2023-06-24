package com.EntityDao;

import java.util.List;

import com.Controller.UserController;
import com.Controller.VideoController;
import com.Entity.User;
import com.Entity.Video;

public class VideoDao extends DaoEntity<Video,String> {
	VideoController videoController;

	public void addEntity(Video entity) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntity(Video entity, String id) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		videoController.updateVideo(entity, id);
	}

	public boolean removeEntity(Video entity, String id) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.removeVideo(entity, id);
	}

	public List<Video> findAllEntity(Video entity) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.findAll_Video();
	}

	public Video findEntity_ByID(String Id) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByID(Id);
	}

	public List<Video> find_Video_ByFavorite(Video entity) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByFavorite();
	}

	public List<Video> find_Video_ByUserId(Video entity) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByUserId();
	}

	public List<Video> find_Video_ByShare(Video entity) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByShare();
	}

	public List<Video> find_Video_ByUserId_Share(Video entity) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByUserId_Share();
	}

}
