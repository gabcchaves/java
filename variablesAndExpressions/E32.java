import java.util.Scanner;
public class E32 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an integer: ");
		int number = scn.nextInt();

		System.out.printf("Sum the successor of its triple and the predecessor of its double: ");
		System.out.printf("%d\n", (number * 3 + 1) + (number * 2 - 1));
	}
}
