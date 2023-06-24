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


@WebServlet("/Bai2d")
public class Bai2d extends HttpServlet {
	
	boolean isCheck = false;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		EntityManager em = JpaUtils.getEntityManager();
		String jpql = "SELECT v FROM Video v WHERE v.favorites IS EMPTY";
		TypedQuery<Video> query = em.createQuery(jpql, Video.class);
		List<Video> lstVideos = query.getResultList();
		request.setAttribute("lstVideos", lstVideos);
		request.getRequestDispatcher("/views/viewsBai2d.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// hiển thị tất cả video không có hoặc có yêu thích
		EntityManager em = JpaUtils.getEntityManager();
		boolean isFavorite = Boolean.parseBoolean(request.getParameter("isFavorite"));
		String jpql = "";
		if (isFavorite) {
			jpql = "SELECT v FROM Video v WHERE v.favorites IS NOT EMPTY";
			request.setAttribute("isChecked", true);
		} else {
			jpql = "SELECT v FROM Video v WHERE v.favorites IS EMPTY";
			request.setAttribute("isChecked", false);
		}

		TypedQuery<Video> query = em.createQuery(jpql, Video.class);
		List<Video> lstVideos = query.getResultList();
		request.setAttribute("lstVideos", lstVideos);
		request.getRequestDispatcher("/views/viewsBai2d.jsp").forward(request, response);
	}

}
