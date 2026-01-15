package assignment10;

public class StudentAdmission {
	String admissionType;
	
	public StudentAdmission() {
		this.admissionType="General Admission";
	}
	StudentAdmission(String admissionType){
		this.admissionType=admissionType;
	}
	void displayType() {
		System.out.println("Admission Type is: "+admissionType);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAdmission s1=new StudentAdmission();
		s1.displayType();
		StudentAdmission s2 = new StudentAdmission("Merit Admission");
		s2.displayType();

	}

}