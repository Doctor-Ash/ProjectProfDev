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
import models.Student;
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
			StudentDAO dao = new StudentDAO();
			SkillDAO skillDAO = new SkillDAO();
			Student lewis = new Student("Lewis", "Frater", 23, "lewis@mail.com",
					"MMU", "Computer Science", "bob123", "apples");
			
			//password manager
		if (uname.equals(lewis.getUsername()) && password.equals(lewis.getPassword()))
		{
			
			
			
			session.setAttribute("session",true); //once the user has logged in sets the session to true so on pages that require admin only have that
			
			String skillName = req.getParameter("skill");
			String description = req.getParameter("description");
			int rating = Integer.parseInt(req.getParameter("rating"));
			
			
			Skill s = new Skill(skillName, description, rating, "04032019", lewis );
			//inserting skill user indicated
			try {
				skillDAO.insertSkill(s);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			resp.sendRedirect("home");	
		}
		
		else 
		{
			doGet(req, resp);
		}
	}
}
