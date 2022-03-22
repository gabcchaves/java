import java.util.Scanner;
public class E52 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		double[] friends = new double[3];
		double totalBet = 0;

		for (int i = 0; i < 3; i++) {
			System.out.printf("%dº friend bet: ", i + 1);
			friends[i] = scn.nextDouble();
			totalBet += friends[i];
		}
		
		// Compute the proportion of each one's bet
		friends[0] /= totalBet / 100;
		friends[1] /= totalBet / 100;
		friends[2] /= totalBet / 100;

		System.out.printf("Enter the total prize value: ");
		double prize = scn.nextDouble();

		friends[0] *= prize / 100;	
		friends[1] *= prize / 100;	
		friends[2] *= prize / 100;	

		for (int i = 0; i < 3; i++) {
			System.out.printf("%dº friend: %.2f.\n", i + 1, friends[i]);
		}
	}
}
