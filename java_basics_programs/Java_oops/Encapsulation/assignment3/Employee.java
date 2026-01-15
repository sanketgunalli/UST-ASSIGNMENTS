package assignment3;

public class Employee {
	private int empId;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Salary must be greater than zero");
		}
	}
	public void displaySalary() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee salary is: "+salary);
	}
	
	
}