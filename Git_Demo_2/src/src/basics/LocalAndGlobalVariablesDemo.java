package basics;

public class LocalAndGlobalVariablesDemo {
	
	static double marks = 9.5;

	public static void main(String[] args) {

		String course = "java";
		
		System.out.println("value of course in main method is "+course);
		
		System.out.println("value of marks in main method is "+marks);
		
	}

	static void display(){
		
		//System.out.println("value of course in display method is "+course);
		System.out.println("value of marks in display method is "+marks);
	}
	
}
