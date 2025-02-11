import java.util.ArrayList;
import java.util.Collections;

public class pr19 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(42);
        numbers.add(12);
        numbers.add(89);
        numbers.add(33);
        numbers.add(5);
        System.out.printf("Original List: %s\n", numbers);
        Collections.sort(numbers);
        System.out.printf("Sorted List: %s\n", numbers);
    }
}