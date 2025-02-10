import java.util.Scanner;

public class pr4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n;
		n = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", n, i, i * n);
		}
		input.close();
	}
}