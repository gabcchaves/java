import java.util.Scanner;
public class E30 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a money value in BRL and the dollar exchange rate: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		double usd = Double.parseDouble(inputArray[0]) / Double.parseDouble(inputArray[1]);

		System.out.printf("Value converted to dollars: %.2f.\n", usd);
	}
}
