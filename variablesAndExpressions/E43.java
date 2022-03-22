import java.util.Scanner;
public class E43 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a total to be paid: ");
		double total = scn.nextDouble();
		double totalWithDiscount = total - (total / 100 * 10);

		System.out.printf("Total with 10%% discount: %.2f.\n", totalWithDiscount);
		System.out.printf("Value of each portion (3x): %.2f.\n", total / 3);
		System.out.printf("Vendor commission, if paid in cash: %.2f.\n", totalWithDiscount / 100 * 5);
		System.out.printf("Vendor commission, if paid in installments: %.2f.\n", total / 100 * 5);
	}
}
