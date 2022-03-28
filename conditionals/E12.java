import java.util.Scanner;
public class E12 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an integer: ");
		int number = scn.nextInt();

		if (number < 0) {
			System.out.println("Invalid number.");
		} else {
			System.out.printf("Logarithm: %.2f.\n", Math.log(number));
		}
	}
}
