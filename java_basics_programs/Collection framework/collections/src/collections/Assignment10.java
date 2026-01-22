package collections;

import java.util.HashMap;

public class Assignment10 {
	public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(1, "Anil");
        employees.put(2, "Sunil");
        employees.put(3, "Nikhil");

        employees.remove(2);

        System.out.println(employees);
    }
}
