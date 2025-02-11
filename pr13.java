import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n;
        n = input.nextInt();
        int first = 0, second = 1, next;
        System.out.printf("%d %d ", first, second);
        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.printf("%d ", next);
            first = second;
            second = next;
        }
        System.out.printf("\n");
        input.close();
    }
}