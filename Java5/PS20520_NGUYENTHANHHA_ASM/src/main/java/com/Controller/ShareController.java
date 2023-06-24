package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ConnectionsData.ConnectionData;
import com.Entity.Favorite;
import com.Entity.Share;

public class ShareController {
	public void createShare(Share entity) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			System.out.println("Thêm entity share thành công");

		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Thêm entity share thất bại");
			// TODO: handle exception
		}
	}

//	public Video updateVideo(Video entity, String id) {
//		EntityManager entityManager;
//		entityManager = ConnectionData.database();
//		try {
//			entityManager.getTransaction().begin();
//			Video findedVideo = entityManager.find(Video.class, id);
//			findedVideo = entity;
//			entityManager.merge(findedVideo);
//			entityManager.getTransaction().commit();
//			System.out.println("Update entity video thành công");
//			return findedVideo;
//		} catch (Exception e) {
//			entityManager.getTransaction().rollback();
//			System.out.println("Update entity video thất bại");
//			// TODO: handle exception
//			return entity;
//		}
//	}

	public boolean removeShare(Share entity, int id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			Share findedShare = entityManager.find(Share.class, id);
			findedShare = entity;
			entityManager.remove(findedShare);
			entityManager.getTransaction().commit();
			System.out.println("remove entity share thành công");
			return true;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("remove entity share thất bại");
			return false;
			// TODO: handle exception
		}
	}

	public List<Share> findAll_Share() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		String jsql = "Select o from Video o";
		List<Share> list_share = new ArrayList<Share>();
		TypedQuery<Share> query_findAll_Share = entityManager.createQuery(jsql, Share.class);
		list_share = query_findAll_Share.getResultList();
		if (list_share.isEmpty()) {
			System.out.println("List user to finAllShare empty!!");
			return null;
		}
		return list_share;
	}
}
