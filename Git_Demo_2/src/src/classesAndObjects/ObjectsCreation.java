package classesAndObjects;

public class ObjectsCreation {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp2 = new Employee();
		
		emp.setEmplId(101);
		emp.setEmplName("harsha");
		emp.setGender('M');
		emp.setSalary(9000);
		emp.setBonus(900);
		
		emp2.setEmplId(105);
		emp2.setEmplName("harika");
		emp2.setGender('F');
		emp2.setSalary(8500);
		emp2.setBonus(850);
		
		System.out.println(emp.getEmplId());
		System.out.println(emp.getEmplName());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonus());
		
		System.out.println();
		
		System.out.println(emp2);
		
	}

}
