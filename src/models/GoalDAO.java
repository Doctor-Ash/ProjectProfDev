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
	
	
	public boolean insertNew(String username) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement= null;
		String set = "No Goals Set";
		String update = "insert INTO goals (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec, username) "
				+ "Values ('" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + set + "' , '" + username + "');" ;
				
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
	
	
	
	public boolean insertGoal(String month, String username, String goal) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement= null;
		
		String update = "UPDATE goals Set " + month +" = '" + goal + "' WHERE username = '" + username  + "';" ;
				
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
	
	
	public Goal getGoals(String username) throws SQLException {
		Connection dbConnection = null;
		Statement statement= null;
		ResultSet result = null;
		String query = "SELECT * FROM goals WHERE username = '" + username + "';";
		ArrayList<Unit> units = new ArrayList<>();
		Goal g1 = null;
		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			
			String jan = result.getString("Jan");
			String feb = result.getString("Feb");
			String mar = result.getString("Mar");
			String apr = result.getString("Apr");
			String may = result.getString("May");
			String jun = result.getString("Jun");
			String jul = result.getString("Jul");
			String aug = result.getString("Aug");
			String sep = result.getString("Sep");
			String oct = result.getString("Oct");
			String nov = result.getString("Nov");
			String dec = result.getString("Dec");
			
				
			
				
				g1 = new Goal(jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec, username);
				
			
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
		return g1;
	}
	
	
	
}
