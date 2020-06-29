package basics;

public class MethodsDemo_2 {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		int r1 = multiplyTwoNumbers(2, 3);
		System.out.println("value of r1 is "+r1);
		
		System.out.println();
		
		int r2 = multiplyTwoNumbers(5, 6);
		System.out.println("value of r2 is "+r2);
		
		System.out.println();
		
		displayDetails(10, "sai", 9000);
		
		System.out.println("Ending of main method");
		
	}
	
	static int multiplyTwoNumbers(int num1, int num2){
		 System.out.println("input received are "+num1 +" and "+num2);
		 int result = num1 * num2;
		 return result;
	}

	static void displayDetails(int id, String name, int salary){
		 System.out.println("value of id is "+id);
		 System.out.println("value of name is "+name);
		 System.out.println("value of salary is "+salary);
	}
	
}
