package Servlets;
/**
* Logout servlet for the web 
*
* @author  Alexander Harrison 17080341
* @version 1.0
* @since   11/1/2019
*/
//@SuppressWarnings("serial")
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jetty.server.Dispatcher;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import models.StudentDAO;


import java.io.IOException;


public class LogoutServlet extends HttpServlet 
{
		static final long serialVersionUID = 1L;
		
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		HttpSession session =req.getSession();

		StudentDAO dao = new StudentDAO();
	
		session.setAttribute("session",false);
		resp.sendRedirect("home");
		//req.setAttribute("",);
		//log out just changes the http session to false so admin parts of the website dont show 
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			

	
	}
}
