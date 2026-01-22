package collections;

import java.util.ArrayList;

public class Assignment4 {
	 public static void main(String[] args) {
	        ArrayList<String> courses = new ArrayList<>();

	        courses.add("Java");
	        courses.add("Python");
	        courses.add("Web Development");
	        courses.add("Data Science");
	        courses.add("AI");

	        for (String course : courses) {
	            System.out.println(course);
	        }
	    }
}
