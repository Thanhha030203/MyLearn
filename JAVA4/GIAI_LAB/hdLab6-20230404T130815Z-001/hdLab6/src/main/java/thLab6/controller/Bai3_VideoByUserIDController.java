package thLab6.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import thLab6.entity.User;
import thLab6.entity.Video;
import thLab6.helperutils.JpaUtils;

@WebServlet("/Bai3_VideoByUserIDController")
public class Bai3_VideoByUserIDController extends HttpServlet {

	private EntityManager em = JpaUtils.getEntityManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TypedQuery<Video> query = em.createNamedQuery("Video.findByFavorite", Video.class);
		List<Video> list = query.getResultList();
		req.setAttribute("videos", list);
		req.getRequestDispatcher("/views/video-by-userid.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("utf-8");
		
		try {
			String username = req.getParameter("username");
			if (!username.isBlank()) {
				User user = em.find(User.class, username);
				
				TypedQuery<Video> query = em.createNamedQuery("Video.findByUser", Video.class);
				query.setParameter("id", username);
				
				List<Video> videos = query.getResultList();
				
				req.setAttribute("user", user);
				req.setAttribute("videos", videos);
				req.setAttribute("usernameValue", username);
				
			} else {
				TypedQuery<Video> query = em.createNamedQuery("Video.findByFavorite", Video.class);
				List<Video> list = query.getResultList();
				req.setAttribute("videos", list);
			}
			req.getRequestDispatcher("/views/video-by-userid.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
