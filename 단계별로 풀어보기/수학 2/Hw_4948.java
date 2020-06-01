package beakjoon10;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int count=0;
		String s="";
		ArrayList<Integer> list = new ArrayList<Integer>();
		do {
			count=0;
			n=sc.nextInt();
			
			if(n==0)
				break;
			
			int[] nums = new int[2*n+1];
			
			for(int i=2; i<=2*n; i++)
				nums[i]=i;
			
			for(int i=2; i<=Math.sqrt(2*n); i++) {
				if(nums[i]==0)
					continue;
				int temp=i;
				for(int j=i+1; j<=2*n; j++) {
					if(j%temp==0)
						nums[j]=0;
				}
				
			}
			
			for(int i=n+1; i<=2*n; i++) {
				if(nums[i]!=0)
					count++;
			}
			
			list.add(count);
			
		}while(n!=0);

		for(int i : list) {
			System.out.println(i);
		}
	}
}
