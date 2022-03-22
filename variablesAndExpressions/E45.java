import java.util.Scanner;
public class E45 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the height of the step of a stair and the heigtht to be reached, separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double steps = Double.parseDouble(inputArray[1]) / Double.parseDouble(inputArray[0]);

		System.out.printf("To reach the given height, it takes %d steps.\n", (int) steps);
	}
}
