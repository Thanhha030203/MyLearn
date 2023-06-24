package thLab6.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import thLab6.entity.Favorite;
import thLab6.entity.User;
import thLab6.helperutils.JpaUtils;

@WebServlet("/Bai2a")
public class Bai2a extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/viewBai2a.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// tìm video yêu thích theo tên người sử dụng
		EntityManager em = JpaUtils.getEntityManager();
		
		String id = req.getParameter("id");
		User user = em.find(User.class, id);
		
		List<Favorite> favorite = user.getFavorites();
		
		req.setAttribute("user", user);
		
		req.setAttribute("favorite", favorite);
				
		req.getRequestDispatcher("/views/viewBai2a.jsp").forward(req, resp);
	}
}
