import java.util.Scanner;
public class E23 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a length in meters: ");
		double meters = scn.nextDouble();
		double yards = meters / 0.91;

		System.out.printf("Length converted to yards: ~ %.2f.\n", yards);
	}
}
