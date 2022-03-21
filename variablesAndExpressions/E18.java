import java.util.Scanner;
public class E18 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a volume in cubic meters: ");
		double cubicMeters = scn.nextDouble();
		double liters = cubicMeters * 1000;

		System.out.printf("Volume converted to liters: %.2f.\n", liters);
	}
}
