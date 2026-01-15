package assignment2;

public class Employee {
	int empId;
	String empName;
	float salary;
	
	Employee(){
		empId=101;
		empName="Selwynraj";
		salary=40000.0f;
	}
	
	void displayDetails() {
		System.out.println("The id of the Employee: "+empId);
		System.out.println("The name of the Employee: "+empName);
		System.out.println("The salary of the Employee: "+salary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.displayDetails();

	}

}