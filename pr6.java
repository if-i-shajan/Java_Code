import java.util.Scanner;

public class pr6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n;
		n = input.nextInt();
		// m = input.nextInt();
		// int sum=0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
		input.close();
	}
}