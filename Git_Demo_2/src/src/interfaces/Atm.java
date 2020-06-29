package interfaces;

public interface Atm {
	
	boolean validatePin(int pinNo) ;
	
	int cashWithDrawal(int requestedAmount);
	
	int balaneInquiry();

}
