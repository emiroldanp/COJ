import java.util.Scanner;
public class GeneralElection1003{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int cases = input.nextInt();
			
			for (int cas = 0; cas < cases; cas++) {


				int n = input.nextInt();
				int m = input.nextInt();
				int candidatos[][] = new int[m][n];

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						candidatos[i][j] = input.nextInt();

					}
				}

				int sumas[] = new int[n];



				for (int j = 0; j < n; j++) {
					int sum = 0;
					for (int i = 0; i < m; i++) {
						sum = sum + candidatos[i][j];

					} 
					sumas[j] = sum;
				} 
				int mayor = 0;
				int candidatoGanador = 0;
				 for (int j = 0; j < n; j++) {
				 	if (sumas[j] > mayor) {
				 		mayor = sumas[j];
				 		candidatoGanador = j + 1;

				 	}
				 } 

				 System.out.println(candidatoGanador);
			}
	}
}