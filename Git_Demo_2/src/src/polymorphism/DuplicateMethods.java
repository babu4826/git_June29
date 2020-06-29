package polymorphism;

public class DuplicateMethods {
	
	public static void main(String[] args) {
		
		String course = "java";
		
		//String course = "html";
		
		DuplicateMethods obj = new DuplicateMethods();
		obj.multiplyTwoNumbers(20, 3);
		
	}
	
	int multiplyTwoNumbers(int num1, int num2){
		  int result = num1 * num2;
		  return result;
	}
	
	double multiplyTwoNumbers(int num1, double num2){
		double result = num1 * num2;
		return result;
	}
	
	/*void multiplyTwoNumbers(int num1, int num2){
		
	}*/

}
