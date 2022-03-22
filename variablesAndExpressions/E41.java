import java.util.Scanner;
public class E41 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the value paid for an hour of work: ");
		double hourPrice = scn.nextDouble();
		System.out.printf("Enter the amount of hours worked in a month: ");
		int numHours = scn.nextInt();
		
		double total = hourPrice * numHours;
		total += total / 100 * 10;

		System.out.printf("Total plus 10%%: %.2f.\n", total);
	}
}
