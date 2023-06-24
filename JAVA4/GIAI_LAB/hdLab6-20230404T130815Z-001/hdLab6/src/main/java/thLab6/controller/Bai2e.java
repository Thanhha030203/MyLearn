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
import thLab6.entity.Report;
import thLab6.helperutils.JpaUtils;


@WebServlet("/Bai2e")
public class Bai2e extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManager em = JpaUtils.getEntityManager();
		String jpql = "SELECT NEW Report(o.video.title, count(o),"
			+ " MAX(o.likeDate), MIN(o.likeDate))"
			+ " FROM Favorite o"
			+ " GROUP BY o.video.title";
		TypedQuery <Report> query = em.createQuery(jpql, Report.class);
		List<Report> list = query.getResultList();
		req.setAttribute("reports", list);
		req.getRequestDispatcher("/views/viewsBai2e.jsp").forward(req, resp);
	}

}
