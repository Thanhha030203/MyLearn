package com.inter;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import com.ps20520.Report;

import Entity.Video;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/search/random", "/search/year"})
public class index_3  extends HttpServlet{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("LAB8");
	EntityManager em = emf.createEntityManager();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resq) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		int [] year= new int[2024-2010];
		 int be= 2010;
			for(int j=0;j<(2024-2010);j++) { 
				year[j]= be;
				be++;				
		}
			List<Integer> listyear = new ArrayList<Integer>();
			for (Integer integer :year) {
				listyear.add(integer);
			}
			req.setAttribute("years", listyear);
			this.search_random(req, resq);
			if(uri.contains("year")) {
		this.search_year(req, resq);
			}
		req.getRequestDispatcher("/views/index_3.jsp").forward(req, resq);
	}
	private void search_year(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		System.out.println("aa");
		if(method.equalsIgnoreCase("post")) { 
			System.out.println("aaggg");
			try {
				Integer year = Integer.parseInt(req.getParameter("year"));		
				StoredProcedureQuery query = em.createStoredProcedureQuery("spFavoriteByYear").registerStoredProcedureParameter("Year",  Integer.class,ParameterMode.IN);	
				query.setParameter("Year", year);
				System.out.println("hh"+ year);
				List<Object[]> list = query.getResultList();
				System.out.println("aaaa");
				List<Report> rs = new ArrayList<>();
				for (Object [] o:list ) {
					System.out.println("aaaf");
					Report re = new Report((Serializable)o[0],Long.parseLong(String.valueOf(o[1])),(Date) o[2],(Date) o[3]);
					rs.add(re);
				}
				System.out.println("rs"+rs.size());
				req.setAttribute("rs", rs);
				req.setAttribute("year", year);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Lỗi tại search_year"+ e);
			}
		}
	}


	private void search_random(HttpServletRequest req, HttpServletResponse resq) {
		// TODO Auto-generated method stub
		try {
			Query  query = em.createNamedQuery("Report.Random");
			System.out.println("Lỗi1");
			List<Video> list = query.getResultList();
			System.out.println("Lỗi2");
			req.setAttribute("l", list);			
		} catch (Exception e) {
			System.out.println("Lỗi"+e);
			// TODO: handle exception
		}
	}
}
