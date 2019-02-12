package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.StudentDAO;

public class AddSkillServlet extends HttpServlet  {
	
	static final long serialVersionUID = 1L;
	
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		RequestDispatcher view =req.getRequestDispatcher("addSkill.jsp");
		view.forward(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			String uname = req.getParameter("username");
			String password = req.getParameter("password");
			HttpSession session =req.getSession(); //used to check whether user is logged in
			
			//password manager
		if (uname.equals("")&& password.equals(""))
		{
			StudentDAO dao = new StudentDAO();
			session.setAttribute("session",true); //once the user has logged in sets the session to true so on pages that require admin only have that
			resp.sendRedirect("home");	
		//	RequestDispatcher view = req.getRequestDispatcher("LoggedIn.jsp");
		//	req.setAttribute("", );
		//	view.forward(req, resp);
			
		}
		
		else 
		{
			doGet(req, resp);
		}
	}
}
