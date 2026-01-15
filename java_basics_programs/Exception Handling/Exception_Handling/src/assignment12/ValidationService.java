package assignment12;

public class ValidationService {

	    public void validateUser(String name, int age)
	            throws InvalidNameException, InvalidAgeException {

	        if (name == null || name.isEmpty()) {
	            throw new InvalidNameException("Name cannot be empty");
	        }

	        if (age < 18) {
	            throw new InvalidAgeException("Age must be 18 or above");
	        }

	        System.out.println("Validation successful");
	    }
}
