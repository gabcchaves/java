import java.util.Scanner;
public class E13 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a distance in kilometers: ");
		double km = scn.nextDouble();
		double miles = km / 1.61;

		System.out.printf("Distance converted to miles: %.2f.\n", miles);
	}
}
