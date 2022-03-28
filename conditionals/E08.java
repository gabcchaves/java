import java.util.Scanner;
public class E08 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter two valid grades, separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double a = Double.parseDouble(inputArray[0]);
		double b = Double.parseDouble(inputArray[1]);

		if (a < 0 || a > 10 || b < 0 || b > 10) {
			System.out.println("Invalid grades.");
		} else {
			System.out.println("Average: " + (a + b) / 2);	
		}
	}
}
