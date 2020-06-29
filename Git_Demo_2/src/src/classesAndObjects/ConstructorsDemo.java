package classesAndObjects;

public class ConstructorsDemo {

	public static void main(String[] args) {

		Employee obj1 = new Employee();
		
		Employee obj2 = new Employee(10, "Goldie", 'F', 8500, 850);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
