import java.util.ArrayList;

public class pr17 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        System.out.printf("Original List: %s\n", numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.printf("List after removing even numbers: %s\n", numbers);
    }
}