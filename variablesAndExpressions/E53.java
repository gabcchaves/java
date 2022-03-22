import java.util.Scanner;
public class E53 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("Enter the length and the width of a land: ");
		String[] landSize = scn.nextLine().split("\\s+");
		System.out.printf("Enter the price of screen, for fencing the land: ");
		double fencePrice = scn.nextDouble();
	
		double cost = fencePrice * Double.parseDouble(landSize[0]) * 2 + fencePrice * Double.parseDouble(landSize[1]) * 2;
	
		System.out.printf("Cost to fence the land: %.2f.\n", cost);
	}
}
