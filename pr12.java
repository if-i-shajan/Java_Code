import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n;
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        input.close();
    }
}