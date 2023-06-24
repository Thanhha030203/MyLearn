package com.inter;

import java.awt.Window.Type;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ps20520.Report;

import Entity.Favorite;
import Entity.User;
import Entity.Video;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({ "/search/username", "/search/keyword", "/search/videoID", "/search/favorite" })
public class index_1 extends HttpServlet {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("LAB8");
	EntityManager em = emf.createEntityManager();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resq) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		if (uri.contains("username")) {
			this.search_user(req, resq);
		}
		else if (uri.contains("keyword")) {
			this.search_key(req, resq);
		}
		else if (uri.contains("videoID")) {
			this.search_video(req, resq);
		}
		else if (uri.contains("favorite")) {
			this.search_favorite(req, resq);
		}
		this.total(req,resq);
		
		req.getRequestDispatcher("/views/index_1.jsp").forward(req, resq);
	}

	private void total(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String sql ="Select new Report(o.video.TITILE, count(o),max(o.likeDate),min(o.likeDate)) from Favorite o group by o.video.TITILE";
		TypedQuery<Report> query = em.createQuery(sql,Report.class);
		List<Report> lists = query.getResultList();
		req.setAttribute("total", lists);
	}

	private void search_favorite(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			boolean fav =Boolean.parseBoolean(req.getParameter("favori")) ;
			System.out.println("fav "+ fav);
			String sql = "Select o from Video o where o.favorites IS EMPTY ";
			if(fav) { 
				sql = "Select o from Video o where o.favorites IS  NOT EMPTY ";
			}
			TypedQuery<Video> query = em.createQuery(sql,Video.class);
			List<Video> list = query.getResultList();
			req.setAttribute("fav",fav);
			req.setAttribute("list",list);
		}
	}

	private void search_video(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String video_id = req.getParameter("video");
			System.out.println("1ss");
			String sql = "Select distinct o.user from Favorite o where o.video.ID like :id";
			TypedQuery<User> query = em.createQuery(sql, User.class);
			System.out.println("2ss");
			query.setParameter("id",video_id);
			System.out.println("ss");
			List<User> u = query.getResultList();
			System.out.println("ss" + u.size());
			System.out.println("sss" + u.get(0).getID());
			req.setAttribute("video_id",video_id);
			req.setAttribute("u", u);
		}
	}

	private void search_key(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String key ="%"+req.getParameter("keyword");

			String sql = "Select distinct o.video from Favorite o where o.video.TITILE like :keyword";
			TypedQuery<Video> query = em.createQuery(sql, Video.class);
			System.out.println("2ss");
			query.setParameter("keyword",req.getParameter("keyword"));

			List<Video> v = query.getResultList();
			req.setAttribute("key", key);
			req.setAttribute("v", v);
		}
		
	}

	private void search_user(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String username = req.getParameter("username");
			User user = em.find(User.class, username);
			List<Favorite> favorite = user.getFavorites();
			req.setAttribute("user", username);
			req.setAttribute("favorite", favorite);
		}
	}
}
