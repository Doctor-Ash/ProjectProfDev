import java.sql.SQLException;

import models.Student;
import models.StudentDAO;

public class TestController {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		
		Student lewis = new Student("Lewis", "Frater", 23, "lewis@mail.com",
				"MMU", "Computer Science", "bob123", "apples");
		
		try {
			dao.insertStudent(lewis);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
