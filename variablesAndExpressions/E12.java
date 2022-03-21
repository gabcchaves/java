import java.util.Scanner;
public class E12 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a distance in miles: ");
		double miles = scn.nextDouble();
		double km = 1.61 * miles;

		System.out.printf("Distance converted to kilometers: %.2f.\n", km);
	}
}
