package thLab6.controller;

import java.io.IOException;
import java.util.ArrayList;
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


@WebServlet("/Bai3_VideoByMonthController")
public class Bai3_VideoByMonthController extends HttpServlet {
	
	private EntityManager em = JpaUtils.getEntityManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String jpql = "SELECT DISTINCT f.video FROM Favorite f WHERE MONTH(f.likeDate) = ?0";
		
		TypedQuery<Video> query = em.createQuery(jpql, Video.class);
		query.setParameter(0, 10);
		List<Video> list = query.getResultList();
		
		req.setAttribute("videos", list);
		req.setAttribute("isMonth10", true);
		req.getRequestDispatcher("/views/video-by-month.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String jpql = "SELECT DISTINCT f.video FROM Favorite f WHERE MONTH(f.likeDate) IN (:months)";

		String[] values = req.getParameterValues("month");
		List<Integer> months = new ArrayList<Integer>();

		if (values != null) {
			for (String month : values) {
				months.add(Integer.valueOf(month));
				req.setAttribute("isMonth" + month, true);
			}
		}

		TypedQuery<Video> query = em.createQuery(jpql, Video.class);
		query.setParameter("months", months);
		List<Video> list = query.getResultList();

		req.setAttribute("videos", list);
		req.getRequestDispatcher("/views/video-by-month.jsp").forward(req, resp);
	}

}
