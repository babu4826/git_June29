package basics;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {

		displayDesignation(15);
	}
	
	static void displayDesignation(int exp){
		if(exp <= 3) {
			System.out.println("I am working as Junior Level Software Engineer");
		}else if(exp <= 6) {
			System.out.println("I am working as Software Engineer");
		}else if(exp <= 9) {
			System.out.println("I am working as Senior Level Software Engineer");
		}else {
			System.out.println("I am working as Manager");
		}
	}

}
