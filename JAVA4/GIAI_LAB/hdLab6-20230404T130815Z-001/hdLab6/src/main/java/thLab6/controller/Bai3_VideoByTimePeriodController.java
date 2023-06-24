package thLab6.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

@WebServlet("/Bai3_VideoByTimePeriodController")
public class Bai3_VideoByTimePeriodController extends HttpServlet {
	
	private EntityManager em = JpaUtils.getEntityManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TypedQuery<Video> query = em.createNamedQuery("Video.findByFavorite", Video.class);
		List<Video> list = query.getResultList();
		req.setAttribute("videos", list);
		req.getRequestDispatcher("/views/video-by-time-period.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fromDate = req.getParameter("fromDate");
		String toDate = req.getParameter("toDate");
		
		try {
			TypedQuery<Video> query = em.createNamedQuery("Video.findInRange", Video.class);
			query.setParameter("min", new SimpleDateFormat("yyyy-MM-dd").parse(fromDate));
			query.setParameter("max", new SimpleDateFormat("yyyy-MM-dd").parse(toDate));
			
			List<Video> videos = query.getResultList();
			req.setAttribute("videos", videos);
			req.setAttribute("fromDateValue", fromDate);
			req.setAttribute("toDateValue", toDate);
			
			req.getRequestDispatcher("/views/video-by-time-period.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("fromDateValue", fromDate);
			req.setAttribute("toDateValue", toDate);
		}

	}

}
