package classesAndObjects;

public class Employee {
	
	private int emplId;
	private String emplName;
	private char gender;
	private int salary;
	private int bonus;
	
	Employee(){
		
	}
	
	Employee(int emplId, String emplName, char gender, int salary, int bonus){
		 this.emplId = emplId;
		 this.emplName = emplName;
		 this.gender = gender;
		 this.salary = salary;
		 this.bonus = bonus;
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmplId(101);
		emp.setEmplName("harsha");
		emp.setGender('M');
		emp.setSalary(9000);
		emp.setBonus(900);
		
		System.out.println(emp.getEmplId());
		System.out.println(emp.getEmplName());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonus());
		
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

	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", emplName=" + emplName + ", gender=" + gender + ", salary=" + salary
				+ ", bonus=" + bonus + "]";
	}

}
