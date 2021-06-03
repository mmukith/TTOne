package exeption;

public class ExceptionHandlingExFn {
	
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void demo()throws Exception {
		
		System.out.println("This is first message ...");
		throw new ArithmeticException("not valid operation ..."); // using throw key word deliberately i am giving exception line 17 18 became unreachable code
		//int i = 1/0; 
		//System.out.println("This is Second message ....");
		
	}

}
