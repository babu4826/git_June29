package polymorphism;

public class SuperClassRefAndSubClassObjRules {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Programmer prog = new Programmer();
		
		// RULE 1 : Super class ref variable can be assigned with child class object 
				// where as child class variable cannot be assigned with parent class object
		Employee emp2 = new Programmer();
	//	Programmer prog2 = new Employee();
		
		// RULE 2 : When we assign child class object to parent class variable then 
				// using parent class variable we can call only the methods present in parent class
			emp2.getEmplId();
			emp2.getEmplName();
			emp2.getSalary();
			emp2.getBonus();
		//	emp2.getNoOfIssuesResolved();
			
	  // RULE 3 : When we assign child class object to parent class variable then 
					// using parent class variable when we call overridden method then 
							// child class overridden method gets executed
		  emp2.getBonus();
	}

}
