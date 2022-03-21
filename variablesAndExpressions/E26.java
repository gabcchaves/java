import java.util.Scanner;
public class E26 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an area in squared meters: ");
		double squaredMeters = scn.nextDouble();
		double hectares = squaredMeters * 0.0001;

		System.out.printf("Area converted to hectares: ~ %.2f.\n", hectares);
	}
}
