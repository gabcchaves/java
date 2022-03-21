import java.util.Scanner;
public class E07 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a temperature in Fahrenheit: ");
		float fahrenheit = scn.nextFloat();
		float celsius = 5 * (fahrenheit - 32) / 9;

		System.out.println("Temperature converted to Celsius: " + celsius);
	}
}
