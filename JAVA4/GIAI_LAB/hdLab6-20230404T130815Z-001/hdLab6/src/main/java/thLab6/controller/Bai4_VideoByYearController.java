package thLab6.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import thLab6.entity.Report;
import thLab6.helperutils.JpaUtils;

@WebServlet("/Bai4_VideoByYearController")
public class Bai4_VideoByYearController extends HttpServlet {

	private EntityManager em = JpaUtils.getEntityManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/video-by-year.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer year = Integer.valueOf(req.getParameter("year"));

//		String jpql = "SELECT NEW Report(o.video.title, count(o)," + " MAX(o.likeDate), MIN(o.likeDate))"
//				+ " FROM Favorite o" + " WHERE YEAR(o.likeDate) = ?0" + " GROUP BY o.video.title";
		StoredProcedureQuery query = em.createStoredProcedureQuery("Report.spFavoriteByYear", Report.class) .registerStoredProcedureParameter("year", Integer.class, ParameterMode.IN);
		
		query.setParameter("year", year);
		List<Report> list = query.getResultList();

		req.setAttribute("is" + year, "true");

		req.setAttribute("reports", list);
		System.out.println("List"+ list.size());
		req.getRequestDispatcher("/views/video-by-year.jsp").forward(req, resp);
	}

}
