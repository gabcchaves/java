import java.util.Scanner;
public class E24 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter an area in squared meters: ");
		double squareMeters = scn.nextDouble();
		double acres = squareMeters * 0.000247;

		System.out.printf("Area converted to acres: ~ %.6f.\n", acres);
	}
}
