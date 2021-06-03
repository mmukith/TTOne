package exeption;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		
		try {
		System.out.println("This is first message ...");
		int i = 1/0; 
		System.out.println("This is Second message ....");
		}
		catch(Exception exp) {
			
			System.out.println("This message printing from CATCH block ...");
			System.out.println("Message is  : "+ exp.getMessage());
			System.out.println("Cause is  : " + exp.getCause());
			exp.printStackTrace();
		}
		
		finally {
			System.out.println("Message printing from FINALLY ");
			
		}
	}
	
}
