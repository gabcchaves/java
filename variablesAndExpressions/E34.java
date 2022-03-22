import java.util.Scanner;
public class E34 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the radius length of a circle: ");
		double radius = scn.nextDouble();

		System.out.printf("Circle area: %.2f.\n", Math.PI * Math.pow(radius, 2));
	}
} 
