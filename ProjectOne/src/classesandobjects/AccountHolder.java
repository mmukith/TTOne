package classesandobjects;

public class AccountHolder {
	
	String firstName;
	String lastName ;
	int age ;
	float accountBalance;
	boolean eligibleForCreditcard;
	
	public void testEligibilityForCreditCard() {
		if (age>21 && accountBalance>=15000 ) {
			eligibleForCreditcard=true;
		}
	}
}
