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

import thLab6.entity.Favorite;
import thLab6.entity.User;
import thLab6.entity.Video;
import thLab6.helperutils.JpaUtils;

@WebServlet("/Bai2b")
public class Bai2b extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/viewBai2b.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// tìm các video được yêu thích có title chứa từ khóa
		
		EntityManager em = JpaUtils.getEntityManager();
		
		String keyword = "%" + req.getParameter("id").trim() + "%";
		String jpql = "select f.video from Favorite f where f.video.title like :keyword";
			
		TypedQuery<Video> query = em.createQuery(jpql, Video.class);
		
		query.setParameter("keyword", keyword);
		List<Video> list = query.getResultList();
		
		req.setAttribute("videos", list);
		req.getRequestDispatcher("/views/viewBai2b.jsp").forward(req, resp);
	}
}
