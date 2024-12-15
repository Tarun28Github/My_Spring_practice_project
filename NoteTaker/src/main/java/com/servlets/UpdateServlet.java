package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			String Title = request.getParameter("title");
			String Content = request.getParameter("content");
            int noteid = Integer.parseInt(request.getParameter("noteId").trim());
			

			
			// saving data using hiber.

			SessionFactory factory = FactoryProvider.getFactory();
			Session s = factory.openSession();
			Transaction tx = s.beginTransaction();

			Note note=s.get(Note.class, noteid);
			
			note.setTitle(Title);
		    note.setContent(Content);
		    note.setDate(new Date());
		    
			tx.commit();
			s.close();
			
			response.sendRedirect("all_notes.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
