import java.util.Scanner;
public class E19 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a volume in liters: ");
		double liters = scn.nextDouble();
		double cubicMeters = liters / 1000;
		
		System.out.printf("Volume converted to cubic meters: %.2f.\n", cubicMeters);
	}
}
