package assignment12;

public class App12 {

	public static void main(String[] args) {
		   ValidationService service = new ValidationService();

	        try {
	            service.validateUser("", 16);
	        }
	        catch (InvalidNameException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
