package beakjoon10;

import java.util.Scanner;
public class Hw_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		
		int[] nums = new int[N+1];
		for(int i=2; i<=N; i++) {
			nums[i]=i;
		}
		
		
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(nums[i]==0)
				continue;
			
			int temp=i;
			for(int j = i+1; j<=N; j++) {
				if(j%temp ==0)
					nums[j]=0;
			}
			
		}
		
		for(int i=M; i<=N; i++) {
			if(nums[i]!=0)
				System.out.println(nums[i]);
		}
		
		/**********************************
		for(int i=M; i<=N; i++) {
			if(i==1) {
				continue;
			}
			else if(i==2||i==3||i==5||i==7) {
				System.out.println(i);
			}
			else if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
				System.out.println(i);
			}
			else
				continue;
		}
		
		**********************************/
	}

}
