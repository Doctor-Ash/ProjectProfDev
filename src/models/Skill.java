package models;

import java.util.ArrayList;
import java.util.Date;

public class Skill {
	private int skill_id;
	private String skill_name;
	private String description;
	private int rating;
	private Student student;
	private String date;
	
	public Skill(String skill_name, String description, int rating, String date, Student s) {
		this.skill_name = skill_name;
		this.description = description;
		this.rating = rating;
		this.student = s;
		this.date = date;
		
		//adds this skill to the student who created it
		//s.addSkill(this);
	}
	
	public String getUsername() {
		return student.getUsername();
	}

	public int getSkill_id() {
		return skill_id;
	}



	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}



	public String getSkill_name() {
		return skill_name;
	}



	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getskill_name() {
		return skill_name;
	}

	public void setskill_name(String skill_name) {
		this.skill_name = skill_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Skill [skill_name=" + skill_name + ", description=" + description + ", currentRating=" + rating;
	}
}
