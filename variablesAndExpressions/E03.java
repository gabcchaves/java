import java.util.Scanner;
public class E03 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		double[] nums = new double[3];
		nums[0] = scn.nextInt();
		nums[1] = scn.nextInt();
		nums[2] = scn.nextInt();

		System.out.println(nums[0] + nums[1] + nums[2]);
	}
}
