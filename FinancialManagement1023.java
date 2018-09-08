import java.util.Scanner;

public class FinancialManagement1023{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double number = 0;
		double result = 0;

		for(int i=0; i<12;i++){
			number = in.nextDouble();
			result += number;
	}

	double av = result / 12;

	System.out.println("$" + (double)Math.round(av*100)/100);

	}
}