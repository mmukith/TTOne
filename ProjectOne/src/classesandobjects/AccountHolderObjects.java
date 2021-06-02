package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder Alex = new AccountHolder() ;
		AccountHolder Brad = new AccountHolder() ;
		AccountHolder Cris = new AccountHolder() ;
		
		Alex.firstName="Alex";
		Alex.lastName="Mendez";
		Alex.age=20;
		Alex.accountBalance=1900;
		Alex.testEligibilityForCreditCard();		
		System.out.println("Is Alex Eligible for CreditCard : "+Alex.eligibleForCreditcard);
	
		Brad.firstName="Brad";
		Brad.lastName="Bendez";
		Brad.age=30;
		Brad.accountBalance=21900;
		Brad.testEligibilityForCreditCard();		
		System.out.println("Is Brad Eligible for CreditCard : "+Brad.eligibleForCreditcard);

		Cris.firstName="Cris";
		Cris.lastName="Cendez";
		Cris.age=10;
		Cris.accountBalance=31900;
		Cris.testEligibilityForCreditCard();		
		System.out.println("Is Cris Eligible for CreditCard : "+Cris.eligibleForCreditcard);

	}
}
