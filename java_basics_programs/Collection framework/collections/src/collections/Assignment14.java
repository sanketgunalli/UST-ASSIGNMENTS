package collections;

import java.util.ArrayList;

public class Assignment14 {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
