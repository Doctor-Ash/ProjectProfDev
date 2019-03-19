package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
* UNIT DAO for connecting to the Database and inserting/updating/deleting units.
* Also used to get information from the database
*
* @author  Lewis, Callum, Josh, Alexander
* @version 1.0
* @since   19/3/2019
*/
public class UnitDAO {

	private static Connection getDBConnection() 
	{
		Connection dbConnection = null;
		
		try 
		{
			Class.forName("org.sqlite.JDBC");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			String databaseURL = "jdbc:sqlite:skills.sqlite";
			dbConnection = DriverManager.getConnection(databaseURL);
			return dbConnection;
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return dbConnection;
	}
	
	public boolean insertUnit(Unit in) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement= null;
		
		String update = "INSERT INTO unit (unit_name, grade,"
				+ " username) VALUES "
				+ "('"+in.getUnit_name()+"','"+in.getGrade()+"',"
						+ "'"+in.getUsername()+"')";
		boolean ok = false;
		
		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(update);
			
			statement.executeUpdate(update);
			ok = true;
		} catch(Exception e)
		{
			e.printStackTrace();
		} finally 
		{
			if (statement != null) 
			{
				statement.close();
			}
			if (dbConnection != null) 
			{
				dbConnection.close();
			}
		}
		return ok;
	}
	
	public boolean deleteUnit(String unit_name, String username) throws SQLException
	{
		System.out.println("Deleting unit with name = " + unit_name);
		Connection dbConnection = null;
		Statement statement = null;
		int result = 0;
		String query = "DELETE FROM unit WHERE unit_name = '" + unit_name + "' AND username = '" + username + "'";
		try {
			dbConnection= getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(query);
			
			result = statement.executeUpdate(query);
		} finally
		{
			if (statement != null) 
			{
				statement.close();
			}
			if (dbConnection != null) 
			{
				dbConnection.close();
			}
		}
		if (result == 1)
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	public ArrayList<Unit> getAllUnits(String username) throws SQLException {
		Connection dbConnection = null;
		Statement statement= null;
		ResultSet result = null;
		String query = "SELECT * FROM unit WHERE username = '" + username + "';";
		ArrayList<Unit> units = new ArrayList<>();
		
		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			
			while(result.next())
			{
				String unit_name = result.getString("unit_name");
				int grade = result.getInt("grade");
				units.add(new Unit
						(
						unit_name,
						grade,
						username
						));
			}
		} catch(Exception e)
		{
			System.out.println("get all units: "+e);
		} finally 
		{
			if (result != null) 
			{
				result.close();
			}
			if (statement != null) 
			{
				statement.close();
			}
			if (dbConnection != null) 
			{
				dbConnection.close();
			}
		}
		return units;
	}
}
