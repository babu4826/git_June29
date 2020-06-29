package polymorphism;

public class Programmer extends Employee {
	
	private int noOfIssuesResolved;
	private int noOfIssuesAssigned;
	
	public Programmer() {
		
	}
	public Programmer(int emplId, String emplName, int salary, int noOfIssuesResolved, int noOfIssuesAssigned) {
		  super(emplId, emplName, salary);
		  this.noOfIssuesAssigned = noOfIssuesAssigned;
		  this.noOfIssuesResolved = noOfIssuesResolved;
	}
	
	double getBonus(){
		System.out.println("this is getBonus method from Programmer java class");
		  int salary = getSalary();
		  double bonus = (salary * 20)/100;
		  return bonus;
	}
	
	public int getNoOfIssuesResolved() {
		return noOfIssuesResolved;
	}
	public void setNoOfIssuesResolved(int noOfIssuesResolved) {
		this.noOfIssuesResolved = noOfIssuesResolved;
	}
	public int getNoOfIssuesAssigned() {
		return noOfIssuesAssigned;
	}
	public void setNoOfIssuesAssigned(int noOfIssuesAssigned) {
		this.noOfIssuesAssigned = noOfIssuesAssigned;
	}

}
