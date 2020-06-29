package basics;

public class MethodsDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");  // 1
		double r1 = addTwoNumbers(2, 6.5);  // 2 (2, 6.5)  // 7 r1 = 8.5
		System.out.println("value of r1 is "+r1); // 8
		System.out.println("Ending of main method"); // 9
	}
	
	static double addTwoNumbers(int num1, double num2){  // 3 num1=2, num2=6.5
		 System.out.println("Input received are "+num1+" and "+ num2);  // 4
		 double result = num1 + num2;  // 5 result = 8.5
		 return result;  // 6 return 8.5
	}

}
