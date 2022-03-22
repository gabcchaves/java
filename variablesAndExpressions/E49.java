import java.util.Scanner;
public class E49 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.printf("Enter the start time (HH:MM:SS) and the duration in seconds, separated by space: ");
		String input = scn.nextLine();
		String[] inputArray = input.split("\\s+");

		int[] time = new int[3];
		time[0] = Integer.parseInt(inputArray[0]);
		time[1] = Integer.parseInt(inputArray[1]);
		time[2] = Integer.parseInt(inputArray[2]);

		int seconds = time[0] * 60 * 60 + time[1] * 60 + time[2] + Integer.parseInt(inputArray[3]);

		time[2] = seconds % 60;
		time[1] = seconds / 60 % 60;
		time[0] = seconds / 60 / 60;	
	
		System.out.printf("End time: %02d:%02d:%02d.\n", time[0], time[1], time[2]);
	}
}
