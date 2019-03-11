package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.StudentDAO;

public class ShowSkillsServlet extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		StudentDAO dao = new StudentDAO();
		
	
		RequestDispatcher view = req.getRequestDispatcher("showskills.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		//starts the home page 
	}
}
