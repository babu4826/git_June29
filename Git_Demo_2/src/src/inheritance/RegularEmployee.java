package inheritance;

public class RegularEmployee extends Employee {
	
	private int salary;
	private int bonus;
	
	public RegularEmployee() {
		
	}
	
	public RegularEmployee(int emplId, String emplName, char gender, int salary, int bonus) {
		super(emplId, emplName, gender);  // this stmt is to initialize the memories allocated for parent class properties in child class object
		   this.salary = salary;
		   this.bonus = bonus;
	}
	
	public RegularEmployee(int emplId, String emplName) {
		  this();
		  
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
