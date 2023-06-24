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
import com.Helper.MailHelper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet({ "/asm/sign-in", "/asm/sign-up", "/asm/sign-out", "/asm/sendmail", "/asm/forgot-password",
		"/asm/change-password", "/asm/myfavorite", "/asm/likeVideo", "/asm/dislikeVideo", "/asm/shareVideo",
		"/asm/product", "/asm/Home", "/asm/myaccount"})
public class index extends HttpServlet {
	int codesendmail;
	User person;
	UserDao userDao;
	List<User> listuser;
	Video video;
	VideoDao videoDao;
	List<Video> listvideo;
	Favorite favorite;
	FavoritteDao favoritteDao;
	List<Favorite> listFavorites;
	Share share;
	ShareDao shareDao;
	List<Share> listshare;
	HttpSession session;
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
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		String link = uri.substring(uri.lastIndexOf('/') + 1, uri.length());
		System.out.println(link);
		listvideo = videoDao.findAllEntity();
		req.setAttribute("listvideo", listvideo);
		if (link.equalsIgnoreCase("sign-in")) {
			this.sign_in(req, resp);
		}
		if (link.equalsIgnoreCase("likeVideo")) {
			this.likeVideo(req, resp);
		}
		if (link.equalsIgnoreCase("shareVideo")) {
			this.shareVideo(req, resp);
		} else if (link.equalsIgnoreCase("sign-up")) {
			this.sign_up(req, resp);
		} else if (link.equalsIgnoreCase("sign-out")) {
			this.sign_out(req, resp);
		} else if (link.equalsIgnoreCase("sendmail")) {
			this.sendmail(req, resp);
		} else if (link.equalsIgnoreCase("forgot-password")) {
			this.forgot_password(req, resp);
		} else if (link.equalsIgnoreCase("change-password")) {
			this.change_password(req, resp);
		} else if (link.equalsIgnoreCase("myfavorite")) {
			this.myfavorite(req, resp);
		} else if (link.equalsIgnoreCase("dislikeVideo")) {
			this.dislikeVideo(req, resp);
		} else if (link.equals("product")) {
			this.procductController(req, resp);
		} else if (link.equalsIgnoreCase("Home")) {
			this.myHome(req, resp);
		} else if (link.equalsIgnoreCase("myaccount")) {
			this.myAccount(req, resp);
		}

	}

	private void myHome(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // TODO
		// stub
		req.getRequestDispatcher("/views/index_user.jsp").forward(req, resp);
	}

	private void sign_out(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {

		}
		req.getRequestDispatcher("/views/sign-in.jsp").forward(req, resp);
	}

	private void sign_up(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			
			String id = req.getParameter("id");
			String password = req.getParameter("password");
			String fullname = req.getParameter("fullname");
			String email = req.getParameter("Email");
			boolean admin = req.getParameter("admin") == "true" ? true : false;
			User newUser = new User(id, password, fullname, email, admin);
			userDao.addEntity(newUser);
			req.setAttribute("Message", "Create successful account!!!");
			req.setAttribute("icon", "checked.png");
// todo method
			req.getRequestDispatcher("/views/sign-up.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("/views/sign-up.jsp").forward(req, resp);
		}
	}

	private void sign_in(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			HttpSession session = req.getSession();
			String id = req.getParameter("user_sign-in");
			String pass = req.getParameter("password_sign-in");
			boolean admin = Boolean.parseBoolean(req.getParameter("admin"));
			System.out.println("admin : " +admin);
			
			person = userDao.findEntity_ByID_PASSWORD_ADMIN(id, pass,admin);
			if(person == null) { 
				req.setAttribute("message_sign_in","No exist account");
				req.getRequestDispatcher("/views/sign-in.jsp").forward(req, resp);
			}
			else {
				if(person.getADMIN()) { 
					session.setAttribute("person", person);
					req.getRequestDispatcher("/views/index_admin.jsp").forward(req, resp);
					
				}
				else {
					session.setAttribute("person", person);
			req.getRequestDispatcher("/views/index_user.jsp").forward(req, resp);
				}
			}
		} else {
			req.getRequestDispatcher("/views/sign-in.jsp").forward(req, resp);
		}
	}

	private void sendmail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			person = userDao.findEntity_ByID(req.getParameter("u"));
			codesendmail = MailHelper.SendMail(req.getParameter("to"));
			if (codesendmail != 0) {
				req.setAttribute("message", "Gửi thành công");
				req.getRequestDispatcher("/views/accept.jsp").forward(req, resp);
			} else {
				req.setAttribute("message", "Gửi thất bại! Vui lòng gửi lại");
				req.getRequestDispatcher("/views/sendmail.jsp").forward(req, resp);
			}
		} else {
			req.getRequestDispatcher("/views/sendmail.jsp").forward(req, resp);
		}
	}

	private void forgot_password(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String entercode = req.getParameter("accpet");
			if (Integer.parseInt(entercode) == codesendmail) {
				System.out.println("accpet thành công");
				req.getRequestDispatcher("/views/change-password.jsp").forward(req, resp);
			} else {
				req.setAttribute("message_change_password", "Password not true");
				req.getRequestDispatcher("/views/accept.jsp").forward(req, resp);
			}
		}
	}

	private void change_password(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String confirm = req.getParameter("change_confirm_password");
			String password = req.getParameter("pass_change_password");
			System.out.println("in" + password);
			if (password.equals(confirm)) {
				person.setPASSWORD(password);
				userDao.updateEntity(person, person.getID());
				req.getRequestDispatcher("/views/sign-in.jsp").forward(req, resp);
			} else {
				req.setAttribute("message_confirm_password", "New password and Confirm Password not sample");
				req.getRequestDispatcher("/views/change-password.jsp").forward(req, resp);
			}
		} else {
			req.getRequestDispatcher("/views/change-password.jsp").forward(req, resp);
		}
	}

	private void myfavorite(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		listvideo = videoDao.find_Video_ByUserId(person.getID());
		List<Video> listvideoshare = new ArrayList<Video>();
		listvideoshare = videoDao.find_Video_ByUserId_Share(person.getID());
		req.setAttribute("countuserlike", listvideo.size());
		req.setAttribute("countusershare", listvideoshare.size());
		req.setAttribute("VideoListInProduct", listvideo);
		req.setAttribute("productVideo", listvideo.get(0));
		req.setAttribute("user", person);
		req.getRequestDispatcher("/views/UserLikeVideo.jsp").forward(req, resp);
	}

	private void shareVideo(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String email = req.getParameter("share_to_mail");
			long millis = System.currentTimeMillis();
			java.sql.Date date = new java.sql.Date(millis);
			share = new Share(email, person, video, date);
			shareDao.addEntity(share);
			List<Video> list = new ArrayList<>();
			list = videoDao.findAllEntity_random();
			req.setAttribute("VideoListInProduct", list);
			req.setAttribute("productVideo", video);
			System.out.println("thêm thành công");
			req.getRequestDispatcher("/views/product_user.jsp").forward(req, resp);
		} else {
			String videoid = req.getParameter("IdOfVideo");
			System.out.println("videossss" + videoid);
			video = videoDao.findEntity_ByID(videoid);
			System.out.println("viesss" + video.getID());
			req.getRequestDispatcher("/views/share_video_user.jsp").forward(req, resp);
		}
	}

	private void likeVideo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		String method = req.getMethod();
		System.out.println(person.getID());
		try {

			String videoid = req.getParameter("IdOfVideolike");
			System.out.println("videossss" + videoid);
			Video videos = new Video();
			videos = videoDao.findEntity_ByID(videoid);
			long millis = System.currentTimeMillis();
			java.sql.Date date = new java.sql.Date(millis);
			System.out.println("person" + person.getID());
			System.out.println("video" + videos.getID());
			System.out.println("person" + date);
			favorite = new Favorite(person, videos, date);
			favoritteDao.addEntity(favorite);
			video = videoDao.findEntity_ByID(videoid);
			List<Video> list = new ArrayList<>();
			list = videoDao.findAllEntity_random();
			req.setAttribute("VideoListInProduct", list);
			req.setAttribute("productVideo", video);
			System.out.println("thêm thành công");
		} catch (Exception e) {
			System.out.println("lỗi ta" + e);
// TODO: handle exception
		}
		req.getRequestDispatcher("/views/product_user.jsp").forward(req, resp);
	}

	private void procductController(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

// TODO Auto-generated method stub
		Video video = new Video();
		VideoDao videoDao = new VideoDao();
		String videoID = req.getParameter("videoId");
		try {
			video = videoDao.findEntity_ByID(videoID);
			List<Video> list = new ArrayList<>();
			list = videoDao.findAllEntity_random();
			req.setAttribute("VideoListInProduct", list);
			req.setAttribute("productVideo", video);
		} catch (Exception e) {
			System.out.println("videoID : " + videoID);
// TODO: handle exception
			System.out.println("video : " + video);
		}
		req.getRequestDispatcher("/views/product_user.jsp").forward(req, resp);
	}

	private void dislikeVideo(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
// TODO Auto-generated method stub
		System.out.println("hdfhskljfhkljshfshdskjgh");
		favorite = new Favorite();
		favoritteDao = new FavoritteDao();
// TODO Auto-generated method stub
		String videoID = req.getParameter("IdOfVideolike");
		System.out.println("videoID dong 292 : " + videoID);
		try {
			video = videoDao.findEntity_ByID(videoID);
			System.out.println("pưeesinID dong 295 : " + person.getID());
			favorite = favoritteDao.findFavoriteByUserVideo(this.person, video);
			System.out.println("dòng 297");
			System.out.println("dòng 298" + favorite.getID());
			boolean re = favoritteDao.removeEntity(favorite, String.valueOf(favorite.getID()));
			if (re) {
				System.out.println("xoá thành công");
			} else {
				System.out.println("xoá thất bại");
			}
		} catch (Exception e) {

// TODO: handle exception
			System.out.println("Lỗiss" + e);
		}
		req.getRequestDispatcher("/views/product_user.jsp").forward(req, resp);
	}

	private void myAccount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		String methodString = req.getRequestURI();
		if (methodString.equalsIgnoreCase("post")) {

		} else {
			req.setAttribute("user", person);
			req.getRequestDispatcher("/views/edit_profile_user.jsp").forward(req, resp);
		}
	}
}
