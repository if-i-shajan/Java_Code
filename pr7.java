import java.util.Scanner;

public class pr7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n;
		n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value : " + max);
		input.close();
	}
}