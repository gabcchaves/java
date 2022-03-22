import java.util.Scanner;
public class E37 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the price of a product: ");
		double price = scn.nextDouble();
		double discount = price / 100 * 12;

		System.out.printf("Price with 12%% discount: %.2f.\n", price - discount);
	}
}
