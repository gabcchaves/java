import java.util.Scanner;
public class E35 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the triangle legs lengths, separate by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double a = Double.parseDouble(inputArray[0]);
		double b = Double.parseDouble(inputArray[1]);

		double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.printf("Hypotenuse length: %.2f.\n", hypotenuse);
	}
}
