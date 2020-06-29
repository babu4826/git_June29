package basics;

public class IterativeStmtsDemo {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			System.out.println("Hi Hello !! "+i);
		}
		
		System.out.println();
		
		int j=1;
		while(j<=3) {
			System.out.println("value of j in while loop is "+j);
			j++;
		}
		
		System.out.println();
		
		int k=1;
		do {
			System.out.println("value of k in do loop is "+k);;
			k++;
		}while(k<=3);
		
	}

}
