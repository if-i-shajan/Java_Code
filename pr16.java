import java.util.ArrayList;

public class pr16 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.printf("ArrayList Elements: ");
        for (int num : numbers) {
            System.out.printf("%d ", num);
        }
        System.out.printf("\n");
    }
}