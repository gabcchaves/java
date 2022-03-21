import java.util.Scanner;
public class E14 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("Enter an angle in degrees: ");
		double degrees = scn.nextDouble();
		double radians = degrees * (Math.PI / 180);

		System.out.printf("Angle converted to radians: ~ %.2f.\n", radians);
	}
}
