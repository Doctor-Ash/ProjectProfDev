import java.sql.SQLException;
import java.util.ArrayList;

import models.Skill;
import models.SkillDAO;
import models.Student;
import models.StudentDAO;

public class TestController {

	public static void main(String[] args) {
		
		StudentDAO studentDao = new StudentDAO();
		SkillDAO skillDao = new SkillDAO();
		ArrayList<Skill> allSkills = new ArrayList<Skill>();
		
		Student lewis = new Student("Lewis", "Frater", 23, "lewis@mail.com",
				"MMU", "Computer Science", "bob123", "apples");
		
		//Skill comms = new Skill("Communication", "description", 8,  "bob123");
		
		// ########STUDENT INSERT TEST############ PASSED 12/02, LF
		 /* try {
			studentDao.insertStudent(lewis);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//##########STUDENT DELETE TEST############ PASSED 12/02, LF
		/*
		try {
			studentDao.deleteStudent(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//#################Skills retrieve for a given username
		
		try {
			allSkills = skillDao.getAllSkills(lewis.getUsername());
			for(Skill s : allSkills) {
				System.out.println(s.getSkill_name());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		//#############SKILLS INSERT TEST################# PASSED 12/02, LF
		
		/*try {
			skillDao.insertSkill(comms);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//###############SKILLS DELETE TEST#################
		/*
		try {
			skillDao.deleteSkill(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
