package beakjoon;

import java.util.Scanner;
public class BJ_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		int n=0;
		int[] output = new int[11];
		
		output[1]=1;
		output[2]=2;
		output[3]=4;
		
		for(int i =0; i<T; i++) {
			
			do {
				n=sc.nextInt();
			}while(!(n>0&&n<11));


			for(int j=4; j<=n; j++) {
				output[j]=output[j-1]+output[j-2]+output[j-3];
			}
			
			System.out.println(output[n]);
			
		}
		
	}
}
