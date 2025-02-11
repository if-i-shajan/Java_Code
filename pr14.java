import java.util.Scanner;

public class pr14 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n;
        n = input.nextInt();
        int result = factorial(n);
        System.out.printf("Factorial of %d = %d\n", n, result);
        input.close();
    }
}
