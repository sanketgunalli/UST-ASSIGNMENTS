package collections;

import java.util.HashMap;

public class Assignment8 {
	public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Ravi");
        employees.put(102, "Sita");
        employees.put(103, "Aman");

        System.out.println("Employee 101: " + employees.get(101));
        System.out.println("Employee 102: " + employees.get(102));
    }
}
