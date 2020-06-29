package inheritance;

public class Employee {

	private int emplId;
	private String emplName;
	private char gender;
	
	public Employee() {
		
	}
	public Employee(int emplId, String emplName, char gender) {
		  this.emplId = emplId;
		  this.emplName = emplName;
		  this.gender = gender;
	}
	
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
