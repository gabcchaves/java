import java.util.Scanner;
public class E25 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter a length in acres: ");
		double acres = scn.nextDouble();
		double squaredMeters = acres * 4048.58;

		System.out.printf("Length converted to squared meters: ~ %.2f.\n", squaredMeters);
	}
}
