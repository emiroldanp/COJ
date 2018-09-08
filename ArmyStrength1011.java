import java.util.Scanner;
public class ArmyStrength1011{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x; 
		x = in.nextInt();
		int[] W = new int[x];

		for(int i = 0; i < x; i++) {

			System.out.println();
			int NG = in.nextInt();
			int NM = in.nextInt();

			int[] Godzilla = new int[NG];
			int[] Mecha = new int[NM];
			int mav = 0;

			for(int G = 0; G < NG; G++) {
				Godzilla[G] = in.nextInt();
				if(Godzilla[G] >= mav) {
					mav = Godzilla[G];
					W[i] = 1;
					}
				}

			for(int M = 0; M < NM; M++) {
				Mecha[M] = in.nextInt();
				if(Mecha[M] > mav) {
					mav = Mecha[M];
					W[i] = 2; 
					}	
				}	
		}

		for(int fin = 0; fin < x; fin++){
				if(W[fin] == 1) {
			System.out.println("Godzilla");
			}
			else {
			System.out.println("MechaGodzilla");
			}
			}
	}
}
