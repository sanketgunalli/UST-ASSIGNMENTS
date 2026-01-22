package collections;

import java.util.ArrayList;

public class Assignment5 {
	public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        if (fruits.contains("Apple")) {
            System.out.println("Apple is present");
        } else {
            System.out.println("Apple is not present");
        }
    }
}
