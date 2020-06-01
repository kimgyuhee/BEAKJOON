package beakjoon10;

import java.util.Scanner;
public class Hw_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count=0;
		int min=0;
		int sum=0;
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
			for(int j=i+1; j<=N; j++) {
				if(j%temp==0)
					nums[j]=0;
			}
		}

		for(int i=M; i<=N; i++) {
			if(nums[i]!=0) {
				if(count==0)
					min=nums[i];
				count++;
				sum+=nums[i];
			}
		}

		if(count==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}

		/*************************************
		for(int i=M; i<=N; i++) {
			if(i==1) {
				continue;
			}
			else if(i==2||i==3||i==5||i==7) {
				count++;
				if(min==0)
					min=i;
				sum+=i;
				continue;
			}
			else if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
				count++;
				if(min==0)
					min=i;
				sum+=i;
			}
			else
				continue;
		}

		if(count==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}

		 ***********************************/
	}

}
