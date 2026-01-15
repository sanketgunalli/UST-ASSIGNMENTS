package assignment9;

public class Admission {
	private int mark;
	private char grade;
	 
	public void setMark(int mark) {
		this.mark = mark;
		if(mark>=90) {
			grade='A';
		}
		else if(mark>=75) {
			grade='B';
		}
		else if(mark>=60) {
			grade='C';
		}
		else {
			grade='D';
		}
	}
	
	public void displayResult() {
		System.out.println("Mark: "+mark);
		System.out.println("Grade "+grade);
	}
}