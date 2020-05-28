package beakjoon13;

import java.util.Scanner;
public class Hw_2231 {
	private static char[] nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String s = Integer.toString(N);
		
		nums = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			nums[i]=s.charAt(i);
			System.out.println(nums[i]+"->"+((int)nums[i]-48));
		}
		
		System.out.println(add(N))
		
	}
	
	public static int add(int n) {
		if(nums.length==1)
			return 0;
		else {
			return n;
		}
	}
}
