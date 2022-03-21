import java.util.Scanner;
public class E11 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a speed in m/s: ");
		float mps = scn.nextFloat();
		float kmph = mps * (float) 3.6;

		System.out.println("Speed converted to km/h: " + kmph);
	}
}
