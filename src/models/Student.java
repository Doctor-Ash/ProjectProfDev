package models;

import java.util.ArrayList;

public class Student {
	
	private int stu_id; 
	private String first_name;
	private String last_name;
	private int age;
	private String email;
	private String university;
	private String course;

	private String username;
	private String password;
	
	private ArrayList<Skill> skills;
	
	public Student(String first_name, String last_name, int age, String email, String university, 
			String course, String username, String password) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.email = email;
		this.university = university;
		this.course = course;
		this.username = username;
		this.password = password;
	}
	
	public Student()
	{}
	
	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//add a skill to the list of skills associated with this student
	public void addSkill(Skill skill) {
		skills.add(skill);
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

	@Override
	public String toString() {
		return "Student [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", email=" + email
				+ ", university=" + university + ", course=" + course;
	}
	
	
}


