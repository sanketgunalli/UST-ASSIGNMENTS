package assignment4;

public class Manager extends Employee {
	double bonus;
	
	void setBonus(double bonus){
		this.bonus = bonus;
	}
	void totalSalary() {
		System.out.println("The Total Salary is "+(salary + bonus));
	}
}