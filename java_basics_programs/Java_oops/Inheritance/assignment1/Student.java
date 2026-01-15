package assignment1;

public class Student extends Person {
	int rollNo;
	
	void displayDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student RollNo: "+rollNo);
	}
	
	Student(String name,int age,int rollNo){
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
}