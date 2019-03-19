package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.GoalDAO;
import models.Skill;
import models.SkillDAO;
import models.Student;
import models.StudentDAO;


public class CreateAccountServlet extends HttpServlet  {
	
	static final long serialVersionUID = 1L;
	
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,IOException
	{
		RequestDispatcher view =req.getRequestDispatcher("createAccount.jsp");
		view.forward(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			
			StudentDAO dao = new StudentDAO();
			GoalDAO goalsdao = new GoalDAO();
			
		
		String firstName = (String) req.getParameter("firstName");
		String lastName = (String) req.getParameter("lastName");
		String username = (String) req.getParameter("username");
		int age = (Integer.parseInt(req.getParameter("age")));
		String email = (String) req.getParameter("email");
		String university = (String) req.getParameter("university");
		String course = (String) req.getParameter("course");
		String password = (String) req.getParameter("password");
		
		
		Student s = new Student(firstName, lastName, age, email, university, course, username, password);
		
		

		try {
			boolean done = dao.insertStudent(s);
			System.out.println(done);
			System.out.println(s);
			if(done) {
				goalsdao.insertNew(username);
				resp.sendRedirect("index.jsp");
			}}
			catch (SQLException e) {
				e.printStackTrace();
			}
		//RequestDispatcher view =req.getRequestDispatcher("createAccount.jsp");
		//view.forward(req,resp);
		
		
	}
}
