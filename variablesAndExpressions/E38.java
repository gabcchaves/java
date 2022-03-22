import java.util.Scanner;
public class E38 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Ente an employee salary: ");
		double salary = scn.nextDouble();
		double raise = salary / 100 * 25;

		System.out.printf("New salary with a 25%% raise: %.2f.\n", salary + raise);
	}
}
