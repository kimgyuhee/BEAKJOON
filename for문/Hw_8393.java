package beakjoon3;

import java.util.Scanner;

public class Hw_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n;
		int sum=0;
		
		do {
			n=scr.nextInt();
		}while(!(n>=1&&n<=10000));
		
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}

		System.out.println(sum);
	}

}
