package models;

import java.util.ArrayList;
import java.util.Date;

public class Skill {
	private String name;
	private String description;
	private int rating;
	private Student student;
	private Date date;
	
	public Skill(String name, String description, int rating, Student s) {
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.student = s;
		
		//adds this skill to the student who created it
		s.addSkill(this);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Skill [name=" + name + ", description=" + description + ", currentRating=" + rating;
	}
}
