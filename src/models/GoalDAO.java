package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GoalDAO {

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
	
	
	
	
	
	public boolean insertGoal(String month, String username, String goal) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement= null;
		
		String update = "UPDATE goals Set " + month +" = '" + goal + "';" ;
				
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
	
	public boolean deleteSkill(int skill_id) throws SQLException
	{
		System.out.println("Deleting skill with id = " + skill_id);
		Connection dbConnection = null;
		Statement statement = null;
		int result = 0;
		String query = "DELETE FROM skill WHERE skill_id = " + skill_id + ";";
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
	
	
	public Boolean updateSkill(Skill up, int skill_id) throws SQLException {
		System.out.println(" Updating skill with id = " + skill_id);
		Connection dbConnection = null;
		Statement statement = null;
		int result = 0;
		String query = "UPDATE skill  = " + skill_id + ";";
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
	
}