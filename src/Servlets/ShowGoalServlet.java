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

import models.Goal;
import models.GoalDAO;
import models.Skill;
import models.SkillDAO;
import models.StudentDAO;

/**
*
*Gets the data from the jsp page and then sends it to the database.
*
* @author  Lewis, Callum, Josh, Alexander
* @version 1.0
* @since   19/3/2019
*/
//comment
public class ShowGoalServlet extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	
		GoalDAO goaldao = new GoalDAO();
		Goal g1 = null;
		
		
		
		HttpSession session =req.getSession(); //used to check whether user is logged in
		String user = (String) session.getAttribute("username");
		
		try {
			g1 = goaldao.getGoals(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		RequestDispatcher view = req.getRequestDispatcher("showGoals.jsp");
		//req.setAttribute("jan", jan);
		req.setAttribute("jan", g1.getJan());
		req.setAttribute("feb", g1.getFeb());
		req.setAttribute("mar", g1.getMar());
		req.setAttribute("apr", g1.getApr());
		req.setAttribute("may", g1.getMay());
		req.setAttribute("jun", g1.getJun());
		req.setAttribute("jul", g1.getJul());
		req.setAttribute("aug", g1.getAug());
		req.setAttribute("sep", g1.getSep());
		req.setAttribute("oct", g1.getOct());
		req.setAttribute("nov", g1.getNov());
		req.setAttribute("dec", g1.getDec());
		
	
		
		//req.setAttribute("",);
		view.forward(req, resp);
		
	}
}
