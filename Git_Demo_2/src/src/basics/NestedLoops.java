package basics;

public class NestedLoops {

	public static void main(String[] args) {

		int noOfRows = 5;
		
		for(int rowCount=1; rowCount<=noOfRows; rowCount++) {
			 for(int columnCount=1; columnCount<=rowCount; columnCount++) {
				 System.out.print(" * ");
			 }
			 System.out.println();
		}
		
	}

}
