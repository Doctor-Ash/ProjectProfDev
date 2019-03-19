import java.sql.SQLException;
import java.util.ArrayList;

import models.Skill;
import models.SkillDAO;
import models.Student;
import models.StudentDAO;
import models.Unit;
import models.UnitDAO;

/**
* This is the second controller that is just for testing purposes so we can test the DAO's once they are made.
*
* @author  Lewis, Callum, Josh, Alexander
* @version 1.0
* @since   19/3/2019
*/

public class TestController {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();
		SkillDAO skillDAO = new SkillDAO();
		UnitDAO unitDAO = new UnitDAO();
		ArrayList<Skill> allSkills = new ArrayList<Skill>();
		ArrayList<Unit> allUnits = new ArrayList<Unit>();
		
		Student lewis = new Student("Lewis", "Frater", 23, "lewis@mail.com",
				"MMU", "Computer Science", "bob123", "apples");
		Unit advProg = new Unit("Advanced Programming", 83, lewis.getUsername());
		
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
		
		//#################Skills retrieve for a given username########### PASSED 18/03 LF
		
		/*try {
			allSkills = skillDao.getAllSkills(lewis.getUsername());
			for(Skill s : allSkills) {
				System.out.println(s.getSkill_name());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}*/
		
		//#############SKILLS INSERT TEST################# PASSED 12/02, LF
		
		/*try {
			skillDao.insertSkill(comms);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//###############SKILLS DELETE TEST################# PASSED 18/03 LF
		/*
		try {
			skillDao.deleteSkill(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//####################UNIT INSERT TEST####################### PASSED 18/03 LF
		/*try {
			unitDAO.insertUnit(advProg);
		} catch(SQLException e) {
			e.printStackTrace();
		}*/
		
		//########################UNIT DELETE TEST###################### PASSED 18/03 LF
		/*try {
			unitDAO.deleteUnit("1", "LewisFrater");
		} catch(SQLException e) {
			e.printStackTrace();
		}*/
		
		//#####################RETRIEVE UNITS FOR GIVEN USERNAME############## PASSED 18/03 LF
		/*try {
			allUnits = unitDAO.getAllUnits(lewis.getUsername());
			for(Unit u : allUnits) {
				System.out.println(u.getUnit_name());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}*/
		
		//#######################retrieve all skills of same name#################### PASSED 19/03 LF
		/*try {
			allSkills = skillDAO.getParticularSkills(lewis.getUsername(), "Communication");
			for(Skill s : allSkills) {
				System.out.println("Skill = "+s.getSkill_name() + "\nRating = "+s.getRating() + "\nDate = " + s.getDate());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}*/
	}

}
