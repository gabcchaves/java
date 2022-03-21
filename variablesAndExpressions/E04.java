import java.util.Scanner;
public class E04 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a float number: ");
		float x = scn.nextFloat();	
		System.out.println("Square: " + Math.pow(x, 2));
	}
}
