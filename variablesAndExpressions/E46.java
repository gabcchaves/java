import java.util.Scanner;
public class E46 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		int number;
		do {
			System.out.printf("Enter a three digit integer: ");
			number = scn.nextInt();
		} while(number < 100 || number > 999);

		StringBuffer reverse = new StringBuffer( Integer.toString(number) );

		System.out.println("Reverse sequence of digits: " + reverse.reverse());
	}
}
