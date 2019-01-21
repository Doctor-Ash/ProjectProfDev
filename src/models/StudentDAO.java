package models;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {

	
	private static Connection getDBConnection()
	{
		   Connection dbConnection = null;

	        try {
	            Class.forName("org.sqlite.JDBC");
	        } catch(ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            String url = "jdbc:sqlite:vehicles.sqlite";
	            dbConnection = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return dbConnection;
	    }
	    
	
	
	public ArrayList <Student> getAllVehicle()  throws SQLException
	{
		System.out.println("Retrieving all vehicles ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "SELECT * FROM vehicles;";
	//	String query = "SELECT * FROM collection;";
	//	Vehicle temp = null;
		ArrayList<Student> VehicleList = new ArrayList<>();

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query); // Execute SQL query and record response to string
			while (result.next())
			{
	            	
				 int vehicle_id = result.getInt("vehicle_id");
				 String make = result.getString("make");
				 String model = result.getString("model");
				 int year = result.getInt("year");
				 int price = result.getInt("price");
				 String license_number = result.getString("license_number");
				 String colour = result.getString("colour");
				 int number_doors= result.getInt("number_doors");
				 String transmission = result.getString("transmission");
				 int mileage = result.getInt("mileage");
				 String fuel_type = result.getString("fuel_type");
				 int engine_size = result.getInt("engine_size");
				 String body_style = result.getString("body_style");
				 String condition = result.getString("condition");
				 String notes = result.getString("notes");
	            	            	        	
	             VehicleList.add(new Student(vehicle_id, make, model, year, price, license_number, colour,number_doors,transmission,mileage,fuel_type,engine_size,body_style,condition,notes));
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (result != null) { result.close(); }
			if (statement != null) { statement.close(); }
			if (dbConnection != null) { dbConnection.close(); }
		}
	
		return VehicleList;
			
	}
	
	public Student getVehicle(int vehicle_id)  throws SQLException
	{
		Student temp = null;
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;

		String query = "SELECT * FROM vehicles WHERE vehicle_id =" + vehicle_id + ";";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery: " + query);
			// execute SQL query
			result = statement.executeQuery(query);

			while (result.next())
			{
	            	
				 int Id = result.getInt("vehicle_id");
				 String make = result.getString("make");
				 String model = result.getString("model");
				 int year = result.getInt("year");
				 int price = result.getInt("price");
				 String license_number = result.getString("license_number");
				 String colour = result.getString("colour");
				 int number_doors= result.getInt("number_doors");
				 String transmission = result.getString("transmission");
				 int mileage = result.getInt("mileage");
				 String fuel_type = result.getString("fuel_type");
				 int engine_size = result.getInt("engine_size");
				 String body_style = result.getString("body_style");
				 String condition = result.getString("condition");
				 String notes = result.getString("notes");
	            	            	            	
	             temp = (new Student(vehicle_id, make, model, year, price, license_number, colour,number_doors,transmission,mileage,fuel_type,engine_size,body_style,condition,notes));
	                }
		}catch(Exception e) {
			System.out.println("vehicles: "+e);
		} finally {
			if (result != null) { result.close(); }
			if (statement != null) { statement.close(); }
			if (dbConnection != null) { dbConnection.close(); }
		}
		return temp;
		
		//return temp;

		
	}
	
	public boolean deleteVehicle(int vehicle_id) throws SQLException
	{
		System.out.println("Deleting vehicle");
		Connection dbConnection = null;
		Statement statement = null;
		int result = 0;
		String query = "DELETE FROM vehicles WHERE vehicle_id = "+vehicle_id + ";";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(query);
			// execute SQL query
			result = statement.executeUpdate(query);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}
		

	
	public boolean insertVehicle(Student in) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement = null;
		
		String update = "INSERT INTO vehicles ( make, model, "
				+ "year, price, license_number, colour, number_doors, "
				+ "transmission, mileage, fuel_type, engine_size, body_style,"
				+ " condition, notes) VALUES"
				+ " ('"+in.getMake()+"',"
				+ "'"+in.getModel()+"',"+in.getYear()+","
				+ "'"+in.getPrice()+"', '"+in.getLicense_number()+"',"
				+ " '"+in.getColour()+"', '"+in.getNumber_doors()+"',"
				+ " '"+in.getTransmission()+"', '"+in.getMileage()+"',"
				+ " '"+in.getFuel_type()+"', '"+in.getEngine_size()+"',"
				+ " '"+in.getBody_style()+"', '"+in.getCondition()+"',"
				+ " '"+in.getNotes()+"');";
		boolean ok = false;
			try {
					dbConnection = getDBConnection();
					statement = dbConnection.createStatement();
					System.out.println(update);
		// execute SQL query
					statement.executeUpdate(update);
					ok = true;
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} finally {
					if (statement != null) {
						statement.close();
					}
					if (dbConnection != null) {
						dbConnection.close();
					}
					
				}
			return ok;
		
	}
	
	public boolean updateVehicle(Student up,int vehicle_id) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement = null;

		String query = "UPDATE collection " + "SET ID = '" + up.getVehicle_id() + "'," + "Make = '" + up.getMake() +"  model " + up.getModel() +" Year " + up.getYear() +"price" + up.getPrice() +" liscense_number"+ up.getLicense_number()+ "colour"+ up.getColour()+"doors"+up.getNumber_doors()+"transmission"+up.getTransmission()+"mileage "+ up.getMileage()+ "fuel_type"+ up.getFuel_type()+"engine_size"+up.getEngine_size()+"Body_syle"+up.getBody_style()+"condition"+up.getCondition()+"notes"+up.getNotes()+ ";";
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(query);
			// execute SQL update
			statement.executeUpdate(query);

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			return false;

		} finally {

			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
		return true;
	}
		
	
}
