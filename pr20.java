import java.util.ArrayList;
import java.util.Collections;

public class pr20 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.printf("Original List: %s\n", numbers);
        Collections.reverse(numbers);
        System.out.printf("Reversed List: %s\n", numbers);
    }
}