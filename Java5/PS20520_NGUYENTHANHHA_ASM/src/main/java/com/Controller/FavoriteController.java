package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ConnectionsData.ConnectionData;
import com.Entity.Favorite;
import com.Entity.User;
import com.Entity.Video;

public class FavoriteController {
	public void createFavorite(Favorite entity) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			System.out.println("Thêm entity favorite thành công");

		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Thêm entity favorite thất bại");
			// TODO: handle exception
		}
	}

	public boolean removeFavoite(Favorite entity, int id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			Favorite findedFavorite = entityManager.find(Favorite.class, id);
			entityManager.remove(findedFavorite);
			entityManager.getTransaction().commit();
			System.out.println("remove entity favorite thành công");
			return true;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("remove entity favorite thất bại");
			System.out.println("Lỗi tại remove favorite controller "+ e);
			return false;
			// TODO: handle exception
		}
	}

	public List<Favorite> findAll_Favorite() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		String jsql = "Select o from Video o";
		List<Favorite> list_favorite = new ArrayList<Favorite>();
		TypedQuery<Favorite> query_findAll_Favorite = entityManager.createNamedQuery(jsql, Favorite.class);
		list_favorite = query_findAll_Favorite.getResultList();
		if (list_favorite.isEmpty()) {
			System.out.println("List user to finAllfavorite empty!!");
			return null;
		}
		return list_favorite;
	}	
	public Favorite find_Favorite_ByUserVideo(User user, Video video) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		Favorite favorite = new Favorite();
		try {
			TypedQuery<Favorite> query_Favorite = entityManager.createNamedQuery("Favorite.find_Favorite_ByVideo_User", Favorite.class);
			query_Favorite.setParameter("idUser", user.getID());
			query_Favorite.setParameter("idVideo", video.getID());
			favorite = query_Favorite.getSingleResult();
			if (favorite == null) {
				System.out.println("favorite to findfavorite null!!");
				return null;
			}
			System.out.println("favorite "+favorite.getID());
			return favorite;
		
		} catch (Exception e) {
			System.out.println("Lỗi tại favorite controoler"+ e);
			return null;
		}
			// TODO: handle exception
		}

}
