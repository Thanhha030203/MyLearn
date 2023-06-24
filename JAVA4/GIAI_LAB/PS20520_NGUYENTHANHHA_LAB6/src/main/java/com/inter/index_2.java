package com.inter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Entity.Video;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/search/usersname", "/search/keysword", "/search/month", "/search/likedate"})
public class index_2 extends HttpServlet {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("LAB8");
	EntityManager em = emf.createEntityManager();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resq) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		if (uri.contains("usersname")) {
			this.search_users(req, resq);
		}
		else if (uri.contains("keysword")) {
			this.search_keys(req, resq);
		}
		else if (uri.contains("month")) {
			this.search_month(req, resq);
		}
		else if (uri.contains("likedate")) {
			this.search_like(req, resq);
		}
		req.getRequestDispatcher("/views/index_2.jsp").forward(req, resq);
	}

	private void search_like(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String from =req.getParameter("from_date");
			String to =req.getParameter("to_date");
			try {
				TypedQuery<Video> query = em.createNamedQuery("Video.finByInRange",Video.class);
				System.out.println("2ss");
				query.setParameter("min",new SimpleDateFormat("yyyy-MM-dd").parse(from));
				query.setParameter("max",new SimpleDateFormat("yyyy-MM-dd").parse(to));
				List<Video> from_to = query.getResultList();
				System.out.println("List"+ from_to.size());
				System.out.println("List"+ from);
				req.setAttribute("from", from);
				req.setAttribute("to", to);
				req.setAttribute("ft", from_to);
			} catch (Exception e) {
				System.out.println("Lỗi tại search_like"+ e);
				// TODO: handle exception
			}
		}
		
	}

	private void search_month(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			try {
				String [] values = req.getParameterValues("month");
				System.out.println("ssss"+values.length);
				List<Integer> months = new ArrayList<Integer>();
				for (String m : values) {
					months.add(Integer.valueOf(m));
					req.setAttribute("isMonth" + m, true);
				}
				
				TypedQuery<Video> query = em.createNamedQuery("Video.findInMonths",Video.class);
				System.out.println("2sss");
				System.out.println();
				query.setParameter("months",months);
				List<Video> v = query.getResultList();
				req.setAttribute("m", v);
			} catch (Exception e) {
				System.out.println("a");
				// TODO: handle exception
			}
		}
	}
	private void search_keys(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String key ="%"+req.getParameter("keyword");

			try {

				TypedQuery<Video> query = em.createNamedQuery("Video.finByKeyWord",Video.class);
				System.out.println("2ss");
				query.setParameter("keyword",key);
				List<Video> v = query.getResultList();
				System.out.println("List"+ v.size());
				req.setAttribute("key", req.getParameter("keyword"));
				req.setAttribute("v", v);
			} catch (Exception e) {
				System.out.println("Lỗi tại search_key_java4_index2"+ e);
				// TODO: handle exception
			}
		}
	}
	private void search_users(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if (method.equalsIgnoreCase("post")) {
			String username = req.getParameter("username");
			try {

				TypedQuery<Video> query = em.createNamedQuery("Video.finByUser",Video.class);
				System.out.println("2ss");
				query.setParameter("username",username);
				List<Video> v = query.getResultList();
				System.out.println("List"+ v.size());
				req.setAttribute("user", username);
				req.setAttribute("favorite", v);
			} catch (Exception e) {
				System.out.println("a");
				// TODO: handle exception
			}
		}
	}
}
