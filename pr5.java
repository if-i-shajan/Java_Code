import java.util.Scanner;

public class pr5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two Number : ");
		int n, m;
		n = input.nextInt();
		m = input.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				System.out.println(i);
				break;
			}
		}
		input.close();
	}
}