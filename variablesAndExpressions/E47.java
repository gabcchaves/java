import java.util.Scanner;
public class E47 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		int number;	
		do {
			System.out.printf("Enter a four digit integer: ");
			number = scn.nextInt();
		} while (number < 1000 || number > 9999);

		for (int i = 0; i < 4; i++) {
			System.out.println( Integer.toString(number).charAt(i) );
		}
	}
}
