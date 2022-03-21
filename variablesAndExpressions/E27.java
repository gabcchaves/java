import java.util.Scanner;
public class E27 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an area value in hectares: ");
		double hectares = scn.nextDouble();
		double squaredMeters = hectares * 10000;

		System.out.printf("Area converted to squared meters: ~ %.2f.\n", squaredMeters);
	}
}
