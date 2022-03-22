import java.util.Scanner;
public class E36 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the height anf radius of a cilinder, separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double baseArea = Math.PI * Math.pow( Double.parseDouble(inputArray[1]), 2 );
		double volume = baseArea * Double.parseDouble(inputArray[0]);
		
		System.out.printf("Cilinder volume: %.2f.\n", volume);
	}
}
