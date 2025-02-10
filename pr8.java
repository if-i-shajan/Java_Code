import java.util.Scanner;

public class pr8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n;
		n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		input.close();
	}
}