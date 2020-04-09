package beakjoon3;

import java.util.Scanner;

public class Hw_2439 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int n;
		
		do {
			n=scr.nextInt();
		}while(!(n>=1&&n<=100));
		
		for(int i=1; i<=n; i++) {
			for(int e=n-i; e>=1;e--) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
