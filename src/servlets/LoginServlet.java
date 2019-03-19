package Servlets;
/**
*This servlet takes the infromation from the jsp pages and checks it with the database if the check is successful then it will change the session to match that person and then it will pass you on to the show skills page 
*
* @author  Lewis, Callum, Josh, Alexander
* @version 1.0
* @since   19/3/2019
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
				session.setAttribute("username", uname);
				RequestDispatcher view = req.getRequestDispatcher("index.jsp");
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

