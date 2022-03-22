import java.util.Scanner;
public class E40 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the amount of days worked: ");
		int numDays = scn.nextInt();

		double total = numDays * 30;

		System.out.printf("The plumber must receive R$ %.2f.\n", total - (total / 100 * 8));
	}
}
