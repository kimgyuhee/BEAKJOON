package beakjoon3;

import java.util.Scanner;

public class Hw_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		int n;
		
		do {
			n=scr.nextInt();
		}while(!(n>=1&&n<=100));
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
