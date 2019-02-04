package models;

import java.util.ArrayList;

public class Skill {
	private String name;
	private String description;
	private int currentRating;
	private ArrayList<Integer> prevRatings;
	private Student student;
	
	public Skill(String name, String description, int currentRating, Student s) {
		this.name = name;
		this.description = description;
		this.currentRating = currentRating;
		this.student = s;
		
		prevRatings.add(currentRating);
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

	public void changeRating(int r) {
		this.currentRating = r;
		prevRatings.add(r);
	}
	
	//returns an array list of all the previous ratings for this skill and student
	public ArrayList<Integer> getRatings() {
		return prevRatings;
	}
	
	@Override
	public String toString() {
		return "Skill [name=" + name + ", description=" + description + ", currentRating=" + currentRating
				+ ", prevRatings=" + prevRatings + "]";
	}
}
