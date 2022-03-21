import java.util.Scanner;
public class E28 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter three values separated by space: ");
		String input = scn.nextLine();

		String[] values = input.split("\\s+");

		double squareSum = 0;
		for (int i = 0; i < 3; i++) {
			squareSum += Math.pow( Double.parseDouble(values[i]), 2 );
		}
		System.out.printf("Sum of their squares: %.2f.\n", squareSum);
	}
}
