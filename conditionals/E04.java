import java.util.Scanner;
public class E04 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an integer: ");
		int number = scn.nextInt();
		if (number >= 0) {
			System.out.println("Squared: " + Math.pow(number, 2));
			System.out.printf("Square root: %.2f\n", Math.sqrt(number));
		} else {
			System.out.println("Invalid number.");
		}
	}
}
