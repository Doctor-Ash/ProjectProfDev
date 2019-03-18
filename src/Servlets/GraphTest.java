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

import models.Skill;
import models.SkillDAO;
import models.StudentDAO;




public class GraphTest extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		StudentDAO dao = new StudentDAO();
		SkillDAO skillDAO = new SkillDAO();
		ArrayList<Skill> skills = new ArrayList<>();
	//	StudentDAO dao = new StudentDAO();
		HttpSession session =req.getSession(); //used to check whether user is logged in
		String user = (String) session.getAttribute("username");
		

		try {
			skills = skillDAO.getAllSkills(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("skills", skills);
		
		
		RequestDispatcher view = req.getRequestDispatcher("Graphs test.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		//starts the home page 
	}
	
	
	
}
