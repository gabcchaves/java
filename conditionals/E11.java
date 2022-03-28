import java.util.Scanner;
public class E11 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		int number = 0;
		do {
			System.out.printf("Enter a non-zero integer: ");
			number = scn.nextInt();
		} while (number == 0);

		int sum = 0;
		String numStr = Integer.toString(number);
		for (int i = 0; i < numStr.length(); i++) {
			sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));	
		}
		System.out.println("Sum of its algarisms: " + sum);
	}
}
