package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Skill;
import models.SkillDAO;
import models.Unit;
import models.UnitDAO;

public class AddUnitServlet extends HttpServlet  {
	
	static final long serialVersionUID = 1L;
	
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		RequestDispatcher view =req.getRequestDispatcher("addUnit.jsp");
		view.forward(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			
			
			HttpSession session =req.getSession(); //used to check whether user is logged in
			String user = (String) session.getAttribute("username");
			
			//StudentDAO dao = new StudentDAO();
			UnitDAO unitdao = new UnitDAO();
			
			
			//password manager
		
			String unit =  req.getParameter("UnitName");
			String gradeS = req.getParameter("Grade");
			int grade = Integer.parseInt(gradeS);
			Unit u = new Unit(unit, grade, user);
			
			
			 
			 
			
			
			//int rating = (Integer.parseInt(req.getParameter("selectRating")));
			//String description = req.getParameter("description");
			//System.out.println(rating + description + skill + user);
			
			//Skill s = new Skill(skill, description, rating, user);
			
			try {
				unitdao.insertUnit(u);
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			resp.sendRedirect("showunits");	
		
		
		
	}
}