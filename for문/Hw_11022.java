package beakjoon3;

import java.util.Scanner;

public class Hw_11022 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n=scr.nextInt();

		int[] a =new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			do {
				a[i]=scr.nextInt();
				b[i]=scr.nextInt();
			}while(!(a[i]>0&&a[i]<10&&b[i]>0&&b[i]<10));
		}
		
		for(int i=0; i<n;i++) {
			System.out.println("Case #"+(i+1)+": "+a[i]+" + "+b[i]+" = "+(a[i]+b[i]));
		}
	}
}
