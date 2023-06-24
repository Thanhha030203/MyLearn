package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.query.NativeQuery;

import com.ConnectionsData.ConnectionData;
import com.Entity.User;
import com.Entity.Video;

public class VideoController {
	public void addVideo(Video entity) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			System.out.println("Thêm entity video thành công");

		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Lỗi thêm video"+ e);
			System.out.println("Thêm entity video thất bại");
			// TODO: handle exception
		}
	}

	public Video updateVideo(Video entity, String id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			Video findedVideo = entityManager.find(Video.class, id);
			findedVideo = entity;
			entityManager.merge(findedVideo);
			entityManager.getTransaction().commit();
			System.out.println("Update entity video thành công");
			return findedVideo;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Update entity video thất bại");
			// TODO: handle exception
			return entity;
		}
	}

	public boolean removeVideo(Video entity, String id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			Video findedVideo = entityManager.find(Video.class, id);
			findedVideo = entity;
			entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
			entityManager.getTransaction().commit();
			System.out.println("remove entity video thành công");
			return true;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("remove entity video thất bại");
			return false;
			// TODO: handle exception
		}
	}

	public List<Video> findAll_Video() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		String jsql = "Select o from Video o";
		List<Video> list_video = new ArrayList<Video>();
		TypedQuery<Video> query_findAll_Video = entityManager.createQuery(jsql, Video.class);
		list_video = query_findAll_Video.getResultList();
		if (list_video.isEmpty()) {
			System.out.println("List user to finAllVideo empty!!");
			return null;
		}
		return list_video;
	}
	public List<Video> findAll_Video_random() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		List<Video> list_video = new ArrayList<Video>();
		Query query_findAll_Video_random = entityManager.createNamedQuery("Video.Random");
		list_video = query_findAll_Video_random.getResultList();
		if (list_video.isEmpty()) {
			System.out.println("List user to finAllVideo empty!!");
			return null;
		}
		return list_video;
	}
	public Video find_Video_ByID(String id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
	try {
		TypedQuery<Video> query_findVideo_ByID = entityManager.createNamedQuery("Video.find_Video_ByID", Video.class);
		query_findVideo_ByID.setParameter("id", id);
		Video video = new Video();
		video = query_findVideo_ByID.getSingleResult();
		if (video == null) {
			System.out.println(" find_Video_ByID = null ");
			return null;
		}
		System.out.println(" find_Video_ByID = 1 ");
		return video;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Hello "+ e);
		return null;
	}
	}

	public List<Video> find_Video_ByFavorite() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		List<Video> list_video = new ArrayList<Video>();
		TypedQuery<Video> query_find_Video_ByFavorite = entityManager.createNamedQuery("Video.find_Video_ByFavorite", Video.class);
		list_video = query_find_Video_ByFavorite.getResultList();
		if (list_video.isEmpty()) {
			System.out.println("List user to fquery_find_Video_ByFavorite empty!!");
			return null;
		}
		return list_video;
	}
	public List<Video> find_Video_ByUserId(String ID) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
	try {
		List<Video> list_video = new ArrayList<Video>();
		TypedQuery<Video> query_find_Video_ByUserId = entityManager.createNamedQuery("Video.find_Video_ByUserId", Video.class);
		query_find_Video_ByUserId.setParameter("username",ID);
		
		list_video = query_find_Video_ByUserId.getResultList();

		if (list_video.isEmpty()) {
			System.out.println("List user to query_find_Video_ByUserId empty!!");
			return null;
		}
		return list_video;
	} catch (Exception e) {
		System.out.println("lỗi controller "+ e);
		return null;
		// TODO: handle exception
	}
		
		
	}
	public List<Video> find_Video_ByShare() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		List<Video> list_video = new ArrayList<Video>();
		TypedQuery<Video> query_find_Video_ByFavorite = entityManager.createNamedQuery("Video.find_Video_ByShare", Video.class);
		list_video = query_find_Video_ByFavorite.getResultList();
		if (list_video.isEmpty()) {
			System.out.println("List user to fquery_find_Video_ByShare empty!!");
			return null;
		}
		return list_video;
	}
	public List<Video> find_Video_ByUserId_Share(String ID) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		List<Video> list_video = new ArrayList<Video>();
		TypedQuery<Video> query_find_Video_ByUserId = entityManager.createNamedQuery("Video.find_Video_ByUserId_Share", Video.class);
		query_find_Video_ByUserId.setParameter("id",ID);
		list_video = query_find_Video_ByUserId.getResultList();
		if (list_video.isEmpty()) {
			System.out.println("List user to query_find_Video_ByUserId_Share empty!!");
			return null;
		}
		return list_video;
	}
}
