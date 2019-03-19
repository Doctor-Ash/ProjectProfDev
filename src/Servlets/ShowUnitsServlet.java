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
import models.Unit;
import models.UnitDAO;

/**
* This is to get all the units that have been inserted from the database and show them on a jsp page 
*
* @author  Lewis, Callum, Josh, Alexander
* @version 1.0
* @since   19/3/2019
*/
public class ShowUnitsServlet extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		StudentDAO dao = new StudentDAO();
		UnitDAO unitDAO = new UnitDAO();
		ArrayList<Unit> units = new ArrayList<>();
		
		HttpSession session =req.getSession(); //used to check whether user is logged in
		String user = (String) session.getAttribute("username");
		
		try {
			units = unitDAO.getAllUnits(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("units", units);
		
	
		RequestDispatcher view = req.getRequestDispatcher("showunits.jsp");
		//req.setAttribute("",);
		view.forward(req, resp);
		//starts the home page 
	}
}
