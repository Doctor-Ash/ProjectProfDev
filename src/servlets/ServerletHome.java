package servlets;

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

import models.Vehicle;
import models.VehicleDAO;



public class ServerletHome extends HttpServlet {

	private static final long serialVersionUID = 1l;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		VehicleDAO dao = new VehicleDAO();
		ArrayList<Vehicle> AllVehicle = dao.getAllVehicle();
	
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		req.setAttribute("AllVehicle", AllVehicle);
		view.forward(req, resp);
		//starts the home page 
	}
	
	
	
}