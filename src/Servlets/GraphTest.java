package Servlets;

/**
* servlet to load the home
*
* @author  Alexander Harrison 17080341
* @version 1.0
* @since   11/1/2019
*/

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.StudentDAO;




public class GraphTest extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		StudentDAO dao = new StudentDAO();
		HttpSession session = req.getSession();
		session.setAttribute("session",false);
	
		RequestDispatcher view = req.getRequestDispatcher("Graphs test.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		//starts the home page 
	}
	
	
	
}
