import java.util.Scanner;
public class E50 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter your age and the current year, both separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");
		
		System.out.printf("Birth year: %d.\n", Integer.parseInt(inputArray[1]) - Integer.parseInt(inputArray[0]));
	}
}
