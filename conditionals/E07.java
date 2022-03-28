import java.util.Scanner;
public class E07 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter two numbers: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");
		
		double x = Double.parseDouble(inputArray[0]);
		double y = Double.parseDouble(inputArray[1]);
		
		if (x > y) {
			System.out.println("Largest: " + x);
		} else {
			if (y > x) {
				System.out.println("Largest: " + y);
			} else {
				System.out.println("Both are equal.");
			}
		}
	}
}
