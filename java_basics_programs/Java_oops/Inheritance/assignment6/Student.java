package assignment6;

public class Student extends Person{
	int rollNo;
	
	public Student(String name,int rollNo) {
		super(name);
		this.rollNo = rollNo;
		System.out.println("Student Roll No: "+rollNo);
	}
}