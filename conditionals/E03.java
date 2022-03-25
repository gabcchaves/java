import java.util.Scanner;
public class E03 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a float number: ");
		float number = scn.nextFloat();
		if (number >= 0)
			System.out.println("Square root: " + Math.sqrt(number) + ".");
		else
			System.out.println("Squared: " + Math.pow(number, 2) + ".");
	}
}
