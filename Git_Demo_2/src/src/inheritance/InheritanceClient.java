package inheritance;

public class InheritanceClient {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmplId(10);
		emp.setEmplName("harsha");
		emp.setGender('M');
		
		RegularEmployee regEmp = new RegularEmployee();
		regEmp.setEmplId(20);
		regEmp.setEmplName("vijay");
		regEmp.setGender('M');
		regEmp.setSalary(9000);
		regEmp.setBonus(500);
		
		ContractEmployee contEmp = new ContractEmployee();
		contEmp.setEmplId(25);
		contEmp.setEmplName("Goldie");
		contEmp.setGender('F');
		contEmp.setHourlyRate(600);
		contEmp.setDuration(30);		
		
		RegularEmployee regEmp2 = new RegularEmployee(80, "akash", 'M', 8500, 750);
		
	}

}
