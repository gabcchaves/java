import java.util.Scanner;
public class E17 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a lenght in centimeters: ");
		double centimeters = scn.nextDouble();
		double inches = centimeters / 2.54;

		System.out.printf("Lenght converted to inches: %.2f.\n", inches);
	}
}
