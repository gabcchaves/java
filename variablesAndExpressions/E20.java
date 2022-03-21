import java.util.Scanner;
public class E20 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a mass in kilograms: ");
		double kgs = scn.nextDouble();
		double pounds = kgs / 0.45;

		System.out.printf("Mass converted to pounds: ~ %.2f.\n", pounds);
	}
}
