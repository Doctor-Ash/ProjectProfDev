package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.GoalDAO;
import models.UnitDAO;

public class DeleteUnitServlet extends HttpServlet  {
	
	static final long serialVersionUID = 1L;
	
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		
		UnitDAO unitDAO = new UnitDAO();
		HttpSession session =req.getSession(); //used to check whether user is logged in
		String user = (String) session.getAttribute("username");
		
		String unitName = req.getParameter("unitName");
		
		
		try {
			unitDAO.deleteUnit(unitName, user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		resp.sendRedirect("./showunits");
	}


}

