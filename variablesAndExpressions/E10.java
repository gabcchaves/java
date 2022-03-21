import java.util.Scanner;
public class E10 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a speed in km/h: ");
		float kmph = scn.nextFloat();
		float mps = kmph / (float) 3.6;

		System.out.println("Speed converted to m/s: " + mps);
	}
}
