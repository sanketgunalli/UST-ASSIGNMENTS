package collections;

import java.util.HashSet;

public class Assignment7 {
	public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
