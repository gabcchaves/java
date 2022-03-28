import java.util.Scanner;
public class E10 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the height and sex (M/F), separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double height = Double.parseDouble(inputArray[0]);
		
		if (inputArray[1].charAt(0) == 'M') {
			System.out.printf("Ideal weight: %.2f.\n", (72.7 * height) - 58);
		} else {
			if (inputArray[1].charAt(0) == 'F') {
				System.out.printf("Ideal weight: %.2f.\n", (62.1 * height) - 44.7);
			} else {
				System.out.println("Invalid sex.");
			}
		}
	}
}
