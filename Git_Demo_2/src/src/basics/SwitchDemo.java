package basics;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		displayCourseDetails("java");
		System.out.println("Ending of main method");
		
	}
	
	static void displayCourseDetails(String course){
		switch(course) {
			case "HTML" :
				System.out.println("HTML stands for Hyper Text Mark up Language");
				System.out.println("We use HTML to communicate with browser in order to develop web pages");
				break;
			case "CSS" :
				System.out.println("CSS stands for Cascading Style Sheet");
				System.out.println("We use CSS to design web pages");
				break;
			case "JS" :
				System.out.println("JavaScript is a client side programming langauge");
				System.out.println("We use JavaScript to build dynamic web pages");
				break;
			default :
				System.out.println("Please check the input provided");
		}
	
	}

}
