package models;

public class Unit {
	private int unit_id;
	private String unit_name;
	private int grade;
	private String username;
	
	public Unit(String unit_name, int grade, String username) {
		this.unit_name = unit_name;
		this.grade = grade;
		this.username = username;
	}

	public int getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	

}
