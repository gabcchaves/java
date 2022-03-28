import java.util.Scanner;

public class E06 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter two integers, separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double x = Integer.parseInt(inputArray[0]);
		double y = Integer.parseInt(inputArray[1]);

		if (x > y)
			System.out.println("Largest: " + x);
		else
			System.out.println("Largest: " + y);

		System.out.println("Difference: " + Math.abs(x - y));
	}
}
