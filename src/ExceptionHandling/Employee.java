package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
		    int i = 9/0;
		}
		catch(Exception e) {
			
			System.out.println("AE is Coming ...");
			e.printStackTrace();
        }
		
		System.out.println("Bye");

		
	
	}

}
