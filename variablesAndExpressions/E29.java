import java.util.Scanner;
public class E29 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter four grades, separated by space: ");
		String input = scn.nextLine();
		String[] grades = input.split("\\s+");

		float sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += Float.parseFloat(grades[i]);	
		}
		float avg = sum / grades.length;
		System.out.println("The arithmetic average: " + avg);
	}
}
