package thLab6.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import thLab6.entity.Video;
import thLab6.helperutils.JpaUtils;

@WebServlet("/Bai4_Top10VideoServlet")
public class Bai4_Top10VideoServlet extends HttpServlet {
	
	private EntityManager em = JpaUtils.getEntityManager();

	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Query query = em.createNamedQuery("Video.random", Video.class);
	try {
		Query query = em.createNamedQuery("Video.random10", Video.class);
//		query.setParameter(1, "2");
		List<Video> list = query.getResultList();
		req.setAttribute("videos", list);
		req.getRequestDispatcher("/views/top-10.jsp").forward(req, resp);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Lỗi"+e);
	}
		
	}
}
