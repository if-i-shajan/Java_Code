import java.util.ArrayList;
import java.util.Scanner;

public class pr18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(12);
        numbers.add(15);
        numbers.add(21);
        System.out.printf("Enter a number to search: ");
        int searchNumber;
        searchNumber = input.nextInt();
        if (numbers.contains(searchNumber)) {
            System.out.printf("%d exists in the list.\n", searchNumber);
        } else {
            System.out.printf("%d does not exist in the list.\n", searchNumber);
        }
        input.close();
    }
}