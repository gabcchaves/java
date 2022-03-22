import java.util.Scanner;
public class E33 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the size of a square: ");
		double squareSideLength = scn.nextDouble();
		
		System.out.println("Square area: " + Math.pow(squareSideLength, 2));
	}
}
