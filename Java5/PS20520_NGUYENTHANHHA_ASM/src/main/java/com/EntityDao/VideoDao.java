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
		videoController = new VideoController();
		videoController.addVideo(entity);
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

	public List<Video> findAllEntity() {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.findAll_Video();
	}
	public List<Video> findAllEntity_random() {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.findAll_Video_random();
	}

	public Video findEntity_ByID(String Id) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByID(Id);
	}

	public List<Video> find_Video_ByFavorite(Video entity) {
		// TODO Auto-generated method stub
		try {
			videoController = new VideoController();
			return videoController.find_Video_ByFavorite();
		} catch (Exception e) {
			System.out.println("lỗi"+ e);
			return videoController.find_Video_ByFavorite();
			// TODO: handle exception
		}
	}

	public List<Video> find_Video_ByUserId(String ID) {
		// TODO Auto-generated method stub
		try {
			videoController = new VideoController();
			return videoController.find_Video_ByUserId(ID);
		} catch (Exception e) {
			System.out.println("lỗi"+ e);
			return null;
		}
	
		
	}

	public List<Video> find_Video_ByShare(Video entity) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByShare();
	}

	public List<Video> find_Video_ByUserId_Share(String id) {
		// TODO Auto-generated method stub
		videoController = new VideoController();
		return videoController.find_Video_ByUserId_Share(id);
	}

}
