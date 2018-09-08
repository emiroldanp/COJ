import java.util.Scanner;
public class Sum1049{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = 0;
		int sum = 0;

		n = in.nextInt();

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				sum = sum + i;
				}
			} else if (n <= 1) {
				for (int j = 1; j >= n; j--) {
					sum = sum + j;
				}
			}

			System.out.println(sum);

	}
}