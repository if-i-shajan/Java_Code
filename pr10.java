import java.util.Scanner;

public class pr10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n;
		n = input.nextInt();
		int ok = 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("%d is not a prime number", n);
				ok = 0;
				break;
			}
		}
		if (ok == 1)
			System.out.printf("%d is a prime number ", n);
		input.close();
	}
}