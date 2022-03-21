import java.util.Scanner;
public class E15 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("Enter an angle in radians: ");
		double radians = scn.nextDouble();
		double degrees = radians * (180 / Math.PI);

		System.out.printf("Angle converted to degrees: %.2f.\n", degrees);
	}
}
