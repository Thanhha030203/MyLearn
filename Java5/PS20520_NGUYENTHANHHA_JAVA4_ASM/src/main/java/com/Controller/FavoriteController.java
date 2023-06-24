package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ConnectionsData.ConnectionData;
import com.Entity.Favorite;
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
			findedFavorite = entity;
			entityManager.remove(findedFavorite);
			entityManager.getTransaction().commit();
			System.out.println("remove entity favorite thành công");
			return true;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("remove entity favorite thất bại");
			return false;
			// TODO: handle exception
		}
	}

	public List<Favorite> findAll_Favorite() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		String jsql = "Select o from Video o";
		List<Favorite> list_favorite = new ArrayList<Favorite>();
		TypedQuery<Favorite> query_findAll_Favorite = entityManager.createQuery(jsql, Favorite.class);
		list_favorite = query_findAll_Favorite.getResultList();
		if (list_favorite.isEmpty()) {
			System.out.println("List user to finAllfavorite empty!!");
			return null;
		}
		return list_favorite;
	}	

}
