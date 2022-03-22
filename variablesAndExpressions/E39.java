import java.util.Scanner;
public class E39 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		double total = 780000;
		double first = total / 100 * 46;
		double second = total / 100 * 32;
		double third = total - first - second;
		System.out.println("A contest has a value of R$ 780,000.00 to divide to 3 winners.");
		System.out.printf("First winner: R$ %.2f.\n", first);
		System.out.printf("Second winner: R$ %.2f.\n", second);
		System.out.printf("Third winner: R$ %.2f.\n", third);
	}
}
