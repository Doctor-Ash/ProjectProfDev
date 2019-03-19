package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement;

import models.Skill;
import models.SkillDAO;
import models.Student;
import models.StudentDAO;
import models.Goal;
import models.GoalDAO;


public class AddGoalServlet extends HttpServlet  {
	
	static final long serialVersionUID = 1L;
	
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		RequestDispatcher view =req.getRequestDispatcher("addGoal.jsp");
		view.forward(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			
			
			HttpSession session =req.getSession(); //used to check whether user is logged in
			String user = (String) session.getAttribute("username");
			
			//StudentDAO dao = new StudentDAO();
			GoalDAO goaldao = new GoalDAO();
			String Month = req.getParameter("selectMonth");
			String goaldesc = req.getParameter("GoalDescription");
			
			
			
			
			//password manager
		
			try {
				
				goaldao.insertGoal(Month, user, goaldesc);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			resp.sendRedirect("showGoals");
			
			
			
			
			//int rating = (Integer.parseInt(req.getParameter("selectRating")));
			//String description = req.getParameter("description");
			//System.out.println(rating + description + skill + user);
			
			//Skill s = new Skill(skill, description, rating, user);
			
			
		
				
		
		
		
	}
}
