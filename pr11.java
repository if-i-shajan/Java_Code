import java.util.Scanner;

public class pr11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n;
		n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
		input.close();
	}

}