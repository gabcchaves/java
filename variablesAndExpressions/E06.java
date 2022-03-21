import java.util.Scanner;
public class E06 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a temperature in Celsius: ");
		float celsius = scn.nextFloat();
		float fahrenheit = celsius * (9 / 5) + 32;

		System.out.println("Temperature converted to Fahrenheit: " + fahrenheit);
	}
}
