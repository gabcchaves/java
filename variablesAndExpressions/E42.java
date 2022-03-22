import java.util.Scanner;
public class E42 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the base salary of an employee: ");
		double baseSalary = scn.nextDouble();
		
		double total = baseSalary - baseSalary / 100 * 2;

		System.out.printf("Total to be paid: %.2f.\n", total);
	}
}
