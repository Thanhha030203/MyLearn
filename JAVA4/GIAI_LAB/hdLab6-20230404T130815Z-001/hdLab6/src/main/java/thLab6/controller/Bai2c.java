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
import thLab6.helperutils.JpaUtils;


@WebServlet("/Bai2c")
public class Bai2c extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/views/viewsBai2c.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		// tìm những người dùng thích video
		EntityManager em = JpaUtils.getEntityManager();
		
		String videoID = request.getParameter("id").trim();
		String jpql = "SELECT f.user FROM Favorite f WHERE f.video.id = :videoID";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		query.setParameter("videoID", videoID);
		List<User> lstUsers = query.getResultList();
		
		request.setAttribute("lstUsers", lstUsers);
		request.getRequestDispatcher("/views/viewsBai2c.jsp").forward(request, response);
	}

}
