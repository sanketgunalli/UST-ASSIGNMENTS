package collections;

import java.util.ArrayList;

public class Assignment15 {
	public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Mickey");

        String[] array = names.toArray(new String[0]);

        for (String name : array) {
            System.out.println(name);
        }
    }
}
