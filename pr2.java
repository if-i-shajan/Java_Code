import java.util.Scanner;

public class pr2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a NUmber : ");
		int n;
		n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		input.close();
	}
}