package collections;

import java.util.ArrayList;

public class Assignment1 {
	 public static void main(String[] args) {
	        ArrayList<String> students = new ArrayList<>();

	        students.add("Rahul");
	        students.add("Amit");
	        students.add("Priya");
	        students.add("Neha");
	        students.add("Karan");

	        for (int i = 0; i < students.size(); i++) {
	            System.out.println(students.get(i));
	        }
	    }
}
