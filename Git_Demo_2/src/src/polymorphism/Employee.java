package polymorphism;

//public final class Employee {
public class Employee {
	
	private int emplId;
	private String emplName;
	private int salary;
	
	public Employee() {
		
	}
	public Employee(int emplId, String emplName, int salary) {
		  this.emplId = emplId;
		  this.emplName = emplName;
		  this.salary = salary;
	}
	
//	final double getBonus(){
	double getBonus(){
		System.out.println("this is getBonus method of Employee java class");
	  double bonus = (salary * 10)/100;
	  return bonus;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
