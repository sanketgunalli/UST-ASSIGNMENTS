package assignment1;

public class Student {
	int id=1;
	String name="selwyn";
	
	void displayDetails() {
		System.out.println("The id of the student: "+id);
		System.out.println("The name of the student: "+name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayDetails();
	}
}