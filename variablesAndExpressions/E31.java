import java.util.Scanner;
public class E31 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an integer: ");
		int number = scn.nextInt();
		System.out.println("Predecessor: " + (number - 1) + "\nSuccessor: " + (number + 1));
	}
}
