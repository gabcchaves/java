import java.util.Scanner;
public class E09 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a temperature in Celsius: ");
		double celsius = scn.nextDouble();
		double kelvin = celsius + 273.15;

		System.out.printf("Temperature converted to Kelvin: %.2f\n", kelvin);
	}
}
