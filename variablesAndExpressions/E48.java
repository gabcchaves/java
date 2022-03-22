import java.util.Scanner;
public class E48 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		int[] time = new int[3];
		System.out.printf("Enter a time length in seconds: ");
		time[0] = scn.nextInt();
		time[1] = time[0] / 60;	
		time[2] = time[1] / 60;
		time[0] = time[0] % 60;

		System.out.printf("Time: %02d:%02d:%02d.\n", time[2], time[1], time[0]);
	}
}
