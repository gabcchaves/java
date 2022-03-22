import java.util.Scanner;
public class E51 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a point coordinates (x, y), separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		float x = Float.parseFloat(inputArray[0]);
		float y = Float.parseFloat(inputArray[1]);

		float distance = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		System.out.printf("Distance from origin (0, 0): %.1f.\n", distance);
	}
}
