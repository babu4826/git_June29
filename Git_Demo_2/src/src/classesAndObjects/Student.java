package classesAndObjects;

// requirement is to carry the information regarding all male employees who joined for same course

public class Student {
	
	private int rollNo;
	private String name;
	private String email;
	private static char gender;
	private static String course;
	
	public static void main(String[] args) {
		
		Student.setGender('M');
		Student.setCourse("java");
		
		Student st = new Student();
		st.setRollNo(50);
		st.setName("harsha");
		st.setEmail("harsha@gmail.com");
		
		Student st2 = new Student();
		st2.setRollNo(60);
		st2.setName("babu");
		st2.setEmail("babu@gmail.com");
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static char getGender() {
		return gender;
	}

	public static void setGender(char gender) {
		Student.gender = gender;
	}

	public static String getCourse() {
		return course;
	}

	public static void setCourse(String course) {
		Student.course = course;
	}
	
	

}
