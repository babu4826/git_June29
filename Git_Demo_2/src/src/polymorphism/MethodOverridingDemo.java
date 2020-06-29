package polymorphism;

public class MethodOverridingDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "harsha", 5000);
		
		Programmer prog = new Programmer(102, "harika", 6000, 10, 30);
		
		// my requirement is to generate 10% of salary as bonus for all the entities
	//	System.out.println("bonus generated for Employee entity is "+emp.getBonus());
	//	System.out.println("bonus generated for Programmer entity is "+prog.getBonus());
		
		// my requirement is to generate 10% of salary for Employee entity and 20% of salary for Programmer entity
		System.out.println("bonus generated for employee entity is "+emp.getBonus());
		System.out.println("bonus generated for Programmer entity is "+prog.getBonus());
		
	}

}
