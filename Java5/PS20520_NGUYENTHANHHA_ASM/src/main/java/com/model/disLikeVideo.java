package com.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Entity.Favorite;
import com.Entity.User;
import com.Entity.Video;
import com.EntityDao.FavoritteDao;
import com.EntityDao.UserDao;
import com.EntityDao.VideoDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/asđjfj")
public class disLikeVideo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		String link = uri.substring(uri.lastIndexOf('/')+1, uri.length());
		System.out.println(link);
		if(link.equals("dislikeVideo")) { 
			this.dislike(req,resp);
			System.out.println("uri"+ link);
		}
	}
	private void dislike(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Favorite favorite = new Favorite();
		FavoritteDao favoritteDao = new FavoritteDao();
		// TODO Auto-generated method stub
		Video video = new Video();
		VideoDao videoDao = new VideoDao();
	
		User person = new User();
		String videoID = req.getParameter("IdOfVideolike");
		String userID = req.getParameter("IdOfUserlike");
		System.out.println("videoID : "+ videoID);
		System.out.println("videoID :vvvvv ");
		System.out.println("UserID : "+ userID);
		try {
			video = videoDao.findEntity_ByID(videoID);
			person = new UserDao().findEntity_ByID(userID);
			favorite = favoritteDao.findFavoriteByUserVideo(person, video);
			favoritteDao.removeEntity(favorite,String.valueOf(favorite.getID()));
			
		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println("Lỗi"+e);
		}
		resp.sendRedirect("asm/myfavorite");
	}
}
