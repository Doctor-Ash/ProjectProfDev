package Servlets;
/**
* Login servlet to let thte user log in
*
* @author  Alexander Harrison 17080341
* @version 1.0
* @since   11/1/2019
*/
//@SuppressWarnings("serial")
import java.io.PrintWriter;
import java.sql.SQLException;
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

import models.Student;
import models.StudentDAO;

import java.io.IOException;


public class LoginServlet extends HttpServlet 
{
		static final long serialVersionUID = 1L;
		
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		RequestDispatcher view =req.getRequestDispatcher("login.jsp");
		view.forward(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			StudentDAO studao = new StudentDAO();
			
			String uname = req.getParameter("username");
			String password = req.getParameter("password");
			HttpSession session =req.getSession(); //used to check whether user is logged in
			
			//password manager
		try {
			if (studao.getStudent(uname,password) == true)
			{
				
				session.setAttribute("session",true); //once the user has logged in sets the session to true so on pages that require admin only have that
				//resp.sendRedirect("home");	
				RequestDispatcher view = req.getRequestDispatcher("whateverpage.jsp");
				req.setAttribute("username", uname);
				view.forward(req, resp);
				
			}
			
			else 
			{
				System.out.print("fail");
				RequestDispatcher view = req.getRequestDispatcher("addSkill.jsp");
				view.forward(req, resp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

