import java.util.Scanner;
public class E09 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the salary: ");
		double salary = scn.nextDouble();
		System.out.printf("Enter the installment value: ");
		double installment = scn.nextDouble();
		
		if (installment < (20 * salary / 100)) {
			System.out.println("Loan granted.");
		} else {
			System.out.println("Loan denied.");
		}
	}
}
