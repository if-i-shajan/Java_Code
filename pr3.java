import java.util.Scanner;

public class pr3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n;
		n = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		input.close();
	}

}