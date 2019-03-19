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

public class ShowGoalServlet extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	
		
	
		RequestDispatcher view = req.getRequestDispatcher("showGoals.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		
	}
}
