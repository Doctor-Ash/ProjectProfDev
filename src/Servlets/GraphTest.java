package Servlets;

/**
* servlet to load the Graphs 
*
* @author  Lewis, Callum, Josh, Alexander
* @version 1.0
* @since   19/3/2019
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

import models.Skill;
import models.SkillDAO;
import models.StudentDAO;




public class GraphTest extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		
		SkillDAO skillDAO = new SkillDAO();
		ArrayList<Skill> ratings = new ArrayList<>();
		
		HttpSession session =req.getSession(); //used to check whether user is logged in
		String user = (String) session.getAttribute("username");
		System.out.println(user);
		String skillName= (String) req.getParameter("skillName");
		System.out.println(skillName);
		

		try {
			ratings = skillDAO.getParticularSkills(user, skillName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("ratings", ratings);
		req.setAttribute("skillName", skillName);
		
		
		RequestDispatcher view = req.getRequestDispatcher("Graphs test.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		//starts the home page 
	}
	
	
	
}
