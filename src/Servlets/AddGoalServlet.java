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

public class AddGoalServlet extends HttpServlet  {
	
	static final long serialVersionUID = 1L;
	
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		RequestDispatcher view =req.getRequestDispatcher("addSkill.jsp");
		view.forward(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			
			
			HttpSession session =req.getSession(); //used to check whether user is logged in
			String user = (String) session.getAttribute("username");
			
			//StudentDAO dao = new StudentDAO();
			SkillDAO skilldao = new SkillDAO();
			
			
			//password manager
		
			String skill =  "Commuication";
			int communicationRating = (Integer.parseInt(req.getParameter("selectCommunicationRating")));
			String communicationDesc = req.getParameter("Communicationdescription");
			Skill Communication = new Skill("Communication", communicationDesc, communicationRating, user);
			
			
			int TeamworkRating = (Integer.parseInt(req.getParameter("selectTeamworkRating")));
			String TeamworkDesc = req.getParameter("Communicationdescription");
			Skill Teamwork = new Skill("TeamWork", TeamworkDesc, TeamworkRating, user);
			
			int OrganisationRating = (Integer.parseInt(req.getParameter("selectOrganisationRating")));
			String OrganisationDesc = req.getParameter("Organisationdescription");
			Skill Organisation = new Skill("Organisation", OrganisationDesc, OrganisationRating, user);
			
			int TimeManagementRating = (Integer.parseInt(req.getParameter("selectTimemanagementRating")));
			String TimeManagementDesc = req.getParameter("Timemanagementdescription");
			Skill TimeManagement = new Skill("TimeManagement", TimeManagementDesc, TimeManagementRating, user);
			
			int PersonalDevelopmentRating = (Integer.parseInt(req.getParameter("selectPersonaldevelopmentRating")));
			String PersonalDevelopmentDesc = req.getParameter("Personaldevelopmentdescription");
			Skill PersonalDevelopment = new Skill("PersonalDevelopment", PersonalDevelopmentDesc, PersonalDevelopmentRating, user);
			 
			 
			
			
			//int rating = (Integer.parseInt(req.getParameter("selectRating")));
			//String description = req.getParameter("description");
			//System.out.println(rating + description + skill + user);
			
			//Skill s = new Skill(skill, description, rating, user);
			
			try {
				skilldao.insertSkill(Communication);
				skilldao.insertSkill(Teamwork);
				skilldao.insertSkill(Organisation);
				skilldao.insertSkill(TimeManagement);
				skilldao.insertSkill(PersonalDevelopment);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			resp.sendRedirect("showskills");	
		
		
		
	}
}
