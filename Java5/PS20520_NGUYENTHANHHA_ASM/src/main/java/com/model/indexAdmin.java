package com.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Entity.Favorite;
import com.Entity.Share;
import com.Entity.User;
import com.Entity.Video;
import com.EntityDao.FavoritteDao;
import com.EntityDao.ShareDao;
import com.EntityDao.UserDao;
import com.EntityDao.VideoDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet({ "/admin/sendmail", "/admin/forgot-password",
	"/admin/change-password", "/admin/delete_user","/admin/profile","/admin/delete", "/admin/video", "/admin/video_edit", "/admin/video_create", "/admin/video_update", "/admin/video_delete", "/admin/user_edit",  "/admin/user",
	"/admin/product", "/admin/Home", "/admin/myaccount","/admin/product_item"})
public class indexAdmin extends HttpServlet {
	User person;
	UserDao userDao;
	List<User> listuser;
	Video video;
	User user;
	VideoDao videoDao;
	List<Video> listvideo;
	Favorite favorite;
	FavoritteDao favoritteDao;
	List<Favorite> listFavorites;
	Share share;
	ShareDao shareDao;
	List<Share> listshare;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		person = new User();
		userDao = new UserDao();
		listuser = new ArrayList<User>();
		videoDao = new VideoDao();
		shareDao = new ShareDao();
		favoritteDao = new FavoritteDao();
		listvideo = new ArrayList<Video>();
		user = new User();
	}

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			try {
				person = (User) req.getSession().getAttribute("person");
			} catch (Exception e) {
				System.out.println("Lõi"+ e);
				// TODO: handle exception
			}
			String uri = req.getRequestURI();
			String link = uri.substring(uri.lastIndexOf('/') + 1, uri.length());
			System.out.println(link);
			listvideo = videoDao.findAllEntity();
			req.setAttribute("listvideo", listvideo);
			if (link.equalsIgnoreCase("user")) {
				this.user_list(req, resp);
			}
			if (link.equalsIgnoreCase("video")) {
				this.video_list(req, resp);
			}
			else if (link.equalsIgnoreCase("user_edit")) {
				this.user_edit(req, resp);
			}
			else if (link.equalsIgnoreCase("delete_user")) {
				this.delete_user(req, resp);
			}
			else if (link.equalsIgnoreCase("delete")) {
				this.delete(req, resp);
			}
//			else if (link.equalsIgnoreCase("video_list")) {
//				this.video_list(req, resp);
//			}
			else if (link.equalsIgnoreCase("video_edit")) {
				this.video_edit(req, resp);
			}
			else if (link.equalsIgnoreCase("product_item")) {
				this.delete_procduct_item(req, resp);
			}
			else if (link.equalsIgnoreCase("video_create")) {
				this.video_create(req, resp);
			}
			else if (link.equalsIgnoreCase("video_update")) {
				this.video_update(req, resp);
			}
			else if (link.equalsIgnoreCase("video_delete")) {
				this.video_delete(req, resp);
			}
			else if (link.equalsIgnoreCase("profile")) {
				this.profile(req, resp);
			}


}

		private void profile(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = req.getMethod();
			if(method.equalsIgnoreCase("post")) { 
				User useredit = this.user;
				userDao.removeEntity(useredit,useredit.getID());
				user_list(req, resp);
				req.getRequestDispatcher("/views/user_manage_admin.jsp").forward(req, resp);
			}
			else {
				req.getRequestDispatcher("/views/profile.jsp").forward(req, resp);
				}
		}

		private void delete_procduct_item(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = req.getMethod();
			if(method.equalsIgnoreCase("post")) { 
				Video editvideo = video;
				videoDao.removeEntity(video,editvideo.getID());
				req.getRequestDispatcher("/views/video_manage_admin.jsp").forward(req, resp);
			}
			else { 
				req.getRequestDispatcher("/views/product_item.jsp").forward(req, resp);
			}
		}

		private void video_delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			video = videoDao.findEntity_ByID(req.getParameter("youtube_id"));
			req.setAttribute("videoitem", video);
			req.getRequestDispatcher("/views/product_item.jsp").forward(req, resp);
		}

		private void video_update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = req.getMethod();
			if(method.equalsIgnoreCase("post")) { 
				video =  videoDao.findEntity_ByID(req.getParameter("youtube_id"));
				video.setTITILE(req.getParameter("video_title"));
				video.setACTIVE(true);
				video.setDESCRIPTION(req.getParameter("description"));
				video.setVIEWS(Integer.parseInt(req.getParameter("view_count")));
				video.setPOSTER(req.getParameter("images_video_edit"));
				videoDao.updateEntity(video, req.getParameter("youtube_id"));
				finuserAll(req, resp);
			}
			finuserAll(req, resp);
			req.getRequestDispatcher("/views/video_manage_admin.jsp").forward(req, resp);
		}

		private void video_create(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			Video newvideo = new Video();
			newvideo.setID(req.getParameter("youtube_id"));
			newvideo.setTITILE(req.getParameter("video_title"));
			newvideo.setACTIVE(true);
			newvideo.setDESCRIPTION(req.getParameter("description"));
			newvideo.setVIEWS(0);
			newvideo.setPOSTER("a.png");
			System.out.println();
			videoDao.addEntity(newvideo);
			finuserAll(req, resp);
			req.getRequestDispatcher("/views/video_manage_admin.jsp").forward(req, resp);
		}

		private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
		}

		private void delete_user(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
			
				this.user = userDao.findEntity_ByID(req.getParameter("username_edit_profile"));
				req.setAttribute("useredit", user);
				req.getRequestDispatcher("/views/profile.jsp").forward(req, resp);
			
			
		}

		private void user_edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = req.getMethod();	
			User user = new User();
			if(method.equalsIgnoreCase("post")) { 
				System.out.println("kljdslkf"+req.getParameter("username_edit_profile"));
				user =  userDao.findEntity_ByID(req.getParameter("username_edit_profile"));
				user.setEMAIL(req.getParameter("email_address"));
				user.setPASSWORD(req.getParameter("password_edit_profile"));
				user.setFULLNAME(req.getParameter("fullname_edit_profile"));
				userDao.updateEntity(user, req.getParameter("username_edit_profile"));
				
			}
			else { 
				user = userDao.findEntity_ByID(req.getParameter("id"));
				req.setAttribute("useredit", user);
				
			}
			finuserAll(req, resp);
			req.getRequestDispatcher("/views/user_manage_admin.jsp").forward(req, resp);
		}
		private void video_edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = req.getMethod();	
			Video editvideo = new Video();
			if(method.equalsIgnoreCase("post")) { 
				System.out.println("kljdslkf"+req.getParameter("youtube_id"));
				editvideo =  videoDao.findEntity_ByID(req.getParameter("youtube_id"));
				editvideo.setTITILE(req.getParameter("video_title"));
				editvideo.setVIEWS(Integer.parseInt(req.getParameter("view_count")));
				editvideo.setDESCRIPTION(req.getParameter("description"));
				editvideo.setACTIVE(Boolean.parseBoolean(req.getParameter("active_video_edit")));
				editvideo.setPOSTER(req.getParameter("images_video_edit"));
				videoDao.updateEntity(editvideo, req.getParameter("youtube_id"));
				 
			}
			else { 
				editvideo= videoDao.findEntity_ByID(req.getParameter("id"));
				req.setAttribute("videoitem", editvideo);
				
			}
			finuserAll(req, resp);
			req.getRequestDispatcher("/views/video_manage_admin.jsp").forward(req, resp);
		}

		private void user_list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			finuserAll(req, resp);
			req.getRequestDispatcher("/views/user_manage_admin.jsp").forward(req, resp);
		}
		
		private void video_list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			findvideoAll(req, resp);
			req.getRequestDispatcher("/views/video_manage_admin.jsp").forward(req, resp);
		}
		public void finuserAll(HttpServletRequest req, HttpServletResponse resp) { 
			listuser = new ArrayList<User>();
			listuser = userDao.findAllEntity();
			req.setAttribute("listuser", listuser);
			System.out.println("fsfsd"+ listuser.size());
		}
		
		public void findvideoAll(HttpServletRequest req, HttpServletResponse resp) { 
			listvideo = new ArrayList<Video>();
			listvideo = videoDao.findAllEntity();
			req.setAttribute("listvideo", listvideo);
			System.out.println("fsfsd"+ listvideo.size());
		}
}
