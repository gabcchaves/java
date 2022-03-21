import java.util.Scanner;
public class E22 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a length in yards: ");
		double yards = scn.nextDouble();
		double meters = yards * 0.91;

		System.out.printf("Length converted to meters: ~ %.2f.\n", meters);
	}
}
