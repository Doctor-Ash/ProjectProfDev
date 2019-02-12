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
	
	public boolean insertStudent(Student in) throws SQLException
	{
		Connection dbConnection = null;
		Statement statement= null;
		
		String update = "INSERT INTO student (stu_id, first_name, last_name, age, email,"
				+ " university, course, username, password) VALUES "
				+ "('"+in.getStu_id()+"','"+in.getFirst_name()+"','"+in.getLast_name()+"',"
						+ "'"+in.getAge()+"', '"+in.getEmail()+"', "
						+ "'"+in.getUniversity()+"', '"+in.getCourse()+"',"
						+ " '"+in.getUsername()+"', '"+in.getPassword()+"')";
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
	
	public boolean deleteStudent(int stu_id) throws SQLException
	{
		System.out.println("Deleting student with id = " + stu_id);
		Connection dbConnection = null;
		Statement statement = null;
		int result = 0;
		String query = "DELETE FROM student WHERE stu_id = " + stu_id + ";";
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
