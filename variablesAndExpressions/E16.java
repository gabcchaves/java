import java.util.Scanner;
public class E16 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a lenght in inches: ");
		double inches = scn.nextDouble();
		double centimeters = inches * 2.54;

		System.out.printf("Lenght converted to centimeters: %.2f.\n", centimeters);
	}
}
