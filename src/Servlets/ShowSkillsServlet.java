package Servlets;

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

public class ShowSkillsServlet extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		StudentDAO dao = new StudentDAO();
		SkillDAO skillDAO = new SkillDAO();
		ArrayList<Skill> skills = new ArrayList<>();
		ArrayList<Skill> last5skills = new ArrayList<>();
		
		
		HttpSession session =req.getSession(); //used to check whether user is logged in
		String user = (String) session.getAttribute("username");
		
		try {
			skills = skillDAO.getAllSkills(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("skills", skills);
		
		
		for(int i = 1; i <= 5; i++) {
			last5skills.add(skills.get(skills.size()-i));
		}
	
		req.setAttribute("last5skills", last5skills);
		
		
		RequestDispatcher view = req.getRequestDispatcher("showskills.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		//starts the home page 
	}
}
