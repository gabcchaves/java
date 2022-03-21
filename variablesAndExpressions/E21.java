import java.util.Scanner;
public class E21 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a mass in pounds: ");
		double pounds = scn.nextDouble();
		double kgs = pounds * 0.45;
		
		System.out.printf("Mass converted to kilograms: ~ %.2f.\n", kgs);
	}
}
