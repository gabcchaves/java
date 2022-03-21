import java.util.Scanner; 
public class E08 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a temperature in Kelvin: ");
		double kelvin = scn.nextDouble();
		double celsius = kelvin - 273.15;

		System.out.printf("Temperature converted to Celsius: %.2f\n", celsius);
	}
}
