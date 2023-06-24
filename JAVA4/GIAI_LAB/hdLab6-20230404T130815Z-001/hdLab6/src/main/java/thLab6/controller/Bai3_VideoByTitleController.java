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

import thLab6.entity.Video;
import thLab6.helperutils.JpaUtils;


@WebServlet("/Bai3_VideoByTitleController")
public class Bai3_VideoByTitleController extends HttpServlet {

	private EntityManager em = JpaUtils.getEntityManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TypedQuery<Video> query = em.createNamedQuery("Video.findByFavorite", Video.class);
		List<Video> list = query.getResultList();
		req.setAttribute("videos", list);
		req.getRequestDispatcher("/views/video-by-title.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("utf-8");
		try {
			TypedQuery<Video> query = em.createNamedQuery("Video.findByKeyword", Video.class);
			String keyword = req.getParameter("keyword");
			query.setParameter("keyword", "%" + keyword + "%");
			List<Video> list = query.getResultList();
			req.setAttribute("videos", list);
			req.setAttribute("keywordValue", keyword);
			req.getRequestDispatcher("/views/video-by-title.jsp").forward(req, resp);
		} catch (Exception e) {
			TypedQuery<Video> query = em.createNamedQuery("Video.findAll", Video.class);
			List<Video> list = query.getResultList();
			req.setAttribute("videos", list);
			req.getRequestDispatcher("/views/video-by-title.jsp").forward(req, resp);
		}
	}
}
