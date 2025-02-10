import java.util.Scanner;

public class pr9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n;
		n = input.nextInt();
		int even = 0;
		int odd = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Even count : " + even);
		System.out.println("Odd count : " + odd);
		input.close();
	}
}