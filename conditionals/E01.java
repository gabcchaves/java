import java.util.Scanner;
public class E01 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter two integers, separated by space: ");
		String[] input = scn.nextLine().split("\\s+");
	
		int[] numbers = { Integer.parseInt(input[0]), Integer.parseInt(input[1]) };
		
		if (numbers[0] > numbers[1]) {
			System.out.println("The largest is " + numbers[0]);
		} else {
			if (numbers[0] < numbers[1]) {
				System.out.println("The largest is " + numbers[1]);
			} else {
				System.out.println("Both are equal.");
			}
		}
	}
}
