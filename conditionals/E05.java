import java.util.Scanner;
public class E05 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an integer: ");
		int number = scn.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Even number.");
		} else {
			System.out.println("Odd number.");
		}
	}
}
